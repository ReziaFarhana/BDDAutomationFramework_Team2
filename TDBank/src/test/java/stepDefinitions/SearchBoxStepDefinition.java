package stepDefinitions;

import common.WebAPI;
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
import tdBank.Career;
import tdBank.SearchBox;

public class SearchBoxStepDefinition extends WebAPI {

    SearchBox searchBox;

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
        searchBox = PageFactory.initElements(driver, SearchBox.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }


//-----------------------------------------------------------------------------


    @Given("I click on TDBank SearchBox")
    public void i_click_on_td_bank_search_box() {
        searchBox.tdBankSearchBox();

    }
    @When("I enter {string} in searchBox and click enter")
    public void iEnterInSearchBoxAndClickEnter(String products) throws InterruptedException {
        searchBox.inputProductsInSearchBox(products);
    }


    @And("I verify {string} Product Text")
    public void iVerifyProductText(String productText) {
        searchBox.verifyProductText(productText);
    }
}