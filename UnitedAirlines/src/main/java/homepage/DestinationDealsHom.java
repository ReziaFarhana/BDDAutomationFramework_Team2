package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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


    public void selectDepartureDate() {
        clickByCss(bookDepartureDateLocator);
        clickByXpath(leftCalenderClickLocator);
        clickByXpath(departureDateLocator);
    }

    public void selectDestinationDate() throws InterruptedException {
        clickByCss(bookReturnDateLocator);
        clickByXpath(rightCalenderClickLocator);
        sleepFor(2);
        clickByXpath(returnDateLocator);
    }

    public void selectTravelerInfo() {
        clickByCss(travelersInfoLocator);
        boolean resutl = driver.findElement(By.cssSelector(inputAdultNumberLocator)).isDisplayed();
        while (resutl == false) {
            clickByXpath(decreaseAdultLocator);
            driver.findElement(By.cssSelector(inputAdultNumberLocator)).isDisplayed();
        }
        clickByXpath(doneButtonLocator);
    }

    public void enterPromoCode(String promoCode) {
        typeOnElement(promotionalCodeLocator, promoCode);
    }

    public void clickOnSearchFlightBox() {
        clickByXpath(searchButtonLocator);
    }


    public void selectClassAndAmount() {
        clickByCss(travelersInfoLocator);
        clickByCss(selectEconomy);
        driver.findElement(By.cssSelector(selectEconomy)).sendKeys("E",
                Keys.ENTER, Keys.TAB, Keys.TAB, Keys.CLEAR, "2");
    }

    public void verifyWithCodeBookingResult(String expected) {
        driver.findElement(By.xpath(verifyBookingLocator)).isDisplayed();
        String actual = driver.findElement(By.xpath(verifyBookingLocator)).getText();
        Assert.assertEquals("Test failed", expected, actual);
//        }else if(driver.findElement(By.cssSelector(verifyBookWithMileLocator)).isDisplayed());{
//            String actual = driver.findElement(By.cssSelector(verifyBookWithMileLocator)).getText();
//            Assert.assertEquals("Test failed",expected,actual);
//        }
    }

    public void verifyNoCodeBookingResult(String expected) {

        String actual = driver.findElement(By.cssSelector(verifyNoPromoCodeLocator)).getText();
        Assert.assertNotEquals("Test failed", expected, actual);
    }

    public void verifyBookingWithMile(String expected) {
        expected = "Sign in to your MileagePlus account to show the best award availability";
        String actual = driver.findElement(By.cssSelector(verifyBookWithMileLocator)).getText();
    }

    /**
     * To verify using a text from a given locator
     *
     * @param loc
     * @param expected
     */
    public void verifyWithText(String loc, String expected) {

        String actual = driver.findElement(By.cssSelector(loc)).getText();
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void clickOnBagChageRules() {
//        driver.findElement(By.cssSelector(promotionalCodeLocator)).sendKeys(Keys.TAB, Keys.ENTER);
        clickByXpath(ClickOnchangeBagRulesLocator);
    }

    // How much will it cost to check my bag under Any flight Button
    public void findHowMuchABageWillCost() {
//        scrollTo();
        driver.findElement(By.xpath(toLocateBagInfoLocator)).getLocation();
        clickByXpath(clickOnAnyFlightTabLocator);
    }

    public void toUpdateOnFrom(String value) {
//        typeOnElement(addCityFromLocator,value);
        driver.findElement(By.cssSelector(addCityFromLocator)).sendKeys
                (value, Keys.TAB);
        driver.findElement(By.cssSelector(addCityToLocator)).sendKeys
                (value, Keys.TAB);

    }


    public void verifyHowMuchWillCstMyBag(String expected) {
        String actual = getTextByXpath(verifyBagPriceLocator);
        Assert.assertEquals("Test failed ", expected, actual);
    }

    public void verifyBalanceLookup(String expected) {
        String actual = getTextByCss(locatorToVerifyBalanceLookUp);
        Assert.assertEquals("Test failed ", expected, actual);
    }







}
