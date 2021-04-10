package homepage;

public class HomePageWebElement {
    public static final String tDBankLogo = "[src='/us/en/personal-banking/images/TDB_tag_white_tcm371-253361.png']";//css
    public static final String adChoicePopUp ="//*[@id='ensCall']";//xpath
    public static final String onlineBankingLoginLocator = "//button[normalize-space()='Login']";
    public static final String onlineBankingWelcomeText = "//h1[contains(text(),'Welcome to Online Banking')]";//xpath
    public static final String servicesBtnLocator = "#td-desktop-nav-dropdown-link-3";//css
    public static final String studentBankingLinkTxt = "//div[@class='td-nav-primary']//a[.='Student Banking']";//xpath
    public static final String smartSimpleStudentBankingTxt ="//span[@class='visible-lg visible-md visible-sm']";//xpath
    public static final String onlineBankingServicesLocator ="//div[@class='td-nav-primary']//div[@class='td-section-left']//a[.='Online Banking']";//xpath
    public static final String learnSmallBankingTxtLocator ="Learn more about Small Business Online Banking.";//LinkText
    public static final String smallBusinessTextLocator ="//h1[contains(.,'Small Business Online Banking')]";//css
    public static final String onlineBankingEnrollNowLocator ="//*[@id='product1_item0']/div/div[2]/div[3]/div/button";//xpath
    //public static final String stimulusPopUpLocator = "//div[@class='button-section']//div[normalize-space()='Not now']";
    public static final String stimulusPopUpLocator = "//div[@class ='button-section']//div[normalize-space()='Not now']";

    //public static final String learnSmallBankingTxtLocator ="Small Business Online Banking";//css

   public static final String onlineBankingEnrollNowPopLocator ="popup_1617677584248-popup-title";//xpath
    //public static final String onlineBankingEnrollNowPopLocator ="//*[@id='button-1']";//xpath
   // public static final String onlineBankingEnrollNowPopLocator ="(//*[@class='text image'])[1]";//xpath

    public static final String findUsLocator ="//span[.='Find Us']";//xpath
    public static final String findUsSearchBoxLocator ="//input[@id='q']";//xpath
    public static final String findUsSearchIconLocator ="//img[@alt='search']";//xpath
    public static final String findUsSearchResultLocator =".ResultSummary";//css

   // public static final String stimulusPopUpLocator ="//div[normalize-space()='Not now']";//xpath
    //public static final String stimulusPopUpLocator2 ="//div[contains(text(),'Not now')]";//xpath
//    public static final String stimulusPopUpLocator ="//*[@id=\"button-1\"]  //div[normalize-space()='Not now']
// div[@class='button-section']//div[normalize-space()='Not now']";//xpath

   // public static final String adChoicrPopUp ="//*[@id='ensCall']";//xpath



    //div[@class='button-section']//div[normalize-space()='Not now']
    //*[@id="button-1"]  //div[normalize-space()='Not now']
    //public static final String adChoicesAndPersonalizationButton = "//*[@id=\"ensCall\"]/span[2]";
    //public static final String onlineLogInBtn = "td-icon td-icon-secureBtn";//class

    public static final String logInBtnLocator ="(//button[starts-with(@class,'td-button')])[1]";//xpath
    public static final String logInUserNameLocator ="//input[@name='psudoUsername']";//xpath
    public static final String logInUserPasswordLocator ="//input[@name='password']";//xpath
    public static final String logInBtnOnlineBankingLocator ="button[type='submit']";//css
    public static final String errorMessageLocator =".error-message";//css

//    Sign-Up

    public static final String signUpHomePageLocator ="//*[contains(text(),'Sign-Up')]";//xpath
  //public static final String plsConfirmCheckBtnLocator ="//label[@class='card'][normalize-space()='I am the account owner for all accounts.']";//xpath
    public static final String plsConfirmCheckBtnLocator ="label[aria-hidden='true']";//css
  //public static final String plsConfirmCheckBtnLocator ="//(//div[starts-with(@class,'td-checkbox')]//label[@class='card'])[4]";//xpath
    public static final String signUpFContinueBtnLocator ="//*[normalize-space()='Continue']";//xpath
    public static final String eSignatureAgreementAcceptLocator ="//*[@class='card']";//xpath
    public static final String termsOfUseAcceptBtnLocator ="//*[starts-with(@class,'ng-binding ng-scope')]";//xpath
    public static final String firstNameSignUpFieldLocator ="//*[@name='firstName']";//xpath
    public static final String lastNameSignUpFieldLocator ="//*[@name='lastName']";//xpath
    public static final String emailSignUpFieldLocator ="//*[@name='email']";//xpath
    public static final String accountTypeDropDownLocator ="//*[@name='accountType']";//xapth
    //public static final String checkingAccountSelectLocator ="//*[@value='Checking']";//xpath
    public static final String aTMCardFieldLocator ="//*[@name='userAtmCheckcard']";//xpath
    public static final String sSNFieldLocator ="//*[@name='ssn']";//xpath
    public static final String accountNumberFieldLocator ="//*[@name='accountNumber']";//xpath
    public static final String userNameFieldLocator ="//*[@name='userName']";//xpath
    public static final String reenterUserNameFieldLocator ="validateUserName";//xpath
    public static final String newPasswordFieldLocator ="//*[@name='newPassword']";//xpath
    public static final String reenterNewPasswordFieldLocator ="//*[@name='newPasswordConfirm']";//xpath
    public static final String SignUpSecondContinueBtnLocator ="//button[normalize-space()='Continue']";//xpath
    public static final String freeBillPayBtnLocator ="[ng-model='enrollmentOptions.billPay'] [alt='Yes']";//css
    public static final String goPaperLessBtnLocator ="span[id='labelWrap_3840'] li:nth-child(1)";//css
    public static final String finaSubmitBtnLocator ="[type='submit']";//css
    public static final String signUpErrorMessageLocator ="//div[@class='td-infobar-content']/div[1]";//xpath


}
