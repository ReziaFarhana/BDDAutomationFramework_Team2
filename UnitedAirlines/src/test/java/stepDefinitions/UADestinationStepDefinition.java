package stepDefinitions;

import common.WebAPI;
import homepage.DestinationDealsHom;
//import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.cucumber.datatable.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static homepage.UAWebElement.*;

public class UADestinationStepDefinition  extends WebAPI {

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


    @When("I clicked on Flights to popular destinations")
    public void i_clicked_on_flights_to_popular_destinations() throws InterruptedException {
       act.clickOnPopularDestinatiosLink();
       sleepFor(2);

    }
    @Then("I should land on a new tab {string}")
    public void i_should_land_on_a_new_tab(String string) throws InterruptedException {
        act.verifyPopularDestination();
        sleepFor(2);
    }

    @When("I click on national parks")
    public void i_click_on_national_parks() throws InterruptedException {
        act.clickOnFlightsToNationalParks();
    }
    @Then("I should land on a new page with {string}")
    public void i_should_land_on_a_new_page_with(String string) throws InterruptedException {
        act.verifyClickedOnFlightsToNationalParks(string);
    }

    @When("I clicked on Flights to San Francisco link")
    public void i_clicked_on_flights_to_san_francisco_link() throws InterruptedException {
        act.clickOnFlightsToSanFrancisco();
    }
    @Then("I should have a new windows tab with a title {string}")
    public void i_should_have_a_new_windows_tab_with_a_title(String string) throws InterruptedException {
        act.verifyFlightsToSanFrancisco(string);
    }

    @When("I clicked on the Flights to New York Newark link")
    public void i_clicked_on_the_flights_to_new_york_newark_link() throws InterruptedException {
        act.clickOnFlightsToNewYork();
    }
    @Then("I should be found a new page with a bread cramp end with {string}")
    public void i_should_be_found_a_new_page_with_a_bread_cramp_end_with(String string) throws InterruptedException {
        act.verifyFlightsDestination(string);
    }

    @When("I clicked on the link on Flights to Houston")
    public void i_clicked_on_the_link_on_flights_to_houston() throws InterruptedException {
        act.clickOnFlightsToHoustomn();
    }
    @Then("I should land to a new windows tab with bread cramp end with  {string}")
    public void i_should_land_to_a_new_windows_tab_with_bread_cramp_end_with(String string) throws InterruptedException {
        act.verifyFlightsDestination(string);
    }

    @When("I clicked on Flights to Chicago link")
    public void i_clicked_on_flights_to_chicago_link() throws InterruptedException {
        act.clickOnFlightsToChicago();
    }

    @When("I clicked on Flights to Los Angeles link")
    public void i_clicked_on_flights_to_los_angeles_link() throws InterruptedException {
        act.clickOnFlightsToLosAngeles();
    }

    @When("I clicked on Flights to Orlando link")
    public void i_clicked_on_flights_to_orlando_link() throws InterruptedException {
        act.clickOnFlightsToFloarida();
    }

    @When("I enter a departure city and destination city")
    public void i_enter_a_departure_city_and_destination_city(DataTable dataTable) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        // For other transformations you can register a DataTableType.
        List<List<String>> col = dataTable.asLists(String.class);
        String departure = col.get(1).get(0);
        String destination = col.get(1).get(1);
        typeOnElement(bookFromLocator,departure);
        sleepFor(3);

//        clearInput(bookToLocator);
        typeOnElement(bookToLocator,destination);

    }

    @When("I selected the departure and return dates")
    public void i_selected_the_departure_and_return_dates() throws InterruptedException {
        act.selectDepartureDate();
        sleepFor(2);
        act.selectDestinationDate();
        sleepFor(2);
    }
    @When("I selected travel info class of travel and number of travelers")
    public void i_selected_travel_info_class_of_travel_and_number_of_travelers() {
        act.selectClassAndAmount();
    }

    @When ("I entered the promotion code {string}")
    public void i_entered_the_promotion_code(String string){
        act.enterPromoCode(string);
    }

    @And ("I click on the Search Flights button")
    public void i_Click_On_The_Search_Flights_Button(){
        act.clickOnSearchFlightBox();
    }

    /**
     * "We could not process your request. Please see the message below and make revisions."
     * Book a Roundtrip flight with a promotion code
     * @param string
     */
    @Then("I should see a text {string}")
    public void i_should_see_a_text(String string) {
        act.verifyWithCodeBookingResult(string);
    }


    /**
     * Book a Roundtrip flight without a promotion code
     * I should land on a page displays a text
     * @param string
     */
    @Then("I should land on a page displays a text {string}")
    public void i_should_land_on_a_page_displays_a_text(String string) {
        act.verifyNoCodeBookingResult(string);
    }


    /**
     * I should expect to see the text
     * @param string
     */
    @Then("I should expect to see the text {string}")
    public void i_should_expect_to_the_text(String string) {
        act.verifyBookingWithMile(string);//
    }

    @When ("I clicked on Book with miles checklist")
    public void i_clicked_on_Book_with_miles_checklist(){
        clickByCss(bookWithMileLocator);
    }


    @When("clicked on Changed bag rules Link")
    public void clicked_on_changed_bag_rules_link() throws InterruptedException {
     act.clickOnBagChageRules();
     sleepFor(3);


    }
    @Then("I should have a new page with a text {string}")
    public void i_should_have_a_new_page_with_a_text(String expected) {
        // Write code here that turns the phrase above into concrete actions
        act.verifyWithText(textVerifyOnBagRulesLocator,expected);

    }

//    @Then("I should have a new page with a text {string}")
//    public void i_should_have_a_new_page_with_a_text(List<List<String>> dataTable, String string) {
//        Map<String,String> fromTable = dataTableInfo(dataTable);
//        String loc = fromTable.get("locator");
//        System.out.println(loc);
//        act.verifyWithText(loc,string);
//
//    }

    public synchronized Map<String,String> dataTableInfo(List<List<String>> dataTable){
        Map<String,String> save = new HashMap<>();
        for(List<String> info : dataTable){
            save.put(info.get(0),info.get(1));
        }
        return save;
    }

    @Then("I clicked on Any Flights Tab")
    public void i_clicked_on_any_flights_tab() {
        act.findHowMuchABageWillCost();
    }

    @Then("Update the From and To box with cities")
    public void update_the_from_and_to_box_with_cities(List<List<String>> dataTable) throws InterruptedException {
        Map<String,String>  data = dataTableInfo(dataTable);
        System.out.println(data.get("From"));
        String from = data.get("From");
        String to = data.get("To");
        System.out.println(from +":" + to);
        scrollTO(locateAnyTabLocator);
        clickByXpath(clickOnAnyFlightTabLocator);
//        typeOnElement(addCityFromLocator,from);
//        sleepFor(5);
//        typeOnElement(bookToLocator,to);
        act.toUpdateOnFrom(from);
        act.toUpdateOnFrom(to);

    }

    @Then("I should have same page updated and a text {string} will be displayed")
    public void i_should_have_same_page_updated_and_a_text_will_be_displayed(String string) {
        act.verifyHowMuchWillCstMyBag(string);
    }

}
