package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how= How.XPATH, using= productsdropdownCusXp) public WebElement productsDropDown;
    @FindBy(how= How.XPATH, using= checkingCusXp) public WebElement checking;

    public void hoverOverProductsDropDown() throws InterruptedException {
        hoverOver(driver, productsDropDown);
    }
    public void clickChecking(){
        driver.findElement(By.xpath(checkingCusXp)).click();
    }
    public void verifyTitle(String expectedText){
        String actualText = driver.getTitle();
        Assert.assertEquals("Text doesnt match", expectedText, actualText);
    }
}
