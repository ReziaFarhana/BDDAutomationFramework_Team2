package unitedairlinessearch;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import unitedairlinesdatatest.DataTest;

import java.io.IOException;
import java.util.List;

import static unitedairlinessearch.UnitedAirlinesSearchWebElement.*;

public class UnitedAirlinesSearch extends WebAPI {

    @FindBy(how = How.XPATH, using = "(//span[starts-with(@class,'app-components')])[2]") public WebElement signInHomePage;
    @FindBy(how =How.XPATH, using = searchBtnInHomePageLocator) public WebElement searchBtnInHomePage;
    @FindBy(how =How.XPATH, using = searchBoxLocator) public WebElement searchBox;
    @FindBy(how=How.XPATH, using = searchBoxButtonLocator) public WebElement searchBoxButton;


    // Action Method class
    public void clickOnSearchBox(){ searchBtnInHomePage.click(); }
    public void enterDataInSearchBoxFromExcel() throws IOException {
        List<String> dataFromExcel = DataTest.getDataFromExcel();
        String item = dataFromExcel.get(1);
        searchBox.sendKeys(item);
        searchBoxButton.click();
    }
    public void validateSearchResult(String expectedText){
        String actualText = getTextByXpath(searchResultTextLocator);
        Assert.assertEquals(actualText, expectedText);
    }

/*
** Test-2 search data from DB
 */
    public void searchDataFromDB() throws Exception {
        DataTest.insertToDB();
        List<String> dataFromDB = DataTest.getDataFromDB();
        String item = dataFromDB.get(1);
        searchBox.sendKeys(item);
        searchBoxButton.click();
    }


}
