package stepDefinitions;

import common.WebAPI;
import homepage.searchbox_texas.SearchBoxTexas;
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

public class SearchBoxTexasStepDefinition extends WebAPI {
    static SearchBoxTexas sbt;

    @BeforeStep
    public static void getInit() {
        sbt = PageFactory.initElements(driver, SearchBoxTexas.class);
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

    @Given("I am on Trip Advisor homePage")
    public void i_am_on_trip_advisor_home_page() throws IOException {
        openBrowser("https://www.tripadvisor.com/");
    }

    @Given("I enter {string} in search box")
    public void i_enter_in_search_box(String string) {
        sbt.WhereToSearchBox();
    }

    @When("I click on search button")
    public void i_click_on_search_button() throws InterruptedException {
        sbt.searchButtonClick();
    }

    @And("I click on Hotels tab")
    public void i_click_on_hotels_tab() {
        sbt.hotelButtonClick();
    }
    @Then("I verify {string} properly appeared")
    public void iVerifyProperlyAppeared(String expectedText) {
        sbt.validateDestinationTexas(expectedText);//validateWhereToSearchBox()
    }

    //    Test-2.Passed....Texas Vacation Rentals...................

    @And("I click on vacation rentals tab")
    public void i_click_on_vacation_rentals_tab() {
        sbt.vacationRentalsTabCheck();
    }

    @Then("I verify {string} appeared")
    public void i_verify_appeared(String expectedText) {
        sbt.validateTexasHotelVacationRentals(expectedText);
    }

    //test-3........Texas Food images..............
    @When("I click on Restaurants Tab")
    public void i_click_on_restaurants_tab() {
        sbt.restaurantTabCheck();
    }

    @When("I click on Dallas Restaurant and navigate to new window")
    public void i_click_on_dallas_restaurant_and_navigate_to_new_window() throws InterruptedException {
        sbt.texasDallasRestaurant();
    }

    @When("I click on takeout checkBox")
    public void i_click_on_takeout_check_box() throws InterruptedException {
        sbt.texasDallasRestaurantFeatureCheckBox();
    }
    @When("I click on launch checkBox")
    public void i_click_on_launch_check_box() throws InterruptedException {
        sbt.texasDallasRestaurantMealsCheckBox();
    }

    @When("I click on Maple Leaf Diner tab and navigate to new window")
    public void i_click_on_maple_leaf_diner_tab_and_navigate_to_new_window() throws InterruptedException {
        sbt.DallasMapleLeafClick();
    }

    @Then("I verify restaurant images is displayed")
    public void i_verify_restaurant_images_is_displayed() {
        sbt.verifyMapleLeafImageIsDisplayed();
    }

    @When("I click on all photos")
    public void i_click_on_all_photos() {
        sbt.mapleLeafAllPhotosIsClickable();
    }

    @Then("I validate photo gallery visible")
    public void i_validate_photo_gallery_visible() {
        sbt.validatePhotoGalleryIsDisplayed();
    }


}



