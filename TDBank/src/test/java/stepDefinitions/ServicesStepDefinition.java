package stepDefinitions;

import common.WebAPI;
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
import tdBank.Services;

import java.io.IOException;

import static tdBank.WebElement.*;

public class ServicesStepDefinition extends WebAPI {

    Services services;

    // Cucumber Hook
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
        services = PageFactory.initElements(driver, Services.class);
    }

//    @After
//    public void closeBrowser(){ cleanUp(); }

    //-----------------------------------------------------


    @Given("I am on the TDBank HomePage")
    public void iAmOnTheTDBankHomePage() throws IOException {
        openBrowser(tdBankURL);
    }

    @When("I Hover over Services and click on Online Banking")
    public void iHoverOverServicesAndClickOnOnlineBanking() throws InterruptedException {

        services.hoverOnElementandHovertoAnother();

    }

    @Then("I Verify TDBank {string} Text")
    public void iVerifyTDBankOnlineBankingText(String expected) throws Throwable {
        services.verifyOnlineBanking(expected);
    }

    //---------------student banking--------------
    @When("I hover over Services and click on the Student Banking")
    public void iClickOnTheStudentBanking() throws InterruptedException {
        services.hoverOverAndSelectStudentBanking();
    }

    @Then("I Verify {string} Text in Student Banking")
    public void iVerifyTextInStudentBanking(String expected) {
        services.verifyStudentChecking(expected);
    }

    //----------------Cross Over------------

    @When("I Hover over Services and I click on the Cross Border")
    public void iHoverOverServicesAndIClickOnTheCrossBorder() throws InterruptedException {

        services.crossBorder();
    }

    @Then("I verify {string} Text In Cross Border")
    public void iVerifyTextInCrossBorder(String expected) {
        services.verifyTDCrossBorder(expected);
    }

    //--------------------International travel------------
    @When("I hover over Services and I click on the Travel Tips")
    public void iHoverOverServicesAndIClickOnTheTravelTips() throws InterruptedException {
        services.travelTips();
    }

    @Then("I Verify TD {string} Text")
    public void iVerifyTDText(String expected) {
        services.verifyTravelTips(expected);
    }

    //--------------------------Foriegn Exchange--------------
    @When("I hover over Services and I Click on the Foreign Exchange Services")
    public void iHoverOverServicesAndIClickOnTheForeignExchangeServices() throws InterruptedException {
        services.foreignExchange();
    }

    @Then("I Verify {string} Text in Services")
    public void iVerifyTextInServices(String expected) {
        services.verifyForeignExchange(expected);
    }
//-------------Verify total amount of currency requested
    @And("I Click on the Order Online button")
    public void iClickOnTheOrderOnlineButton() throws InterruptedException {
        services.orderOnline();
    }

    @And("I click on the Order Currency button")
    public void iClickOnTheOrderCurrencyButton() {
        services.orderCurrency();
    }

    @And("I enter the Destination in the Where are you going? Text Box")
    public void iEnterTheDestinationInTheWhereAreYouGoingTextBox() {
        services.enterDestination();
    }

    @When("I Enter the Amount of currency to be exchanged")
    public void iEnterTheAmountOfCurrencyToBeExchanged() {
        services.enterAmountOfCurrencyToBeExchanged();
    }

    @Then("I Verify the {string} has been updated")
    public void iVerifyTheHasBeenUpdated(String expected) {
        services.verifyTotalAmountRequested(expected);
    }
//-------------------------------------------------------
    @When("I click Add To Cart Button")
    public void iClickAddToCartButton() throws InterruptedException {
        services.currencyOrderAddToCart();
    }

    @Then("I verify Add in cart {string} message")
    public void iVerifyMessage(String expected) {
        services.verifyAddToCartSuccessfullyMessage(expected);
    }
//------------------------------------------
    @And("I click the Cart Icon Button")
    public void iClickTheCartIconButton() throws InterruptedException {
        services.cartIconButton();
    }

    @And("I change The USD Amount to {int}")
    public void iChangeTheUSDAmountTo(int arg0) {
        services.editUSDamount();
    }

    @When("I click the Foreign Amount Box")
    public void iClickTheForeignAmountBox() {
        services.clickForeignAmountBox();
    }

    @When("I click the Update Cart Button")
    public void iClickTheUpdateCartButton() {
        services.updateCart();
    }

    @Then("I Verify the Message {string}")
    public void iVerifyTheMessage(String expected) {
        services.verifySuccessfullyUpdatedMessage(expected);
    }
//------------Enter info on personal informatin page and verify verification page appaear
    @And("I click Checkout Button")
    public void iClickCheckoutButton() {
    }

    @And("I Click the prefix Drop Down and I select Attorney")
    public void iClickThePrefixDropDownAndISelectAttorney() {
    }

    @And("I enter First Name in the text Box")
    public void iEnterFirstNameInTheTextBox() {
    }

    @And("I enter Last Name in the Text Box")
    public void iEnterLastNameInTheTextBox() {
    }

    @And("I enter Email in the Text Box")
    public void iEnterEmailInTheTextBox() {
    }

    @When("I click the Verification Button")
    public void iClickTheVerificationButton() {
    }

    @Then("I Verify {string} Text Displays")
    public void iVerifyTextDisplays(String arg0) {
    }


//-------------------------


}
