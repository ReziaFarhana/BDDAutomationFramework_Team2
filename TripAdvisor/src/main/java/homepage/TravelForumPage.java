package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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




}
