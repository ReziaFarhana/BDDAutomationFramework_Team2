package homepage;

import common.WebAPI;
import datatest.DataTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.List;

import static homepage.HomePageWebElement.*;


public class HomePage extends WebAPI {
    @FindBy(how=How.XPATH, using = searchBoxLoc) public WebElement searchBox;
    @FindBy(how=How.XPATH, using = searchBoxBtn) public WebElement searchBoxButton;


    public void clickOnSearchBox(){
        searchBox.click();
    }

    public void enterDataInSearchBoxFromExcel() throws IOException {
        List<String> dataFromExcel = DataTest.getDataFromExcel();
        String item = dataFromExcel.get(3);
        searchBox.sendKeys(item);
        searchBoxButton.click();
    }

    public void verifySearchResult(String expectedText){
        String actualText = getTextByXpath(searchResultText);
        Assert.assertEquals("Text doesnt match", expectedText, actualText);
    }
}
