package stepDefinition;

import common.WebAPI;
import homepage.EmployersPage;
import homepage.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class EmployersPageStepDefinition extends WebAPI {

    static EmployersPage employersPage;

    // Cucumber Hook
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        employersPage= PageFactory.initElements(driver, EmployersPage.class);
    }

//    @After
//    public void closeBrowser(){
//        cleanUp();
//    }

    @Given("user is on employers page")
    public void user_is_on_employers_page() throws IOException {
        openBrowser("https://www.aetna.com/employers-organizations.html");
    }

    //*****************************************
    @When("user clicks on Explore Aetna Sites")
    public void user_clicks_on_Aetna_Sites() {
       employersPage.clickDropDown();
    }
    @And("user clicks on About Us")
    public void user_clicks_on_About_Us() {
        employersPage.clickAboutUsNav();
    }

    @Then("user verify {string} appears properly")
    public void user_verify_appears_properly(String expectedText) {
        employersPage.verifyAboutUsPage(expectedText);
    }

    //*****************************************

    @Then("user clicks on Products and services")
    public void userClicksOnProductsAndServices() throws InterruptedException {
        employersPage.clickProductsandServices();
    }

    @When("user hovers over Health Plans")
    public void userHoversOverHealthPlans() throws InterruptedException {
        employersPage.hoverOverHealthPlans();
    }

    @When("user clicks All Health Plans")
    public void userClicksAllHealthPlans() {
        employersPage.clickAllHealthPlans();
    }

    @Then("user verifies page title is {string}")
    public void userVerifiesPageTitleIs(String expectedText) {
        employersPage.verifyAllHealthPlanPage(expectedText);
    }


    //*****************************************

    @And("user clicks Medicare")
    public void userClicksMedicare() throws InterruptedException {
        employersPage.clickMedicare();
    }
    //*****************************************
    @When("user clicks on Dental")
    public void userClicksOnDental() throws InterruptedException {
        employersPage.clickDental();
    }
    //*****************************************
    @When("user clicks on Vision")
    public void userClicksOnVision() throws InterruptedException {
        employersPage.clickVision();
    }
    //*****************************************
    @When("user clicks on Pharmacy")
    public void userClicksOnPharmacy() throws InterruptedException {
        employersPage.clickPharmacy();
    }
    //*****************************************
    @When("user clicks on Supplemental")
    public void userClicksOnSupplemental() throws InterruptedException {
        employersPage.clickSupplemental();
    }
    //*****************************************
    @And("user hovers over Member Programs")
    public void userHoversOverMemberPrograms() throws InterruptedException {
        employersPage.hoverOverMemberPrograms();
    }


    @When("user clicks All Member Programs")
    public void userClicksAllMemberPrograms() throws InterruptedException {
        employersPage.clickAllMemberPrograms();
    }

    //*****************************************


    @When("user clicks Aetna Health app")
    public void userClicksAetnaHealthApp() {
        employersPage.clickAetnaHealthapp();
    }

    @Then("user verifies  {string} appears properly")
    public void userVerifiesAppearsProperly(String expectedText) {
        employersPage.verifyHealthAppPage(expectedText);
    }

    @When("user clicks Behavioral Health")
    public void userClicksBehavioralHealth() {
        employersPage.clickBehavioralHealth();
    }

    //******************************************************************

    @When("user clicks Care Management")
    public void userClicksCareManagement() {
        employersPage.clickCareManagement();
    }
    //******************************************************************


    @When("user clicks Customer Service")
    public void userClicksCustomerService() {
        employersPage.clickCustomerService();
    }


    //*****************************************
    @When("user clicks Diabetes")
    public void userClicksDiabetes() {
        employersPage.clickDiabetes();
    }

    //*****************************************
    @When("user clicks Member Management Platform")
    public void userClicksMemberManagementPlatform() {
        employersPage.clickMemberManangementPlatform();
    }


    //*****************************************
    @When("user clicks Telehealth")
    public void userClicksTelehealth() {
        employersPage.clickTelehealth();
    }


    //*****************************************
    @When("user clicks Womens Health")
    public void userClicksWomensHealth() {
        employersPage.clickWomensHealth();
    }



}
