package stepDefinitions;

import common.WebAPI;
import homepage.DestinationDealsHom;
import homepage.UAActionHome;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

import org.openqa.selenium.support.PageFactory;

import static homepage.UAWebElement.*;


public class UAOffersSectionStepDefinition extends WebAPI {
    UAActionHome act;
    DestinationDealsHom action;

    @BeforeStep
    public void getInit() {
        act = PageFactory.initElements(driver, UAActionHome.class);
    }

    @Given("I click on the Current offers and promos link")
    public void i_click_on_the_current_offers_and_promos_link() {
        act.clickOnCurrentOffersPromos();
    }

    @Then("I should see Deals & offers on the front page")
    public void i_should_see_deals_offers_on_the_front_page() {
        act.VerifyclickOnCurrentOffersProms();
    }

    @Given("I click on MileagePlus news and offers link")
    public void i_click_on_mileage_plus_news_and_offers_link() {
        act.clickOnMileageAndPlus();
    }

    @Then("I should see MileagePlus deals & offers on the front page")
    public void i_should_see_mileage_plus_deals_offers_on_the_front_page() {
        act.verifyMileageAndPlusIsClicked();
    }

    @When("I click on Discounts for 18 to 22 year olds link")
    public void i_click_on_discounts_for_to_year_olds_link() {
        act.clickOnAgeDiscountLink();
    }

    @Then("I should see Discounts for 18 to 22 year olds on the front page")
    public void i_should_see_discounts_for_to_year_olds_on_the_front_page() {
        act.verifyAgeDiscountIsClicked();
    }

    @Given("I click on Veterans Advantage discount link")
    public void i_click_on_veterans_advantage_discount_link() {
        act.clickOnVeteransAdvantage();
    }

    @Then("I should see Veterans Advantage discount on the front page")
    public void i_should_see_veterans_advantage_discount_on_the_front_page() {
        act.verifyVeteransAdvantageIsClicked();

    }

    @And("I clicked On Redeem eCertificate link")
    public void i_clicked_on_redeem_e_certificate_link() throws InterruptedException {
        act.clickOnRedeemeCert();
        sleepFor(3);
        scrollTO(locatorToMakevisible);
    }

    @Then("I should see Redeem eCertificate displayed on the front page")
    public void i_should_see_redeem_e_certificate_displayed_on_the_front_page() {
        act.verifyRedeemeCertIsClicked();
    }

    @When("scroll to Electronic travel certificate Section")
    public void scroll_to_electronic_travel_certificate_section() {
        act.scrollToElectronicTravel();
    }

    @When("Select Year {string} Under Year Issued")
    public void select_year_under_year_issued(String string) {
        act.enterInWebElement(toEnterYearInfoLocator, string);
    }

    @When("entered {string} in PIN Options")
    public void entered_in_pin_options(String string) {
        act.enterInWebElement(enterPONLocator, string);
    }

    @When("enter {string} in the last name field")
    public void enter_in_the_last_name_field(String string) {
        act.enterInWebElement(enterLastNameLocator, string);
    }

    @When("I clicked on confirm button")
    public void i_clicked_on_confirm_button() {
        clickByCss(clickOnConfirmButtonLocator);
    }

    @Then("I should have get {string} in return")
    public void i_should_have_get_in_return(String string) {
        act.verifyeCeritificate();
    }

    @Given("I Selected the Year issued {string}")
    public void i_selected_the_year_issued(String years) {
        selectOptionByVisibleText(LocatorForYearSelection,years);
    }

    @Given("I entered the an invalid Pin {string}")
    public void i_entered_the_an_invalid_pin_digits(String string) {
        typeByCss(LocatorToEnterPIN,string);
    }

    @Given("I entered unanimous  Recipient's last name {string}")
    public void i_entered_unanimous_recipient_s_last_name(String string) {
        typeByCss(LocatorForRecipientsLName,string);
    }
    @When("I clicked on the confirm button")
    public void i_clicked_on_the_confirm_button() throws InterruptedException {
        clickByCss(locatorToClickOnConfirm);
        sleepFor(5);

    }

    @Then("I should have get a response {string}")
    public void i_should_have_get_a_response_entered_valid_information(String expected) {
        action.verifyBalanceLookup(expected);
    }

}
