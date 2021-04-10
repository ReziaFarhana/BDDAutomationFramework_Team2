package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static homepage.HomePageWebElement.*;

public class MoreTabStepDefinition extends WebAPI {
    static HomePage action;


    public static final String URL = "https://www.tripadvisor.com";
    public static final String BROWSERNAME = "firefox";
    public static final String BROWSERVERSION = "87";

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
        action = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    public void navigateTripadvisorWebPage() throws IOException {
        openBrowserUsingMultiBrowser(URL, BROWSERNAME, BROWSERVERSION);
    }

    @Given("I am navigated to tripadvisor Home page")
    public void i_am_navigated_to_tripadvisor_home_page() throws IOException, InterruptedException {
        navigateTripadvisorWebPage();
        sleepFor(3);
    }

    @And("click on the More tab from the Header")
    public void click_on_the_more_tab_from_the_header() {
        clickByCss(locatorForMoreTab);
    }

    @Given("I clicked on Add a Place")
    public void i_clicked_on_add_a_place() {
        clickByCss(locatorForAddAPlace);
    }

    @Then("I should have seen a text {string}")
    public void i_should_have_seen_a_text_add_a_place_to_tripadvisor(String expected) {
        action.verifyAddAPlacePage(expected);
    }

    @Given("I clicked on Airlines link")
    public void i_clicked_on_airlines_link() {
        clickByCss(locatorForAirlines);
    }

    @Then("I should have a new Airlines page with a text {string}")
    public void i_should_have_a_new_airlines_page_with_a_text(String expected) {
        action.verifyAirlinesPage(expected);
    }

    @Given("I clicked on Cruises link")
    public void i_clicked_on_cruises_link() {
        clickByCss(locatorForCruse);
    }

    @Then("I should have a new Cruises page with a text {string}")
    public void i_should_have_a_new_cruises_page_with_a_text(String string) {
        action.verifyTitlePage(string);
    }

    @Given("I clicked on Flights link")
    public void i_clicked_on_flights_link() {
        clickByCss(locatorForFlight);
    }

    @Then("I should have a new Flights page with a text {string}")
    public void i_should_have_a_new_flights_page_with_a_text(String string) {
        action.verifyTitlePage(string);
    }

    @Given("I clicked on Rental Cars link")
    public void i_clicked_on_Rental_Cars_link() {
        clickByCss(locatorForCareRental);
    }

    @Then("I should have a new Rental Cars page with a text {string}")
    public void i_should_have_a_new_Rental_Cars_page_with_a_text(String string) {
        action.verifyTitlePage(string);
    }

    @Given("I clicked on Hire a Trip Designer link")
    public void i_clicked_on_hire_a_trip_designer_link() {
        clickByCss(locatorHireTripDesigner);
    }

    @Then("I should have a new Hire a Trip Designer page with a text {string}")
    public void i_should_have_a_new_hire_a_trip_designer_page_with_a_text(String string) {
        action.verifyTitlePage(string);
    }

    @Given("I clicked on Where to? box and select")
    public void i_clicked_on_where_to_box_and_select_caribbean() throws InterruptedException {
        clickByCss(locatorWhereToInCruise);
        sleepFor(3);
    }

    @Given("when I clicked on Insurance link")
    public void when_i_clicked_on_insurance_link() {
        clickByCss(locatorOfInsurance);
    }

    @Then("I should have found a TripProtection logo on the left top corner of the pate")
    public void i_should_have_found_a_trip_prolocatorOfInsurancetection_logo_on_the_left_top_corner_of_the_pate() {
        action.verifyTripProtectionPage();
    }

    @Given("I clicked on Single Tripe Get your Quote button")
    public void i_clicked_on_single_tripe_get_your_quote_button() throws InterruptedException {
        clickByCss(singleInsuranceQuotelocator);
        windoSwitchHandler2(1);
        sleepFor(3);
    }

    @Then("I should have a new window tab with a text {string}")
    public void i_should_have_a_new_window_tab_with_a_text(String expected) throws InterruptedException {
        action.verifySingleInsurance(expected);
        sleepFor(3);
    }

    @When("I clicked on Access My Plan link")
    public void i_clicked_on_access_my_plan_link() throws InterruptedException {
        clickByCss(locatorToAccessMyPlan);
        windoSwitchHandler2(1);
        sleepFor(3);
    }

    @Then("I should have landed a new page {string}")
    public void i_should_have_landed_a_new_page(String expected) throws InterruptedException {
//        sleepFor(5);
        action.verifyAccessMyPlan(expected);
    }

    // ~~~ Quote
    @When("I Select a State of Residence from the Choose a state box")
    public void i_select_a_state_of_Residence_from_the_choose_a_state_box() throws InterruptedException {
        action.toSelectStateResidence();
    }

    @When("I entered the Total Trip Cost")
    public void i_entered_the_total_trip_cost() {
        typeByCss1(locatorToEnterTripCost, "1500");
    }

    @When("I selected Destination which is optional")
    public void i_selected_destination_which_is_optional() {
        action.toSelectStateDestiantin();
    }

    @When("I Select Departure and Return Date")
    public void i_select_depature_and_return_date() {
        clickOnElement(locatorToIdentifyDepartureAndReturnDate);
        clickByXpath(locatorForDepartureDate);
        clickByXpath(locatorForReturnDate);
    }

    @When("I identify an Initial Deposit Date")
    public void i_identify_an_initial_deposit_date() throws InterruptedException {
        sleepFor(3);
        clickByCss(locatorToIntialDepositDate);
        clickByXpath(locatorSelectIntialDepositDate);
    }

    @When("I entered the Traveler Ages")
    public void i_entered_the_traveler_ages() {
        //
        clickByCss(locatorForTravelerAge);
        typeByCss1(locatorToEnterTavelersAge, "40");
        clickByCss(locatorToClickOnDone);
    }

    @When("I clicked on Get Quote button")
    public void i_clicked_on_get_quote_button() {
        clickByCss(locatorToClickOnQouteButton);
    }

    @Then("I should have end at {string}")
    public void i_should_have_end_at(String expected) {
        action.verifyInsuranceQoute(expected);
    }

    @FindBy(css = iframeLocator)
    public WebElement iframe;

    @FindBy(xpath = stateSelectionIframe)
    public WebElement state;

    @And("read iframe")
    public void test() throws InterruptedException {
        driver.switchTo().frame(iframe);
        sleepFor(5);
//        System.out.println(getTextByclass(locatorIframe));
//        state.click();
//        Select sel = new Select(state);
//        sleepFor(3);
//        sel.selectByVisibleText("VA-Virginia");
        typeByCss(tripCostlocator, "1200");
        typeByCss(age1locator, "44");

        sleepFor(3);
        driver.switchTo().parentFrame();

    }

    @When("I enter the airlines name {string}")
    public void i_enter_the_airlines_name(String airlinesName) {
        typeByCssNEnter(locatorForAirlinesSearch,airlinesName);
    }
    @Then("I should found a some {string} of the airlines in search")
    public void i_should_found_a_some_of_the_airlines_in_search(String airlinesInfo) {
        action.verifyAirlinesSearch(airlinesInfo);
    }

    @Given("I clicked on Flights Link from the Header Menu")
    public void i_clicked_on_flights_link_from_the_header_menu() {
        clickByCss(locatorToClickOnFlightsLink);
    }
    @Then("I should have landed on {string} new page")
    public void i_should_have_landed_on_new_page(String string) {
        action.verifyClickOnFlightsLink(string);
    }

    // ~~~~~~~~~~ booking

    @When("I entered the City {string} in the From Edit box")
    public void i_entered_the_in_the_from_edit_box(String city) {
        typeByXpathNEnter(locatorDeparture,city);
    }

    @When("I entered the City {string} int To where? Edit box")
    public void i_entered_the_int_to_where_edit_box(String city) {
        typeByXpathNEnter(locatorForDestination,city);
    }

    @When("I selected the Departure and Return date form the given calender")
    public void i_selected_the_departure_and_return_date_form_the_given_calender() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I clicked on th Find Flights button")
    public void i_clicked_on_th_find_flights_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should have {string}")
    public void i_should_have(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
