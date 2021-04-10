package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import tdBank.SiteMap;

import java.io.IOException;

import static tdBank.WebElement.tdBankURL;

public class SiteMapStepDefinition extends WebAPI {

    SiteMap siteMap;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public void getInit() {
        siteMap = PageFactory.initElements(driver, SiteMap.class);

    }

    @Given("I am on TDBank Homepage{int}")
    public void iAmOnTDBankHomepage(int arg0) throws IOException {

        openBrowser(tdBankURL);
    }

//-------------------------SiteMap---------------------------------------------------------------

@Given("I click on SiteMap")
    public void i_click_on_site_map() throws InterruptedException {
        siteMap.siteMapLink();
    }

    @Then("I click on Student Banking")
    public void i_click_on_student_banking() throws InterruptedException {
        siteMap.studentBanking();
    }

    @Then("I Verify {string} in Student Banking displays")
    public void iVerifyInStudentBankingDisplays(String expectedText) {

        siteMap.verifyStudentCheckingDisplays(expectedText);
    }

//-----------Travel Tips-----------------
    @Then("I click on Travel Tips")
    public void iClickOnTravelTips() {


    }

    @And("I click on Order foreign currency")
    public void iClickOnOrderForeignCurrency() {
    }

    @Then("I enter amount in currency calculator")
    public void iEnterAmountInCurrencyCalculator() {
    }

    @When("I click on Start My Order")
    public void iClickOnStartMyOrder() {
    }

    @Then("I verify my Order is added to shopping cart")
    public void iVerifyMyOrderIsAddedToShoppingCart() {
    }


}
