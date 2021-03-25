package stepDefinitions;

import common.WebAPI;
import homepageheader.CommercialPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CommercialPageStepDefinition extends WebAPI {
    static CommercialPage commercialPage;

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
        commercialPage = PageFactory.initElements(driver, CommercialPage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on the TD Bank homePage")
    public void i_am_on_the_td_bank_home_page() throws IOException {
        openBrowser("https://www.td.com");
    }

    @When("I close the Ads Choices & Personalization popUp")
    public void i_close_the_ads_choices_personalization_pop_up() {
        commercialPage.adsChoicesAndPersonalizationpopUp();
    }

    @Then("I click on the Commercial tab")
    public void i_click_on_the_commerical_tab() throws InterruptedException {
        sleepFor(5);
        commercialPage.commercialTab();
    }

    @Then("I hover over the Lending button and I select Commercial Lending option")
    public void i_hover_over_the_lending_button_and_i_select_commercial_lending_option() {
        commercialPage.hoverOverLendingAndSelectCommerical();
    }

    @Then("I verify {string} in the product title")
    public void i_verify_in_the_product_title(String expectedText) {
        commercialPage.verifyCommercialLendingPage(expectedText);
    }

    //2nd test
    @Then("I scrolled down to click on the Request a call button")
    public void i_scrolled_down_to_click_on_the_request_a_call_button() {
        commercialPage.requestACall();
    }

    @Then("I enter all the personal information to schedule an appointment")
    public void i_enter_all_the_personal_information_to_schedule_an_appointment(List<List<String>> table) {
        Map<String, String> map = TableDictionaryConverter(table);
        commercialPage.enterPersonalInformation(map.get("FirstName"), map.get("LastName"), map.get("BusinessName"), map.get("Phone"), map.get("Email"));
    }

    @When("I clicked on the Are you a TD customer radioButton")
    public void i_clicked_on_the_are_you_a_td_customer_radio_button() {
        commercialPage.areYouATDCustomer();
    }

    @Then("I verify the {string} header on the page")
    public void i_verify_the_header_on_the_page(String expectedText) {
        commercialPage.verifyHeaderOnTheScheduleAppointmentPage(expectedText);

    }


}
