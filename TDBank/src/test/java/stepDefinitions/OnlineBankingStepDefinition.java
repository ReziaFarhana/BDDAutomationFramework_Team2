package stepDefinitions;

import common.WebAPI;
import homepage.HomePage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;

import static homepage.HomePageWebElement.*;

public class OnlineBankingStepDefinition extends WebAPI {
    static HomePage action;
    @BeforeStep
    public static void getInit() {
        action = PageFactory.initElements(driver, HomePage.class);
    }

    @When("I clicked on Products tab")
    public void i_clicked_on_products_tab() throws InterruptedException {
        clickByXpath(productsTab);
        sleepFor(3);
    }
    @Then("I should have a Title page {string}")
    public void i_should_have_a_title_page(String expected) {
        action.verifyProductsTab(expected);
    }

    @When("I hover on the Solutions Link")
    public void i_hover_on_the_solutions_link() {
        clickByCss(solutionsTab);
    }
    @When("I clicked on Cross Border Banking")
    public void i_clicked_on_cross_border_banking() {
        clickByXpath(crossBorderBanking);
    }

    @Then("I should land on a new Online Banking windows {int} {string}")
    public void i_should_land_on_a_new_online_banking_windows(int index, String string) {
        action.verifyNewTab(index,string);
    }



}
