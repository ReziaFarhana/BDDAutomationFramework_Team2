//package stepDefinitions;
//
//import common.WebAPI;
//import homepage.OnlineBankingPage;
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.support.PageFactory;
//
//import java.io.IOException;
//import java.util.List;
//
//public class OnlineBankingStepDefinition extends WebAPI {
//
//    //    static HomePage homePage;
//    static OnlineBankingPage ob;
//
//    // Cucumber Hook
//    @BeforeStep
//    public static void getInit() {
//        ob = PageFactory.initElements(driver, OnlineBankingPage.class);
//    }
//
//    @AfterStep
//    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
//            // Take a screenshot
//            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
//        }
//    }
//
//    @After
//    public void closeBrowser() {
//        cleanUp();
//    }
////test-1 passed
//    @Given("I am on the TD Bank homePage")
//    public void I_am_on_the_TD_Bank_homePage() throws IOException {
//        openBrowser("https://www.td.com/us/en/personal-banking/");
//    }
//
//    @Given("I see the TD Bank logo")
//    public void I_see_the_TD_Bank_logo() {
//        ob.validateTdBankLogoIsDisplayed();
//    }
//
//    @Given("I close the Ads Choices & Personalization popUp")
//    public void i_close_the_ads_choices_personalization_pop_up() {
//        ob.adsChoicesAndPersonalizationPopUp();
//    }
//
//    @When("I clicks on the Login button under Online Banking")
//    public void I_clicks_on_the_Login_button_under_Online_Banking() {
//        ob.logInIcon();
//    }
//
//    @Then("I can see the Online Banking Log In page is displayed")
//    public void I_can_see_the_Online_Banking_Log_In_page_is_displayed() {
//        ob.validateOnlineBankingWelcomeText();
//    }
//
//    //test-2 passed..........................................................
//    @When("I hover over the services button and I click Online Banking option")
//    public void i_hover_over_the_services_button_and_i_click_online_banking_option() throws InterruptedException {
//       ob.onlineBankingUnderServices();
//    }
//
//    @When("I click on Learn more about Small Business Online Banking.")
//    public void i_click_on_learn_more_about_small_business_online_banking(){
//        ob.smallBusinessOnlineBanking();
//    }
//
//    @Then("I verify {string} is appeared")
//    public void i_verify_is_appeared(String expectedText) {
//       ob.validateSmallBankingOnlinePage(expectedText);
//    }
////test-3.......................................................
//    @When("I scroll down and I click on Enroll now")
//    public void i_scroll_down_and_i_click_on_enroll_now() throws InterruptedException {
//        ob.onlineBankingEnrollNowScroll();
//    }
//    @And("I cancel the Ads Choices & Personalization popUp")
//    public void iCancelTheAdsChoicesPersonalizationPopUp() {
//        ob.questionsOnStimulusPaymentsPopUp();
//    }
//
//        @Then("I verify {string} window pop up")
//        public void i_verify_window_pop_up (String expectedText) throws InterruptedException {
//        ob.validateOnlineBankingEnrollNowPopUp();
//        }
//
////test-4 passed.............................................................................
//        @When("I hover over the services button and I select Student Banking option")
//        public void I_hover_over_the_services_button_and_i_select_student_banking_option () throws InterruptedException
//        {
//            sleepFor(5);
//            ob.hoverOverServicesAndSelectStudentLoan();
//        }
//
//        @Then("I verify {string} is displayed")
//        public void i_verify_is_displayed (String expectedText){
//            ob.verifyStudentLoanPage(expectedText);
//        }
////        test-5................................................................................
//        @When("I click FindUs Icon")
//        public void i_click_find_us_icon() {
//        ob.clickOnFindUsIcon();
//}
//
//        @When("I enter {string} and click on searchIcon")
//        public void i_enter_and_click_on_search_icon(String zipcode) throws InterruptedException {
//            ob.enterLocationAndClickOnSearchIcon(zipcode);
//    }
//
//        @Then("I validate TD bank locations appeared")
//        public void i_validate_td_bank_locations_appeared() throws InterruptedException {
//            ob.validateFindUsValidationText("10 locations near \"Jamaica, NY\"");
//    }
////    test-6 Get direction button check...............................................
//        @When("I take necessary steps and landed on locations page")
//        public void i_take_necessary_steps_and_landed_on_locations_page() throws InterruptedException {
//            ob.landingOnLocationsPage();
//        }
//
//        @And("I click on Get Direction Button")
//        public void i_click_on_get_direction_button() {
//            ob.clickOnGetDirection();
//        }
//
//        @Then("I validate google map page Title")
//        public void i_validate_google_map_page_title() {
//            ob.validateGetDirection();
//    }
////test-7..Sign Up functionality..............................................................
//
//   //test-..............................................
//    @When("I click on signUp button")
//    public void i_click_on_sign_up_button() {
//        ob.clickOnSignInBtn();
//}
//
//    @When("I do necessary steps to land on User info page")
//    public void i_do_necessary_steps_to_land_on_user_info_page() throws InterruptedException {
//        ob.pleaseConfirmCheckBtn();
//        ob.acceptPopUpUsingAlert();
//        ob.eSignAcceptCheckBox();
//        ob.acceptSecondPopUpUsingAlert();
//    }
//
//    @When("I select account type")
//    public void i_select_account_type() {
//        ob.selectAccountType();
//    }
//
//    @When("I enter user information")
//    public void i_enter_user_information(io.cucumber.datatable.DataTable dataTable) {
//        List<List<String>> data = dataTable.asLists(String.class);
//        ob.enterFirstName(data.get(1).get(0));
//        ob.enterLastName(data.get(1).get(1));
//        ob.enterEmail(data.get(1).get(02));
//        ob.enterAtmCardNumber(data.get(1).get(3));
//        ob.enterSsnNumber(data.get(1).get(4));
//        ob.enterAccountNumber(data.get(1).get(5));
//        ob.enterUserName(data.get(1).get(6));
//        ob.reEnterUserName(data.get(1).get(7));
//        ob.enterUserPassword(data.get(1).get(8));
//        ob.reEnterUserPassword(data.get(1).get(9));
//    }
//
//    @When("I click on continue button")
//    public void i_click_on_continue_button() {
//        ob.clickOnContinueBtn();
//
//    }
//
//    @Then("I validate signUp message")
//    public void i_validate_sign_up_message() {
//        ob.validateSignUpPageText("");
//
//    }
////    test-8.Login functionality test with invalid credentials......................
//
//    @When("I click on logIn button in homePage")
//    public void i_click_on_log_in_button_in_home_page() {
//        ob.clickOnTdLogInBtn();
//    }
//
//    @When("I enter {string} and {string}")
//    public void i_enter_and(String userName, String password) {
//        ob.enterUserInfo(userName, password);
//    }
//
//    @When("I click on login")
//    public void i_click_on_login() {
//        ob.clickOnLogInBtn();
//    }
//
//    @Then("I validate the error message")
//    public void i_validate_the_error_message() throws InterruptedException {
//       ob.validateLogInText("Economic Impact Payments:  Be sure your bank info is correct and track your payment with the IRS.  Learn more");
//    }
//
//    /**
//     * test-9.TD Bank product dropDown list check
//     */
//    @When("I click on product")
//    public void i_click_on_product() throws InterruptedException {
//        ob.clickOnProductBtn();
//    }
//
//    @When("I click on checking")
//    public void i_click_on_checking() throws InterruptedException {
//       ob.clickOnCheckingBtn();
//    }
//
//
//
//}
//
//
//
