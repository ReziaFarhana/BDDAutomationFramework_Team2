package stepDefinitions;

import common.WebAPI;
import homepage.Header;
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

public class HeaderStepDefintion extends WebAPI {

    static Header head;

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
        head = PageFactory.initElements(driver, Header.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() throws IOException {
        openBrowser("https://www.td.com/us/en/personal-banking/");
    }
    @Then("I see the page title as {string}")
    public void i_see_the_providers_page_title_as(String expectedTitle) {
        head.verifyPageTitle(expectedTitle);
    }

    @Then("I see the page url as {string}")
    public void iSeeThePageUrlAs(String expectedUrl) {
        head.verifyPageUrl(expectedUrl);

    }


    @And("I hover over Services tab")
    public void iHoverOverServicesTab() throws InterruptedException {
        head.hoverService();

    }

    @Then("I see Student Banking link")
    public void iSeeStudentBankingLink() {
        head.findStudentBanking();
    }

    @When("I click Student Banking Link")
    public void iClickStudentBankingLink() {
        head.clickStudentBanking();
    }

    @Then("I see Cross Border link")
    public void iSeeCrossBorderLink() {
        head.findCrossBorder();
    }

    @When("I click Cross Border Link")
    public void iClickCrossBorderLink() {
        head.clickCrossBorder();
    }

    @Then("I see Travel Tips link")
    public void iSeeTravelTipsLink() {
        head.findTravelTips();

    }

    @When("I click Travel Tips Link")
    public void iClickTravelTipsLink() {
        head.clickTravelTips();
    }

    @Then("I see Online Banking link")
    public void iSeeOnlineBankingLink() {
        head.findOnlineBanking();
    }

    @When("I click Online Banking Link")
    public void iClickOnlineBankingLink() {
        head.clickOnlineBanking();
    }


    @Then("I see the student services banner")
    public void iSeeTheStudentServicesBanner() {
        head.findStudentBanner();
    }


    @When("I click Learning tab")
    public void iClickLearningTab() {
        head.clickLearning();
    }

    @Then("I see Learning page banner")
    public void iSeeLearningPageBanner() {
        head.findLearningBanner();
    }

    @Then("I see Personal Banking banner")
    public void iSeePersonalBankingBanner() {
        head.findPersonalBankingBanner();
    }

    @Then("I see Learning main page banner")
    public void iSeeLearningMainPageBanner() {
        head.findMoneyBanner();
    }

    @Then("I see Personal Banking tab")
    public void iSeePersonalBankingTab() {
        head.findPersonalBankingTab();
    }

    @Then("I see Credit and Lending tab")
    public void iSeeCreditAndLendingTab() {
        head.findCreditAndLendingTab();
    }


    @Then("I see SECURITIES AND INSURANCE footer tag")
    public void iSeeSECURITIESANDINSURANCEFooterTag() {
        head.findSecurities();
    }

    @Then("I see Not FDIC Insured sub footer tag")
    public void iSeeNotFDICInsuredSubFooterTag() {
        head.findFdic();
    }

    @Then("I see Not No Bank Guarantee sub footer tag")
    public void iSeeNotNoBankGuaranteeSubFooterTag() {
        head.findBank();
    }
}