package homepage;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static homepage.IndividualPageWebElement.*;

public class IndividualPage extends WebAPI {


    @FindBy(xpath = loginBoxLocator)
    public WebElement userBox;

    @FindBy(xpath = passwordBoxLocator)
    public WebElement passBox;


    public void verifyPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    public void verifyPageUrl(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Title does not match");
    }

    public void clickLogin() {
        waitTimeExplicit(logInButton);
        clickByXpath(logInButton);


    }


    public void clickLogin1() {
        waitTimeExplicit(logInButton1);
        clickByXpath(logInButton1);


    }

    public void enterUserName(String userName) {
        userBox.sendKeys(userName);

    }

    public void clickSecureLogin() {
        waitTimeExplicit(logInButton1);
        clickByXpath(secureLogin);
    }

    public void loginInvalid() {
        assertEqualByXpath(loginFailed, "Your username or password isn't correct.\n" +
                "\n" +
                "To keep your info secure, we'll lock your account if you can't sign in after 3 times.");
    }

    public void enterPassword(String password) {
        passBox.sendKeys(password);
    }
}

