package stepDefinitions;

import common.WebAPI;
import homepage.SignUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class SignUpStepDefinition extends WebAPI {
    static SignUp sign;
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
        sign = PageFactory.initElements(driver, SignUp.class);
    }



    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on the Trip Advisor homepage")
    public void i_am_on_the_trip_advisor_homepage() throws IOException {
        openBrowser("https://www.tripadvisor.com/");
    }

    @Given("I click on the continue with email button")
    public void i_click_on_the_continue_with_email_button() throws InterruptedException {
        sign.continueWithEmailButton();
    }
    @When("I enter user information from the table")
    public void i_enter_user_information_from_the_table(List<List<String>> table) {
        Map<String, String> map = TableDictionaryConverter(table);
        sign.enterUserDetail(map.get("Email"),map.get("CreateAPassword"));
    }
    @Then("I click on the join button")
    public void i_click_on_the_join_button() {
     sign.joinButton();
    }


    @Then("I verify the text {string} as the title")
    public void i_verify_the_text_as_the_title(String expectedTitle) {
        sign.verifyBecomeAMemberBoxTitle(expectedTitle);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        sign.signIn();

    }
}
