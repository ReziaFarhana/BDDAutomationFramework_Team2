package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import static homepage.HomePageWebElement.*;

public class MultiPackStepDefinition extends WebAPI {

    HomePage act;

    @BeforeStep
    public void getInit() {
        act = PageFactory.initElements(driver, HomePage.class);
    }

    @Then("I hover on The Health Guide Option and click on All health resources")
    public void i_hover_on_the_health_guide_option_and_click_on_all_health_resources() throws InterruptedException {
        driver.findElement(By.cssSelector(clickOnMemberSupportLink)).sendKeys(Keys.TAB,Keys.TAB, Keys.ENTER);
        clickByCss(anothercheck);
        sleepFor(3);

    }
    @Then("I should land on a new page with a Title {string}")
    public void i_should_land_on_a_new_page_with_a_title(String string) {
        act.verifyLoggedInOnHealthResource(string);
    }

    @And ("I click on HMO vs POS and more")
    public void i_click_on_HMO_vs_POS(){
        clickByXpath(clickOnHMOvsPOS);
    }

    @Then ("I should see the corresponding {string}")
    public void i_should_see_the_corresponding(String expected){
        act.verifyHMOvsPOSIsDesplayed(expected);
    }

    @And("I click on Helping families")
    public void i_click_on_Helping_families(){
        clickByXpath(helpingFamilies);
    }

    @Then ("I should see the corresponding helping families text {string}")
    public void i_should_see_corresponding_helping_families(String expected){
        act. verifyHelpingFamiliesDesplayed(expected);
    }

    @When("I click on Healthy school year")
    public void i_click_on_healthy_school_year() {
        clickByXpath(healthySchoolYear);
    }

    @Then("I should see the corresponding Healthy school year text {string}")
    public void i_should_see_the_corresponding_healthy_school_year_text(String expected) {
        act.verifyHealthySchoolYearIsDesplayed(expected);
    }


}
