package homepageheader;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepageheader.HomePageHeaderWebElement.*;

public class CommercialPage extends WebAPI {
    @FindBy(how = How.XPATH, using = lendingButtonLocator)
    public WebElement lendingButton;
    @FindBy(how = How.XPATH, using = commercialLendingOption)
    public WebElement commercialLending;
    @FindBy(how = How.ID, using = firstNameInputBox)
    public WebElement firstName;
    @FindBy(how = How.ID, using = lastNameInputBox)
    public WebElement lastName;
    @FindBy(how = How.ID, using = businessNameInputBox)
    public WebElement businessName;
    @FindBy(how = How.ID, using = phoneNumberInputBox)
    public WebElement phone;
    @FindBy(how = How.ID, using = emailInputBox)
    public WebElement email;


    public void adsChoicesAndPersonalizationpopUp() {
        clickByXpath(adChoicesAndPersonalizationXButton);
    }

    public void commercialTab() {
        clickByLinkText(commercialTabLocator);
    }

    public void hoverOverLendingAndSelectCommerical() {
        hoverAndClick(lendingButton, commercialLending);
    }

    public void verifyCommercialLendingPage(String expectedText) {
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title does not match");
    }

    public void requestACall() {
        clickByXpath(requestACallButton);
    }

    public void enterPersonalInformation(String firstname, String lastname, String businessname, String phoneNumber, String emailAddress) {
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        businessName.sendKeys(businessname);
        phone.sendKeys(phoneNumber);
        email.sendKeys(emailAddress);
    }

    public void areYouATDCustomer(){
        clickByXpath(tDCustomer);
    }

    public void verifyHeaderOnTheScheduleAppointmentPage(String expectedText){
        String actualText = getTextByXpath(scheduleAnAppointmentPageHeader);
        Assert.assertEquals(actualText,expectedText,"Header does not match");

    }


}
