package stepDefinitions;

import common.WebAPI;
import homepage.UAActionHome;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;


public class UAOffersSectionStepDefinition extends WebAPI {
    UAActionHome act;

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public void getInit() {
        act = PageFactory.initElements(driver, UAActionHome.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
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
    public void i_clicked_on_redeem_e_certificate_link() {

    }

    @Then("I should see Redeem eCertificate displayed on the front page")
    public void i_should_see_redeem_e_certificate_displayed_on_the_front_page() {

    }


}
