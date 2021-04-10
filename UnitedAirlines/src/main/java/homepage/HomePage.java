package homepage;


import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;
public class HomePage extends WebAPI {

// Action Method class
    // Find By Annotation: First Approach

   @FindBy(how = How.XPATH, using = searchButton)
    public WebElement searchButton1;
    @FindBy(how = How.XPATH, using = searchBoxLocator)
    public WebElement searchBoxLocator1;
    @FindBy(how = How.XPATH, using = search)
    public WebElement search1;
    @FindBy(how = How.XPATH, using = covid19getText)
    public WebElement covid19getText1;
    @FindBy(how = How.XPATH, using = travelInfo)
    public WebElement travelInfo1;
    @FindBy(how = How.XPATH, using = contactUs)
    public WebElement contactUs1;
    @FindBy(how = How.XPATH, using = customerSupport)
    public WebElement customerSupport1;
    @FindBy(how = How.XPATH, using = searchBox)
    public WebElement searchBox1;
 @FindBy(how = How.XPATH, using = searchUnited)
    public WebElement searchUnited1;


    public void searchButton() {
        searchButton1.click();
    }
    public void setSearchBoxLocator() {
        searchBoxLocator1.sendKeys("covid 19 information ");

    }


    public void Search() {
        search1.click();

    }

    public void verifySearchResult(String expectedText) {
        String actualText = covid19getText1.getText();
        Assert.assertEquals("Product does not match", expectedText, actualText);
    }

    public void CheckTitle(String expectedResult) {
        String actualText = driver.getTitle();
        Assert.assertNotEquals("Product does not match",expectedResult, actualText);
    }
    //*****************************************************************************************



    public void travelInfo() {
        travelInfo1.click();

    }

    public void contactus() {
        contactUs1.click();

    }

    public void contactustitle() {
        contactus();
        String exResult = "Customer support";
        String acResult = customerSupport1.getText();
        Assert.assertEquals("Test is not matching", exResult, acResult);

    }

    public void contactusSearchBox() throws InterruptedException {
        contactus();
       // typeByXpath(customerSupport, baggage);
        sleepFor(10);
        searchBox1.click();

    }
    public void contactusSearchBoxText() throws InterruptedException {
        contactusSearchBox();
        String exResult = "Search united.com";
        String acResult = searchUnited1.getTagName();
        Assert.assertEquals("Test is not matching", exResult, acResult);


    }
}