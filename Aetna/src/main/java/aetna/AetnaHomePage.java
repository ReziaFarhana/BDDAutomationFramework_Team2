package aetna;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static aetna.WebElement.*;

public class AetnaHomePage extends WebAPI {


    @FindBy(how = How.ID, using = searchBoxLocator)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchBoxLocator)
    public WebElement searchText;
    @FindBy(how = How.XPATH, using = searchResult)
    public WebElement srchResult;

    //---------------------verifying logo-----------------------------------------
    //Aetna HomePage
    public void aetnaHomepage() throws IOException {
        openBrowser(aetnaURL);
    }

    //contact Us
    public void clickContactUS() throws InterruptedException {
        sleepFor(3);

        clickByXpath(contactUs);
        windowHandle();
    }

    //click Aetna LOGO
    public void aetnaLogo() {

        clickByXpath(logo);
    }

    //verify the aetna hompage by clicking the LOGO
    public void verifyAetnaHomePage(String expectedTitle) {
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedTitle, "Text did not match");

    }
    //-------------------Who We Are---->our Mission-->verify title------------------------------------------

    public void whoAreWeDD() throws InterruptedException {
        sleepFor(3);

        clickByXpath(whoWeAreDD);
    }

    public void ourMission() throws InterruptedException {
        clickByXpath(ourMission);
        clickByXpath(ourValues);
        sleepFor(2);
    }

    public void verifyCompanyValuePage() {
        String expectedTitle = "Company Values | Aetna";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Text did not match");
    }


    //---------Initiatives--->--Corporate Responsibilities-->national programs

    public void initiatives() {

        clickByXpath(initiativesTab);

    }

    public void corporateResponsibilities() throws InterruptedException {

        clickByXpath(corporateResponsibility);
        sleepFor(3);

    }

    public void verifyCorporateResponsibilitiesTitle(String expextedTitle) {
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expextedTitle, "Title did not match");


    }

    public void nationalProgram() throws InterruptedException {
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,1500)");
        clickByXpath(nationalInitiatives);
        sleepFor(3);
    }

    public void nationalHealthPageTitle(String expectedTitle) {

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Text did Not match");

    }

    //-----initiatives---->Doing business with us---
    public void doingBusinessWithUs() throws InterruptedException {
        clickByXpath(doingBusinessWithUs);
        sleepFor(3);
        windowHandle();
        sleepFor(3);
    }

    public void verifyDoingBusinessPageText(String expectedText) {
        String actualText = getTextByXpath(doingBusinessWithusText);
        Assert.assertEquals(actualText, expectedText, "Text did Not match");
    }

    //-------------verify search text page
    public void verifySearchTextPage(String expectedText) {

        String actualText = getTextByXpath(searchResult);
        Assert.assertEquals(actualText, expectedText, "text does not match");
    }

    //------------investor---------------investor overview---------

    public void investors() throws InterruptedException {
        clickByXpath(investorsTab);
        sleepFor(3);
    }

    public void investorOverview() throws InterruptedException {
        clickByXpath(investorsOverview);
        sleepFor(3);
        windowHandle();
        sleepFor(3);
    }

    //-------------Health Section--->community
    public void healthSection() {
        clickByXpath(healthSection);
    }

    public void community() {
        clickByXpath(community);
    }
//------------SearchBox-------


    public void inputInSearchBox(String searchKeyword) {
        typeOnElementAndEnterbyXpath(searchBoxLocator, searchKeyword);
    }

    public void searchKeyword(String searchKeyword) {
        searchBox.sendKeys(searchKeyword);
    }

    public void searchButton() {
        clickByXpath(searchButton);
    }


//    public void verifySearchResult(String expectedText) {
//        String actualText = searchText.getText();
//        Assert.assertEquals(actualText, expectedText,"Product does not match");
//    }
//
//    public void verifyPageTitle(String expectedText) {
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Page Title not match");
//    }

    public void healthCareReform() throws InterruptedException {
        clickByXpath(healthCareReform);
        sleepFor(3);
        windowHandle();
        sleepFor(5);
    }

    public void verifyHealthCareReformText(String expectedText){
        String actualText=getTextByXpath(healthCareReformActualText);
        Assert.assertEquals(actualText,expectedText,"Text does not match");
    }

    public void verifyTitlePage(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");

    }


}


