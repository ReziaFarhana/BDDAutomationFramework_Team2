package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepage.HomePageWebElement.*;


public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = Personal)
    public WebElement personal;
    @FindBy(how = How.XPATH, using = WeAreHereToHelp)
    public WebElement weareheretohelp;
    @FindBy(how = How.XPATH, using = checkingAccount)
    public WebElement checkingaccount;
    @FindBy(how = How.XPATH, using = checkingAccount)
    public WebElement Checkingaccount1;
    @FindBy(how = How.XPATH, using = BeyoundCheckingGetText)
    public WebElement BeyoundCheckingGetText1;
    @FindBy(how = How.XPATH, using = learnMoreAboutHomeStepDeffinition)
    public WebElement learnMoreAboutHomeStepDeffinition1;
    @FindBy(how = How.XPATH, using = TDBankCheckingAccountText)
    public WebElement TDBankCheckingAccountText1;
    @FindBy(how = How.XPATH, using = CheckingComesText)
    public WebElement CheckingComesText1;
    @FindBy(how = How.XPATH, using = CheckingComesText)
    public WebElement CheckingComesText2;

    public void personal() {
        personal.click();
    }
    public void personalWeAreHereToHelp() {
         String expectedTex =" We're here to help.";
        String actualResult = weareheretohelp.getText();
        Assert.assertEquals("text does not match", expectedTex,actualResult);
    }
    public void Checkingaccount() throws InterruptedException {
        checkingaccount.click();
        Thread.sleep(5000);
    }

    public void CheckingAccountGetText() {
        String exResult = "TD Beyond Checking";
        String acResult = BeyoundCheckingGetText1.getText();
        Assert.assertEquals("Text Does not Match", exResult, acResult);
    }

    public void CheckingAccountGetTitle(String exResult) throws InterruptedException {
        Checkingaccount();
        String acResult = driver.getTitle();
        org.junit.Assert.assertEquals("Test is not matching", exResult, acResult);
    }

    public void LearnAboutHSDefinition() throws InterruptedException {
        clickByXpath(Personal);
        Thread.sleep(2000);
        learnMoreAboutHomeStepDeffinition1.click();
    }


    public void enrollNow() throws InterruptedException {
        LearnAboutHSDefinition();
        learnMoreAboutHomeStepDeffinition1.click();
    }


    public void checkTitle(String exResult) throws InterruptedException {
        enrollNow();
        String acResult = driver.getTitle();
        Assert.assertEquals("Text Does not Match", exResult, acResult);

    }
//*************************************************************************************************************************************************

    public void smallBusiness() throws InterruptedException {
        clickByXpath(smallBusiness);
    }

    public void watchVideo() throws InterruptedException {
        clickByXpath(watchVideo);
        Thread.sleep(10000);
    }

    public void CheckTitle(String exResult) throws InterruptedException {
        String acResult = driver.getTitle();
        Assert.assertEquals("Text Does not Match", exResult, acResult);

    }

    //*******************************************************************************************************************
    public void Commercial() throws InterruptedException {
        clickByXpath(Commercial);
        sleepFor(10);
    }

    public void learnMore() throws InterruptedException {
        clickByXpath(learnMore);
        sleepFor(10);
    }

    public void CheckTitle1(String exResult) throws InterruptedException {
        String acResult = driver.getTitle();
        Assert.assertEquals("Text Does not Match", exResult, acResult);

    }
//*****************************************************************************************************************************************


    public void InvestingAndWealth() throws InterruptedException {
        clickByXpath(InvestingAndWealth);
        sleepFor(10);
    }

    public void IndividualsAndFamilies() throws InterruptedException {
        clickByXpath(IndividualsAndFamilies);
        sleepFor(10);
    }

    public void retirementPlanning() throws InterruptedException {
        clickByXpath(retirementPlanning);
        sleepFor(10);
    }

    public void CheckTitle2(String exResult) throws InterruptedException {
        String acResult = driver.getTitle();
        Assert.assertEquals("Text Does not Match", exResult, acResult);

    }

//***********************************************************************************************************************

    public void product() {
        mouseHoverByXpath(Product);
    }

    public void ClickOnCheckingAccountTab() {
        clickByXpath(Checking);
    }

    public void checkingComesText() {
        String expectedText = "Checking comes jam-packed with perks — and a bonus.";
        String actualText = CheckingComesText1.getText();
        org.junit.Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    public void ClickOnSaving() {
        clickByXpath(Saving);
    }

    public void ClickOnCDS() {
        clickByXpath(CDs);
    }

    public void CheckCreditCard() {
        clickByXpath(CreditCard);
    }

    public void CreditCardCheckTitle() {
        String expectedText = "TD Bank Credit Cards";
        String actualText = CheckingComesText1.getText();
        org.junit.Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    public void Check() {
        clickByXpath(Mortgage);
    }
    public void PersonaLoan () {
        clickByXpath(PersonalLoan);
    }

}


