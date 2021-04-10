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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition  extends WebAPI {
    static HomePage homePage;

    // Cucumber Hook
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
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }
    @Given("I am on Trip Advisor Home Page")
    public void i_am_on_trip_advisor_home_page() throws IOException {
        openBrowser("https://www.tripadvisor.com/");
    }

    @Given("I click on where to ?")
    public void i_click_on_where_to() {
        homePage.where();

    }

    @Given("I enter Florida")
    public void i_enter_florida() {
        homePage.Florida();

    }

    @Then("I verify that the title {string} is displaying properly")
    public void i_verify_that_the_title_is_displaying_properly(String exResult) throws InterruptedException {
        homePage.CheckTitle2(exResult);
    }

    @When("I click on Hotels")
    public void iClickOnHotels() {
        homePage.ClickOnHotels();
    }

    @Then("I should see where to text displaying")
    public void iShouldSeeWhereToTextDisplaying() {
        homePage.wheretotext();
    }

    @Given("I click on more")
    public void i_click_on_more() {
        homePage.more();

    }

    @Given("I click on add a place")
    public void i_click_on_add_a_place() {
        homePage.place();

    }

    @Then("I verify that the title {string} displaying properly")
    public void iVerifyThatTheTitleDisplayingProperly(String expectedResult) {
        homePage.getTitle();

    }

    @And("I click on Airline")
    public void iClickOnAirline() {
        homePage.Airline();
    }

    @Then("I verify that the title {string} title")
    public void iVerifyThatTheTitleTitle(String expectedResult) {
        homePage.getTitle();
    }

    @And("I click on Flights")
    public void iClickOnFlights() {
        homePage.Flights();
    }

    @Then("I verify the title {string} title")
    public void iVerifyTheTitleTitle(String expectedResult) {
        homePage.getTitle();
    }

    @And("I click on Cruises")
    public void iClickOnCruises() {
        homePage.Cruise();

    }

    @Then("I verify the title {string}")
    public void iVerifyTheTitle(String expectedResult) {
        homePage.getTitle();
    }

    @And("I click on Hire a Trip")
    public void iClickOnHireATrip() {
        homePage.HireaTrip();

    }

    @Then("I verify the title {string} is displaying")
    public void iVerifyTheTitleIsDisplaying(String expectedResult) {
        homePage.getTitle();
    }

    @And("I click on Insurance")
    public void iClickOnInsurance() {
        homePage.insurance();

    }

    @Then("I verify the title {string} a title")
    public void iVerifyTheTitleATitle(String expectedResult) {
        homePage.getTitle();

    }

    @And("I click on rental cars")
    public void iClickOnRentalCars() {
        homePage.RentalCars();
    }


    @Then("I verify title {string} a title")
    public void iVerifyTitleATitle(String expectedResult) {
        homePage.getTitle();
    }

    @And("I click on road Trip")
    public void iClickOnRoadTrip() {
        homePage.roadTrip();
    }

    @Then("I verify title {string} is a title")
    public void iVerifyTitleIsATitle(String expectedResult) {
        homePage.getTitle();
    }

    @And("I click on road Travel Choice")
    public void iClickOnRoadTravelChoice() {
        homePage.TravlersChoice();
    }

    @Then("I verify title {string} is displaying")
    public void iVerifyTitleIsDisplaying(String expectedResult) {
        homePage.getTitle();
    }

    @And("I click on vacation Packaging")
    public void iClickOnVacationPackaging() {

    }
}




