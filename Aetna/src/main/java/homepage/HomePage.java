package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation:

    @FindBy(how = How.XPATH, using = shopForAplan)
    public WebElement shopForAplan1;
    @FindBy(how = How.XPATH, using = shopForAplanTab)
    public WebElement shopForAplanTab1;
    @FindBy(how = How.XPATH, using = Medicare)
    public WebElement Medicare1;
    @FindBy(how = How.XPATH, using = FindAdoctor)
    public WebElement FindAdoctor1;
    @FindBy(how = How.XPATH, using = Individual)
    public WebElement Individual1;

    public void shopForAplan() {
        shopForAplan1.click();
    }

    public void shopForAPlanText(String exResult) {
        shopForAplan();
        String acResult = driver.getTitle();
        Assert.assertEquals("Test is not matching", exResult, acResult);
    }

    public void Medicare() throws InterruptedException {
        shopForAplanTab1.click();
        Thread.sleep(1000);
        Medicare1.click();
    }

    public void findAdoctor() throws InterruptedException {
        Medicare();
        FindAdoctor1.click();

    }

    public void Individual() throws InterruptedException {
        Individual1.click();
        Thread.sleep(5000);
    }
}
