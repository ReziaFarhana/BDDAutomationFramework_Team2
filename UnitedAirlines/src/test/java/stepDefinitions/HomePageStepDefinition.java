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
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

//    @After
//    public void closeBrowser(){
//        cleanUp();
//    }

    @Given("user is on the UnitedAirlines homepage")
    public void user_is_on_the_united_airlines_homepage() throws IOException {
        openBrowser("https://www.united.com/en/us");
    }
    @And("user enters From location")
    public void user_enters_from_location() {
        homePage.enterLocationFrom();
    }
    @Given("user enters To location")
    public void user_enters_to_location() {
        homePage.enterLocationTo();
    }
    @Given("user enters dates for flight")
    public void user_enters_dates_for_flight() {
        homePage.selectDates();
    }
    @Given("user selects Premium economy")
    public void user_selects_premium_economy() {
        homePage.selectFlightClass();
    }
    @When("user clicks Find Flights button")
    public void user_clicks_find_flights_button() {
        homePage.clickFindFlightsBtn();
    }










}
