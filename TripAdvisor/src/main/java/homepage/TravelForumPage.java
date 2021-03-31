package homepage;

import common.WebAPI;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static homepage.TravelForumPageWebElements.*;

public class TravelForumPage extends WebAPI {
    @FindBy(how= How.CLASS_NAME, using = searchTextXp)public WebElement searchText;
    @FindBy(how= How.CLASS_NAME, using = asiaXp)public WebElement asia;

    public void clickOnSearchBox(){
        driver.findElement(By.className(searchBoxClass));
    }

    public void enterDataintoSearchBox(String searchData) throws InterruptedException {

        driver.findElement(By.className(searchBoxClass)).sendKeys(searchData, Keys.ENTER);
        sleepFor(3);
    }
    public void verifySearchText(String expectedText) throws InterruptedException {
        String actualText = searchText.getText();
        sleepFor(3);
        Assert.assertEquals("Text doesnt match", expectedText, actualText);

    }
    public void verifyPageURL(String expectedText){
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals("Title doesnt match", expectedText, actualText);
    }
    //**************************************************************
    public void getlinksFromTravelForumPage(){
        getListofWebElementsbyTag("a");
    }
    //**************************************************************

    public void rightClickandOpenBrowseDestinationLinks() throws InterruptedException {
         openMultipleTabsAtOnce(browseByDestination);
     }
     public void verifyAllTitles() throws InterruptedException {
       getTitlesofMultipleTabs();
     }
    //**************************************************************
     public void clickOnTravelingWithPets() throws InterruptedException {
        //opens new tab after clicking link
        rightClickandOpenNewTabUsingLink(travelingwPetsLink);
        //switches to that tab


     }
    public void verifyBrowseByTheme(String expectedText){
        String actualText = driver.findElement(By.id(browseByThemeLinksText)).getText();
        Assert.assertEquals("Text doesnt match", expectedText, actualText);
    }
    //**************************************************************
    public void clickOnOutdoorAdventureTravel() throws InterruptedException {
        //opens new tab after clicking link
        rightClickandOpenNewTabUsingLink(outdoorAdvenTravLink);
        //switches to that tab

    }
    //**************************************************************
    public void clickOnRoadTrip() throws InterruptedException {
        //opens new tab after clicking link
        rightClickandOpenNewTabUsingLink(roadTripsLink);
        //switches to that tab
    }
    //**************************************************************
    public void clickOnTravelGadgetsGear() throws InterruptedException {
        rightClickandOpenNewTabUsingLink(travelGadgetsGearLink);
    }
    //**************************************************************
    public void clickOnhoneyMoonRomance() throws InterruptedException {
        rightClickandOpenNewTabUsingLink(honeymoonsRomanceLink);
    }
    //**************************************************************
    public void clickOnFamilyTravel() throws InterruptedException {
        rightClickandOpenNewTabUsingLink(familyTravelLink);
    }
    //**************************************************************
    public void clickOnBargainTravel() throws InterruptedException {
        rightClickandOpenNewTabUsingLink(bargainTravelLink);
    }
    //**************************************************************
    public void clickTrainTravel() throws InterruptedException {
        rightClickandOpenNewTabUsingLink(trainTravelLink);
    }
    //**************************************************************
    public void clickOnAirTravel() throws InterruptedException {
        rightClickandOpenNewTabUsingLink(airTravelLink);
    }
    //**************************************************************
    public void clickOnAntartic() throws InterruptedException {
        rightClickandOpenNewTabUsingLink(antarcticLink);
    }
    //**************************************************************
    public void clickOnSoloTravel() throws InterruptedException {
        rightClickandOpenNewTabUsingLink(soloTravelLink);
    }
    //**************************************************************

public void typeInSearchBox() {
    driver.findElement(By.xpath(searchBoxXp)).sendKeys(searchData, (Keys.ARROW_DOWN), Keys.ENTER);
}

public void selectDate() throws InterruptedException {
String expectedDate = "09-01-2021";
String emonth=expectedDate.split(".")[1];
String eyear=expectedDate.split(".")[2];
String edate=expectedDate.split(".")[0];

clickByXpath("//*[@id='date_picker_in_1']");
driver.findElement(By.xpath("(//div[@class='month'])[1]")).getText().trim();
    }

public void selectDatePickerUsingJs(WebDriver driver, WebElement element, String dateValue) throws InterruptedException {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("argument(0).setAttribute('value','"+dateValue+"');",element);
        sleepFor(4);

}
//**************************************************
    public void rightClicksOnNYCimage(){
        rightClickandOpenNewTabUsingXPATH(nycimagecusxp);
    }
    public void clickOnPage4(){
        clickByXpath(page4CusXp);
    }

    //********************************************************
    public void rightClicksOnParisimage(){
        rightClickandOpenNewTabUsingXPATH(franceimagecusxp);
    }
    //********************************************************
    public void rightClicksOnRomeimage(){
        rightClickandOpenNewTabUsingXPATH(romeimagecusxp);
    }







}
