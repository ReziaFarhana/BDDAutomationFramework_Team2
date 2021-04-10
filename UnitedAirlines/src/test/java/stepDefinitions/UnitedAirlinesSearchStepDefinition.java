package stepDefinitions;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import unitedairlineshome.UnitedAirlinesHomePage;
import unitedairlinessearch.UnitedAirlinesSearch;

import java.io.IOException;

public class UnitedAirlinesSearchStepDefinition extends WebAPI {

    static UnitedAirlinesSearch us;

    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public void getInIt() {
        us = PageFactory.initElements(driver, UnitedAirlinesSearch.class);
    }

    @Given("I am in United Airlines Homepage")
    public void i_am_in_united_airlines_home_page() throws IOException {
        openBrowser("https://www.united.com/en/us");
    }
    @Given("I click on the search Button")
    public void i_click_on_the_search_button() {
        us.clickOnSearchBox();
    }

    @When("I type data into search box from excel")
    public void i_type_data_into_search_box_from_excel() throws IOException {
        us.enterDataInSearchBoxFromExcel();
    }

    @Then("I verify {string} is  displayed properly")
    public void i_verify_is_displayed_properly(String expectedText) {
         us.validateSearchResult(expectedText );
    }

    @When("I type data into search box from database")
    public void i_type_data_into_search_box_from_database() throws Exception {
                   us.searchDataFromDB();
    }
}
