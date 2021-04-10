package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import javax.swing.*;
import static homepage.HomePageWebElement.*;


public class HomePage extends WebAPI {


    public static final String medicare = "(//button[text()='Medicare'])[1]";
    public static final String browseAetnaMedicarePlan = "(//a[text()='Browse Aetna Medicare plans '])[1]";

    //student health
    @FindBy(how = How.XPATH, using =shopForAPlanLocator) public WebElement shopPlan;
    @FindBy(how = How.XPATH, using = "healthCoverageLocator") public WebElement healthCoverage;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "studentPlansLocator") public WebElement studentPlans;
    @FindBy(how = How.XPATH, using = "validateSHWelcomeTextLocator") public WebElement validateSHWelcomeText;

    //Employer
    @FindBy(xpath = "plansThroughAnEmployerLocator") public WebElement plansEmployer;
    @FindBy(className = "plansEmployerTextLocator") public WebElement plansEmployerText;
    //international
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[2]/div[2]/ul/li[3]/a")
    WebElement internationalPlans;
    @FindBy(xpath = "//*[@id=\"main\"]/div[6]/div/div/div[1]/div[1]/div/h2")
    WebElement internationalPlansText;
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[2]/div[2]/ul/li[4]/a")
    WebElement findDoctor;
    @FindBy(xpath = "//*[@id=\"content__main\"]/div[2]/div/div/div/div/div/div/div[2]/h2")
    WebElement findDoctorText;
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[3]/div[1]/button")
    WebElement dentalAndVision;
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[3]/div[2]/ul/li[1]/a")
    WebElement dentalPlans;
    @FindBy(xpath = dentalTextLocator) public WebElement dentalText;
    @FindBy(xpath = findDoctorLocator) public WebElement findADoctorTab;

    @FindBy(xpath = "covidAlertTextLocator") public WebElement covidAlertText;
    @FindBy(xpath = "/html/body/div[2]/div/nav/div/ul[1]/li[1]/div[2]/div/div/section/ul/li[3]/div[2]/ul/li[2]/a")
    WebElement findADentist;
    @FindBy(xpath = "//*[@id=\"textParagraph_191\"]")
    WebElement dentistText;
    @FindBy(css = ".megamenu > nav:nth-of-type(1) li:nth-of-type(1) li:nth-of-type(3) li:nth-of-type(3) > a:nth-of-type(1)")
    WebElement visionPlans;
    @FindBy(xpath = "visionInsurancePlanText ") public WebElement visionPlanText;


    @FindBy(xpath = "//button[@class='lang-selected-option dropdown-toggle']")
    WebElement exploreAetnaSites;
    @FindBy(xpath = "/html/body/div[2]/div/header/div[2]/nav/div[2]/div/div[3]/ul/li[1]/a/span")
    WebElement aetnaCom;
    @FindBy(xpath = "//span[contains(text(),'Aetna Medicare')]")
    WebElement aetnaMedicare;
    @FindBy(xpath = "//a[@class='link__text'][contains(text(),'Request a call')]")
    WebElement requestCall;
    @FindBy(xpath = "//label[contains(text(),'A new plan')]")
    WebElement aNewPlan;
    @FindBy(xpath = "//span[contains(text(),'Find a doctor')]")
    WebElement findADoctor;
    @FindBy(xpath = "//a[contains(text(),'Plan from an employer')]")
    WebElement planFromAnEmployer;
    @FindBy(id = searchingAsMemberTextLocator)
    WebElement searchingAMemberText;
    @FindBy(xpath = "//span[contains(text(),'For Providers')]")
    WebElement forProviders;
    @FindBy(xpath = "//*[@id=\"content__main\"]/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[1]/ul/li[1]/div/a/span")
    WebElement joinTheAetnaNetwork;
    @FindBy(xpath = "//span[contains(text(),'Welcome')]")
    WebElement welcome;
    @FindBy(xpath = "//b[contains(text(),'Step 1')]")
    WebElement step1;

    @FindBy(xpath = "//span[@class='link__tab'][contains(text(),'Medical')]")
    WebElement medical;
    @FindBy(xpath = "//span[contains(text(),'Medical Request for Participation')]")
    WebElement medicalRequestForParticipationText;
    @FindBy(xpath = "//span[@class='link__tab'][contains(text(),'Dental')]")
    WebElement dental;
    @FindBy(xpath = "//span[contains(text(),'Dental Request for Participation')]")
    WebElement dentalRequestForParticipationText;
    @FindBy(xpath = "//span[contains(text(),'Precertification')]")
    WebElement precertification;
    @FindBy(xpath = "//h3[@class='heading']")
    WebElement findADoctorOrHospital;
    @FindBy(xpath = "//h1[@class='ng-scope aet-cont-hdrtxt txtAlgnCntrTitle']")
    WebElement directoryText;
    @FindBy(xpath = "//span[@class='link__tab'][contains(text(),'Other')]")
    WebElement others;
    @FindBy(xpath = "//span[contains(text(),'Other networks you can join')]")
    WebElement otherNetworksYouCanJoinText;
    @FindBy(xpath = "//span[contains(text(),'Medicare information')]")
    WebElement medicareInformation;
    @FindBy(xpath = "//span[contains(text(),'Learn about the dispute process')]")
    WebElement learnAboutTheDisputeProcess;
    @FindBy(xpath = "//span[contains(text(),'Clinical Policy Bulletins')]")
    WebElement clinicalPolicyBulletinsText;
    @FindBy(xpath = "//span[@class='link__tab'][contains(text(),'Behavioral Health')]")
    WebElement behavioralHealth;
    @FindBy(xpath = "//span[contains(text(),'Behavioral Health Request')]")
    WebElement behavioralHealthRequestForParticipationText;
    @FindBy(xpath = "//span[@class='link__tab'][contains(text(),'Facility')]")
    WebElement facility;
    @FindBy(xpath = "//span[contains(text(),'Facility Request for Participation')]")
    WebElement facilityRequestForParticipationText;

    /**
     * test-1-Student Health
     */
    public void verifyShopForAPlan() { shopPlan.click(); }

//    public void verifyStudentPlansUnderHealthCoverage() throws InterruptedException {
//        sleepFor(2);
//        mouseHoverByXpath(healthCoverageLocator);
//        Actions actions=new Actions(driver);
//        waitUntilSelectable(studentPlansLocator);
//        actions.moveToElement(studentPlans).click().build().perform();
//
//    }

    public void verifyHealthCoverage() {
        healthCoverage.click();
    }
    public void studentPlansBtn() {
        studentPlans.click();
    }
    public void validateHealthCoverage(String expectedText) {
            String actualText = validateSHWelcomeText.getText();
            Assert.assertEquals(expectedText, actualText);
        }
    /**
     * test-2- Plans Through Employer
     */
    public void plansThroughEmployer() {
        plansEmployer.click();
    }

    public void validatePlansThroughEmployer(String expectedText) {
        String actualText = plansEmployerText.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    /**
     * test-3- International Plan
     */
    public void internationalPlansCheck() {
        internationalPlans.click();
    }

    public void validateInternationalPlans(String actualResult) {
        String expectedResult = internationalPlansText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
    /**
     * test-4 Plan for an Employee.................
     */
    public void findADoctor() throws InterruptedException {
        Thread.sleep(3000);
        findADoctor.click();
    }
    public void planFromAnEmployer(){
        planFromAnEmployer.click();
    }
    public void validateFindADoctor(String expectedText){
//        String expectedResult = "Searching as a member is better";
        String actualText = searchingAMemberText.getText();
        Assert.assertEquals(actualText,expectedText);
    }

    /**
     * test-5- Dental & Vision & Supplimental
     */
    public void dentalAndVisionCheck() {
        dentalAndVision.click();
    }

    public void dentalPlanCheck() {
        dentalPlans.click();
    }
    public void validateDentalTextCheck(String expectedText) {
        String actualText = dentalText.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    /**
     * test-6- fins a dentist
     */
    public void findADentistCheck(){
        clickByXpath(findADentistLocator);
    }

    public void validateFindADentistCheck(String actualResult) {
        String expectedResult = dentistText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * test-7- Vision Plans
     */
    public void visionPlansCheck() {
        visionPlans.click();
    }

    public void validateVisionPlansCheck(String actualResult) {
        String expectedResult = visionPlanText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Test-8 Aetna Disputes & Appeals Overview
     */
    public void necessaryStepsAetnaDispute() throws InterruptedException {
        Thread.sleep(3000);
        medicareInformation.click();
        learnAboutTheDisputeProcess.click();
    }
    public void validateAetnaDisputesAppeals(String actualTitle){
        String expectedTitle = driver.getTitle();
        Assert.assertEquals("Title doesn't match", expectedTitle,actualTitle);
    }

//    And I click on Medicare information
//    And I click on Learn about the dispute process

    /**
     * Test-9 Explore Aetna sites
     */
    public void exploreAetnaSites() {
        exploreAetnaSites.click();
    }
    public void aetnaCom(){
        aetnaCom.click();
    }
    public void aetnaMedicare(){
        aetnaMedicare.click();
    }
    public void requestCall(){
        requestCall.click();
    }
    public void validateANewPlan(){
        String expectedResult = "A new plan";
        String actualResult = aNewPlan.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }




    /**
     * Test-11 For Providers
     */
    public void forProviders() throws InterruptedException {
        Thread.sleep(5000);
        forProviders.click();
        Thread.sleep(5000);
    }
    public void joinTheAetnaNetwork(){
        joinTheAetnaNetwork.click();
    }
    public void welcome(){
        welcome.click();
    }
    public void validateForProviders(String expectedText){
         String actualText = step1.getText();
        Assert.assertEquals(actualText,expectedText);
    }

    /**
     * Test-12 Medical
     */
    public void medical() throws InterruptedException {
        Thread.sleep(3000);
        medical.click();
    }
    public void validateMedical(){
        String expectedResult = "Medical Request for Participation";
        String actualResult = medicalRequestForParticipationText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


    /**
     * Test-13 Dental
     */
    public void dental(){
        dental.click();
    }
    public void validateDental(){
        String expectedResult = "Dental Request for Participation";
        String actualResult = dentalRequestForParticipationText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     * Test-14 BehavioralHealth
     */
    public void behavioralHealth(){
        behavioralHealth.click();
    }
    public void validateBehavioralHealth(){
        String expectedResult = "Behavioral Health Request";
        String actualResult = behavioralHealthRequestForParticipationText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


    /**
     * Test-15 Facility
     */
    public void facility() throws InterruptedException {
        facility.click();
        Thread.sleep(3000);
    }
    public void validateFacility(){
        String expectedResult = "Facility Request for Participation";
        String actualResult = facilityRequestForParticipationText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


    /**
     * Test-16 Others
     */
    public void others() throws InterruptedException {
        Thread.sleep(3000);
        others.click();
    }
    public void validateOthers(){
        String expectedResult = "      Other networks you can join";
        String actualResult = otherNetworksYouCanJoinText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    /**
     * Test-17 Precertification
     */
    public void precertification(){
        precertification.click();
    }
    public void findADoctorOrHospital(){
        findADoctorOrHospital.click();
    }
    public void validatePrecertification(){
        String expectedResult = "Provider Referral Directory";
        String actualResult = directoryText.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
