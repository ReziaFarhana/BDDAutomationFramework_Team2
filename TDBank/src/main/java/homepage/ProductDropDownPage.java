package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static homepage.ProductsDropDownWebElement.*;


public class ProductDropDownPage extends WebAPI {

// Action Method class


    public void clickLearnMore() {
        clickByXpath(learnMoreCusXp);
    }

    public void clickViewAccountDetail() {
        scrollByXPATH(viewAccountDeetCusXp);
    }

    public void verifyUrl(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("url doesnt match", expectedUrl, actualUrl);
    }

    public void clickOnSearchBox(){
        clickByXpath(searchBoxCusXp);
    }
    public void searchData(String searchData){
        driver.findElement(By.xpath(searchBoxCusXp)).sendKeys(searchData, Keys.ENTER);
    }


}
