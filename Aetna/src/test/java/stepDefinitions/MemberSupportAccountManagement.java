package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static homepage.HomePageWebElement.*;

public class MemberSupportAccountManagement extends WebAPI {

    public static final String URL = "https://www.aetna.com";
    HomePage act;


    public void homePageOfAetna() throws IOException {
        openBrowser(URL);
    }

    @BeforeStep
    public void getInit() {
        act = PageFactory.initElements(driver, HomePage.class);
    }

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on Aetna's home page")
    public void i_am_on_aetna_s_home_page() throws InterruptedException, IOException {
        homePageOfAetna();
        sleepFor(3);
    }

    @When("I click on the  Member support Menu bar link")
    public void i_click_on_the_member_support_menu_bar_link() {
        clickByXpath(memberSupportHomePageLink);
    }

    @Then("I should get a drop down option for further slection")
    public void i_should_get_a_drop_down_option_for_further_slection() throws InterruptedException {
        act.verifyMemberSupportClicked();
        sleepFor(3);
    }

    @And("I hover over on account management Link")
    public void i_hover_over_on_account_management_Link() throws InterruptedException {
//
//        driver.findElement(By.xpath(accountManagementLink)).sendKeys(Keys.TAB,Keys.ENTER);
        mouseHoverByXpath(accountManagementLink);
    }

    @When("I click on Log in to your member website link")
    public void i_click_on_log_in_to_your_member_website_link() {
        clickByCss(memberWebsiteLink);
    }

    @Then("I should have land on a page with a text {string}")
    public void i_should_have_land_on_a_page_with_a_text(String string) {
        act.verifyLoginPage(string);
    }

    @Then("I should have land on a Find a doctor with a text {string}")
    public void i_should_have_land_on_a_find_a_doctor_with_a_text(String string) {
        act.verifyFindDrPage(string);
    }

    @When("I click on Find a doctor link")
    public void i_click_on_find_a_doctor_link() {
        clickByXpath(clickOnFindDr);
    }

    @When("I click on a Find a pharmacy link")
    public void i_click_on_a_find_a_pharmacy_link() throws InterruptedException {
        clickByXpath(clickOnPharmacyLink);
        sleepFor(3);
    }

    @Then("I should have land on a Pharmacy Home with a text {string}")
    public void i_should_have_land_on_a_pharmacy_home_with_a_text(String string) {
        act.verifyPharmacyPage(string);
    }

    @Then("I select Retail Pharmacy Locations")
    public void i_select_retail_pharmacy_locations() {
        act.selectAPharmacy();
    }

    @Then("I click on a Radio button named ZIP CODE")
    public void i_click_on_a_radio_button_named_zip_code() {
        act.selectZIPCode();
    }

    @Then("I entered a zip cod {string}")
    public void i_entered_a_zip_cod(String string) {
        typeOnInputField(enterAZIPCode, string);
    }

    @Then("I select Distance 20 miles")
    public void i_select_distance_miles() throws InterruptedException {
        act.selectDistanceInMile();
    }

    @Then("I select a Plan Aetna Rx Value Network")
    public void i_select_a_plan_aetna_rx_value_network() {
        act.selectPlanNetwork();
    }

    @When("I click on the search box")
    public void i_click_on_the_search_box() throws InterruptedException {
        clickById(clickOnSearchButton);
        sleepFor(2);
    }

    @Then("I should find a text {string}")
    public void i_should_find_a_text(String string) {
        act.verifySearchResult(string);
    }

    @Given("I click on a Radio button named CITY CODE")
    public void i_click_on_a_radio_button_named_city_code() {
        act.ClickCityRadeo();
    }

    @Given("I entered a City {string}")
    public void i_entered_a_city(String string) {
        typeOnInputField(enterCityName, string);
    }

    @Given("I select State")
    public void i_select_state() throws InterruptedException {
        act.selectState();
    }

    @Then("I click on a Search by Name tab")
    public void i_click_on_a_search_by_name_tab() {
        clickByXpath(clickOnSearchByName);
    }

    @Then("I enter the Pharmacy Name {string}")
    public void i_enter_the_pharmacy_name(String string) {
        typeOnInputField(enterPharmacyName,string);
    }

    @Then("I verify ZIP Code is selected")
    public void i_verify_zip_code_is_selected() {
        act.selectZIPCode();
    }

    @Then("I select Distance 30 miles")
    public void i_select_distance_Away_Inmiles() throws InterruptedException {
        act.selectDistanceAway();
    }

    @When("I click on the search box of Search By Name tab")
    public void i_click_on_the_search_box_of_SearchByName_tab() throws InterruptedException {
        clickByCss(getClickOnSearchButton2);
    }

    @Then("I should find Search by Name ends with a page that has a text{string}")
    public void i_should_find_Search_by_Name_text_as(String string) {
        act. verifySearchByName(string);
    }

    @And("I click on a Advance Search tab")
    public void and_I_click_on_a_Advance_Search_tab(){
        clickByXpath(clickOnAdvanceSearch);
    }

    @Then("I should land on a page with a text {string}")
    public void i_should_land_On_a_with_text(String text){
        act.verifyAdvanceSearchResult(text);
    }







}
