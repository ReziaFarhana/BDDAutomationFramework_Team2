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
import java.util.List;

public class HomePageStepDefinition extends WebAPI {

    static HomePage hp;


    // Cucumber Hook
    @BeforeStep
    public static void getInit() {
        hp = PageFactory.initElements(driver, HomePage.class);
    }

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    //    @After
//    public void closeBrowser() {
//        cleanUp();
//    }
//test-1 passed
    @Given("I am on the TD Bank homePage")
    public void I_am_on_the_TD_Bank_homePage() throws IOException {
        openBrowser("https://www.td.com/us/en/personal-banking/");
    }

    @Given("I see the TD Bank logo")
    public void I_see_the_TD_Bank_logo() {
        hp.validateTdBankLogoIsDisplayed();
    }

    @Given("I close the Ads Choices & Personalization popUp")
    public void i_close_the_ads_choices_personalization_pop_up() {
        hp.adsChoicesAndPersonalizationPopUp();
    }

    @When("I clicks on the Login button under Online Banking")
    public void I_clicks_on_the_Login_button_under_Online_Banking() {
        hp.logInIcon();
    }

    @Then("I can see the Online Banking Log In page is displayed")
    public void I_can_see_the_Online_Banking_Log_In_page_is_displayed() {
        hp.validateOnlineBankingWelcomeText();
    }

    //test-2 passed small banking..........................................................
    @When("I hover over the services button and I click Online Banking option")
    public void i_hover_over_the_services_button_and_i_click_online_banking_option() throws InterruptedException {
        hp.onlineBankingUnderServices();
    }

    @When("I click on Learn more about Small Business Online Banking.")
    public void i_click_on_learn_more_about_small_business_online_banking() {
        hp.smallBusinessOnlineBanking();
    }

    @Then("I verify {string} is appeared")
    public void i_verify_is_appeared(String expectedText) {
        hp.validateSmallBankingOnlinePage(expectedText);
    }

    //test-3.......................................................
    @When("I scroll down and I click on Enroll now")
    public void i_scroll_down_and_i_click_on_enroll_now() throws InterruptedException {
        hp.onlineBankingEnrollNowScroll();
    }

    @And("I cancel the questions On Stimulus Payments Pop up")
    public void i_cancel_the_questions_on_stimulus_payments_pop_up() {
       // hp.questionsOnStimulusPaymentsPopUp();
        hp.questionsOnStimulusPaymentsPopUp2();
    }

    @Then("I verify {string} window pop up")
    public void i_verify_window_pop_up() throws InterruptedException {
        hp.validateOnlineBankingEnrollNowPopUp();
    }

    //test-4 passed.............................................................................
    @When("I hover over the services button and I select Student Banking option")
    public void I_hover_over_the_services_button_and_i_select_student_banking_option() throws InterruptedException {
        sleepFor(5);
        hp.hoverOverServicesAndSelectStudentLoan();
    }

    @Then("I verify {string} is displayed")
    public void i_verify_is_displayed(String expectedText) {
        hp.verifyStudentLoanPage(expectedText);
    }

    //        test-5. find Us check in.passed..............................................................................
    @When("I click Find Us icon")
    public void i_click_find_us_icon() {
        hp.clickOnFindUsIcon();
    }

    @And("I enter {string} and I click on search icon")
    public void i_enter_and_i_click_on_search_icon(String zipcode) throws InterruptedException {
        hp.enterLocationAndClickOnSearchIcon(zipcode);
    }

    @Then("I validate TD Bank locations appeared")
    public void i_validate_td_bank_locations_appeared() throws InterruptedException {
        hp.validateFindUsValidationText("10 locations near \"New York, NY\"");
    }

    //    test-6 Get direction button check...............................................
    @When("I take necessary steps and landed on locations page")
    public void i_take_necessary_steps_and_landed_on_locations_page() throws InterruptedException {
        hp.landingOnLocationsPage();
    }

    @And("I click on Get Direction Button")
    public void i_click_on_get_direction_button() {
        hp.clickOnGetDirection();
    }

    @Then("I validate google map page Title")
    public void i_validate_google_map_page_title() {
        hp.validateGetDirection();
    }
//test-7..Sign Up functionality..............................................................

    //test-..............................................
    @When("I click on Sign Up button")
    public void i_click_on_sign_up_button() throws InterruptedException {
        hp.clickOnSignUpHomePageBtn();
    }

    @When("I do necessary steps to land on User info page")
    public void i_do_necessary_steps_to_land_on_user_info_page() throws InterruptedException {
        hp.verifyClickOnOnlineBankingEnrollmentContinue();
        hp.verifyESignatureAgreementAndContinueBtn();
    }

    @When("I select account type")
    public void i_select_account_type() {
        hp.selectAccountType();
    }

    @When("I enter user information")
    public void i_enter_user_information(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        hp.enterFirstName(data.get(1).get(0));
        hp.enterLastName(data.get(1).get(1));
        hp.enterEmail(data.get(1).get(2));
        hp.enterAtmCardNumber(data.get(1).get(3));
        hp.enterSsnNumber(data.get(1).get(4));
        hp.enterAccountNumber(data.get(1).get(5));
        hp.enterUserName(data.get(1).get(6));
        hp.reEnterUserName(data.get(1).get(7));
        hp.enterUserPassword(data.get(1).get(8));
        hp.reEnterUserPassword(data.get(1).get(9));
    }

    @And("I check Yes From Bill Pay Option")
    public void i_check_yes_from_bill_pay_option() {
        hp.checkYesFromBillPayOption();
    }

    @And("I select Paper less Option")
    public void i_select_paper_less_option() {
        hp.goPaperlessOption();
    }

    @When("I click on continue button")
    public void i_click_on_continue_button() {
        hp.clickOnContinueBtn();
    }

    @Then("I should see {string} is properly appear")
    public void i_should_see_is_properly_appear(String expectedResult) {
        hp.validateSignUpPageText(expectedResult);
    }


    @And("I click on Online Banking Enrollment continue button")
    public void i_click_on_online_banking_enrollment_continue_button() {
        hp.verifyClickOnOnlineBankingEnrollmentContinue();
    }

    @And("I accept eSignatureAgreement and click on continue button")
    public void i_accept_esignatureagreement_and_click_on_continue_button(){
        hp.verifyESignatureAgreementAndContinueBtn();

    }


//    test-8.Login functionality test with invalid credentials......................

    @When("I click on logIn button in homePage")
    public void i_click_on_log_in_button_in_home_page() {
        hp.clickOnTdLogInBtn();
    }

    @When("I click not now on the questions on Stimulus Payments Pop up")
    public void i_click_not_now_on_the_questions_on_stimulus_payments_pop_up() {
        hp.questionsOnStimulusPaymentsPopUp2();
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String userName, String password) {
        hp.enterUserInfo(userName, password);
    }

    @When("I click on login")
    public void i_click_on_login() {
        hp.clickOnLogInBtn();
    }

    @Then("I validate {} message")
    public void i_validate_message(String expectedText) {
        hp.validateLogInText(expectedText);
    }

    /**
     * test-9.TD Bank product dropDown list check
     */
    @When("I click on product")
    public void i_click_on_product() throws InterruptedException {
        hp.clickOnProductBtn();
    }

    @Then("I validate {string} displayed")
    public void iValidateDisplayed(String expectedResult) {
        hp.validateProductText(expectedResult);
    }
}






