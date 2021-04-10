package stepDefinitions;

import common.WebAPI;
import homepage.searchbox.SearchBox;
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

public class SearchBoxStepDefinition extends WebAPI {
    static SearchBox sb;
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
        sb= PageFactory.initElements(driver,SearchBox.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }

    @Given("I am on Trip Advisor home Page")
    public void i_am_on_trip_advisor_home_page() throws IOException {
        openBrowser("https://www.tripadvisor.com/");
    }

    @And("I enter {string} in searchBox")
    public void i_enter_in_search_box(String countryName) {
        // Action method
        sb.enterCountryName(countryName);
    }

    @When("I click on search Button")
    public void i_click_on_search_button() {
        sb.clickOnSearchButton();
    }

    @Then("I should see {string} is properly appear")
    public void i_should_see_is_properly_appear(String expectedText) {
        sb.verifySearchResult("\""+expectedText+"\"");
    }

    @Then("I verify {string} in product title")
    public void i_verify_in_product_title(String expectedText) {
        // Amazon.com : hand sanitizer
        sb.verifyPageTitle(expectedText);
    }

    @Then("I verify {string} in page title")
    public void i_verify_in_page_title(String verifyTitle) {
        sb.verifyPageURL(verifyTitle);

    }

    /**
     * get url
     */
    @When("I clicks on things to do")
    public void i_clicks_on_things_to_do() {
        sb.verifyThingsToDo();
    }

//    @When("I enters {string} in searchbox")
//    public void I_enter_in_searchbox(String searchData) throws InterruptedException {
//       sb.enterDataIntoSearchBox(searchData);
//
//    }

    @Then("I verifies {string} appears properly")
    public void I_verifies_appears_properly(String pageURL) {
       sb.verifyPageURL(pageURL);
    }



}