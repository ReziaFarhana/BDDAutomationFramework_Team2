package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import static homepage.HomePageWebElement.*;

public class FindMedicineCostsStepDefinition extends WebAPI {

    HomePage act;


    @BeforeStep
    public void getInit() {
        act = PageFactory.initElements(driver, HomePage.class);
    }


    @When("I click on find Medicine and costs link")
    public void i_click_on_find_medicine_and_costs_link() {
        driver.findElement(By.xpath(memberSupportHomePageLink)).sendKeys(Keys.TAB, Keys.ENTER);
        clickByXpath(findMedicineCost);

    }

    @Then("I should have land to a page {string}")
    public void i_should_have_land_to_a_page(String string) {
        act.verifyMedicinCostPage(string);
    }

    @When("I click on explore medicare option button")
    public void i_click_on_explore_medicare_option_button() {
        clickByXpath(medicareOption);
    }

    @Then("I should have get medicare Aetna logo page")
    public void i_should_have_get_medicare_aetna_logo_page() {
        act.verifyMedicareAetnaPage();
    }

    @When("I enter {string} {string} and {string}")
    public void i_enter_and(String firstName, String lastName, String email) {
        typeOnlyOnElement(fNameEmailSubscription, firstName);
        typeOnlyOnElement(lNameEmailSubscription, lastName);
        typeOnlyOnElement(emailAddressSubscription, email);
    }

    @When("I click on a signUp button")
    public void i_click_on_a_sign_up_botton() {
        clickByCss(clickOnSignUpButton);
    }

    @Then("I should have a text response of {string}")
    public void i_should_have_a_text_response_of(String string) {
        act. verifyEmailSubscritption(string);
    }


}
