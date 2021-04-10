package stepDefinitions;

import common.WebAPI;
import homepage.IndividualPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class IndividualPageStepDefinition extends WebAPI {

    static IndividualPage individual;

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public void getInit() {
        individual = PageFactory.initElements(driver, IndividualPage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("Individual Plans page is being displayed")
    public void individual_plans_page_is_being_displayed() throws IOException {
        openBrowser("https://www.aetna.com/individuals-families.html");
    }



    @Then("I should see the page title equates to {string}")
    public void i_should_see_the_providers_page_title_equates_to (String expectedTitle) {
        individual.verifyPageTitle(expectedTitle);
    }


    @Then("I should see the page url equates to {string}")
    public void iShouldSeeThePageUrlEquatesTo(String expectedUrl) {
        individual.verifyPageUrl(expectedUrl);

    }


    @And("I click login button")
    public void iClickLoginButton() {
        individual.clickLogin();

    }

    @And("I click login button on next screen")
    public void iClickLoginButtonOnNextScreen() {
        individual.clickLogin1();
    }

    @And("I enter {string} in username field")
    public void iEnterInSearchBox(String userName) {
        individual.enterUserName(userName);
    }

    @And("I enter {string} in password field")
    public void iEnterInPasswordField(String password) {
        individual.enterPassword(password);

    }

    @When("I click on secure login button")
    public void iClickOnSecureLoginButton() {
        individual.clickSecureLogin();
    }

    @Then("I should see invalid login message")
    public void iShouldSeeInvalidLoginMessage() {
        individual.loginInvalid();
    }


}
