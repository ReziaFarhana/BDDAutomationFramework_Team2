package homepage;

import common.WebAPI;
import org.junit.Assert;

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
}
