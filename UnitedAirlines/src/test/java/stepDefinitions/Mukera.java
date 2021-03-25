package stepDefinitions;

import common.WebAPI;
import homepage.UAActionHome;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import static homepage.UAWebElement.*;

public class Mukera extends WebAPI {

    UAActionHome act;

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
        act = PageFactory.initElements(driver, UAActionHome.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I righy click on current offers")
    public void i_righy_click_on_current_offers() {
       act.rightClick(redeemCertLocator,"");
    }
    @Given("click on open on new page")
    public void click_on_open_on_new_page() {

    }
    @Then("I should see a new windows opened wth")
    public void i_should_see_a_new_windows_opened_wth() {

    }
}
