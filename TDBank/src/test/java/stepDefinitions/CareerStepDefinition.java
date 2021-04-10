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
import tdBank.Career;

import java.io.IOException;

import static common.WebAPI.driver;
import static tdBank.WebElement.*;


public class CareerStepDefinition extends WebAPI {
    Career career;

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
    public void getInit() {
        career = PageFactory.initElements(driver, Career.class);
    }

//    @After
//    public void closeBrowser(){ cleanUp(); }

    //-----------------------------------------------------
    @Given("I am on TDBank homepage")
    public void i_am_on_td_bank_homepage() throws IOException {
        openBrowser(tdBankURL);
    }
//-------------------------Career tab
    @When("I click on the Career tab")
    public void i_click_on_the_career_tab() throws InterruptedException {
        career.clickOnCareerTab();
    }

    @Then("I enter {string} keyword in Job SearchBox")
    public void iEnterKeywordInJobSearchBox(String keyword) {
        career.KeywordInJobSearchbox(keyword);
    }


    @And("I enter {string} in the location SearchBox")
    public void iEnterInTheLocationSearchBox(String state) {
        career.locationInSearchBox(state);
    }

    @Then("I click on search Button")
    public void i_click_on_search_button() throws InterruptedException {
        career.clickOnSearchButton();

    }

    @Then("I Verify the {string} Text should Appear")
    public void iVerifyTheTextShouldAppear(String expectedText) {
        career.verifySearchResultText(expectedText);
    }

//    @Then("I should see {string} Title page should display")
//    public void iShouldSeeTitlePageShouldDisplay(String expectedTitle) {
//        career.verifySearchResultTitle(expectedTitle);
//    }

//-----------------------Retail opportunities------------


    @And("I hover over Job Opportunities DropDown and I select Call Center Opportunities")
    public void iHoverOverJobOpportunitiesDropDownAndISelectCallCenterOpportunities() throws InterruptedException {

        career.hoverJobOpportunities();
    }
    @Then("I should see Call Center Opportunities")
    public void iShouldSeeRetailJobOpportunities() {
        career.verifyRetailOpportunitiesPage(callCenterTextLocator);

    }


}
