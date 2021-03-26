package stepDefinitions;

import common.WebAPI;
import homepage.DestinationDealsHom;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

import org.openqa.selenium.support.PageFactory;

import static homepage.UAWebElement.*;

public class UADestinationStepDefinition  extends WebAPI {

    DestinationDealsHom act;

    @BeforeStep
    public void getInIt(){
        act = PageFactory.initElements(driver,DestinationDealsHom.class);
    }


    @When("I clicked on Flights to popular destinations")
    public void i_clicked_on_flights_to_popular_destinations() throws InterruptedException {
       act.clickOnPopularDestinatiosLink();

    }
    @Then("I should land on a new tab {string}")
    public void i_should_land_on_a_new_tab(String string) throws InterruptedException {
        act.verifyPopularDestination();
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



}
