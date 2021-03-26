package stepDefinitions;

import common.WebAPI;
import homepageheader.InvestingAndWealthPage;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class InvestingAndWealthPageStepDefinition extends WebAPI {
    static InvestingAndWealthPage investingAndWealthPage;

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
        investingAndWealthPage = PageFactory.initElements(driver, InvestingAndWealthPage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Then("I click on the Investing And Wealth Tab")
    public void i_click_on_the_investing_and_wealth_tab() {
       investingAndWealthPage.investingAndWealthTab();
    }

    @Then("I hover over the Financial Goals link and I select Preserve Your Wealth option")
    public void i_hover_over_the_financial_goals_link_and_i_select_preserve_your_wealth_option() throws InterruptedException {
        investingAndWealthPage.hoverOverFinancialGoalsAndSelectPreserveWealth();
    }
    @Then("I should see the page title as {string}")
    public void i_should_see_the_page_title_as(String expectedTitle) {
        investingAndWealthPage.verifyPreserveWealthPageTitle(expectedTitle);
    }

    @Then("I click on the Investment Management Find out more link")
    public void i_click_on_the_investment_management_find_out_more_link() {
        investingAndWealthPage.investmentManagementFindOutMoreLink();
    }
    @When("I click on Our Process")
    public void i_click_on_our_process() {
        investingAndWealthPage.ourProcessTab();

    }
    @Then("I should see {string} title")
    public void i_should_see_title(String expectedTitle) {
        investingAndWealthPage.verfiyOurProcessTitle(expectedTitle);
    }

    @Then("I click on the Individuals and Families icon")
    public void i_click_on_the_individuals_and_families_icon() {
        investingAndWealthPage.individualsAndFamilies();
    }
    @Then("I click the Find a TD Bank Button")
    public void i_click_the_find_a_td_bank_button() {
        investingAndWealthPage.findATDBankLocation();
    }
    @When("I enter {string} in the searchBox and hit enter")
    public void i_enter_in_the_search_box_and_hit_enter(String state) throws InterruptedException {
        investingAndWealthPage.findAStoreSearchBox(state);
    }
    @Then("I verify {string} properly appeared below the searchBox")
    public void i_verify_properly_appeared_below_the_search_box(String expectedState) {
        investingAndWealthPage.verifySearchedState(expectedState);
    }

    @Then("I click on the Business Owners icon")
    public void i_click_on_the_business_owners_icon() throws InterruptedException {
       investingAndWealthPage.businessOwner();
    }
    @Then("I click on the Private Banking Link")
    public void i_click_on_the_private_banking_link() {
    investingAndWealthPage.privateBankingLink();
    }
    @When("I click on the Payment Solutions Tab")
    public void i_click_on_the_payment_solutions_tab() {
       investingAndWealthPage.paymentSolutionTab();
    }
    @Then("I should see {string} as the title")
    public void i_should_see_as_the_title(String expectedTitle) {
        investingAndWealthPage.verifyPaymentSolutionTitle(expectedTitle);
    }

    @Then("I click on the Retirement and Wealth Planning icon")
    public void i_click_on_the_retirement_and_wealth_planning_icon() {
       investingAndWealthPage.retirementAndWealthPlanning();
    }
    @Then("I click on the Legacy and Philanthropic Planning link")
    public void i_click_on_the_legacy_and_philanthropic_planning_link() {
      investingAndWealthPage.legacyAndPhilanthropicPlanningLink();
    }
    @When("I click on the Watch video button of TD wealth Planning")
    public void i_click_on_the_watch_video_button_of_td_wealth_planning() {
        investingAndWealthPage.watchVideoButton();
    }
    @When("I clicked on transcript")
    public void i_clicked_on_transcript() throws InterruptedException {
        investingAndWealthPage.transcriptButton();
    }
    @Then("I verify {string} is the first sentence of the transcript on the video")
    public void i_verify_is_the_first_sentence_of_the_transcript_on_the_video(String expectedText) {
        investingAndWealthPage.verifyFirstSenenteceOfTheTranscript(expectedText);
    }

}
