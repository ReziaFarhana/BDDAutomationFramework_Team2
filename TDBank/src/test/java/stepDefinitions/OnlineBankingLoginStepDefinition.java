package stepDefinitions;

import common.WebAPI;
import homepage.TDOnlineBanking;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class OnlineBankingLoginStepDefinition extends WebAPI {

    //    static HomePage homePage;
    static TDOnlineBanking tdOnlineBanking;

    // Cucumber Hook
    @BeforeStep
    public static void getInit() {
        tdOnlineBanking = PageFactory.initElements(driver, TDOnlineBanking.class);
    }

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("User is in TD Bank homePage")
    public void user_is_in_td_bank_home_page() throws IOException {
        openBrowser("https://www.td.com/us/en/personal-banking/");
    }

    @Given("User see the TD Bank logo")
    public void user_see_the_td_bank_logo() {
        tdOnlineBanking.validateTdBankLogoIsDisplayed();
    }

    @When("User clicks on the Login button under Online Banking")
    public void user_clicks_on_the_login_button_under_online_banking() {
        tdOnlineBanking.logInIcon();
    }

    @Then("User can see the Online Banking Log In page is displayed")
    public void user_can_see_the_online_banking_log_in_page_is_displayed() {
        tdOnlineBanking.verifyOnlineBanking();
    }


}
