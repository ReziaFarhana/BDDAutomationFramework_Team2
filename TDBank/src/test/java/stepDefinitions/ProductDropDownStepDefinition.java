package stepDefinitions;

import common.WebAPI;
import homepage.ProductDropDownPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProductDropDownStepDefinition extends WebAPI {

    static ProductDropDownPage productsddpage;
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        productsddpage= PageFactory.initElements(driver, ProductDropDownPage.class);
    }

//    @After
//    public void closeBrowser(){
//        cleanUp();
//    }


    @Given("user is on Checking page")
    public void userIsOnCheckingPage() throws IOException {
        openBrowser("https://www.td.com/us/en/personal-banking/checking-accounts/");
    }

    @When("user clicks on Learn More")
    public void userClicksOnLearnMore() {
        productsddpage.clickLearnMore();

    }

    @Then("user verifies URL is {string}")
    public void userVerifiesURLIs(String expectedUrl) {
        productsddpage.verifyUrl(expectedUrl);
    }
}
