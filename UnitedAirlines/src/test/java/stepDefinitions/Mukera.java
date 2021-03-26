package stepDefinitions;

import common.WebAPI;
import homepage.DestinationDealsHom;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class Mukera extends WebAPI {

    DestinationDealsHom act;


    @BeforeStep
    public void getInIt(){
        act = PageFactory.initElements(driver,DestinationDealsHom.class);
    }

    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // Take a screenshot
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }


    //    @After
    public void closeBrowser(){
        cleanUp();
    }

    // not ready for use
    public void loginPageSet(String url, String browserName, String browserVersion) throws IOException {
        openBrowserUsingMultiBrowser(url,browserName,browserVersion);
    }

    // Method not completed
    @Given("url, browserName and browserVersion to login into United Airlines")
    public void loginOnUAWithMultipleOption(DataTable table){
        List<List<String>> log = table.asLists(String.class);
        String url = log.get(0).get(0);
        String browserName= log.get(0).get(1);
        String browserVersion= log.get(0).get(2);
        // this  method needs to be refined
    }

    @Given("I Have {string} {string} and {string} to login")
    public void i_have_and_to_login(String url, String browserName, String browserVersion) throws IOException, InterruptedException {
        loginPageSet(url,browserName,browserVersion);
        sleepFor(5);
    }

    @When("I clicked on the DEALS link of the United airlines home page")
    public void i_clicked_on_the_deals_link_of_the_united_airlines_home_page() throws InterruptedException {
        act.clickOnUADeals();
        sleepFor(2);
    }

}
