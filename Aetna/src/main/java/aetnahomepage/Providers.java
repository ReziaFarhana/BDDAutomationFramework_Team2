package aetnahomepage;

import common.WebAPI;
import org.testng.Assert;

import static aetnahomepage.ProvidersWebElement.*;

public class Providers extends WebAPI {

    public void providersLink() throws InterruptedException {
        clickByXpath(providersLocator);
    }

    public void verifyProvidersPage(String expectedText){
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Title does not match");
    }


}
