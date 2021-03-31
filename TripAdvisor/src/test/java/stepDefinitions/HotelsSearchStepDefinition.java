package stepDefinitions;

import common.WebAPI;
import homepageheader_hotels.HotelsSearch;
import homepageheader_hotels.HotelsSearchWithKeyword;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @When("I click update without changing the default Guests informations on the Guests box")
    public void i_click_update_without_changing_the_default_guests_informations_on_the_guests_box() {
        hotelsSearch.guestsUpdateButton();
    }

    @Then("I verify the page title as {string}")
    public void i_verify_the_page_title_as(String expectedTitle) {
        hotelsSearch.verifyHotelSearchResults(expectedTitle);
    }
}


