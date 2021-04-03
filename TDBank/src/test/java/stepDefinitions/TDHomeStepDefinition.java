package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static homepage.HomePageWebElement.*;

public class TDHomeStepDefinition extends WebAPI {
    static HomePage act;

    public static final String URL = "https://www.td.com";
    public static final String BROWSERNAME  = "firefox";
    public static final String BROWSERVERSION = "87";

    public void navigateTDBankWebPage() throws IOException {
        openBrowserUsingMultiBrowser(URL,BROWSERNAME,BROWSERVERSION);
    }

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
        act = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am navigated to TDBank Home page TDBank")
    public void i_am_navigated_to_td_bank_home_page_https_www_td_com() throws IOException, InterruptedException {
        navigateTDBankWebPage();
        sleepFor(3);
        if(isElementDisplayed(popupAtFrontPage)){
            clickByCss(popupAtFrontPage);
        }
    }

    @Given("I clicked on Services link")
    public void i_clicked_on_services_link() throws InterruptedException {
        takeEnterKeys(servicesLocator);
        sleepFor(3);
    }

    @Given("I locate and clicked on Online Banking")
    public void i_locate_and_clicked_on_online_banking() throws InterruptedException {
        takeEnterKeys(onlineBankingLocator);
        sleepFor(3);
    }

    @Then("I should land on a new Online Banking page {string}")
    public void i_should_land_on_a_new_online_banking_page(String expected) {
        act.verifyOnlineBankingIsClicked(expected);
    }

    @Given("I clicked on the Log In Header Option")
    public void i_clicked_on_the_log_in_header_option() {
        takeEnterKeys(clickOnLoginOption);
    }
    @Given("I locate and clicked on Online Banking under Login")
    public void i_locate_and_clicked_on_online_banking_under_login() {
        takeEnterKeys(onlineBankingInSignIn);
    }

    @Then("I should land on a new Online Banking windows tab {string}")
    public void i_should_land_on_a_new_online_banking_windows_tab(String expected) {
        act.verifyOnlineBankingUnderLogIn(expected);
    }
}


