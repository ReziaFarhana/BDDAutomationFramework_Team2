package stepDefinitions;

import common.WebAPI;
import homepage.UAActionHome;
import homepage.UAWebElement;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static homepage.UAWebElement.*;

public class UADealsStepDefinition extends WebAPI {
    UAActionHome action;
    UAWebElement element;

    public static final String url = "https://www.united.com";

    public void homePageOfUA() throws IOException {
        openBrowser(url);
    }
    @BeforeStep
    public  void getInit(){
        action= PageFactory.initElements(driver,UAActionHome.class);
    }

    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on United Airlines Home page")
    public void i_am_on_united_airlines_home_page() throws IOException, InterruptedException {
        homePageOfUA();
        sleepFor(5);
    }

    @Given("I click on the DEALS option")
    public void i_click_on_the_deals_option() throws InterruptedException {
        action.clickOnDeals();
        sleepFor(2);
    }

    @Then("I should see the OFFERS option")
    public void i_should_see_the_offers_option() {
        action.verifiyOffer();

    }

}
