package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;


public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using =employersPageTextXp ) public WebElement employersPageText;

// Action Method class


    // Find By Annotation:

    public void clickEmployersLink(){
        clickByXpath(employersXp);
    }

    public void verifyEmployersLink(String expectedText) throws InterruptedException {
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        WebElement element=driver.findElement(By.xpath(employersPageTextXp));
        executor.executeScript("arguments[0].scrollIntoView(true);",element);

       String actualText= employersPageText.getText();
       sleepFor(3);
        Assert.assertEquals("Text doesnt match", expectedText, actualText);
    }

    public void verifyEmployersPageTitle(String expectedText){
        String actualText =driver.getTitle();
        Assert.assertEquals("Page title doesnt match", expectedText, actualText);
    }


}
