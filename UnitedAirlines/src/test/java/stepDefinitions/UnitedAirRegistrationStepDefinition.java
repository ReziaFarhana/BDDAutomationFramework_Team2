package stepDefinitions;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import unitedairregistration.UnitedAirRegistrationPage;

import java.util.List;


public class UnitedAirRegistrationStepDefinition extends WebAPI {
    static UnitedAirRegistrationPage ur;

    @After // class project
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo"); // ... and embed it in the report.
        }
        cleanUp();
    }

    @BeforeStep
    public void getInIt() {
        ur = PageFactory.initElements(driver, UnitedAirRegistrationPage.class);
    }

    @When("I click on signIn button")
    public void i_click_on_sign_in_button() throws InterruptedException {
        ur.signInButton();
    }

    @When("I click on join now and use title")
    public void i_click_on_join_now_and_use_title() throws InterruptedException {
        ur.joinNowButton();
    }

    @When("I use data in member information field")
    public void i_use_data_in_member_information_field(DataTable data) throws InterruptedException {
        List<List<String>> sign = data.asLists(String.class);
        ur.typeFirstName(sign.get(1).get(0));
        ur.typeMiddleName(sign.get(1).get(1));
        ur.typeLastName(sign.get(1).get(2));
        ur.typeDate(sign.get(1).get(3));
        ur.typeYear(sign.get(1).get(4));
    }

    @When("month and gender field is selected")
    public void month_and_gender_field_is_selected() throws InterruptedException {
        ur.monthAndGender();
    }

    @Then("I validate {string} is appeared properly")
    public void i_validate_is_appeared_properly() {
        ur.validateContactInfoText();
    }

    /**
     * Contact information test
     */
    @When("I entered data in Contact Information field")
    public void i_entered_data_in_contact_information_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        ur.typeStreetName(sign.get(1).get(0));
        ur.typeCityName(sign.get(1).get(1));
        ur.typeStateName(sign.get(1).get(2));
        ur.typeZipCode(sign.get(1).get(3));
    }

    @Then("I validate {string} appear properly")
    public void i_validate_appear_properly() {
        ur.validatePhoneNoText();
    }

    /**
     * Phone number field check
     */
    @When("I entered data in phone number field")
    public void i_entered_data_in_phone_number_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        ur.typePhoneNumber(sign.get(1).get(0));
        ur.typeExtensionPhone(sign.get(1).get(1));
        ur.typeBusinessPhone(sign.get(1).get(2));
        ur.typeExtensionBusinessPhn(sign.get(1).get(3));
        ur.typeAirportName(sign.get(1).get(4));
    }

    @And("I click on check box field")
    public void i_click_on_check_box_field() {
        ur.checkBoxClick();
    }

    @Then("I verify {string} appear properly")
    public void i_verify_appear_properly(String email) {
        ur.ValidateEmailText();
    }

    /**
     * Email field test
     */
    @When("I entered data in email field")
    public void i_entered_data_in_email_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        ur.typeEmailAddressField(sign.get(1).get(0));
        ur.typeVerifyEmailId(sign.get(1).get(1));
    }

    @When("I click on check box and uncheck box")
    public void i_click_on_check_box_and_uncheck_box() throws InterruptedException {
        ur.checkAndUnCheckBox();
    }

    @When("I entered data in password field")
    public void i_entered_data_in_password_field(DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        ur.typePasswordField(sign.get(1).get(0));
        ur.typeReEnterPassword(sign.get(1).get(1));
    }

    @When("I click on Show button")
    public void i_click_on_show_button() throws InterruptedException {
        ur.showButton();
    }

    @Then("I verify {string} display properly")
    public void i_verify_display_properly(String text) {
        ur.ValidateSecurityQuesText();
    }

    /**
     * Security questions check
     */
    @When("I entered data in answer field")
    public void i_entered_data_in_answer_field(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<List<String>> sign = dataTable.asLists(String.class);
        ur.questionAndAnswer1(sign.get(1).get(0));
        ur.questionAndAnswer2(sign.get(2).get(0));
        ur.questionAndAnswer3(sign.get(3).get(0));
        ur.questionAndAnswer4(sign.get(4).get(0));
        ur.questionAndAnswer5(sign.get(5).get(0));
    }

    @Then("I verify Accept and enroll button is enabled")
    public void iVerifyAcceptAndEnrollButtonIsEnabled() {
            ur.validateAcceptAndEnrollBtn();
    }
}
