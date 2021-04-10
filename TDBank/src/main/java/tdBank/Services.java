package tdBank;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

import static tdBank.WebElement.*;
import static tdBank.WebElement.*;

public class Services extends WebAPI {
    @FindBy(how = How.XPATH, using = servicesBtnLocator)
    public WebElement onlineBankingServices;
    //@FindBy(how = How.XPATH, using = servicesTab) public WebElement servicesTb;
    @FindBy(how = How.XPATH, using = servicesTabHover)
    public WebElement svcTB;
    @FindBy(how = How.XPATH, using = svcTabNew)
    public WebElement svcTab1;
    @FindBy(how = How.XPATH, using = studentbanking2)
    public WebElement stdbnk2;
    @FindBy(how = How.XPATH, using = whereRUGoingTextBox)
    public WebElement destination;
    @FindBy(how = How.XPATH, using = austria)
    public WebElement austria1;
    @FindBy(how = How.XPATH, using = europe)
    public WebElement europe1;

    public static final String adChoicesAndPersonalizationXButton = "//*[@id=\"ensCall\"]/span[2]";


    public void clickServiceTab() throws InterruptedException {

        clickByCss(servicesBtnLocator);
        clickByXpath(servicesTab);
        sleepFor(3);
        clickByXpath(onlineBanking);
    }

    public void hoverOnElementandHovertoAnother() throws InterruptedException {
        clickByXpath(adChoicesAndPersonalizationXButton);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0],50;");

        Actions actions = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath(svcTabNew));
        actions.moveToElement(mainMenu);
        sleepFor(3);
        WebElement subMenu = driver.findElement(By.xpath(onlineBanking));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
    }

    public void verifyOnlineBanking(String expectedText) {
        String actualText = getTextByXpath(onlineBankingActualText);
        Assert.assertEquals(actualText, expectedText, "Text does Not match");

    }
    //----------------student banking

    public void studentBanking() throws InterruptedException {
        //clickByXpath(adChoicesAndPersonalizationXButton);
        sleepFor(5);

        Actions actions = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath(svcTabNew));
        actions.moveToElement(mainMenu);

        sleepFor(10);

        WebElement subMenu = driver.findElement(By.xpath(studentBanking1));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        sleepFor(5);
    }

    //--------------------
    public static void hoverAndClick(WebElement elementHover, WebElement elementClick) {
        Actions selecrMenu = new Actions(driver);
        selecrMenu.moveToElement(elementHover).click(elementClick).build().perform();
    }

    public void hoverOverAndSelectStudentBanking() throws InterruptedException {
        sleepFor(5);
        hoverAndClick(svcTab1, stdbnk2);
        sleepFor(3);
    }


    public void verifyStudentChecking(String expectedText) {
        String actualText = getTextByXpath(studentActualTextLocater);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    //---------------------cross over border---------
    public void crossBorder() throws InterruptedException {
        clickByXpath(adChoicesAndPersonalizationXButton);
        sleepFor(5);

        Actions actions = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath(svcTab2));
        actions.moveToElement(mainMenu);

        sleepFor(10);

        WebElement subMenu = driver.findElement(By.xpath(crossBordertab));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        sleepFor(5);

    }

    public void verifyTDCrossBorder(String expectedText) {
        String actualText = getTextByXpath(tdCrossBorder);
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    //------------------international travel tips----
    public void travelTips() throws InterruptedException {

        clickByXpath(adChoicesAndPersonalizationXButton);
        sleepFor(5);

        Actions actions = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath(svcTab2));
        actions.moveToElement(mainMenu);

        sleepFor(10);

        WebElement subMenu = driver.findElement(By.xpath(travelTips));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        sleepFor(5);
    }

    public void verifyTravelTips(String expectedText) {
        String actualText = getTextByXpath(internationalTravActualTextLocater);
        Assert.assertEquals(actualText, expectedText, "The Text doe not match");
    }

    //--------------Foreign exchange
    public void foreignExchange() throws InterruptedException {
        clickByXpath(adChoicesAndPersonalizationXButton);
        sleepFor(5);

        Actions actions = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath(svcTab2));
        actions.moveToElement(mainMenu);

        sleepFor(10);

        WebElement subMenu = driver.findElement(By.xpath(foreignExchange));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        sleepFor(5);

    }

    public void verifyForeignExchange(String expected) {
        String actualText = getTextByXpath(foreignExchangeActualText);
        Assert.assertEquals(actualText, expected, "Text does not match");

    }

    //-----------verify currency request is displayed
    public void orderOnline() throws InterruptedException {
        clickByXpath(orderOnline);
        sleepFor(3);
        windowHandle();
        sleepFor(3);

    }

    public void orderCurrency() {
        //  clickByXpath(adChoicesAndPersonalizationXButton);
        clickByXpath(orderCurrencyLink1);
    }

    public void enterDestination() {
        clickByXpath(whereRUGoingTextBox);

        hoverAndClick(destination,europe1);
    }

    public void enterAmountOfCurrencyToBeExchanged() {
        typeOnElementAndEnterbyXpath(dollarToBeExchangedBox, "1000");

    }

    public void verifyTotalAmountRequested(String expectedText) {
        String actualText = getTextByXpath(europeNew);
        Assert.assertEquals(actualText, expectedText, "Text does not match");


    }

    //-----------------verify Add to cart--------------------------------

    public void currencyOrderAddToCart() throws InterruptedException {
//        JavascriptExecutor js2 = (JavascriptExecutor) driver;
//        js2.executeScript("window.scrollBy(0,500)");
        clickByXpath(currencyAddToCart);
        sleepFor(4);
    }

    public void verifyAddToCartSuccessfullyMessage(String expectedText) {
        String actualText = getTextByXpath(successfulMessage);
        Assert.assertEquals(actualText, expectedText, "Text did not match");
    }

    //------------------edit amount in cart--------------------------

    public void cartIconButton() throws InterruptedException {
        clickByXpath(cartIcon);
        sleepFor(3);
        windowHandle();
        sleepFor(3);
    }

    public void editUSDamount() {
        typeByXpath1(usdAmntBx,"1500");
    }

    public void clickForeignAmountBox() {
        clickByXpath(foreignAmountBox);
    }

    public void updateCart() {
        clickByXpath(updtCart);
    }

    public void verifySuccessfullyUpdatedMessage(String expectedText) {
        String actualText=getTextByXpath(cartUpdatedMessage);
        Assert.assertEquals(actualText,expectedText,"The Text does not match");
    }

    //--------------Personal Info form--------
    public void checkout(){

        clickByXpath(checkoutCurrencyOrder);
    }

    public void prefixDropdown(String loc) {

        Select prefixDD = new Select(driver.findElement(By.xpath(loc)));
        prefixDD.selectByVisibleText("Attorney");
    }

    public void firstName() {
        typeOnElementAndEnterbyXpath(firstName,"Sam");
    }

    public void lastName() {
        typeOnInputBoxByXpath(lastName,"Smaith");
    }

    public void email() {
        typeOnInputBoxByXpath(email,"Smith@gmail.com");
    }

    public void verificationButton() {
        clickByXpath(verificationButton);
    }

    public void verifyPersonalVerificationPage(String expectedText) {
        String actualText=getTextByXpath(personalVerificationText);
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

}
