package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homepage.UAWebElement.*;

public class DestinationDealsHom extends WebAPI {

    UAWebElement element;

    public void clickOnUADeals() {
        clickByXpath(dealsLocator);
    }

    @FindBy(xpath = getPopularDestinationsLocator)
    public WebElement popularDestination;

    public void clickOnPopularDestinatiosLink() throws InterruptedException {
        scrollTo(popularDestination);
        clickByXpath(popularDestinationsLocator);
        sleepFor(5);
    }

    public void verifyPopularDestination() throws InterruptedException {
        windoSwitchHandler2(1);
        sleepFor(5);
        String expected = "United Cheap Flights to 300+ Destinations Worldwide | United Airlines";
        String actual = driver.getTitle();
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void clickOnFlightsToNationalParks() throws InterruptedException {
        scrollTo(popularDestination);
        clickByXpath(flightToNationalParksLocator);
        sleepFor(5);
    }

    public void verifyClickedOnFlightsToNationalParks(String expected) throws InterruptedException {
        windoSwitchHandler2(1);
        sleepFor(5);
        String actual = driver.getTitle();
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void clickOnFlightsToSanFrancisco() throws InterruptedException {
        scrollTo(popularDestination);
        clickByXpath(toSanFranciscoLocator);
        sleepFor(5);
    }

    public void verifyFlightsToSanFrancisco(String expected) throws InterruptedException {
        windoSwitchHandler2(1);
        sleepFor(5);
        String actual = driver.findElement(By.xpath(destinationDealsNewPageTextLocator)).getText();
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void clickOnFlightsToNewYork() throws InterruptedException {
        scrollTo(popularDestination);
        clickByXpath(toNewYorkLocator);
        sleepFor(5);
    }

    public void verifyFlightsDestination(String expected) throws InterruptedException {
        windoSwitchHandler2(1);
        sleepFor(5);
        String actual = driver.findElement(By.xpath(destinationDealsNewPageTextLocator)).getText();
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void clickOnFlightsToHoustomn() throws InterruptedException {
        scrollTo(popularDestination);
        clickByXpath(toHoustonLocator);
        sleepFor(5);
    }

    public void clickOnFlightsToChicago() throws InterruptedException {
        scrollTo(popularDestination);
        clickByXpath(toChicagoLocator);
        sleepFor(5);
    }

    public void clickOnFlightsToLosAngeles() throws InterruptedException {
        scrollTo(popularDestination);
        clickByXpath(toLosAngelesLocator);
        sleepFor(5);
    }

    public void clickOnFlightsToFloarida() throws InterruptedException {
        scrollTo(popularDestination);
        clickByXpath(toFloaridaLocator);
        sleepFor(5);
    }

    public void enterFromCity( String city){
      typeOnElementNEnter(bookFromLocator,city);

    }

    @FindBy(css = bookFromLocator)
    public WebElement found;
    public void enterToCity( String city){
      scrollTo(found);
      typeOnElementNEnter(bookFromLocator,city);
    }

    public void selectDepartureDate(){
        clickByCss(bookDepartureDateLocator);
        clickByXpath(leftCalenderClickLocator);
        clickByXpath(march30Locator);
    }

    public void selectDestinationDate(){
        clickByCss(bookReturnDateLocator);
        clickByXpath(april24Locator);
    }

    public void selectTravelerInfo(){
        clickByCss(travelersInfoLocator);
        boolean resutl = driver.findElement(By.cssSelector(inputAdultNumberLocator)).isDisplayed();
        while (resutl == false){
            clickByXpath(decreaseAdultLocator);
            driver.findElement(By.cssSelector(inputAdultNumberLocator)).isDisplayed();
        }
        clickByXpath(doneButtonLocator);
    }

    public void enterPromoCode(String promoCode){
        clickByCss(promotionalCodeLocator);
    }

    public void clickOnSearchFlightBox(){
        clickByXpath(searchButtonLocator);
    }



}
