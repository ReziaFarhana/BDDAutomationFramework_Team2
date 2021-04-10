package tdBank;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import static tdBank.WebElement.*;

public class SearchBox extends WebAPI {
    public static final String adChoicesAndPersonalizationXButton = "//*[@id=\"ensCall\"]/span[2]";

public void tdBankSearchBox(){
    clickByXpath(adChoicesAndPersonalizationXButton);
    clickByXpath(searchButtonLocator);

}
public void inputProductsInSearchBox(String products) throws InterruptedException {
    sleepFor(5);

   // typeOnInputBoxByXpath("//div[@class='td-search-container']//form[@role='search']",products);
    driver.findElement(By.xpath("//input[@placeholder='Search'])[1]")).sendKeys(products, Keys.ENTER);


}
public void verifyProductText(String expectedText){
    String actualText=getTextByXpath(youSearchedFor);
    Assert.assertEquals(actualText,expectedText,"Text did not match");



}
}
