package homepageheader_hotels;

import common.WebAPI;
import org.testng.Assert;

import static homepageheader_hotels.HotelsWebElement.*;

public class Register extends WebAPI {

    public void signInButton(){
        clickByXpath(signInLocator);
    }
    public void continueWithEmailButton() throws InterruptedException {
        sleepFor(5);
        clickByXpath(continueWithEmailButton);
    }
    public void becomeAMemberButton(){
        clickByXpath(becomeAMemberButton);
    }
    public void verifyBecomeAMemberBoxTitle(String expectedTitle){
        String actualTitle = getTextByXpath(becomeAMemberBoxTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Title is not a match");
    }

}
