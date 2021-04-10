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

import static homepage.HomePageWebElement.actualMyCartText;

public class HomePageStepDefinition extends WebAPI {
    static HomePage homePage;

    @BeforeStep
    public static void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on Aetna home page")
    public void i_am_on_aetna_home_page() throws IOException {
        openBrowser("https://www.aetna.com/");
    }

    @When("I click shop for a plan")
    public void i_click_shop_for_a_plan() {
        homePage.shopForPlan();
    }

    @And("I go Health coverage")
    public void i_go_health_coverage() {
        homePage.verifyHealthCoverage();
    }

    @And("I click Student plans")
    public void i_click_student_plans() {
        homePage.studentPlansBtn();
    }

    @Then("I validate {string} is appeared properly")
    public void i_validate_is_appeared_properly(String expectedText) {
        homePage.validateHealthCoverage(expectedText);
    }

    /**
     * Test-2............................................................................................
     */

    @When("I click Plans through an employer")
    public void i_click_plans_through_an_employer() {
        homePage.plansThroughEmployer();
    }

    @Then("I validate {string} is displayed properly")
    public void i_validate_is_displayed_properly(String expectedText) {
        homePage.validatePlansThroughEmployer(expectedText);
    }

    /**
     * Test-3 International Plans..............................................................
     */

    @When("I click International Plans")
    public void i_click_international_plans() {
        homePage.internationalPlansCheck();
    }

    @Then("I validate Aetna Well-being is appeared properly")
    public void i_validate_aetna_well_being_is_appeared_properly() {
        homePage.validateInternationalPlans("Aetna Well-being");
    }
    /**
     * Test-4...............................................................
     */

//    // Find a doctor
//    @And("I click find a doctor")
//    public void i_click_find_a_doctor() {
//        homePage.findADoctorCheck();
//    }
//
//    @Then("I validate {String} Alert is appeared properly")
//    public void i_validate_alert_is_appeared_properly() {
//       homePage.validateFindADoctorCheck("");
//    }

    /**
     * Test-5...........................................................................
     */

    @When("I go dental, vision and supplemental")
    public void i_go_dental_vision_and_supplemental() {
        homePage.dentalAndVisionCheck();
    }

    @When("I click dental plans")
    public void i_click_dental_plans() {
        homePage.dentalPlanCheck();
    }

    @Then("I validate Legal notices is appeared properly")
    public void i_validate_legal_notices_is_appeared_properly() {
        homePage.validatePlansThroughEmployer("Legal notices");
    }

    /**
     * Test-6...........................
     */
// Find a Dentist
    @When("I click find a dentist")
    public void i_click_find_a_dentist() {
        homePage.findADentistCheck();
    }

    @Then("I validate {string} appeared properly")
    public void i_validate_appeared_properly() {
        homePage.validateFindADentistCheck("You Can:");
    }

    /**
     * Test-7... Vision Plans.........................................
     */

    @When("I click vision plans")
    public void i_click_vision_plans() {
        homePage.visionPlansCheck();
    }

    @Then("I validate Aetna Dental Direct plan is appeared properly")
    public void i_validate_aetna_dental_direct_plan_is_appeared_properly() {
        homePage.validateVisionPlansCheck("Aetna Dental Direct plan");
    }

    /**
     * Test-8.Aetna Request call Functionality Checking..................
     */

    @When("I click on Explore Aetna sites")
    public void i_click_on_explore_aetna_sites() {
        homePage.exploreAetnaSites();
    }

    @When("I click on Aetna.com")
    public void i_click_on_aetna_com() {
        homePage.aetnaCom();
    }

    @When("I click on Aetna Medicare")
    public void i_click_on_aetna_medicare() {
        homePage.aetnaMedicare();
    }

    @When("I click on Request call")
    public void i_click_on_request_call() {
        homePage.requestCall();
    }

    @Then("I validate A new plan is appeared properly")
    public void i_validate_a_new_plan_is_appeared_properly() {
        homePage.validateANewPlan();
    }

    /**
     * Test-9 Aetna Plan from an employer Functionality Checking..............
     */
    @When("I click on Find a doctor")
    public void i_click_on_find_a_doctor() throws InterruptedException {
        homePage.findADoctor();
    }

    @When("I click on Plan from an employer")
    public void i_click_on_plan_from_an_employer() {
        homePage.planFromAnEmployer();
    }

    @Then("I validate {string} message is appeared properly")
    public void i_validate_message_is_appeared_properly(String expectedText) {
        homePage.validateFindADoctor(expectedText);
    }

    /**
     * Aetna Welcome Functionality Checking
     */
    @When("I click on For Providers")
    public void i_click_on_for_providers() throws InterruptedException {
        homePage.forProviders();
    }

    @When("I click on Join the Aetna network")
    public void i_click_on_join_the_aetna_network() {
        homePage.joinTheAetnaNetwork();
    }

    @When("I click on Welcome")
    public void i_click_on_welcome() {
        homePage.welcome();
    }

    @Then("I validate {string} is appeared")
    public void i_validate_is_appeared(String expectedText) {
        homePage.validateForProviders(expectedText);
    }

    /**
     * Aetna Medical Functionality Checking
     */

    @When("I click on Medical")
    public void i_click_on_medical() throws InterruptedException {
        homePage.medical();
    }

    @Then("I validate Medical Request for Participation is appeared properly")
    public void i_validate_medical_request_for_participation_is_appeared_properly() {
        homePage.validateMedical();
    }

    /**
     * Aetna Dental Functionality Checking
     */
    @When("I click on Dental")
    public void i_click_on_dental() {
        homePage.dentalPlanCheck();
    }

    @Then("I validate {string} is displayed")
    public void i_validate_is_displayed(String expectedText) {
        homePage.validateDentalTextCheck(expectedText);
    }

    /**
     * Aetna Behavioral Health Functionality Checking
     */
    @When("I click on Behavioral Health")
    public void i_click_on_behavioral_health() {
        homePage.behavioralHealth();
    }

    @Then("I validate Behavioral Health Request for Participation is appeared properly")
    public void i_validate_behavioral_health_request_for_participation_is_appeared_properly() {
        homePage.validateBehavioralHealth();
    }

    /**
     * Aetna Facility Request for Participation Functionality Checking
     */
    @When("I click on Facility")
    public void i_click_on_facility() throws InterruptedException {
        homePage.facility();
    }

    @Then("I validate Facility Request for Participation is appeared properly")
    public void i_validate_facility_request_for_participation_is_appeared_properly() {
        homePage.validateFacility();
    }

    /**
     * Aetna Others Functionality Checking
     */
    @When("I click on Others")
    public void i_click_on_others() throws InterruptedException {
        homePage.others();
    }

    @Then("I validate Other networks you can join is appeared properly")
    public void i_validate_other_networks_you_can_join_is_appeared_properly() {
        homePage.validateOthers();
    }

    /**
     * Aetna Find a doctor or hospital Functionality Checking
     */
    @When("I click on Precertification")
    public void i_click_on_precertification() {
        homePage.precertification();
    }

    @When("I click on Find a doctor or hospital")
    public void i_click_on_find_a_doctor_or_hospital() {
        homePage.findADoctorOrHospital();
    }

    @Then("I validate Directory is appeared properly")
    public void i_validate_directory_is_appeared_properly() {
        homePage.validatePrecertification();
    }

    /**
     * Aetna Disputes & Appeals Overview
     */

    @Then("I took necessary steps to land on Aetna Disputes & Appeals Overview")
    public void i_took_necessary_steps_to_land_on_aetna_disputes_appeals_overview() throws InterruptedException {
        homePage.necessaryStepsAetnaDispute();
    }

    @Then("I validate Clinical Policy Bulletins is appeared properly")
    public void i_validate_clinical_policy_bulletins_is_appeared_properly() {
        homePage.validateAetnaDisputesAppeals("Medicare Information for Health Care Providers | Aetna");
    }

    @And("I click on Shop for a Plan")
    public void i_click_on_shop_for_a_plan() {
        homePage.shopForPlan();

    }

    @And("I click on Medicare and I click on Browse Aetna Medicare Plans")
    public void i_click_on_medicare_and_i_click_on_browse_aetna_medicare_plans() {
        homePage.medicareAndBrowsePlans();

    }

    @And("I click on Medicare Advantage Plans")
    public void i_click_on_medicare_advantage_plans() {
        homePage.medicareAdvantage();

    }

    @And("I enter the Zip Code")
    public void i_enter_the_zip_code() {
        homePage.zipCode();
    }

    @And("I click View 2021 Plans")
    public void i_click_view_2021_plans() throws InterruptedException {
        homePage.view2021Plans();
    }

    @Then("I Verify the plans Available {string} Title")
    public void iVerifyThePlansAvailableTitle(String expectedTitle) {
        homePage.verifyPlanListTitlePage(expectedTitle);
    }

    @And("I click the Sort Drop Down")
    public void iClickTheSortDropDown() {
        homePage.sortDD();
    }

    @And("I Select Plan Premium\\(Low to High)")
    public void iSelectPlanPremiumLowToHigh() {
        homePage.planLowToHigh();
    }

    @When("I click Add To Cart")
    public void iClickAddToCart() throws InterruptedException {
        homePage.addToCart();
    }

    @Then("I Verify the {string} Text")
    public void iVerifytheText(String expectedText) {
        homePage.verifyMyCartText(expectedText);
    }

    @And("I click the Existing Aetna or SilverScript member option radio button")
    public void iClickTheExistingAetnaOrSilverScriptMemberOptionRadioButton() {
        homePage.existingMemberRadioButton();
    }

    @And("I click Dental and Vision add button")
    public void iClickDentalAndVisionAddButton(){
        homePage.dentalAndVisionAddButton();
    }
    @When("I Click the Proceed to Checkout button")
    public void iClickTheProceedToCheckoutButton() throws InterruptedException {
        homePage.proceedToCheckout();
    }

    @Then("I verify the Personal Information {string} Text")
    public void iVerifyThePersonalInformationText(String expectedText) {
        homePage.verifyPersonalInfoPage("Personal Information");
    }

    @Then("I verify the Personal Information {string} Title")
    public void iVerifyThePersonalInformationTitle(String arg0) {
        homePage.verifyPersonalInfoTitle("Aetna Medicare - Enrollment Form");
    }

    @And("I Click the Special Enrollment CheckBox")
    public void iClickTheSpecialEnrollmentCheckBox() {
        homePage.specialEnrollmentCheckBoc();
    }


    @And("I enter the First Name {string} in the Text Box")
    public void iEnterTheFirstNameInTheTextBox(String firstName) {
        homePage.firstNameInput(firstName);
    }

    @And("I enter the Middle Initial {string} in the Text Box")
    public void iEnterTheMiddleInitialInTheTextBox(String middleName) {
        homePage.middelInitialInput(middleName);
    }

    @And("I enter the Last Name {string} in the Text Box")
    public void iEnterTheLastNameInTheTextBox(String lastname) {
        homePage.lastNameInput(lastname);
    }

    @And("I enter the Date of Birth {string} in the Text Box")
    public void iEnterTheDateOfBirthInTheTextBox(String dob) {
        homePage.dateOfBirthInput(dob);
    }

    @And("I enter the Primary Phone Number {string} in the Text Box")
    public void iEnterThePrimaryPhoneNumberInTheTextBox(String phNum) {
        homePage.primaryPhoneNumber(phNum);
    }

    @And("I enter the Email Address {string} in the Text Box")
    public void iEnterTheEmailAddressInTheTextBox(String email) {
        homePage.emailAddressInput(email);
    }

    @And("I Click the Gender RadioButton")
    public void iClickTheGenderRadioButton() {
        homePage.clickOngenderBtn();
    }
    @And("I enter the Address {string} in the Text Box")
    public void iEnterTheAddressInTheTextBox(String Address) {
        homePage.TypeAddress(Address);
    }

    @And("I click female as Gender")
    public void iClickFemaleAsGender() {
        homePage.clickFemaleGenderBtn();
    }

    @Then("I verify Mailing Address selection is optional")
    public void iVerifyMailingAddressSelectionIsOptional() {
    }
}

