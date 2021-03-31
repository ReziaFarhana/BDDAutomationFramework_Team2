package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import homepage.ProductsPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {

    static HomePage homepage;

    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        homepage= PageFactory.initElements(driver, HomePage.class);
    }

//    @After
//    public void closeBrowser(){
//        cleanUp();
//    }

    @Given("user am on TD Bank homepage")
    public void user_am_on_td_bank_homepage() throws IOException {
        openBrowser("https://www.td.com/");
    }
    @When("user hovers over Products Drop down")
    public void user_hovers_over_products_drop_down() throws InterruptedException {
        homepage.hoverOverProductsDropDown();
    }
    @When("user clicks on Checking")
    public void user_clicks_on_checking() {
        homepage.clickChecking();
    }
    @Then("user verifies {string} is the title")
    public void user_verifies_is_the_title(String expectedText) {
        homepage.verifyTitle(expectedText);
    }


    @And("user clicks on Saving")
    public void userClicksOnSaving() {
        homepage.clickSavings();
    }

    @And("user clicks on CD")
    public void userClicksOnCD() {
    }

    @And("user clicks on Credit Cards")
    public void userClicksOnCreditCards() {
    }

    @And("user clicks on Home Equity Loans and Lines")
    public void userClicksOnHomeEquityLoansAndLines() {
    }

    @And("user clicks on Mortgage")
    public void userClicksOnMortgage() {
    }

    @And("user clicks on Personal Loans")
    public void userClicksOnPersonalLoans() {
    }

    @And("user clicks on IRA")
    public void userClicksOnIRA() {
    }

    @And("user clicks on Debit Cards")
    public void userClicksOnDebitCards() {
    }

    @And("user clicks on Prepaid Cards")
    public void userClicksOnPrepaidCards() {
    }

    @And("user clicks on Special Offers")
    public void userClicksOnSpecialOffers() {
    }
}
