package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import homepage.TravelForumPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class TravelForumStepDefinitions extends WebAPI {
    static TravelForumPage travelforumpage;

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit() {
        travelforumpage = PageFactory.initElements(driver, TravelForumPage.class);
    }

    //    @After
//    public void closeBrowser(){
//        cleanUp();
//    }
    @Given("user is on Travel Forum page")
    public void user_is_on_travel_forum_page() throws IOException {
        openBrowser("https://www.tripadvisor.com/ForumHome");
    }

    @And("user clicks on searchbox")
    public void user_clicks_on_searchbox() {
        travelforumpage.clickOnSearchBox();
    }

    @When("user enters {string} in searchbox")
    public void user_enters_in_searchbox(String searchData) throws InterruptedException {
        travelforumpage.enterDataintoSearchBox(searchData);
    }

    @Then("user should see {string} appear properly")
    public void userShouldSeeAppearProperly(String expectedText) throws InterruptedException {
        travelforumpage.verifySearchText(expectedText);
    }
}
