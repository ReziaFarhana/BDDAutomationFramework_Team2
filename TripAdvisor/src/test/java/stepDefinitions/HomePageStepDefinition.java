package stepDefinitions;

import homepage.HomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static HomePage home;

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit() {
        home = PageFactory.initElements(driver, HomePage.class);
    }


    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on the Trip Advisor main homepage")
    public void i_am_on_the_trip_advisor_main_homepage() throws IOException {
        openBrowser("https://www.tripadvisor.com/");
    }


    @And("user clicks on the searchbox")
    public void userClicksOnTheSearchbox() {
        home.clickOnSearchBox();
    }

    @When("user types data into search box from excel")
    public void userTypesDataIntoSearchBoxFromExcel() throws IOException {
        home.enterDataInSearchBoxFromExcel();
    }

    @Then("user verifies {string} is displayed properly")
    public void userVerifiesIsDisplayedProperly(String expectedText) {
        home.verifySearchResult(expectedText);
    }
}