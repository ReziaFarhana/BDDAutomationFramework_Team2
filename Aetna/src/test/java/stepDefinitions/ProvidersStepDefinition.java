package stepDefinitions;

import aetnahomepage_Provider.ProvidersHomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class ProvidersStepDefinition extends WebAPI {
    public static ProvidersHomePage providers;

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
        providers = PageFactory.initElements(driver, ProvidersHomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on the Aetna Homepage")
    public void i_am_on_the_aetna_homepage() throws IOException, InterruptedException {
        openBrowser("https://www.aetna.com/");
        sleepFor(5);
    }

    @When("I click on the Providers link")
    public void i_click_on_the_providers_link() throws InterruptedException {
        providers.providersLink();
    }

    @When("I click on the viewProviderUpdateVideo on the Partnering with providers pop-up")
    public void i_click_on_the_view_provider_update_video_on_the_partnering_with_providers_pop_up() {
        providers.viewProviderUpdateVideo();
    }

    @When("I click on the continue button")
    public void i_click_on_the_continue_button() {
        providers.continueButton();
    }

    @Then("I verify {string} as the title of the video on YouTube")
    public void i_verify_as_the_title_of_the_video_on_you_tube(String expectedTitle) {
        providers.verifyyouTubeVideoTitle(expectedTitle);
    }

    @When("I close the Partnering with providers alert")
    public void i_close_the_Partnering_with_providers_alert() {
        providers.closeAlert();
    }




}
