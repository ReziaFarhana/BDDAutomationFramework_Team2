package stepDefinitions;

import aetnahomepage.Providers;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;


public class ProvidersStepDefinition extends WebAPI {
    public static Providers providers;

    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public void getInit(){
        providers = PageFactory.initElements(driver, Providers.class);
    }

    @After
    public void closeBrowser(){
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
    @Then("I verify the {string} page title")
    public void i_verify_the_page_title(String expectedText) {
        providers.verifyProvidersPage(expectedText);

    }











}
