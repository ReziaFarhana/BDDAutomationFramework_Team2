package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static homepage.HomePageWebElement.*;



public class HomePage extends WebAPI {

    @FindBy(css = tDBankLogo) public WebElement TDBankLogo;
    @FindBy(xpath = onlineBankingWelcomeText) public WebElement onLineBankingWelcomeTxt;
    @FindBy(css = servicesBtnLocator) public WebElement servicesBtn;
    @FindBy(xpath = smartSimpleStudentBankingTxt) public WebElement smartSimpleStudentBanking;
    @FindBy(xpath = onlineBankingEnrollNowLocator) public WebElement onlineBankingEnrollNowTab;
    @FindBy(linkText = smallBusinessTextLocator) public WebElement smallBusinessText;
    @FindBy(xpath =  onlineBankingEnrollNowPopLocator) public WebElement onlineBankingEnrollNowPopUP;

//Sign-Up
    @FindBy (how = How.XPATH, using =signUpHomePageLocator) public WebElement signUpHomePageBtn;
    //@FindBy (how = How.XPATH, using =plsConfirmCheckBtnLocator)) public WebElement plsConfirmCheckBtnL);
    @FindBy (how = How.CSS, using=plsConfirmCheckBtnLocator) public WebElement plsConfirmCheckBtn;
    @FindBy (how = How.XPATH, using=signUpFContinueBtnLocator) public WebElement signUpFContinueBtn;
    @FindBy (how = How.XPATH, using=eSignatureAgreementAcceptLocator) public WebElement termsOfUseBtn;
    @FindBy (how = How.XPATH, using=termsOfUseAcceptBtnLocator) public WebElement termsOfUseAcceptBtn;
    @FindBy (how = How.XPATH, using=firstNameSignUpFieldLocator) public WebElement firstNameSignUpField;
    @FindBy (how = How.XPATH, using=lastNameSignUpFieldLocator) public WebElement lastNameSignUpField;
    @FindBy (how = How.XPATH, using=emailSignUpFieldLocator) public WebElement emailSignUpField;
    @FindBy (how = How.XPATH, using=accountTypeDropDownLocator) public WebElement accountTypeDropDown;
//    @FindBy (how = How.XPATH, using=checkingAccountSelectLocator) public WebElement checkingAccountSelect;
    @FindBy (how = How.XPATH, using=aTMCardFieldLocator) public WebElement aTMCardField;
    @FindBy (how = How.XPATH, using=sSNFieldLocator) public WebElement sSNField;
    @FindBy (how = How.XPATH, using=accountNumberFieldLocator) public WebElement accountNumberField;
    @FindBy (how = How.XPATH, using=userNameFieldLocator) public WebElement userNameField;
    @FindBy (how = How.XPATH, using=reenterUserNameFieldLocator) public WebElement reenterUserNameField;
    @FindBy (how = How.XPATH, using=newPasswordFieldLocator) public WebElement newPasswordField;
    @FindBy (how = How.XPATH, using=reenterNewPasswordFieldLocator) public WebElement reenterNewPasswordField;
    @FindBy (how = How.XPATH, using=SignUpSecondContinueBtnLocator) public WebElement SignUpSecondContinueBtn;
    @FindBy (how = How.CSS, using=freeBillPayBtnLocator) public WebElement freeBillPayBtn;
    @FindBy (how = How.CSS, using=goPaperLessBtnLocator) public WebElement goPaperLessBtn;
    @FindBy (how = How.CSS, using=signUpErrorMessageLocator) public WebElement signUpErrorMessage;

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-2']//span[@class='td-icon expand']")
    WebElement productDropDownIcon;
    @FindBy(xpath = "//li[@class='td-dropdown td-dropdown-active']//ul[@class='td-dropdown-content']//li//a[contains(text(),'Checking')]")
    WebElement checkingBtn;
    @FindBy(xpath = "//h1[contains(text(),'TD Bank Checking Accounts')]")
    WebElement checkingBtnTxt;

//Log in
    @FindBy(xpath = logInBtnLocator) public WebElement tdHomePageLogInBtn;
    @FindBy(xpath = logInUserNameLocator) public WebElement logInUserNameField;
    @FindBy(xpath = logInUserPasswordLocator) public WebElement logInUserPasswordField;
    @FindBy(css = logInBtnOnlineBankingLocator) public WebElement logInBtnOnlineBanking;
//    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/div[2]") WebElement loginErrorMsg;
    @FindBy(xpath = errorMessageLocator ) public WebElement loginErrorMsg;

    //find us
    @FindBy(xpath = findUsLocator) public WebElement findUsIcon;
    @FindBy(xpath = findUsSearchBoxLocator) public WebElement findUsSearchBox;
    @FindBy(xpath = findUsSearchIconLocator) public WebElement findUsSearchIcon;
    @FindBy(css = findUsSearchResultLocator) public WebElement findUsSearchResult;

    @FindBy(xpath = "//input[@id='q']") public WebElement locatorSearchBox;
    @FindBy(xpath = "//img[@class='Locator-searchIcon']") public WebElement locatorSearchIcon;
    @FindBy(xpath = "//div[@class='ResultSummary']") public WebElement findUsValidationText;
    @FindBy(xpath = "//*[@id=\"js-yl-USBRANCH40244\"]/article/div[11]/div/div/div/a") public WebElement getDirectionBtn;

//    @FindBy(xpath = "//div[@class='td-dropdown-content']//a[.='Online Banking']")
//    WebElement onlineBanking;
//    @FindBy(xpath = "//h1[contains(text(),'Welcome to Online Banking')]")
//    WebElement validateText;
//    @FindBy(xpath = "//span[contains(text(),'Sign up for Online Banking')]")
//    WebElement signUpBtn;
//    @FindBy(xpath = "//label[@class='card'][contains(text(),'I am the account owner for all accounts.')]")//(//div[starts-with(@class,'td-checkbox')]//label[@class='card'])[4]
//    WebElement plsConfirmCheckBtn;

    /**
     * Helper Method
     */
    public void validateTdBankLogoIsDisplayed() {
        Assert.assertTrue(TDBankLogo.isDisplayed());
    }

    public void adsChoicesAndPersonalizationPopUp() {
        clickByXpath(adChoicePopUp);
    }


    /**
     * test-1 Online Banking
     */
    public void logInIcon() {
        clickByXpath(onlineBankingLoginLocator);
    }

    public void validateOnlineBankingWelcomeText() {
        Assert.assertTrue(onLineBankingWelcomeTxt.isDisplayed());
    }

    /**
     * Test-2 Student Loan
     */
    public void hoverOverServicesAndSelectStudentLoan() throws InterruptedException {
        sleepFor(5);
        Actions actions = new Actions(driver);
        actions.moveToElement(servicesBtn).perform();
        clickByXpath(studentBankingLinkTxt);
    }

    public void verifyStudentLoanPage(String expectedText) {
        String actualText = smartSimpleStudentBanking.getText();
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    /**
     * TD BankTest-3 small Business Banking check
     */
    public void onlineBankingUnderServices() throws InterruptedException {
        sleepFor(5);
        Actions actions = new Actions(driver);
        actions.moveToElement(servicesBtn).build().perform();
        clickByXpath(onlineBankingServicesLocator);
    }

    public void smallBusinessOnlineBanking() {
        clickByLinkText(learnSmallBankingTxtLocator);
    }

    public void validateSmallBankingOnlinePage(String expectedText) {
        String actualText = smallBusinessText.getText();
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }

    /**
     * Test-4 OnlineBanking Enrollment
     */
    public void onlineBankingEnrollNowScroll() throws InterruptedException {
        sleepFor(2);
        WebElement myElement = driver.findElement(By.xpath("//*[@id='product1_item0']/div/div[2]/div[3]/div/button"));
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].scrollIntoView()", myElement);
//        scrollByXPATH(onlineBankingEnrollNowLocator);
//        new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission' and @ng-reflect-name='reportingDealPermission']"))).click();
////      onlineBankingEnrollNow.click();
        driver.navigate().to("https://onlinebanking.tdbank.com/#/authentication/login/enrollment/signup/selectprofile");
    }

    /**
     * QuestionsOnStimulusPayment
     */

//    public void questionsOnStimulusPaymentsPopUp(){
//        clickByXpath(stimulusPopUpLocator);
//        Alert alert=driver.switchTo().alert();
//        alert.dismiss();
//    }

    public void validateOnlineBankingEnrollNowPopUp() throws InterruptedException {
        boolean b = onlineBankingEnrollNowPopUP.isDisplayed();
        Assert.assertTrue(b);
    }

    /**
     * Test-5 Find us Box functionality check
     */
    public void clickOnFindUsIcon() {
        findUsIcon.click();
    }

    public void enterLocationAndClickOnSearchIcon(String zipCode) throws InterruptedException {
        sleepFor(3);
        findUsSearchBox.sendKeys(zipCode);
        sleepFor(3);
        findUsSearchIcon.submit();
    }

    public void validateFindUsValidationText(String expectedResult) throws InterruptedException {
        String actualResult = findUsSearchResult.getText();
        Assert.assertEquals("Search Item not match", actualResult, expectedResult);
    }

    /**
     * Test-6 Get direction button check
     */
    public void landingOnLocationsPage() throws InterruptedException {
        clickOnFindUsIcon();
        locatorSearchBox.sendKeys("10463");
        sleepFor(3);
        locatorSearchIcon.submit();
        sleepFor(3);
    }

    public void clickOnGetDirection() {
        getDirectionBtn.click();
        driver.navigate().to("https://www.google.com/maps/place/TD+Bank/@40.721376,-73.8062462,17z/data=!3m1!4b1!4m5!3m4!1s0x0:0x5d1f3147c537fd18!8m2!3d40.721376!4d-73.8040575");
    }

    public void validateGetDirection() {
        String expectedTitle = "TD Bank - Google Maps";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title does not match", actualTitle, expectedTitle);
    }

    /**
     * TD Bank-7 SignUp functionality test
     */
    public void clickOnSignUpHomePageBtn() throws InterruptedException {
        signUpHomePageBtn.click();
        sleepFor(3);
//      driver.navigate().to("https://onlinebanking.tdbank.com/#/enrollment/signup/personal");
        // driver.navigate().to("https://onlinebanking.tdbank.com/#/authentication/login/enrollment/signup/selectprofile");

    }

//    public void pleaseConfirmCheckBtn() throws InterruptedException {
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView();",plsConfirmCheckBtn);
//       Thread.sleep(5000);
//          plsConfirmCheckBtn.click();
//          clickByXpath(signUpFContinueBtnLocator);


    public void verifyClickOnOnlineBankingEnrollmentContinue(){
        clickByCss(plsConfirmCheckBtnLocator);
        clickByXpath(signUpFContinueBtnLocator);
    }

    public void verifyESignatureAgreementAndContinueBtn() {
        clickByXpath(eSignatureAgreementAcceptLocator);
        clickByXpath(termsOfUseAcceptBtnLocator);
        driver.navigate().to("https://onlinebanking.tdbank.com/#/enrollment/signup/personal");
    }

    public void enterFirstName(String firstName) {
        firstNameSignUpField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameSignUpField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailSignUpField.sendKeys(email);
    }

    public void selectAccountType() {
        accountTypeDropDown.click();
        Select select = new Select(accountTypeDropDown);
        select.selectByVisibleText("Checking");
    }
    /**
     * QuestionsOnStimulusPayment2
     */

    public void questionsOnStimulusPaymentsPopUp2()throws NoSuchElementException {
        clickByXpath(stimulusPopUpLocator);
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
    }

    public void enterAtmCardNumber(String atmNumber) {
        aTMCardField.sendKeys(atmNumber);
    }

    public void enterSsnNumber(String SSN) {
        sSNField.sendKeys(SSN);
    }

    public void enterAccountNumber(String accountNumber) {
        accountNumberField.sendKeys(accountNumber);
    }

    public void checkYesFromBillPayOption() {
        freeBillPayBtn.click();
    }

    public void goPaperlessOption() {
        goPaperLessBtn.click();
    }

    public void enterUserName(String userName) {
        userNameField.sendKeys(userName);
    }

    public void reEnterUserName(String reEnterName) {
        reenterUserNameField.sendKeys(reEnterName);
    }

    public void enterUserPassword(String password) {
        newPasswordField.sendKeys(password);
    }

    public void reEnterUserPassword(String reEntPassword) {
        reenterNewPasswordField.sendKeys(reEntPassword);
    }

    public void clickOnContinueBtn() {
        clickByCss(finaSubmitBtnLocator);
    }

    public void validateSignUpPageText(String expectedResult) {
        String actualResult = signUpErrorMessage.getText();
        Assert.assertEquals("Record don't match", actualResult, expectedResult);
    }
//....
    /**
     * ..........................................................
     * Test-8 Td bank Login functionality test with invalid credentials
     */
    public void clickOnTdLogInBtn() {
        tdHomePageLogInBtn.click();
    }

    public void enterUserInfo(String userName, String password) {
        logInUserNameField.sendKeys(userName);
        logInUserPasswordField.sendKeys(password);
    }

    public void clickOnLogInBtn() {
        logInBtnOnlineBanking.click();
    }

    public void validateLogInText(String expectedText) {
        String actualText = loginErrorMsg.getText();
        Assert.assertEquals("Text don't match", actualText, expectedText);
    }

    /**
     * TD Bank-9 product dropDown list check
     */
    public void clickOnProductBtn() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(productDropDownIcon).perform();
    }

    public void clickOnCheckingBtn() throws InterruptedException {
        sleepFor(3);
        checkingBtn.click();
        sleepFor(3);
    }

    public void validateProductText(String expectedResult) {
        String actualResult = checkingBtnTxt.getText();
        Assert.assertEquals("Search Item not match", actualResult, expectedResult);
    }


}









