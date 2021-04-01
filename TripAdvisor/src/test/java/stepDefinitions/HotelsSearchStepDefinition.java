package stepDefinitions;

import common.WebAPI;
import homepageheader_hotels.HotelsSearch;
import homepageheader_hotels.HotelsSearchWithKeyword;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class HotelsSearchStepDefinition extends WebAPI {
    static HotelsSearch hotelsSearch;

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
        hotelsSearch = PageFactory.initElements(driver, HotelsSearch.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I click on the whereTo searchBox")
    public void i_click_on_the_where_to_search_box() {
        hotelsSearch.whereToSearchBox();
    }
    @When("I select Los Angeles from the popular destinations suggestion")
    public void i_select_los_angeles_from_the_popular_destinations_suggestion() {
        hotelsSearch.selectPopularDestination();
    }
    @Then("I verify the title {string}")
    public void i_verify_the_title(String expectedTitle) {
        hotelsSearch.verifyPageTitle(expectedTitle);
    }
//    @Then("I verify the title {string}")
//    public void iVerifyTheTitle(String expectedTitle ) {
//        hotelsSearch.verifyPageTitle(expectedTitle);
//    }
    @When("I click on the checkIn box")
    public void i_click_on_the_check_in_box() {
        hotelsSearch.checkInBox();
    }

    @When("I click on the right angle bracket on the calendar to go next and I select a date")
    public void i_click_on_the_right_angle_bracket_on_the_calendar_to_go_next_and_i_select_a_date() {
        hotelsSearch.checkInDate();
    }

    @When("I select a checkOut date")
    public void i_select_a_check_out_date() {
        hotelsSearch.checkOutDate();
    }

    @When("I click update on the Guests box")
    public void i_click_update_on_the_guests_box() throws InterruptedException {
        hotelsSearch.guestsUpdateButton();
    }

    @Then("I verify the page title as {string}")
    public void i_verify_the_page_title_as(String expectedTitle) {
        hotelsSearch.verifyHotelSearchResults(expectedTitle);
    }


    @When("I click on the plus sign to add {int} Rooms")
    public void i_click_on_the_plus_sign_to_add_rooms(Integer rooms) throws InterruptedException {
        hotelsSearch.addRooms(rooms);
    }
    @When("I click on the plus sign to add {int} Adults")
    public void i_click_on_the_plus_sign_to_add_adults(Integer adults) throws InterruptedException {
       hotelsSearch.addAdults(adults);
    }
    @Then("I should see {string} in the guestsBox")
    public void i_should_see_in_the_guests_box(String expectedRoomsCount) {
        hotelsSearch.verifyNumberOfRooms(expectedRoomsCount);
    }
    @Then("I should also see {string} in the guestBox")
    public void i_should_also_see_in_the_guest_box(String expectedAdultsCount) {
       hotelsSearch.verifyNumberOfAdults(expectedAdultsCount);
    }

    @When("I click on the plus sign to add {int} Children")
    public void i_click_on_the_plus_sign_to_add_children(Integer childrens) throws InterruptedException {
        hotelsSearch.addChildren(childrens);
    }
    @When("I select {int} on the Age dropdown for the first child")
    public void i_select_on_the_age_dropdown_for_the_first_child(Integer age) {
        hotelsSearch.child1Age(age);
    }

    @When("I select {int} on the age dropdown for the second child")
    public void i_select_on_the_age_dropdown_for_the_second_child(Integer age) {
        hotelsSearch.child2Age(age);
    }
    @Then("I should see {string}")
    public void i_should_see(String expectedChildrenCount) {
        hotelsSearch.verifyNumberOfChildren(expectedChildrenCount);
    }

    @When("I filter the price by xdataOffset {int} and ydataOffset {int}")
    public void i_filter_the_price_by_xdata_offset_and_ydata_offset(Integer xOffset, Integer yOffset) throws InterruptedException {
        hotelsSearch.filterPriceUsingSlider(xOffset,yOffset);
    }
    @Then("I verify the price {string}")
    public void i_verify_the_price(String expectedPriceRange) {
hotelsSearch.verifyFilteredPrice(expectedPriceRange);

    }


}


