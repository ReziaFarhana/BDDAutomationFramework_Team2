package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.net.HttpURLConnection;
import java.util.List;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    public void verifyAddAPlacePage(String expected) {
        String actual = getTextByCss(locatorToVerifyAddPlace);
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void verifyAirlinesPage(String expected) {
        String actual = getTextByXpath(locatorToVerifyAirlinesLink);
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void verifyTitlePage(String expected) {
        String actual = driver.getTitle();
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void verifyTripProtectionPage() {
        boolean actual = isElementDisplayed(locatorOfTripProtection);
        Assert.assertEquals("Test failed", true, actual);
    }

    public void verifySingleInsurance(String expected){
        String actual = getTextByCss(toVerifySingleInsurancerlocator);
        Assert.assertEquals("Test failed",expected,actual);
    }

    public void verifyAccessMyPlan(String expected){
        String actual = getTextByCss(locatorToVerifyAccessMyPlan);
        Assert.assertEquals("Test failed",expected,actual);
    }

    @FindBy(css = locatorToSelectState)
    public WebElement selectState;

    @FindBy(css = locatorToSelectDestination)
    public WebElement destination;


    public void toSelectStateResidence(){
        scrollTO(locatorToLocateQoute);
        selectState.click();
        selectOptionByVisibleText(selectState,"VA");
    }

     public void toSelectStateDestiantin(){
        selectOptionByVisibleText(destination,"Africa - Other");
    }

    public void verifyInsuranceQoute(String expected){
        String actual = getTextByCss(locatorToVirifyQoute);
        Assert.assertEquals("Test failed",expected,actual);

    }

    public void verifyAirlinesSearch(String airliensInfo){
        String actual = getTextByCss(locatorToClickOnAirlinesSearch);
        Assert.assertEquals("Test failed",airliensInfo,actual);
    }

    public void verifyClickOnFlightsLink(String text){
        String actual = getTextByXpath(locatorToVerifyClickOnFlightsLink);
        Assert.assertEquals("Test failed",text,actual);
    }










    public void bootStrap(String loc, String val) {
        List<WebElement> list = driver.findElements(By.xpath(loc));
        System.out.println(list.size());
//        for (int i = 0; i < siz; i++) {
//            System.out.println(list.get(i).getText());
//            if (list.get(i).getText().contains(val)) {
//                list.get(i).click();
//
//            }
//        }

        for(WebElement el : list){
            System.out.println(list.size());
            System.out.println(el.getText());
            if(el.getText().contains(val)){
                el.click();
            }
        }

    }


}
