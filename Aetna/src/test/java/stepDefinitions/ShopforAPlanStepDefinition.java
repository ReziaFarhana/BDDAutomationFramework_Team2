package stepDefinitions;

import aetna.AetnaHomePage;
import aetna.ShopForAPlan;
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

import static aetna.WebElement.*;

public class ShopforAPlanStepDefinition extends WebAPI {
    ShopForAPlan shopForAPlan;

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
        shopForAPlan = PageFactory.initElements(driver, ShopForAPlan.class);
    }
//    @After
//    public void closeBrowser() {
//        cleanUp();
//    }

    //-----------Shop For Plan--->Browse plans-->medicare advantage-->zipcode-->view 2021----------------------------------
    @And("I click on Shop for a Plan")
    public void i_click_on_shop_for_a_plan() {
        shopForAPlan.shopForPlan();

    }
    @And("I click on Medicare and I click on Browse Aetna Medicare Plans")
    public void i_click_on_medicare_and_i_click_on_browse_aetna_medicare_plans() {
        shopForAPlan.medicareAndBrowsePlans();

    }
    @And("I click on Medicare Advantage Plans")
    public void i_click_on_medicare_advantage_plans() {
        shopForAPlan.medicareAdvantage();

    }
    @And("I enter the Zip Code")
    public void i_enter_the_zip_code() {
        shopForAPlan.zipCode();

    }
    @And("I click View 2021 Plans")
    public void i_click_view_2021_plans() throws InterruptedException {
        shopForAPlan.view2021Plans();
    }

    @Then("I Verify the plans Available {string} Title")
    public void iVerifyThePlansAvailableTitle(String arg0) {
        shopForAPlan.verifyPlanListTitlePage(verifyPlanListTitle);
    }
//------------Sort DD--->PremiumLowToHigh---->add to cart
    @And("I click the Sort Drop Down")
    public void iClickTheSortDropDown() {
        shopForAPlan.sortDD();
    }

    @And("I Select Plan Premium\\(Low to High)")
    public void iSelectPlanPremiumLowToHigh() {
        shopForAPlan.planLowToHigh();
    }

    @When("I click Add To Cart")
    public void iClickAddToCart() throws InterruptedException {
        shopForAPlan.addToCart();
    }

    @Then("I Verify the {string} Text")
    public void iVerifytheText(String expectedText) {
        shopForAPlan.verifyMyCartText(expectedMyCartText);
    }

    //---------------radio button--->dental and vision add button--proceed to checkout


    @And("I click the Existing Aetna or SilverScript member option radio button")
    public void iClickTheExistingAetnaOrSilverScriptMemberOptionRadioButton() {
        shopForAPlan.existingMemberRadioButton();
    }

    @And("I click Dental and Vision Add button")
    public void iClickDentalAndVisionAddButton() {
        shopForAPlan.dentalAndVisionAddButton();
    }

    @When("I Click the Proceed to Checkout button")
    public void iClickTheProceedToCheckoutButton() throws InterruptedException {
        shopForAPlan.proceedToCheckout();
    }

    @Then("I verify the Personal Information {string} Text")
    public void iVerifyThePersonalInformationText(String expectedText) {
        shopForAPlan.verifyPersonalInfoPage("Personal Information");
    }

    @Then("I verify the Personal Information {string} Title")
    public void iVerifyThePersonalInformationTitle(String arg0) {
        shopForAPlan.verifyPersonalInfoTitle("Aetna Medicare - Enrollment Form");
    }
//------------------------personalInfo page registration
    @And("I Click the Special Enrollment CheckBox")
    public void iClickTheSpecialEnrollmentCheckBox() {
        shopForAPlan.specialEnrollmentCheckBoc();
    }


    @And("I enter the First Name {string} in the Text Box")
    public void iEnterTheFirstNameInTheTextBox(String firstName) {
        shopForAPlan.firstNameInput(firstName);

    }

    @And("I enter the Middle Initial {string} in the Text Box")
    public void iEnterTheMiddleInitialInTheTextBox(String middleName) {
        shopForAPlan.middelInitialInput(middleName);

    }

    @And("I enter the Last Name {string} in the Text Box")
    public void iEnterTheLastNameInTheTextBox(String lastname) {
        shopForAPlan.lastNameInput(lastname);

    }

    @And("I enter the Date of Birth {string} in the Text Box")
    public void iEnterTheDateOfBirthInTheTextBox(String dob) {
        shopForAPlan.dateOfBirthInput(dob);

    }

    @And("I enter the Primary Phone Number {string} in the Text Box")
    public void iEnterThePrimaryPhoneNumberInTheTextBox(String phNum) {
        shopForAPlan.primaryPhoneNumber(phNum);


    }

    @And("I enter the Email Address {string} in the Text Box")
    public void iEnterTheEmailAddressInTheTextBox(String email) {
        shopForAPlan.emailAddressInput(email);

    }

    @And("I Click the Gender RadioButton")
    public void iClickTheGenderRadioButton() {
    }


    //------------------------------------------------------------



}
