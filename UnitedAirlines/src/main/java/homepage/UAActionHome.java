package homepage;


import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.UAWebElement.*;

public class UAActionHome extends WebAPI{

    UAWebElement element;

    public void clickOnDeals() {
        clickByXpath(dealsLocator);
    }

    public void verfiyOffer(){
        String expected = "OFFERS";
        String actual = getTextByXpath(offerTextLocator);
        Assert.assertEquals("Test failed",expected,actual);
    }

    public void clickOnCurrentOffersPromos(){
        clickByXpath(currentOffersLinksLocator);
    }

    public void VerifyclickOnCurrentOffersProms() {
        String expected = "Deals & offers";
        String actual = getTextByXpath(currentOffersLinksTetLocator);
        Assert.assertEquals("Test failed",expected,actual);
    }

    public void clickOnMileageAndPlus(){
        clickByXpath(mileagePlusLocator);
    }

    public void verifyMileageAndPlusIsClicked(){
        String expected = "MileagePlus deals & offers";
        String actual = getTextByXpath(mileagePlusLocatorText);
        Assert.assertEquals("Test failed",expected,actual);
    }

    public void clickOnAgeDiscountLink(){
        clickByXpath(ageDiscountsLocator);
    }

    public void verifyAgeDiscountIsClicked(){
        String expected = "Discounted flights for 18 to 22 year olds";
        String actual = getTextByCss(offersSectionsHeadTextLocator);
        Assert.assertEquals("Test failed",expected,actual);
    }

    public void clickOnVeteransAdvantage(){
        clickByXpath(veteransDiscountLocator);
    }

    public void verifyVeteransAdvantageIsClicked(){
        String expected = "Veterans Advantage discount";
        String actual = getTextByCss(offersSectionsHeadTextLocator);
        Assert.assertEquals("Test failed",expected,actual);
    }

    public void clickOnRedeemeCert(){
        clickByXpath(redeemCertLocator);
    }

    public void verifyRedeemeCertIsClicked(){
        String expected = "Using United travel credits";
        String actual = getTextById(redeemCertTextLocator);
        Assert.assertEquals("Test failed",expected,actual);
    }

    public void locat(){

    }






}
