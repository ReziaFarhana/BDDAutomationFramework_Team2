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


    @Given("I am Atena homePage")
    public void i_am_atena_home_page() throws IOException {
        openBrowser("https://www.aetna.com/");
    }

    @Given("I click on shop for a plan")
    public void i_click_on_shop_for_a_plan() {
        homePage.shopForAplan();
    }

    @Then("I verify title {string} is working")
    public void i_verify_title_is_working(String exResult) {
        homePage.shopForAPlanText(exResult);

    }
//*********************************************************************************

    @Given("I click on Medicare")
    public void i_click_on_medicare() throws InterruptedException {
        homePage.Medicare();

    }

    @Given("I click on Find a doctor")
    public void i_click_on_find_a_doctor() throws InterruptedException {
        homePage.findAdoctor();

    }

    @Then("i will verify that the page Aetna is working properly")
    public void i_will_verify_that_the_page_aetna_is_working_properly() {

    }
//*********************************************************************************************



    @Given("I click on Individual tab")
    public void i_click_on_individual_tab() throws InterruptedException {
        homePage.Individual();

    }
    @Then("i will verify that the Individual tab is working properly")
    public void i_will_verify_that_the_individual_tab_is_working_properly() {

    }















//    @Given("I am on Atena homePage")
//    public void i_am_on_atena_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Given("I enter {string} in searchBox")
//    public void i_enter_in_search_box(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("I click on search Button")
//    public void i_click_on_search_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I should see {string} is properly appearing in the researches")
//    public void i_should_see_is_properly_appearing_in_the_researches(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I should not see {string}  appearing")
//    public void i_should_not_see_appearing(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I verify {string} is a valid research")
//    public void i_verify_is_a_valid_research(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//
//
//
//
   /* static HomePage homePage;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("I am on amazon homePage")
    public void i_am_on_amazon_home_page() throws IOException {
    // Call Action method
        openBrowser("https://www.amazon.com/");

    }

    @And("I enter {string} in searchBox")
    public void i_enter_in_search_box(String productName) {
        // Action method
        homePage.enterProductName(productName);
    }


    @When("I click on search Button")
    public void i_click_on_search_button() {
    homePage.clickOnSearchButton();
    }

    @Then("I should see {string} is properly appear")
    public void i_should_see_is_properly_appear(String expectedText) {
    homePage.verifySearchResult("\""+expectedText+"\"");
    }

    @Then("I should not see {string} is appear")
    public void i_should_not_see_is_appear(String expectedText) {
        homePage.verifySearchResultNotMatch("\""+expectedText+"\"");
    }

    @Then("I verify {string} in product title")
    public void i_verify_in_product_title(String expectedText) {
        // Amazon.com : hand sanitizer
        homePage.verifyPageTitle(expectedText);
    }




*/


}
