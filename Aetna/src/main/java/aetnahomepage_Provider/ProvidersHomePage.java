package aetnahomepage_Provider;

import common.WebAPI;
import org.testng.Assert;

import static aetnahomepage_Provider.ProvidersWebElement.*;

public class ProvidersHomePage extends WebAPI {

    public void providersLink() throws InterruptedException {
        sleepFor(3);
        clickByXpath(providersLocator);
    }
    public void viewProviderUpdateVideo(){
    clickByXpath(viewProviderUpdateVideoLink);
    }
    public void continueButton(){
        clickByXpath(continueButton);
    }
    public void verifyyouTubeVideoTitle(String expectedTitle){
        closeTheOldWindow();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void closeAlert() throws InterruptedException {
        clickByXpath(closeAlertButton);
        sleepFor(3);
    }
    public void verifyProvidersPageTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void exploreHealthCareResourcesLink(){
        clickByXpath(manualsWebinarsAndMoreLinkLocator);
    }
    public void verifyManualsAndWebinarsPageTitle(String expectedTitle){
        String actualTitle = getTextByXpath(manualsAndWebinarsPageTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void readProviderNewslettersLink(){
        clickByXpath(newsletters);
    }
    public void verifyNewslettersLink(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void findRegulationsByStateLink(){
        clickByXpath(stateRegulations);
    }

    public void verifyStateRegulationsTitle(String expectedTitle){
        String actualTitle = getTextByXpath(stateRegulationsPageTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }

    public void learnAboutDisputesAndAppealsLink(){
        clickByXpath(disputesAndAppeals);
    }

    public void verifydisputesAndAppealsPageTitle(String expectedTitle){
        String actualTitle = getTextByXpath(disputesAndAppealsPageTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Title does not match");
    }



}
