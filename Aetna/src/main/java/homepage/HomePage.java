package homepage;

import static homepage.HomePageWebElement.*;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebAPI {


    // Action Method class
    @FindBy(how = How.CSS, using = textLocator)
    public WebElement text;
    @FindBy(how = How.XPATH, using = text1Locator)
    public WebElement text1;
    @FindBy(how = How.CSS, using = text2Locator)
    public WebElement text2;
    @FindBy(how = How.CSS, using = text3Locator)
    public WebElement text3;
    @FindBy(how = How.CSS, using = text4Locator)
    public WebElement text4;
    @FindBy(how = How.XPATH, using = text5Locator)
    public WebElement text5;
    @FindBy(how = How.XPATH, using = text6Locator)
    public WebElement text6;
    @FindBy(how = How.XPATH, using = text7Locator)
    public WebElement text7;


    public void ClickOnShopForPlan() {
        clickByXpath(planLocator);
    }

    public void hoverOnMedicare() {
        mouseHoverByCSS(medicareLocator);
    }

    public void ClickOnFindDoctor() {
        clickByXpath(findDoctorLocator);
    }

    public void verifyText11() {
        String expectedText = "Find Aetna Medicare Health Care Professionals";
        String actualText = text.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    // Browse Aetna Medicare Plan
    public void ClickOnBrowseAetnaMedicarePlan() {
        clickByXpath(browseAetnaLocator);
    }

    public void verifyTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Title doesn't match", expectedTitle, actualTitle);
    }


    // Check our drug list
    public void ClickOnCheckOurDrugList() {
        clickByXpath(checkOurDrugListLocator);
    }

    // Understand Medicare
    public void ClickOnUnderstandMedicare() {
        clickByXpath(understandMedicareLocator);
    }

    // FindAPlanToMeetYourNeeds
    public void ClickOnFindAPlanToMeetYourNeeds() {
        clickByXpath(findAPlanToYourNeedsLocator);
    }

    //EnrollInMedicare
    public void ClickOnEnrollInMedicare() {
        clickByXpath(enrollInMedicareLocator);
    }

    //HealthCoverage
    public void HoverOnHealthCoverage() {
        clickByXpath(healthCoverageLocator);
    }

    //Plans Through An Employer
    public void PlansThroughAnEmployer() {
        clickByXpath(text1Locator);
    }

//    public void verifyText1() {
//        String expectedText = " Health insurance through work";
//        String actualText = text1.getText();
//        Assert.assertEquals("Text doesn't match",expectedText,actualText);
//    }

    public void verifyText211() {
        String expectedText = "Health insurance through work";
        String actualText = text2.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    //International Plan
    public void lickOnInternationalPlans() {
        clickByXpath(internationalPlanLocator);

    }

    public void ClickOnFindADoctor() {
        clickByXpath(text3Locator);
    }


    public void verifyText3() {
        String expectedText = " Find Doctor, Dentist or Hospital";
        String actualText = text3.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    public void ClickOnStudentPlans() {
        clickByXpath(studentLocator);
    }

    //DentalVisionAndSupplemental
    public void HoverOnDentalVisionAndSupplemental() {
        clickByXpath(dentalLocator1);
    }

    //ClickOnDentalPlans
    public void iClickOnDentalPlans() {
        clickByXpath(dentalPlansLocator);
    }

    //ClickOnFindADentist
    public void ClickOnFindADentist() {
        clickByXpath(findDentalLocator);
    }

    public void verifyText4() {
        String expectedText = "Directory of Health Care Professionals";
        String actualText = text4.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    // VisionPlans
    public void ClickOnVisionPlans() {
        clickByXpath(visionPlanLocator);
    }

    public void verifyText5() {
        String expectedText = "Vision insurance for individuals";
        String actualText = text5.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    // find a eye doctor
    public void clickOnFindAnEyeDoctor() {
        clickByXpath(findAnEyeDoctorLocator);
    }

    public void verifyText6() {
        String expectedText = "Vision insurance for individuals";
        String actualText = text6.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    //SupplementalPlans()
    public void clickOnSupplementalPlans() {
        clickByXpath(supplementalPlanLocator);
    }

    //HoverOnPharmacy
    public void hoverOnPharmacy() {
        clickByXpath(pharmacyLocator);
    }

    public void clickOnGetPharmacyPlanInformation() {
        clickByXpath(pharmacyPlanLocator);
    }

    public void verifyText7() {
        String expectedText = "Pharmacy benefits and services";
        String actualText = text7.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    //Find A pharmacy
    public void clickOnFindAPharmacy() {
        clickByXpath(findAPharmacyLocator);
    }


    // Medicaid
    public void iHoverOnMedicaid() {
        clickByXpath(medicaidLocator);
    }

    //FindMedicineAndCosts
    public void clickFindMedicineAndCosts() {
        clickByCss(findMedicineAndCostsLocator);
    }

    ////////////////////////////////////////////////maria le bas*************************
    // Action Method class
// Action Method class
    @FindBy(how = How.CSS, using = textLocator)
    public WebElement text11;
    @FindBy(how = How.XPATH, using = text1Locator)
    public WebElement text111;
    @FindBy(how = How.XPATH, using = textLocator2)
    public WebElement text21;
    @FindBy(how = How.XPATH, using = yourHealthStartsTodayText)
    public WebElement yourHealthStartsTodayText1;


    public void ClickOnShopForPlan1() {
        clickByXpath(planLocator);
    }

    public void hoverOnMedicare1() {
        mouseHoverByCSS(medicareLocator);
    }

    public void ClickOnFindDoctor1() {
        clickByXpath(findDoctorLocator);
    }

    public void verifyText() {
        String expectedText = "Find Aetna Medicare Health Care Professionals";
        String actualText = text.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    //*************************************************************************************************************
    // Browse Aetna Medicare Plan
    public void verifyText1() {
        String expectedText = "demoText";
        String actualText = text1.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    //**************************************************************************************************************
    // Check our drug list
    public void ClickOnCheckOurDrugList1() throws InterruptedException {
        clickByXpath(checkOurDrugListLocator);
        sleepFor(5);
    }

    public void ClickOnMemberSupport() {
        clickByXpath(MemberSupportLocator);
    }

    public void HoverOnAccountManagement() {
        mouseHoverByXpath(AccountManagementLocator);
    }

    public void ClickOnLogInToYourMemberWebsite() {
        clickByXpath(loginToMyMemberWebsiteLocator);
    }

    public void verifyText21() {
        String expectedText = "Welcome to Aetna's member website";
        String actualText = text2.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    //*******************************************************************************************************************
    //Find a doctor
    public void findDoctor() {
        clickByXpath(findDoctor);
    }

    public void findMedicine() {
        clickByXpath(findMedicine);
    }

    public void findAForm() {
        clickByXpath(findAForm);
    }

    public void payYourPremium() {
        clickByXpath(payYourPremium);
    }

    public void yourID() {
        clickByXpath(getYourID);
    }

    public void CheckAClaim() {
        clickByXpath(checkAClaim);
    }

    //***************************************************************************************************************
//Health Guide
    public void HoverTheHealthGuide() {
        mouseHoverByXpath(healthGuide);
    }

    public void ClickOnAllHealthResources() {
        clickByXpath(allHealthResources);
    }

    public void ShouldSeeYourGoodHealthStartsHere() {
        String expectedText = "Your good health starts here";
        String actualText = yourHealthStartsTodayText1.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    public void ClickLivingHealthy() {
        clickByXpath(livingHealthy);
    }

    public void ClickUnderstandingHealthCare() {
        clickByXpath(understandingHealthCare);
    }

    public void ClickUnderstandingManagingHealth() {
        clickByXpath(managinghealth);
    }

    public void HoverOnAdditionalResources() {
        clickByXpath(Aditionalresources);
    }

    public void ClickOnHealthInsuranceRightsAndResources() {
        clickByXpath(Aditionalresources);
    }

    public void ClickOnContactUs() {
        clickByXpath(contactus);
    }

    public void ClickOnFrequentlyAskedQuestions() {
        clickByXpath(frequentlyAskedQuestions);
    }

}









