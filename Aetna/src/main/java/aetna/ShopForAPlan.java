package aetna;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;

import static aetna.WebElement.*;

public class ShopForAPlan extends WebAPI {
    @FindBy(how = How.XPATH, using = shopForAPlan)
    public WebElement shopPlan;


    public void aetnaHomepage() throws IOException {

        openBrowser(aetnaURL);
    }
//------------------------BackGround-------------------------------------------------


    public void shopForPlan() {

        clickByXpath(shopForAPlan);
    }

    public void medicareAndBrowsePlans() {
        clickByXpath(medicare);
        clickByXpath(browseAetnaMedicarePlan);
    }

    public void medicareAdvantage() {
        clickByXpath(medicareAdvantagePlans);
    }

    public void zipCode() {
        typeOnElement(zipCodeForMedicareAdvantage, "11590");
    }

    public void view2021Plans() throws InterruptedException {
        clickByXpath(view2021Plans);
        sleepFor(3);
        windowHandle();
        sleepFor(3);
    }

    public void verifyPlanListTitlePage(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title did not match");
    }

    //--------------SORT DD-----> Add To Cart
    public void sortDD() {
        clickByXpath(sortEstimatedCostDD);
    }

    public void planLowToHigh() {
        clickByXpath(planPremiumLowToHighDD);

    }
    public void addToCart() throws InterruptedException {
        clickByXpath(addToCartMedicarePlan);
        sleepFor(3);
        windowHandle();
        sleepFor(3);
    }

    public void verifyMyCartText(String expectedText) {
        String actualText = getTextByXpath(actualMyCartText);
        Assert.assertEquals("TextDid Not match", expectedText, actualText);
    }

    //----------Radio Button--> dental and vision---->Checkout-->>Verify Personal Info----------------------------------
    public void existingMemberRadioButton() {

        clickByXpath(newAetnaRadioButton);
    }

    public void dentalAndVisionAddButton() {

        clickByXpath(optionalAddOnDentalAndVision);
    }

    public void proceedToCheckout() throws InterruptedException {
        clickByXpath(proceedToCheckoutMedicarePlan);
        sleepFor(3);
        windowHandle();
        sleepFor(3);
    }
                        //-----Personal Info Verify Text
    public void verifyPersonalInfoPage(String expectedText) {
        String actualText = getTextByXpath(verifyPersonalInfoTextLocator);
        Assert.assertEquals("Text did not match", expectedText, actualText);
    }

                    //----personal Info verify Title
    public void verifyPersonalInfoTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match",expectedTitle, actualTitle);
    }


//-----------------------------------------------------------------------
//-----------------Data Table----------------------
    public void specialEnrollmentCheckBoc() {
        clickByXpath(specialEnrollmentPeriodCheckBox);
    }

    public void firstNameInput(String firstName){
        typeOnElement(firstNamePersonalForm,firstName);

    }
    public void middelInitialInput(String middleName ){
        typeOnElement(middleInitalPersonalForm,middleName);

    }
    public void lastNameInput(String lastName){
        typeOnElement(lastNamePersonalForm,lastName);

    }
    public void dateOfBirthInput(String dob){
        typeOnElement(birthdatePersonalForm,dob);

    }
    public void primaryPhoneNumber(String primPhoneNum){
        typeOnElement(primaryPhoneNumPersonalForm,primPhoneNum);


    }
    public void emailAddressInput(String email){
        typeOnElement(emailAddPersonalForm,email);
        }


    }
