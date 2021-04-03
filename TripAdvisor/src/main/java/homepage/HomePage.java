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
