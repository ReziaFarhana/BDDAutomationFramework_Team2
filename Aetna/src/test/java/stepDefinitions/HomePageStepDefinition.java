package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.IExpectedExceptionsHolder;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {

    static HomePage homePage;


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
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I m on Aetna homePage")
    public void user_is_on_explore_aetna_sites() throws IOException {
        openBrowser("https://www.aetna.com");
    }


//**************************************************************************************
// account Management


    @Given("I am on Aetna Home Page")
    public void i_am_on_aetna_home_page() throws IOException {
        openBrowser("https://www.aetna.com");
    }


    @And("I click on member Support")
    public void iClickOnMemberSupport() {
        homePage.ClickOnMemberSupport();
    }

    @And("I hover on Account Management")
    public void iHoverOnAccountManagement() {
        homePage.HoverOnAccountManagement();

    }

    @When("I click on log in to your member website")
    public void iClickOnLogInToYourMemberWebsite() {
        homePage.ClickOnLogInToYourMemberWebsite();
    }

    @Then("I should see Welcome to Aetna's member website")
    public void iShouldSeeWelcomeToAetnaSMemberWebsite() {

    }


    @When("I click on Find doctor")
    public void i_click_on_find_doctor() {
        homePage.findDoctor();
    }

    @Then("I verify {string} is Title")
    public void i_verify_is_title(String expectedTitle) {
        homePage.verifyTitle(expectedTitle);
    }

//*****************************************************

    @When("I click on find medicine and costs")
    public void i_click_on_find_medicine_and_costs() {
        homePage.findMedicine();

    }

    @Then("I verify {string}  Title")
    public void i_verify_title(String expectedTitle) {
        homePage.verifyTitle(expectedTitle);
    }

    // find a form
    @When("I click on find a form")
    public void i_click_on_find_a_form() {
        homePage.findAForm();
    }

    @Then("I verify {string}  as Title")
    public void i_verify_as_title(String expectedTitle) {
        homePage.verifyTitle(expectedTitle);
    }
//Pay your premium

    @When("I click Pay your premium")
    public void i_click_pay_your_premium() {
        homePage.payYourPremium();
    }
//ID card

    @When("I click on your ID card")
    public void i_click_on_your_id_card() {
        homePage.yourID();
    }

    @Then("I verify the {string} is Title")
    public void i_verify_the_is_title(String expectedTitle) {
        homePage.verifyTitle(expectedTitle);
    }

    @When("I click on Check a claim")
    public void i_click_on_check_a_claim() {
        homePage.CheckAClaim();
    }
//************************************************************

    @When("I click on View Coverage")
    public void i_click_on_view_coverage() {
        homePage.CheckAClaim();
    }

    //**************************************************************
//Health
    @And("I hover the health guide")
    public void iHoverTheHealthGuide() {
        homePage.HoverTheHealthGuide();
    }

    @When("I click on all health resources")
    public void iClickOnAllHealthResources() {
        homePage.ClickOnAllHealthResources();
    }


    @Then("I should see Your good health starts here")
    public void iShouldSeeYourGoodHealthStartsHere() {
        homePage.ShouldSeeYourGoodHealthStartsHere();
    }

    @When("I click living healthy")
    public void iClickLivingHealthy() {
        homePage.ClickLivingHealthy();
    }

    @Then("I verify {string} is the Title")
    public void iVerifyIsTheTitle(String arg0) {
    }

    @When("I click Understanding health care")
    public void iClickUnderstandingHealthCare() {
        homePage.ClickUnderstandingHealthCare();
    }

    @Then("I verify {string}  the Title")
    public void iVerifyTheTitle(String arg0) {

    }


    @When("I click Understanding managing Health")
    public void iClickUnderstandingManagingHealth() {
        homePage.ClickUnderstandingManagingHealth();
    }

    @And("I hover on Additional Resources")
    public void iHoverOnAdditionalResources() {
        homePage.HoverOnAdditionalResources();
    }


    @Then("I verify {string} is title")
    public void iVerifyIsTitle(String expectedResult) {
        homePage.getTitle();
    }

    @When("I click on Health insurance rights and resources")
    public void iClickOnHealthInsuranceRightsAndResources() {
        homePage.ClickOnHealthInsuranceRightsAndResources();
    }

    @When("I click on contact us")
    public void iClickOnContactUs() {
        homePage.ClickOnContactUs();

    }

    @Then("I verify {string} is a Title")
    public void iVerifyIsATitle(String expectedResult) {
        homePage.getTitle();
    }

    @When("I click on Frequently asked questions")
    public void iClickOnFrequentlyAskedQuestions() {
        homePage.ClickOnHealthInsuranceRightsAndResources();

    }

    @Then("I verify {string} is displaying Title")
    public void iVerifyIsDisplayingTitle(String expectedResult) {
        homePage.getTitle();
    }
//*******************************************************************************************************


    @And("I click on shop for plan")
    public void iClickOnShopForPlan() {
        homePage.ClickOnShopForPlan();
    }

    //  Medicare
    @And("I hover on medicare")
    public void iHoverOnMedicare() {
        homePage.hoverOnMedicare();
    }

    @And("I click on find doctor")
    public void iClickOnFindDoctor() {
        homePage.ClickOnFindDoctor();
    }

    @Then("I should see Find Aetna Medicare Health Care Professionals")
    public void iShouldSeeFindAetnaMedicareHealthCareProfessionals() {
        homePage.verifyText();
    }


    //   Browse Aetna medicare plan
    @When("I click on Browse Aetna medicare plan")
    public void iClickOnBrowseAetnaMedicarePlan() {
        homePage.ClickOnBrowseAetnaMedicarePlan();
    }

    @Then("I verify {string} as Title")
    public void iVerifyAsTitle(String expectedTitle) {
        homePage.verifyTitle(expectedTitle);
        //   homePage.verifyText1();
    }


    // Check our drug list
    @When("I click on Check our drug list")
    public void iClickOnCheckOurDrugList() {
        homePage.ClickOnCheckOurDrugList();
    }

    // Understand Medicare
    @When("I click on Understand Medicare")
    public void iClickOnUnderstandMedicare() {
        homePage.ClickOnUnderstandMedicare();
    }

    // Find A Plan To Meet Your Needs
    @When("I click on Find a plan to meet your needs")
    public void iClickOnFindAPlanToMeetYourNeeds() {
        homePage.ClickOnFindAPlanToMeetYourNeeds();
    }

    // EnrollInMedicare
    @When("I click on Enroll in Medicare")
    public void iClickOnEnrollInMedicare() {
        homePage.ClickOnEnrollInMedicare();
    }


    //HealthCoverage
    @And("I hover on health coverage")
    public void iHoverOnHealthCoverage() {
        homePage.HoverOnHealthCoverage();
    }

    //Plans Through An Employer
    @When("I click on Plans through an employer")
    public void iClickOnPlansThroughAnEmployer() {
        homePage.PlansThroughAnEmployer();
    }

    @Then("I should see Health insurance through work")
    public void iShouldSeeHealthInsuranceThroughWork() {
        homePage.verifyText2();
    }

    @When("I click on International plans")
    public void iClickOnInternationalPlans() {
        homePage.lickOnInternationalPlans();
    }

    @Then("I verify  Find Doctor, Dentist or Hospital")
    public void iVerifyFindDoctorDentistOrHospital() {
    }

    @When("I click on Find a Doctor")
    public void iClickOnFindADoctor() {
        homePage.ClickOnFindADoctor();
    }

    @When("I click on Student plans")
    public void iClickOnStudentPlans() {
        homePage.ClickOnStudentPlans();
    }

    //Dental vision and Supplemental
    @And("I hover on Dental vision and Supplemental")
    public void iHoverOnDentalVisionAndSupplemental() {
        homePage.HoverOnDentalVisionAndSupplemental();
    }

    @When("I click on Dental plans")
    public void iClickOnDentalPlans() {
        homePage.iClickOnDentalPlans();
    }

    @When("I click on Find a dentist")
    public void iClickOnFindADentist() {
        homePage.ClickOnFindADentist();
    }

    @Then("I should see Directory of Health Care Professionals")
    public void iShouldSeeDirectoryOfHealthCareProfessionals() {
        homePage.verifyText4();
    }

    //VisionPlans
    @When("I click on Vision plans")
    public void iClickOnVisionPlans() {
        homePage.ClickOnVisionPlans();

    }

    @Then("I should see Vision insurance for individuals")
    public void iShouldSeeVisionInsuranceForIndividuals() {
        homePage.verifyText5();
    }

    @When("I click on Find an eye doctor")
    public void iClickOnFindAnEyeDoctor() {
        homePage.clickOnFindAnEyeDoctor();
    }

    //Supplemental plans
    @When("I click on Supplemental plans")
    public void iClickOnSupplementalPlans() {
        homePage.clickOnSupplementalPlans();
    }

    //HoverOnPharmacy
    @And("I hover on Pharmacy")
    public void iHoverOnPharmacy() {
        homePage.hoverOnPharmacy();
    }

    @When("I click on Get pharmacy plan information")
    public void iClickOnGetPharmacyPlanInformation() {
        homePage.clickOnGetPharmacyPlanInformation();

    }

    @Then("I should see Pharmacy benefits and services")
    public void iShouldSeePharmacyBenefitsAndServices() {
        homePage.verifyText7();
    }

    @When("I click on Find a pharmacy")
    public void iClickOnFindAPharmacy() {
        homePage.clickOnFindAPharmacy();
    }

    @And("I hover on  Medicaid")
    public void iHoverOnMedicaid() {
        homePage.iHoverOnMedicaid();
    }

    @When("I click on Medicaid plans")
    public void clickFindMedicineAndCosts() {
        homePage.clickFindMedicineAndCosts();

    }


}
