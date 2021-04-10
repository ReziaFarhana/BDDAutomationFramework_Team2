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
    @FindBy(how = How.CSS, using = SearchBtnLocator) public WebElement SearchBtn;



    public void enterCountryName(String countryName) {
        searchBox.sendKeys(countryName);
    }

    public void clickOnSearchButton(){ SearchBtn.click(); }

    public void verifySearchResult(String expectedCountry){
        String actualText=searchText.getText();
        Assert.assertEquals("Search doesn't match",expectedCountry,actualText);
    }

    public void verifyPageTitle(String expectedText) throws InterruptedException {
        String actualText=driver.getTitle();
        sleepFor(3);
        Assert.assertEquals("Page Title not match",expectedText,actualText);
    }
//Test-2................................................................
   public void verifyThingsToDo () { clickByXpath(ThingsToDoHPLocator); }

   public void enterCityName(String City) {searchBox.sendKeys(City); }

   public void verifyPageURL (String expectedText) throws InterruptedException {
        String actualText = driver.getCurrentUrl();
        sleepFor(3);
        Assert.assertEquals("Search doesn't match", expectedText, actualText);
    }
}


