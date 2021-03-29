package stepDefinition;

import common.WebAPI;
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

public class HomePageStepDefinition extends WebAPI {
    static HomePage homePage;

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
        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }

    @Given("user is on Aetna homepage")
    public void user_is_on_aetna_homepage() throws IOException {
        openBrowser("https://www.aetna.com");
    }
    @When("user clicks on Employers link")
    public void user_clicks_on_employers_link() {
        homePage.clickEmployersLink();
    }

//    @Then("user should see {string} appear")
//    public void user_should_see_appear(String expectedText) throws InterruptedException {
//        homePage.verifyEmployersLink("\""+expectedText+"\"");
//    }
    @Then("user verify page title is {string}")
    public void user_verify_page_title_is(String expectedText) {
        homePage.verifyEmployersPageTitle(expectedText);
    }

}
