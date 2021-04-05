package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomePageStepDefinition extends WebAPI {

   static HomePage homepage;
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
        homepage= PageFactory.initElements(driver, HomePage.class);
    }

//    @After
//    public void closeBrowser(){
//        cleanUp();
//    }

    @Given("I am on TripAdvisor homepage")
    public void i_am_on_trip_advisor_homepage() throws IOException {
      openBrowser("https://www.tripadvisor.com/");
    }
    @And("user clicks on Travel Forums")
    public void userClicksOnTravelForums() {
        homepage.clickOnTravelForumBtn();
    }
    @And("user clicks on the Sign in Button")
    public void user_clicks_on_the_sign_in_button() throws InterruptedException {
        sleepFor(3);
        homepage.clickOnSignInButton();
    }
    @And("user clicks on Continue With Email Button")
    public void user_clicks_on_continue_with_email_button() {
        homepage.clickOnContinueWithEmailButton();
    }

    @And("user enters Email and Password from Table")
    public void userEntersEmailAndPasswordFromTable(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        //converting whatever data itll return to list<list> type array
        //now we want to see if we can retrieve from the datatable
        String email = data.get(1).get(0);// first is row next is column index
        System.out.println(email);
        //same thing for next data: password
        String password = data.get(1).get(1);
        System.out.println(password);
        //now to pass the data to our method in homepage to send to the browswer
        homepage.enterEmailandPassword(email,password);
    }

    @When("user clicks on Sign in button")
    public void user_clicks_on_sign_in_button() throws InterruptedException {
        homepage.clickOnSignInButton();
    }


    @Then("user verifies {string} appears")
    public void userVerifiesAppears(String expectedText) {
        homepage.verifyUserSignedIn(expectedText);
    }

    //*************************************************************************************

    @And("user clicks on the searchbox")
    public void userClicksOnTheSearchbox() {
        homepage.clickOnSearchBox();
    }


    @When("user types data into search box from excel")
    public void userTypesDataIntoSearchBoxFromExcel() throws IOException {
        homepage.enterDataInSearchBoxFromExcel();
    }

    @Then("user verifies {string} is displayed properly")
    public void userVerifiesIsDisplayedProperly(String expectedText) {
        homepage.verifySearchResult(expectedText);
    }

    @When("user types data into search box from database")
   public void userTypesDataIntoSearchBoxFromDatabase() throws Exception {
        homepage.searchDataFromDB();
    }


}
