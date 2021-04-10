package unitedairregistration;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnitedAirRegistrationPage extends WebAPI {
    // Action Method class

    // Find By Annotation: First Approach
    @FindBy(xpath = "//*[@id=\"loginButton\"]/span")
    WebElement signUpBtn;
    @FindBy(xpath = "//a[contains(text(),'Join now')]")
    WebElement joinNowBtn;
    @FindBy(xpath = "//select[@id='Title']")
    WebElement titleArrow;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameBox;
    @FindBy(xpath = "//input[@id='MiddleName']")
    WebElement middleNameBox;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameBox;
    @FindBy(xpath = "//*[@id='DOB_BirthMonth']")
    WebElement monthBox;
    @FindBy(xpath = "//*[@id='DOB_BirthDay']")
    WebElement dateBox;
    @FindBy(xpath = "//*[@id='DOB_BirthYear']")
    WebElement yearBox;
    @FindBy(xpath = "//*[@id='Gender2']")
    WebElement selectGenderBox;
    @FindBy(xpath = "//h2[.='Contact information']")
    WebElement ContactInfoText;

    @FindBy(xpath = "//*[@id=\"AddressLine1\"]")
    WebElement streetField;
    @FindBy(xpath = "//*[@id=\"City\"]")
    WebElement cityField;
    @FindBy(xpath = "//*[@id=\"StateCodeRequired\"]")
    WebElement stateField;
    @FindBy(xpath = "//*[@id=\"PostalCodeRequired\"]")
    WebElement zipCodeField;
    @FindBy(xpath = "//h3[.='Phone number']")
    WebElement PhoneNoText;

    @FindBy(xpath = "//*[@id=\"PhoneNumber_Input\"]")
    WebElement mobileNumber;
    @FindBy(xpath = "//*[@id=\"ExtensionNumber\"]")
    WebElement extensionNum;
    @FindBy(xpath = "//*[@id=\"IsSavePhoneDayOfTravelContact\"]")
    WebElement checkBox;
    @FindBy(xpath = "//*[@id=\"BusinessPhoneNumber_Input\"]")
    WebElement businessPhone;
    @FindBy(xpath = "//*[@id=\"BusinessExtensionNumber\"]")
    WebElement extensionBusiness;
    @FindBy(xpath = "//*[@id=\"HomeAirport\"]")
    WebElement airportName;
    @FindBy(xpath = "//h3[.='Email information']")
    WebElement EmailText;

    @FindBy(xpath = "//*[@id='EmailAddress']")
    WebElement emailAddressField;
    @FindBy(xpath = "//*[@id='EmailAddressConfirm']")
    WebElement verifyEmailId;
    @FindBy(xpath = "//*[@id='IsSaveEmailDayOfTravelContact']")
    WebElement notifyCheckBox;
    @FindBy(xpath = "//*[@id='IsSaveMarketingEmails']")
    WebElement boxUnCheck;
    @FindBy(xpath = "//*[@id='NewPassword']")
    WebElement passwordField;
    @FindBy(xpath = "//*[@id='NewPasswordConfirm']")
    WebElement reEnterPassword;
    @FindBy(xpath = "//*[@id='NewPasswordConfirmShowHideLink']")
    WebElement clickShowButton;
    @FindBy(xpath = "//h3[.='Security questions']")
    WebElement SecurityQuesText;

    @FindBy(xpath = "//*[@id='Questions_0__QuestionKey']")
    WebElement question1; //What is your favorite sport?
    @FindBy(xpath = "//*[@id='Questions_0__AnswerKey']")
    WebElement answer1;
    @FindBy(xpath = "//*[@id='Questions_1__QuestionKey']")
    WebElement question2;
    @FindBy(xpath = "//*[@id='Questions_1__AnswerKey']")
    WebElement answer2;
    @FindBy(xpath = "//*[@id='Questions_2__QuestionKey']")
    WebElement question3;
    @FindBy(xpath = "//*[@id='Questions_2__AnswerKey']")
    WebElement answer3;
    @FindBy(xpath = "//*[@id='Questions_3__QuestionKey']")
    WebElement question4;
    @FindBy(xpath = "//*[@id='Questions_3__AnswerKey']")
    WebElement answer4;
    @FindBy(xpath = "//*[@id='Questions_4__QuestionKey']")
    WebElement question5;
    @FindBy(xpath = "//*[@id='Questions_4__AnswerKey']")
    WebElement answer5;
    @FindBy(xpath = "//*[@id='btnEnroll']")
    WebElement acceptAndEnrollButton;

    /**
     * SignIn button functionality test
     */
    public void signInButton() throws InterruptedException {
        signUpBtn.click();
        sleepFor(3);
    }

    public void joinNowButton() throws InterruptedException {
        joinNowBtn.click();
        selectOptionByVisibleText(titleArrow, "Mrs.");
        sleepFor(5);
    }

    public void typeFirstName(String firstName) {
        firstNameBox.sendKeys(firstName);
    }

    public void typeMiddleName(String middleName) {
        middleNameBox.sendKeys(middleName);
    }

    public void typeLastName(String lastName) {
        lastNameBox.sendKeys(lastName);
    }

    public void typeDate(String date) throws InterruptedException {
        dateBox.sendKeys(date);
        sleepFor(4);
    }

    public void typeYear(String year) throws InterruptedException {
        yearBox.sendKeys(year);
        sleepFor(5);
    }

    public void monthAndGender() throws InterruptedException {
        sleepFor(3);
        selectOptionByVisibleText(monthBox, "01 - January");
        sleepFor(5);
        selectOptionByVisibleText(selectGenderBox, "Female (F)");
        sleepFor(4);
    }

    public void validateContactInfoText() {
        boolean b= ContactInfoText.isDisplayed();
        Assert.assertTrue(b);
    }

    /**
     * Contact information field test
     */
    public void typeStreetName(String streetName) throws InterruptedException {
        streetField.sendKeys(streetName);
        sleepFor(3);
    }

    public void typeCityName(String cityName) throws InterruptedException {
        cityField.sendKeys(cityName);
        sleepFor(3);
    }

    public void typeStateName(String StateName) throws InterruptedException {
        stateField.sendKeys(StateName);
        sleepFor(3);
    }

    public void typeZipCode(String zipCode) throws InterruptedException {
        zipCodeField.sendKeys(zipCode);
        sleepFor(4);
    }

    public void validatePhoneNoText() {
       boolean b= PhoneNoText.isDisplayed();
        Assert.assertTrue(b);
    }

    /**
     * Phone number field check
     */
    public void typePhoneNumber(String phoneNum) {
        mobileNumber.sendKeys(phoneNum);
    }

    public void typeExtensionPhone(String extension) {
        extensionNum.sendKeys(extension);
    }

    public void typeBusinessPhone(String businessPhn) {
        businessPhone.sendKeys(businessPhn);
    }

    public void typeExtensionBusinessPhn(String exBusiPhn) {
        extensionBusiness.sendKeys(exBusiPhn);
    }

    public void typeAirportName(String airport) throws InterruptedException {
        airportName.sendKeys(airport);
        sleepFor(4);
    }

    public void checkBoxClick() {
        checkBox.click();
    }

    public void ValidateEmailText() {
       boolean b=EmailText.isDisplayed();
        Assert.assertTrue(b);
    }

    /**
     * Email field test
     */
    public void typeEmailAddressField(String email) {
        emailAddressField.sendKeys(email);
    }

    public void typeVerifyEmailId(String verifyEmail) throws InterruptedException {
        verifyEmailId.sendKeys(verifyEmail);
        sleepFor(3);
    }

    public void checkAndUnCheckBox() throws InterruptedException {
        notifyCheckBox.click();
        sleepFor(3);
        boxUnCheck.click();
    }

    public void typePasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void typeReEnterPassword(String reEntPassword) {
        reEnterPassword.sendKeys(reEntPassword);
    }

    public void showButton() throws InterruptedException {
        clickShowButton.click();
        sleepFor(5);
    }

    public void ValidateSecurityQuesText() {
        boolean b=SecurityQuesText.isDisplayed();
        Assert.assertTrue(b);
    }

    /**
     * Security questions check
     */
    public void questionAndAnswer1(String ans1) throws InterruptedException {
        sleepFor(4);
        selectOptionByVisibleText(question1, "What is your favorite flavor of ice cream?");
        sleepFor(5);
        answer1.sendKeys(ans1);
        sleepFor(4);
    }

    public void questionAndAnswer2(String ans2) throws InterruptedException {
        sleepFor(4);
        selectOptionByVisibleText(question2, "What is your favorite type of reading?");
        sleepFor(5);
        answer2.sendKeys(ans2);
        sleepFor(4);
    }

    public void questionAndAnswer3(String ans3) throws InterruptedException {
        sleepFor(4);
        selectOptionByVisibleText(question3, "What is your favorite type of movie?");
        sleepFor(5);
        answer3.sendKeys(ans3);
        sleepFor(4);
    }

    public void questionAndAnswer4(String ans4) throws InterruptedException {
        sleepFor(4);
        selectOptionByVisibleText(question4, "What was the first major city that you visited?");
        sleepFor(5);
        answer4.sendKeys(ans4);
        sleepFor(4);
    }

    public void questionAndAnswer5(String ans5) throws InterruptedException {
        sleepFor(4);
        selectOptionByVisibleText(question5, "In what month is your best friend's birthday?");
        sleepFor(5);
        answer5.sendKeys(ans5);
        sleepFor(4);
    }
    public void validateAcceptAndEnrollBtn() {
       boolean b= acceptAndEnrollButton.isEnabled();
        Assert.assertTrue(b);
    }

}