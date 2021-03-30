package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;



public class HomePage extends WebAPI {
    @FindBy(how =How.XPATH, using = emailBoxXp) public WebElement emailBox;
    @FindBy(how =How.XPATH, using = passwordBoxCusXp) public WebElement passwordBox;
    @FindBy(how=How.XPATH, using = signInBtnXp) public WebElement signInBtn;
    @FindBy(how=How.XPATH, using = welcomeMsgTextXp) public WebElement welcomeBackMsg;
    // Action Method class


    public void clickOnTravelForumBtn(){
        clickByXpath(travelForumsBtnXp);
    }
    public void clickOnSignInButton() throws InterruptedException {
        clickByXpath(signInButtonXp);
        sleepFor(3);
    }
    public void clickOnContinueWithEmailButton(){
        scrollByXPATH(continueWEmailXp);
    }

    public void enterEmailandPassword(String email, String password){
      emailBox.sendKeys(email);
      passwordBox.sendKeys(password);

    }
    public void clickSignIn(){
        signInBtn.click();
    }
    public void verifyUserSignedIn(String expectedText){
        String actualText = welcomeBackMsg.getText();
        Assert.assertEquals("Text doesnt match", expectedText, actualText);
    }


}