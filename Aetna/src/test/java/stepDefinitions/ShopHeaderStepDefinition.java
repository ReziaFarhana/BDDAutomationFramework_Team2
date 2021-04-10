package stepDefinitions;

import common.WebAPI;
import homepage.ShopHeader;
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

public class ShopHeaderStepDefinition extends WebAPI {

    static ShopHeader shop;

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
        shop = PageFactory.initElements(driver, ShopHeader.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on the Individual Plans Page")
    public void i_am_on_the_individual_plans_page() throws IOException {
        openBrowser("https://www.aetna.com/individuals-families.html");
    }

    @And("I click Shop for a plan tab")
    public void i_click_shop_for_a_plan_tab() {
        shop.clickShopTab();
    }

    @When("I hover over Medicare tab")
    public void i_hover_over_medicare_tab() throws InterruptedException {
        shop.hoverMedicare();

    }

    @Then("I should see Browse Plans Link")
    public void i_should_see_browse_plans_link() {
        shop.verifyPlans();

    }


    @Then("I should see Find Doctor Link")
    public void iShouldSeeFindDoctorLink() {
        shop.findDoctor();

    }

    @Then("I should see the page title as {string}")
    public void i_should_see_the_providers_page_title_as(String expectedTitle) {
        shop.verifyPageTitle(expectedTitle);
    }


    @Then("I should see the page url as {string}")
    public void iShouldSeeThePageUrlAs(String expectedUrl) {
        shop.verifyPageUrl(expectedUrl);

    }

    @When("I click Find Doctor Link")
    public void iClickFindDoctorLink() {
        shop.clickfindaDoctor();

    }

    @When("I click Browse Plans Link")
    public void iClickBrowsePlansLink() {
        shop.clickBrowsePlans();


    }

    @Then("I should see drug list Link")
    public void iShouldSeeDrugListLink() {
        shop.findDrugList();

    }

    @When("I click Check our drug list Link")
    public void iClickCheckOurDrugListLink() {
        shop.clickDrugList();


    }

    @When("I hover over Health coverage tab")
    public void iHoverOverHealthCoverageTab() throws InterruptedException {
        shop.hoverHealthCoverage();
    }


    @Then("I should see Health coverage Link")
    public void iShouldSeeHealthCoverageLink() {
        shop.findHealthCoverage();


    }

    @Then("I should see Plans through an employer Link")
    public void iShouldSeePlansThroughAnEmployerLink() {
        shop.findEmployerPlans();

    }

    @When("I click Plans through an employer Link")
    public void iClickPlansThroughAnEmployerLink() {
        shop.clickEmployerPlans();

    }


    @Then("I should see Student plans link")
    public void iShouldSeeStudentPlansLink() {
        shop.findStudent();
    }

    @When("I click Student plans link")
    public void iClickStudentPlansLink() {
        shop.clickStudentPlans();
    }

}


