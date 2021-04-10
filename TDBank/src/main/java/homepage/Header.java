package homepage;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static homepage.HeaderWebElement.*;

public class Header extends WebAPI {

    @FindBy(xpath = servicesTabLocator)
    public WebElement service;


    public void hoverService() throws InterruptedException {
        hoverOver(driver, service);
    }


    public void verifyPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    public void verifyPageUrl(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Title does not match");
    }


    //Find
    public void findStudentBanking() {
        assertEqualByXpath(studentBankingLinkLocator, "Student Banking");
    }

    public void findCrossBorder() {
        waitTimeExplicit(crossBorderLinkLocator);
        assertEqualByXpath(crossBorderLinkLocator, "Cross Border");
    }

    public void findTravelTips() {
        waitTimeExplicit(travelTipsLinkLocator);
        assertEqualByXpath(travelTipsLinkLocator, "Travel Tips");
    }

    public void findOnlineBanking() {
        waitTimeExplicit(onlineBankingLinkLocator);
        assertEqualByXpath(onlineBankingLinkLocator, "Online Banking");
    }

    public void findStudentBanner() {
        waitTimeExplicit(studentBannerLocator);
        assertEqualByXpath(studentBannerLocator, "Student Checking & Other Services");
    }

    public void findLearningBanner() {
        waitTimeExplicit(learningBanner);
        assertEqualByXpath(learningBanner, "Learning Center");
    }

    public void findPersonalBankingBanner() {
        waitTimeExplicit(personalBankingBanner);
        assertEqualByXpath(personalBankingBanner, "Personal Banking");
    }

    public void findMoneyBanner() {
        waitTimeExplicit(yourMoneyBanner);
        assertEqualByXpath(yourMoneyBanner, "It's your money. Make the most of it.");
    }

    public void findPersonalBankingTab() {
        waitTimeExplicit(personalBankingTab);
        assertEqualByXpath(personalBankingTab, "Personal Banking");
    }

    public void findCreditAndLendingTab() {
        waitTimeExplicit(creditAndLendingTab);
        assertEqualByXpath(creditAndLendingTab, "Credit and Lending");
    }

    public void findSecurities() {
        waitTimeExplicit(securitiesAndInsuranceTag);
        assertEqualByXpath(securitiesAndInsuranceTag, "SECURITIES AND INSURANCE");
    }

    public void findFdic() {
        waitTimeExplicit(notFdicInsuredTag);
        assertEqualByXpath(notFdicInsuredTag, "Not FDIC Insured");
    }

    public void findBank() {
        waitTimeExplicit(noBankTag);
        assertEqualByXpath(noBankTag, "No Bank Guarantee");
    }


    //Click
    public void clickStudentBanking() {
        waitTimeExplicit(studentBankingLinkLocator);
        clickByXpath(studentBankingLinkLocator);
    }

    public void clickCrossBorder() {
        waitTimeExplicit(crossBorderLinkLocator);
        clickByXpath(crossBorderLinkLocator);
    }

    public void clickTravelTips() {
        waitTimeExplicit(travelTipsLinkLocator);
        clickByXpath(travelTipsLinkLocator);
    }

    public void clickOnlineBanking() {
        waitTimeExplicit(onlineBankingLinkLocator);
        clickByXpath(onlineBankingLinkLocator);
    }

    public void clickLearning() {
        waitTimeExplicit(learningTab);
        clickByXpath(learningTab);
    }



}

