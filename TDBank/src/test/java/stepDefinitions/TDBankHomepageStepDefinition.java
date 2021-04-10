package stepDefinitions;

import common.WebAPI;
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
import org.testng.Assert;
import tdBank.TDBankHomepage;

import java.io.IOException;

import static tdBank.WebElement.*;

public class TDBankHomepageStepDefinition extends WebAPI {

   TDBankHomepage homePage;


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
        homePage = PageFactory.initElements(driver, TDBankHomepage.class);
    }

//    @After
//    public void closeBrowser() {
//        cleanUp();
//    }


    @Given("I am on TDBank HomePage")
    public void i_am_on_td_bank_home_page() throws IOException {
        openBrowser(tdBankURL);
    }


    @Given("I click on SearchBox")
    public void i_click_on_search_box() {
       homePage.locateSearchBox();
    }

    @And("I enter {string} in the SearchBox and click enter")
    public void iEnterInTheSearchBoxAndClickEnter(String arg0) throws InterruptedException {

        homePage.typeInSearchBox("loan");
    }

    @Then("I should see {string}")
        public void iShouldSee(String arg0) {
        homePage.shouldSeeTypeOfLoan("What types of loans do you offer?");

        }

// ---------------------Mortgage loan---------


    @Then("I click on Mortgage Loans")
    public void i_click_on_mortgage_loans() {
        homePage.mortgageLoanButton();
    }

    @Then("I Click on Calculate My Mortgage Button")
    public void i_click_on_calculate_my_mortgage_button() {
        homePage.calculateMortgageButton();

    }
    @Then("I Enter my credentials")
    public void i_enter_my_credentials() {
    homePage.enterMortgageCredentials();

    }
    @When("I Click on {string}")
    public void i_click_on(String string) {
    homePage.getMyOptionButton();
    }
    @Then("I Should See Mortgage per Month")
    public void i_should_see_mortgage_per_month() {
        String expectedText= "30 Year Fixed Rate";
        String actualText = getTextByXpath("//*[@id=\"sb-main-result\"]/div/div[1]/div[2]/h2");
        Assert.assertEquals(expectedText,actualText,"Text did not match");
    }


  //----passed------------------personal Loans----
    @When("I click on Personal Loans Button")
    public void iClickOnPersonalLoansButton() {
        homePage.personalLoanButton();
    }

    @Then("I Verify {string} Displays")
    public void iVerifyDisplays(String arg0) {
        homePage.personalLoanPageVerification();
    }

//----------------Small Business Loans---a pop appears and test fails---
    @Then("I click on Small Business Loans")
    public void iClickOnSmallBusinessLoans() throws InterruptedException {
        homePage.smallBusinessLoans();
    }
    @And("I Enter valid State info")
    public void iEnterValidStateInfo() {
        homePage.selectregion();

    }

    @When("I calculate Monthly Payments")
    public void iCalculateMonthlyPayments() {
        homePage.smallBusinessmMonthlyCalculation();
    }

    @Then("I Should see {string} Statement")
    public void iShouldSeeStatement(String arg0) {
        homePage.monthlyPaymentDisplayed();
    }
//-------------------------------Commercial Loans----------------
    @Then("I click on Commercial Loans")
    public void iClickOnCommercialLoans() {
        homePage.commercialLoan();
    }

    @And("I click Request a Call")
    public void iClickRequestACall() {
        homePage.requestACall();
    }

    @Then("I enter the credentials")
    public void iEnterTheCredentials() {
        homePage.enterCredentialsForCommercialLoan();
    }

    @When("I click the Submit Button")
    public void iClickTheSubmitButton() {
        homePage.submitButtonforCommercialForm();

    }
//------------------------Home equity-pop up window need to handle------------------
    @Then("I click on Home Equity")
    public void iClickOnHomeEquity() {
        homePage.homeEquityLoan();
    }
    @Then("I enter valid State and City")
    public void iEnterValidStateAndCity() {
        homePage.setYourLocation();
    }

    @And("I enter Valid Information to calculate Home equity rate")
    public void iEnterValidInformationToCalculateHomeEquityRate() {
        homePage.enterValidEquityInfo();
    }

    @When("I click on Get Rates")
    public void iClickOnGetRates() {
        homePage.getRatesLink();
    }

    @Then("I verify {string} Statement Displays")
    public void iVerifystatementDisplays(String arg0) {
        homePage.verifyPersonalEquityQuote();
    }

//-----------------------Searchbox DataTable--------------------



}