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
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static homepage.HomePageWebElement.*;

public class MoreTabStepDefinition extends WebAPI {
    static HomePage action;


    public static final  String URL = "https://www.tripadvisor.com";
    public static final String BROWSERNAME  = "firefox";
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
        openBrowserUsingMultiBrowser(URL,BROWSERNAME,BROWSERVERSION);
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

    // ~~

    @Given("I clicked on Cruises link")
    public void i_clicked_on_cruises_link() {
        clickByCss(locatorForCruse);
    }

    @Then("I should have a new Cruises page with a text {string}")
    public void i_should_have_a_new_cruises_page_with_a_text(String string) {
        action. verifyTitlePage(string);
    }

    @Given("I clicked on Flights link")
    public void i_clicked_on_flights_link() {
        clickByCss(locatorForFlight);
    }

    @Then("I should have a new Flights page with a text {string}")
    public void i_should_have_a_new_flights_page_with_a_text(String string) {
        action. verifyTitlePage(string);
    }

    @Given("I clicked on Rental Cars link")
    public void i_clicked_on_Rental_Cars_link() {
        clickByCss(locatorForCareRental);
    }

    @Then("I should have a new Rental Cars page with a text {string}")
    public void i_should_have_a_new_Rental_Cars_page_with_a_text(String string) {
        action. verifyTitlePage(string);
    }

    @Given("I clicked on Hire a Trip Designer link")
    public void i_clicked_on_hire_a_trip_designer_link() {
        clickByCss(locatorHireTripDesigner);
    }

    @Then("I should have a new Hire a Trip Designer page with a text {string}")
    public void i_should_have_a_new_hire_a_trip_designer_page_with_a_text(String string) {
        action. verifyTitlePage(string);
    }

    @Given("I clicked on Where to? box and select")
    public void i_clicked_on_where_to_box_and_select_caribbean() throws InterruptedException {
        clickByCss(locatorWhereToInCruise);
        sleepFor(3);
//        moveToElementClick(locatorToSelectCaribbean);

    }


}
