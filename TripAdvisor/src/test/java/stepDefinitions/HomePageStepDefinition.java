package stepDefinitions;

import common.WebAPI;
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
import tripAdvisor.Homepage;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    Homepage homepage;


    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot


            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public void getInit() {

        homepage = PageFactory.initElements(driver, Homepage.class);
    }

//    @After
//    public void closeBrowser() {
//        cleanUp();
//    }

    @Given("I am on TripAdvisor Homepage")//1
    public void i_am_on_trip_advisor_homepage() throws IOException {
        homepage.openTripAdvisor();
    }

    //---------------------Vacation Rental
    //to go to vacation rental page
    @Given("I click on Vacation Rentals")
    public void i_click_on_vacation_rentals() {
        homepage.goToVacationRentals();

    }

    //Enter location to search for vacation rentals
    @Then("I enter {string} in Where To TextBox and click enter")
    public void iEnterInWhereToTextBoxAndClickEnter(String location) throws InterruptedException {

        homepage.enterLocationForVacRental("Tampa");
    }



    @When("I click on reviews and opinions")
    public void i_click_on_reviews_and_opinions() throws InterruptedException {
        homepage.reviewsAndOpinions();

    }

    @Then("I verify {string} Title Appears correctly")
    public void iVerifyTitleAppearsCorrectly(String expected) {
        homepage.verifyTampaVacationrental(expected);
    }


    @Then("I verify that {string} Text Displays Correctly")
    public void iVerifyThatTextDisplaysCorrectly(String expected) {

        homepage.verifyExploreTampaText(expected);
    }

    //--------------------------


//-----------explore Tampa--->vacation rentals-->verify tampa vacation rental Page
    @When("I click on Vacation Rental Tab")
    public void iClickOnVacationRentalTab() {

        homepage.goToVacationRentals();
    }

    @Then("I verify the Text {string} appears Accurately")
    public void iVerifyTheTextAppearsAccurately(String expected) {

        homepage.verifyTampaVacationrental(expected);
    }



    //-----------------checkin filter-------------
    @And("I click on Checkin Box")
    public void iClickOnCheckinBox() {
        homepage.checkinBox();
    }

    @And("I click on {string} and click on {string}")
    public void iClickOnAndClickOn(String date1, String date2) throws InterruptedException {

        homepage.pickADate(date1,date2);
    }

    @And("I click on Guest")
    public void iClickOnGuest() {
        homepage.guestNumber();
    }

    @And("I click the add button to add bedrooms")
    public void iClickTheAddButtonTimesToAddBedrooms( ) throws InterruptedException {
        homepage.addBedrooms();
    }

    @And("I click the add button to add guests")
    public void iClickTheAddButtonToAddGuests( ) {
        homepage.guestNumber();
    }

    @And("I click the add button  to add  bathrooms")
    public void iClickTheAddButtonTimesToAddBathrooms( ) throws InterruptedException {
        homepage.addBathrooms();
    }

    @When("I click on apply")
    public void iClickOnApply() {
        homepage.applyButton();
    }

    @Then("I verify all the filters appear accurately")
    public void iVerifyAllTheFiltersAppearAccurately(String expected) {
        homepage.verifyFiltersAppear(expected);
    }

    //-----------------------Sort drop down---
    @And("I click on  Sort By drop Down")
    public void iClickOnSortByDropDown() {
        homepage.sortDD();
    }

    @When("I Select Price-Low to High")
    public void iSelectPriceLowToHigh() {
        homepage.priceLowToHigh();
    }

    @Then("I Verify that the {string} Text is the Lowest Price")
    public void iVerifyThatTheTextIsTheLowestPrice(String expected) {
        homepage.verifyPricechange(expected);
    }
//--------------price high to low
    @When("I click on Price-High to Low")
    public void iClickOnPriceHighToLow() {
    }

    @Then("The search result should be diplayed in descending order by price per night")
    public void theSearchResultShouldBeDiplayedInDescendingOrderByPricePerNight() {
    }
//------------------------sort by travel ratings
    @When("I click on Travel Rating")
    public void iClickOnTravelRating() {
    }

    @Then("I should see bubble rating")
    public void iShouldSeeBubbleRating() {
    }

    //--------------Slider---------------------
    @And("I click on the left Slider button")
    public void iClickOnTheLeftSliderButton() {
        homepage.leftSliderButton();
    }

    @And("I slide the slider to Offset 10 for the amount $100")
    public void iSlideTheSliderToOffsetForTheAmount$() {

        homepage.sliderMinimum();
    }

    @Then("I verify the minimum amount has changed to {string}")
    public void iVerifyTheMinimumAmountHasChangedTo(String expected) {
        homepage.verifyMinimuAmountdisplayed(expected);


    }

    @And("I click on the right Slider button")
    public void iClickOnTheRightSliderButton() {
        homepage.rightSliderButton();
    }
    @And("I slide the slider to Offset 50 for the amount $500")
    public void iSlideTheSliderToAmount() {
        homepage.sliderToMaximum();

    }

    @Then("I verify the maximum amount has changed to $500")
    public void iVerifyTheMaximumAmountHasChangedTo(String expected) {
        homepage.verifyMaximumAmountDisplayd(expected);
    }

    //---------------------suitability Filter------------------
    @And("I click the Kid Friendly Checkbox")
    public void iClickTheKidFriendlyCheckbox() {
    }

    @And("I click Pet friendly Checkbox")
    public void iClickPetFriendlyCheckbox() {
    }

    @Then("the Applied filters should be displayed")
    public void theAppliedFiltersShouldBeDisplayed() {
    }

    //-------------amenities Filter-------------
    @And("I Click On Parking Checkbox")
    public void iClickOnParkingCheckbox() {
    }

    @When("I click on Internet Checkbox")
    public void iClickOnInternetCheckbox() {
    }

    @Then("the applied filters should be displayed2")
    public void theAppliedFiltersShouldBeDisplayed2() {
    }

    //----------------------------RentalHouses-----------
    @When("I click on Vacation Rental Houses Checkbox")
    public void iClickOnVacationRentalHousesCheckbox() {
    }

    @Then("the applied filter should be displayed3")
    public void theAppliedFilterShouldBeDisplayed3() {
    }

    //------------------waterView------------
    @And("I click the Water views Checkbox")
    public void iClickTheWaterViewsCheckbox() {
    }

    @And("I click Waterfront Checkbox")
    public void iClickWaterfrontCheckbox() {
    }



}




