package homepage.searchbox;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.searchbox.SearchBoxWebElement.*;
import static homepage.searchbox_texas.SearchBoxTexasWebElement.searchTexasBtnLocator;
import static homepage.searchbox_texas.SearchBoxTexasWebElement.searchWhereToLocator;

public class SearchBox extends WebAPI {
    @FindBy(how = How.CSS, using = searchWhereToHPBoxLocator) public WebElement searchBox;
    @FindBy(how = How.CSS, using = searchHPBtnLocator) public WebElement searchHPBtn;
    @FindBy(how = How.XPATH, using = searchTextLocator) public WebElement searchText;
//    @FindBy(how = How.XPATH, using = searchWhereToLocator) public WebElement searchBox;
//    @FindBy(how = How.XPATH, using = searchTexasBtnLocator) public WebElement searchBtn;

    @FindBy(how = How.XPATH, using = ThingsToDoHPLocator)
    public WebElement ThingsToDoHPage;


    public void verifySearchText(String expectedText) throws InterruptedException {
        String actualText = searchBox.getText();
        sleepFor(3);
        Assert.assertEquals("Text doesn't match", expectedText, actualText);

    }
    public void verifyPageURL (String expectedText){
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals("Title doesn't match", expectedText, actualText);
    }
//.........................................................

    public void enterCountryName(String countryName) {
        searchBox.sendKeys(countryName);
    }


    public void clickOnSearchButton(){
        searchHPBtn.click();
    }

    public void verifySearchResult(String expectedText){
        String actualText=searchText.getText();
        Assert.assertEquals("Search doesn't match",expectedText,actualText);
    }

    public void verifySearchResultNotMatch(String expectedText){
        String actualText=searchText.getText();
        Assert.assertNotEquals("Search doesn't match",expectedText,actualText);
    }

    public void verifyPageTitle(String expectedText){
        String actualText=driver.getTitle();
        Assert.assertEquals("Page Title not match",expectedText,actualText);
    }
        public void verifyThingsToDo () {
        }
    }

