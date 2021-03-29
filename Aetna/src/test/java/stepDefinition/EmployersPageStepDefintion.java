package stepDefinition;

import common.WebAPI;
import homepage.EmployersPage;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class EmployersPageStepDefintion extends WebAPI {

    static EmployersPage employersPage;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        employersPage= PageFactory.initElements(driver, EmployersPage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }

    @Given("user is on employers page")
    public void user_is_on_employers_page() throws IOException {
        openBrowser("https://www.aetna.com/employers-organizations.html");
    }
    @When("user clicks on Explore Aetna Sites")
    public void user_clicks_on_Aetna_Sites() {
       employersPage.clickDropDown();
    }
    @And("user clicks on About Us")
    public void user_clicks_on_About_Us() {
        employersPage.clickAboutUsNav();
    }

    @Then("user verify {string} appears properly")
    public void user_verify_appears_properly(String expectedText) {
        employersPage.verifyAboutUsPage(expectedText);
    }
}
