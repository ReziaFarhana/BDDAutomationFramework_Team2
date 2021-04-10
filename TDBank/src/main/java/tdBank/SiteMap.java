package tdBank;

import common.WebAPI;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.io.IOException;

import static tdBank.WebElement.*;



public class SiteMap extends WebAPI {

    public static final String adChoicesAndPersonalizationXButton = "//*[@id=\"ensCall\"]/span[2]";

public void siteMapLink() throws InterruptedException {
    clickByXpath(adChoicesAndPersonalizationXButton);
    JavascriptExecutor js2 = (JavascriptExecutor) driver;
    js2.executeScript("window.scrollBy(0,2500)");

    clickByXpath(siteMap);
    sleepFor(3);
    windowHandle();
    sleepFor(3);
}

public void studentBanking() throws InterruptedException {
    clickByXpath(studentBanking1);
    sleepFor(2);
}

public void verifyStudentCheckingDisplays(String expectedText){
    String actualText=getTextByXpath(studentCheckingTextLocater);
    Assert.assertEquals(actualText,expectedText,"Text does not match");

}
//--------------------------TravelTips-------------------

    public void travelTips(){

    clickByLinkText("Travel");

}
public void foriegnCurrency(){




}
    public void currencyCalculator(){

}
    public void startMyOrder(){


    }
    public void verifyOrderInShoppingCart(){

    }


}