package homepage;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static homepage.IndividualPageWebElement.*;

public class SupportHeader extends WebAPI {


    @FindBy(xpath = accountTabLocator)
    public WebElement account;


    public void clickMemberTab() {
        clickByXpath(memberSupportTabLocator);
    }


    public void hoverAccount() throws InterruptedException {
        hoverOver(driver, account);
        sleepFor(1);
    }

    public void clickpayPremiumTab() {
        waitTimeExplicit(payPremiumTabLocator);
        clickByXpath(payPremiumTabLocator);
    }


    public void verifyDoctor() {
        assertEqualByXpath(findaDoctorTabLocator1, "Find a doctor");

    }


    public void findForm() {
        assertEqualByXpath(findForm, "Find a form");

    }


    public void verifyPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }


    public void findPayPremium() {
        assertEqualByXpath(payPremiumTabLocator, "Pay your premium");

    }


}
