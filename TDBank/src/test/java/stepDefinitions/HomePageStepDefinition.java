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



    @Given("I m on TD Bank homePage")
    public void iMOnTDBankHomePage() throws IOException {
        openBrowser("https://www.td.com/");
    }

    @And("I click on Services")
    public void iClickOnServices() {
       homePage.clickOnServices();
    }

    //StudentBanking

    @When("I hover on Student Banking")
    public void iHoverOnStudentBanking() {
        homePage.hoverOnStudentBanking();
    }

    @Then("I should see Smart and simple student banking.")
    public void iShouldSeeSmartAndSimpleStudentBanking() {
    }





//
//    @Given("I am on  TDBank homePage")
//    public void i_am_on_td_bank_home_page() throws IOException {
//
//        openBrowser("https://www.td.com/us/en/personal-banking/online-banking/");
//    }
//
//    @When("I click on personal tab")
//    public void i_click_on_personal_tab1() {
//        homePage.personal();
//    }
//
//    @Then("I should see we are here to help you")
//
//    public void i_should_see_we_are_here_to_help_you() {
//        homePage.personalWeAreHereToHelp();
//    }
//
//    @Then("I verify {string} is a working tab")
//    public void i_verify_is_a_working_tab(String string) {
//    }
//
//    @Given("I click on  personal tab")
//    public void i_click_on_personal_tab() {
//        homePage.personal();
//    }
//
//    @Given("I click on checking account tab")
//    public void i_click_on_checking_account_tab() throws InterruptedException {
//        homePage.Checkingaccount();
//    }
//
//    @Then("I should see TD Bank open a TDBank checking account display properly")
//    public void i_should_see_td_bank_open_a_td_bank_checking_account_display_properly() {
//        homePage.CheckingAccountGetText();
//
//    }
//
//    @Then("I verify {string} is displaying")
//    public void i_verify_is_displaying(String exResult) throws InterruptedException {
//        homePage.CheckingAccountGetTitle(exResult);
//    }
//
//    @When("I click on more about personal online banking")
//    public void i_click_on_more_about_personal_online_banking() throws InterruptedException {
//        homePage.LearnAboutHSDefinition();
//    }
//
//    @When("I click on enroll now")
//    public void i_click_on_enroll_now() throws InterruptedException {
//        homePage.enrollNow();
//    }
//
//    @Then("I verify page title as {string} is displaying")
//    public void i_verify_page_title_as_is_displaying(String exResult) throws InterruptedException {
//        homePage.checkTitle(exResult);
//    }
//
//    @Given("I click on small business")
//    public void i_click_on_small_business() throws InterruptedException {
//        homePage.smallBusiness();
//    }
//
//    @Given("I click on  watch the video")
//    public void i_click_on_watch_the_video() throws InterruptedException {
//        homePage.watchVideo();
//    }
//
//    @Then("I verify {string} is displaying properly")
//    public void i_verify_is_displaying_properly(String exResult) throws InterruptedException {
//        homePage.CheckTitle(exResult);
//    }
//
//    @Given("I click on  Commercial")
//    public void i_click_on_commercial() throws InterruptedException {
//        homePage.Commercial();
//    }
//
//    @Given("I click on  learn more")
//    public void i_click_on_learn_more() throws InterruptedException {
//        homePage.learnMore();
//    }
//
//    @Then("I verify {string} is opening properly")
//    public void i_verify_is_opening_properly(String exResult) throws InterruptedException {
//        homePage.CheckTitle1(exResult);
//    }
//
//    @Given("I click on  Investing and Wealth")
//    public void i_click_on_investing_and_wealth() throws InterruptedException {
//        homePage.InvestingAndWealth();
//    }
//
//    @Given("I click on Individuals and Families")
//    public void i_click_on_individuals_and_families() throws InterruptedException {
//        homePage.IndividualsAndFamilies();
//    }
//
//    @Given("I click Retirement Planning")
//    public void i_click_retirement_planning() throws InterruptedException {
//        homePage.retirementPlanning();
//    }
//
//    @Then("I verify {string} is  properly opening")
//    public void i_verify_is_properly_opening(String exResult) throws InterruptedException {
//        homePage.CheckTitle2(exResult);
//    }
//
//    @When("I hover on Product")
//    public void iHoverOnProduct() {
//        homePage.product();
//    }
//
//    @And("I click on Checking account tab")
//    public void iClickOnCheckingAccountTab() {
//        homePage.ClickOnCheckingAccountTab();
//    }
//
//    @When("I click on saving")
//    public void iClickOnSaving() {
//        homePage.ClickOnSaving();
//    }
//
//    @Then("I verify page title as {string} is a Title")
//    public void iVerifyPageTitleAsIsATitle(String expectedResult) {
//        homePage.getTitle();
//    }
//
//    @When("I click on CD'S")
//    public void iClickOnCDS() {
//        homePage.ClickOnCDS();
//    }
//
//    @Then("I verify page title as {string} is Title")
//    public void iVerifyPageTitleAsIsTitle(String expectedResult) throws InterruptedException {
//        homePage.CheckTitle(expectedResult);
//    }
//
//    @When("I click on credit card")
//    public void iClickOnCreditCard() {
//        homePage.CheckCreditCard();
//    }
//
//    @Then("I should see Checking comes jam-packed with perks — and a bonus.")
//    public void iShouldSeeCheckingComesJamPackedWithPerksAndABonus() {
//        homePage.checkingComesText();
//    }
//
//    @Then("I should see TD Bank Credit Cards")
//    public void iShouldSeeTDBankCreditCards() {
//        homePage.CreditCardCheckTitle();
//    }
//
//    @When("I click on Mortgage")
//    public void iClickOnMortgage() {
//        homePage.Check();
//    }
//    @Then("I verify page title as {string} Title")
//    public void iVerifyPageTitleAsTitle(String expectedResult) throws InterruptedException {
//        homePage.CheckTitle(expectedResult);
//    }
//
//    @When("I click Personal Loan")
//    public void iClickPersonalLoan() {
//        homePage.PersonaLoan();
//    }
//
//    @Then("I verify page title {string} Title")
//    public void iVerifyPageTitleTitle(String expectedResult) throws InterruptedException {
//        homePage.CheckTitle(expectedResult);
//    }
//
//


}

