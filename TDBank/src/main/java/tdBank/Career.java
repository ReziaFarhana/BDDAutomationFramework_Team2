package tdBank;

import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;
import  org.openqa.selenium.WebElement;

import static tdBank.WebElement.*;

public class Career extends WebAPI {
    @FindBy(how = How.XPATH, using = jobOpportunitiesDropDown)public WebElement jobOpportunitiesDD;
@FindBy(how = How.XPATH, using = callCentersLocator)public WebElement callcenterLoc;

    public static final String adChoicesAndPersonalizationXButton = "//*[@id=\"ensCall\"]/span[2]";


    public void scrollDownToCareers() {
        scrollDown2("Careers");
    }


    //click career button
    public void clickOnCareerTab() throws InterruptedException {

        clickByXpath(adChoicesAndPersonalizationXButton);
        scrollDownToCareers();

        clickByXpath(careerButtonLocator);
        sleepFor(3);
        windowHandle();
        sleepFor(3);


    }
//--------------------------Job SearchBox----------------------------------------
    public void KeywordInJobSearchbox(String keyword){

        typeOnElement(keywordjobSearchBox,keyword);
    }

    public void locationInSearchBox(String state) {

        typeOnElement(searchByLocation, state);
    }

    //click search after input in searchbox
    public void clickOnSearchButton() throws InterruptedException {

        clickByXpath(searchButton);
        sleepFor(3);
        windowHandle();
        sleepFor(3);
    }

    public void verifySearchResultText(String expectedText){
        String actualText=getTextByXpath(liveResultsPageTextlocator);
        Assert.assertEquals(actualText,expectedText,"Text message does not match");
    }

    public void verifySearchResultTitle(String expectedaTitle) {
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedaTitle, "Product does not match");
    }

    //--------------------job opportunities------

    public void hoverJobOpportunities() throws InterruptedException {
        //mouseHoverByXpath(jobOpportunitiesDropDown);
        //clickByXpath(callCentersLocator);
        hoverAndClick(jobOpportunitiesDD,callcenterLoc);
    }
    public void hoverAndClick(WebElement elementHover, WebElement elementClick) {

        Actions selecrMenu = new Actions(driver);
            selecrMenu.moveToElement(elementHover).click(elementClick).build().perform();
        }



    public void verifyRetailOpportunitiesPage(String expectedText) {
        String actualText = getTextByXpath(callCenterTextLocator);
        Assert.assertEquals(actualText, expectedText, "text does not match");
    }

}



