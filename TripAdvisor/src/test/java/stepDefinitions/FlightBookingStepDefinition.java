package stepDefinitions;

import common.WebAPI;
import homepage.flightbooking.FlightBooking;
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

public class FlightBookingStepDefinition extends WebAPI {

           static FlightBooking fb;

        @BeforeStep
        public static void getInit() {
            fb = PageFactory.initElements(driver, FlightBooking.class);
        }

        // Cucumber Hook
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

    @Given("I am on the Trip Advisor Travel Forum page")
    public void i_an_on_the_trip_advisor_travel_forum_page() throws IOException {
        openBrowser(" https://www.tripadvisor.com/ForumHome");
    }

    @When("I click on Flights")
    public void i_click_on_flights() throws InterruptedException {
            fb.flightTab();
    }

    @And("I enter Where from and To field")
    public void i_enter_where_from_and_to_field() throws InterruptedException {
        fb.whereFromToField();
    }

    @And("I enter departure and arrival date")
    public void i_enter_departure_and_arrival_date() throws InterruptedException {
            fb.calenderCheckIn();
    }

//    @Given("I enter person field and close person field")
//    public void i_enter_person_field_and_close_person_field() throws InterruptedException {
//            fb.personField();

    @And("I click on find flight button")
    public void i_click_on_find_flight_button() throws InterruptedException {
            fb.findFlightBox();

    }

    @Then("I verify {string} is displayed")
    public void i_verify_is_displayed(String expectedText) {
            fb.validateTravelForum(expectedText);
    }
        //Test-2...Things to do in Dhaka City.................

    @When("I click on Things to Do")
        public void i_click_on_things_to_do() throws InterruptedException {
        fb.verifyDhakaThingsToDo();
    }

    @When("I click on Monuments & Statues")
    public void i_click_on_monuments_statues() throws InterruptedException {
            fb.verifyDhakaMonumentsStatues();
    }

//    @When("I click on Shahid Minar")
//    public void i_click_on_shahid_minar() throws InterruptedException {
//            fb.verifyShahidMinarTabIsClickable();
//    }
//
//    @When("I click on Full view")
//    public void i_click_on_full_view() throws InterruptedException {
//            fb.verifyFullViewIsClickable();
//    }
//
//    @When("I click on Gallery")
//    public void i_click_on_gallery() throws InterruptedException {
//            fb.verifyPhotoGalleryIsClickable();
//........................................................................
    @Then("I verify {string} is visible")
    public void i_verify_is_visible(String title) {
        fb.validateThingsToDo();
    }

    @Then("I gets all links from Travel Forum Page")
    public void i_gets_all_links_from_travel_forum_page() {
        fb.getListofWebElementsbyTag("a");
    }

//    ................................................
     @When("user right clicks and opens all Browse Destination links")
        public void userRightClicksAndOpensAllBrowseDestinationLinks() throws InterruptedException {
       fb.rightClickandOpenBrowseDestinationLinks();
}

    @Then("user verifies all Page Title prints")
        public void userVerifiesAllPageTitlePrints() throws InterruptedException {
        fb.verifyAllTitles();
    }

    @When("I click on One way tab")
    public void i_click_on_one_way_tab() {
            fb.verifyOneWayTripBtnIsClickable();
    }

    @When("I enter departure date")
    public void i_enter_departure_date() {
        fb.verifyOneWayTripBtnIsClickable();
    }

    @And("I enter {string} Where from and {string} To field")
    public void i_enter_where_from_and_to_field(String newYork, String switzerLand) throws InterruptedException {
            fb.verifyNewYorkToZurich();
    }
    @And("I click on find flight btn")
    public void i_click_on_find_flight_btn() throws InterruptedException {
        fb.findFlightBox2();
    }

    @Then("I verify {string} as page Title")
    public void i_verify_as_page_title(String title) {

    }
}





