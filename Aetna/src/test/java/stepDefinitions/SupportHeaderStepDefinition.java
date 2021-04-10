package stepDefinitions;

import common.WebAPI;

import homepage.SupportHeader;
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

import java.io.IOException;

public class SupportHeaderStepDefinition extends WebAPI {

    static SupportHeader member;

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
        member = PageFactory.initElements(driver, SupportHeader.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("Individual Plans page is displayed")
    public void individual_plans_page_is_displayed() throws IOException {
        openBrowser("https://www.aetna.com/individuals-families.html");
    }

    @Then("I should see the page title is {string}")
    public void i_should_see_the_providers_page_title_as(String expectedTitle) {
        member.verifyPageTitle(expectedTitle);
    }



    @When("I hover over Account management tab")
    public void iHoverOverAccountManagementTab() throws InterruptedException {
        member.hoverAccount();
    }

    @Then("I should see Find a Doctor Link")
    public void iShouldSeeFindADoctorLink() {
        member.verifyDoctor();

    }

    @And("I click Member support tab")
    public void iClickMemberSupportTab() {
        member.clickMemberTab();
    }

    @Then("I should see Find a Form link")
    public void iShouldSeeFindAFormLink() {
        member.findForm();
    }

    @Then("I should see Pay your premium link")
    public void iShouldSeePayYourPremiumLink() {
        member.findPayPremium();

    }

    @When("I click Pay your premium link")
    public void iClickPayYourPremiumLink() {
        member.clickpayPremiumTab();
    }
}
