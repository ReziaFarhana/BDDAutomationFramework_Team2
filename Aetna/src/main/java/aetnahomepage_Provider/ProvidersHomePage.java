package aetnahomepage_Provider;

import common.WebAPI;
import org.testng.Assert;

import static aetnahomepage_Provider.ProvidersWebElement.*;

public class ProvidersHomePage extends WebAPI {

    public void providersLink() throws InterruptedException {
        clickByXpath(providersLocator);
    }
    public void viewProviderUpdateVideo(){
    clickByXpath(viewProviderUpdateVideoLink);
    }
    public void continueButton(){
        clickByXpath(continueButton);
    }
    public void verifyyouTubeVideoTitle(String expectedTitle){
        closeTheOldWindow();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void closeAlert(){
        clickByXpath(closeAlertButton);
    }


}
