package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.TravelForumPageWebElements.*;

public class TravelForumPage extends WebAPI {
    @FindBy(how= How.CLASS_NAME, using = searchTextXp)public WebElement searchText;

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
}
