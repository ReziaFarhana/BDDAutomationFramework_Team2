package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

import static homepage.HomePage.*;
import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {
    HomePageWebElement element;
//    @FindBy(how = How.CSS,using = productNameN) public WebElement res;
//    @FindBy(css = productNameN) public WebElement clickOnServices;

    public void verifyOnlineBankingIsClicked(String expected){
        String actual = getTextByXpath(verifyOnlineBaking);
        Assert.assertEquals("Test failed",expected,actual);
    }

    public void verifyOnlineBankingUnderLogIn(String expected){
        handleNewTab();
        String actual = getTextByCss(verifyonlineBankingInSignIn);
        Assert.assertEquals("Test failed",expected,actual);
    }

    public void verifyProductsTab(String expected){
        String actual = driver.getTitle();
        Assert.assertEquals("Test failed",expected,actual);
    }

    public void verifyNewTab(int index, String expected){
        windoSwitchHandler2(index);
        String actual = getTextByCss(verifyonlineBankingInSignIn);
        Assert.assertEquals("Test failed",expected,actual);
    }













    public void bootStrapElements(String loc,String string){
        List<WebElement> elements = driver.findElements(By.xpath(loc));
        System.out.println(elements.size());
        for (int i = 0; i < elements.size();i++){
            System.out.println(elements.get(i).getText());
            if(elements.get(i).getText().contains(string)){
            elements.get(i).click();}
        }

    }

}
