package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class EmployersPage extends WebAPI {
    @FindBy(how = How.CLASS_NAME, using =aboutUsPageTextClass ) public WebElement aboutUsText;


    public void clickDropDown(){
        clickByXpath(exploreDropDownToggleClass);
    }
    public void clickAboutUsNav(){
        clickByXpath(aboutUsLinkXp);
    }
    public void verifyAboutUsPage(String expectedText){
        String actualText = aboutUsText.getText();
        Assert.assertEquals("Text doesnt match", expectedText, actualText);

    }
}
