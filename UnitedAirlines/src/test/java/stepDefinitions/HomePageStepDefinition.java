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
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
    static HomePage homePage;

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
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }


    @Given("I am on United Airlines homePage")
    public void i_am_on_united_airlines_home_page() throws IOException {
        openBrowser("https://www.united.com/en/us/");

    }

    @Given("I enter {string} in searchBox")
    public void i_enter_in_search_box(String string) {
        homePage.searchButton();


    }

    @When("I click on search Button")
    public void i_click_on_search_button() {
        homePage.setSearchBoxLocator();

    }

    @Then("I should see {string} is properly displaying")
    public void i_should_see_is_properly_displaying(String expectedText) {
        homePage.Search();

    }

    @Then("I verify {string} in product title")
    public void i_verify_in_product_title(String expectedResult) {
        homePage.CheckTitle(expectedResult);

    }

//**********************************************************************************************
    @Given("I click on Travel Info TAb")
    public void i_click_on_travel_info_t_ab() {
        homePage.travelInfo();


    }

    @Then("I should not see {string} is appearing")
    public void i_should_not_see_is_appearing(String string) {

    }


    @Given("I enter \\{new york} in searchBox Info TAb")
    public void i_enter_in_search_box_info_t_ab() {

    }

    @Given("I enter \\{canada} in searchBox")
    public void i_enter_in_search_box() {

    }


    @Given("I select a date")
    public void i_select_a_date() {

    }

    @Given("i click on find a flight")
    public void i_click_on_find_a_flight() {


    }

    @Then("I should see \\{trip} is properly displaying")
    public void i_should_see_is_properly_displaying() {

    }

    @Then("i verify {string} the product title")
    public void i_verify_the_product_title(String string) {

    }


//*********************************************************************

    @Given("I click on contact us")
    public void i_click_on_contact_us() {
        homePage.contactus();
    }

    @Then("I verify the page title as Customer Support &amp; Service Portal")
    public void i_verify_the_page_title_as_customer_support_amp_service_portal() {
        homePage.contactustitle();
    }


//***********************************************************

    @Given("I enter baggage fees in the searchbox")
    public void i_enter_baggage_fees_in_the_searchbox() throws InterruptedException {
        homePage.contactusSearchBox();

    }

    @Then("I verify the page title as Search United.Com - Find Pages on Our Website & FAQs")
    public void i_verify_the_page_title_as_search_united_com_find_pages_on_our_website_fa_qs() throws InterruptedException {
        homePage.contactusSearchBoxText();
    }


//*****************************************************************************************************************



    @Given("I click on Account & Lists")
    public void i_click_on_account_lists() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("MileagePlus number*")
    public void mileage_plus_number(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Given("I enter password")
    public void i_enter_password(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Given("I click on signIn Button")
    public void i_click_on_sign_in_button() {

    }

    @Then("I should see {string}")
    public void i_should_see(String string) {

    }
}