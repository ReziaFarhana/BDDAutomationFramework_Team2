package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepage.HomePageWebElement.*;

public class SignUp extends WebAPI {
    @FindBy(how = How.ID, using = emailAddressBoxLocator)
    public WebElement emailAddress;
    @FindBy(how = How.ID, using = passwordInputBox)
    public WebElement passwordInput;

    public void signInButton() {
        clickByXpath(signInLocator);
    }

    public void continueWithEmailButton() throws InterruptedException {
        waitTimeExplicit(continueEmail);
        clickByXpath(continueEmail);

    }

    public void enterUserDetail(String email, String password) {
        emailAddress.sendKeys(email);
        passwordInput.sendKeys(password);
    }
    public void joinButton(){
        clickByXpath(joinButton);
    }

    public void becomeAMemberButton() {
        clickByXpath(becomeAMemberButton);
    }

    public void verifyBecomeAMemberBoxTitle(String expectedTitle) {
        String actualTitle = getTextByXpath(becomeAMemberBoxTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }

    public void signIn() {
        clickByXpath(signInLocator1);


    }
}
