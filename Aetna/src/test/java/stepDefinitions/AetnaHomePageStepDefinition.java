package stepDefinitions;

import aetna.AetnaHomePage;
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

import java.io.IOException;

import static aetna.WebElement.*;

public class AetnaHomePageStepDefinition extends WebAPI {


    AetnaHomePage homePage;


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

        homePage = PageFactory.initElements(driver, AetnaHomePage.class);
    }

//    @After
//    public void closeBrowser() {
//        cleanUp();
//    }

    //-------Verify Logo---------------
    @Given("I am on Aetna Homepage")
    public void iAmOnAetnaHomepage() throws IOException {
        homePage.aetnaHomepage();
    }

    @And("I Click on Contact Us")
    public void i_click_on_contact_us() throws InterruptedException {
        homePage.clickContactUS();
    }

    @When("I Click on Aetna Logo")
    public void i_click_on_aetna_logo() {
        homePage.aetnaLogo();
    }

    @Then("I Verify the {string} Title")
    public void iVerifyTheAetnaHomepageTitle(String expectedTitle) {
        homePage.verifyTitlePage(homePageTitle);

    }
//--------------------Who We are--our mission

    @And("I click on Contact Us")
    public void iClickOnContactUs() throws InterruptedException {
        homePage.clickContactUS();
    }

    @And("I click Who we are Drop Down")
    public void iClickWhoWeAreDropDown() throws InterruptedException {
        homePage.whoAreWeDD();
    }

    @When("I click on Our Mission and I click on Our values")
    public void iClickOnOurMissionAndIClickOnOvervalues() throws InterruptedException {
        homePage.ourMission();
    }

    @Then("I verify {string} Title")
    public void iVerifyCompanyValuesTitle(String arg0) {
        homePage.verifyTitlePage(companyValuesTitlePage);
    }
//------------------Initiatives-->corporate responsibilities------------------------------
    @And("I click on Initiatives")
    public void iClickOnInitiatives() {
        homePage.initiatives();
    }

    @And("I click Corporate Responsibility")
    public void iClickCorporateResponsibility() throws InterruptedException {
        homePage.corporateResponsibilities();
    }
    @Then("I verify  {string} title")
    public void iVerifyCorporateResponsibilityTitle(String arg0) {
        homePage.verifyTitlePage("Corporate Responsibility | Aetna");
    }
        //    @When("I click National Program")
//    public void iClickNationalProgram() throws InterruptedException {
//        homePage.nationalProgram();
//    }
        // homePage.nationalHealthPageTitle("National Health Initiatives | Aetna");
    //------------------Who We are-----Verify HealthcareReform Title-----Doing Business----------------

    @When("I click on Doing Business with us")
    public void iClickOnDoingBusinessWithUs() throws InterruptedException {
        homePage.doingBusinessWithUs();
    }

    public void iVerifyDoingBusinessTitlePage(String arg0) throws Throwable {
        homePage.verifyTitlePage(doingBUsinessWithUsTitlePage);

    }

    @Then("I verify {string} Text")
    public void iVerifyText(String arg0) {
        homePage.verifyDoingBusinessPageText("Doing Business with Us");
    }

    //----------investor--Investor Overview----
    @And("I click on Investors")
    public void iclickOnInvestors() throws InterruptedException {
        homePage.investors();
    }

    @When("I click on Investor Overview")
    public void iClickOnInvestorOverview() throws InterruptedException {
        homePage.investorOverview();
    }

    @Then("I verify Investor Overview {string} title")
    public void iVerifyInvestorInfoTitle(String arg0) {
        homePage.verifyTitlePage(investorInformation);
    }
//------------Health Section-----community--------

    @And("I click on Health Section")
    public void iClickOnHealthSection() {
        homePage.healthSection();
    }

    @When("I click on Community")
    public void iClickOnCommunity() {
        homePage.community();
    }


    @Then("I verify {string} title")
    public void iVerifyTitle(String arg0) {

        homePage.verifyTitlePage(communityTitlePage);
    }
//---------------------searchBox
    @And("I enter {string} In SearchBox and Click Enter")
    public void iEnterInSearchBoxAndClickEnter(String arg0) {

        homePage.inputInSearchBox("Doctor");
    }
//------------Search doctor in Search Box---------------------------------
    @Then("I Verify {string} Title")
    public void iVerifySearchResultTitle(String arg0) {

        homePage.verifyTitlePage(searchresultTitle);
    }

//-------------Search Box Data Table--------

    @And("I input {string} in the SearchBox")
    public void iInputInTheSearchBox(String searchKeyword) {

        homePage.inputInSearchBox(searchKeyword);
    }

    @And("I click on Search button")
    public void iClickOnSearchButton() {
        homePage.searchButton();

    }
    @Then("I verify the {string} Text")
    public void iVerifyTheText(String searchresult) {
        homePage.verifySearchTextPage(searchresult);
    }

//------------------------Healthcare reform-------------
    @When("I Click on HealthCare Reform")
    public void iClickOnHealthCareReform() throws InterruptedException {
        homePage.healthCareReform();
    }


    @Then("I Verify the Aetna {string} Text")
    public void iVerifyTheAetnaText(String arg0) {
        homePage.verifyHealthCareReformText("Health Care Reform");
    }
}




