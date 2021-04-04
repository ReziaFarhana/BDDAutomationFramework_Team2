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

    static HomePage homepage;

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
    public static void getInit() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on  TDBank homePage")
    public void i_am_on_td_bank_home_page() throws IOException {

        openBrowser("https://www.td.com/us/en/personal-banking/online-banking/");
    }

    @When("I click on personal tab")
    public void i_click_on_personal_tab1() {
        homepage.personal();

    }

    @Then("I should see we are here to help you")
    public void i_should_see_we_are_here_to_help_you() {
        homepage.personalWeAreHereToHelp();

    }

    @Then("I verify {string} is a working tab")
    public void i_verify_is_a_working_tab(String string) {

    }



    @Given("I click on  personal tab")
    public void i_click_on_personal_tab() {
        homepage.personal();

    }
    @Given("I click on checking account tab")
        public void i_click_on_checking_account_tab () throws InterruptedException {
        homepage.Checkingaccount();

        }

        @Then("I should see TD Bank open a TDBank checking account display properly")
        public void i_should_see_td_bank_open_a_td_bank_checking_account_display_properly () {
       // homepage.CheckingAccountGetText();

        }

        @Then("I verify {string} is displaying")
        public void i_verify_is_displaying (String string){

        }
    }
