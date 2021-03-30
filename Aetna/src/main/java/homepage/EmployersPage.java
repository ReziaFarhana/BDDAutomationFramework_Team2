package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class EmployersPage extends WebAPI {

    @FindBy(how = How.CLASS_NAME, using =aboutUsPageTextClass ) public WebElement aboutUsText;
    @FindBy(how = How.XPATH, using =healthPlansXp) public WebElement healthPlans;
    @FindBy(how = How.XPATH, using =memberProgramsxP) public WebElement memberPrograms;
    @FindBy(how = How.XPATH, using =aetnaHelpAppPagetxtSp) public WebElement aetnaHelpapp;
    @FindBy(how = How.XPATH, using =administrationOfferingXp) public WebElement administrationOffering;


    public void clickDropDown(){
        clickByXpath(exploreDropDownToggleClass);
    }
    public void clickAboutUsNav(){
        clickByXpath(aboutUsLinkXp);
    }
    public void verifyAboutUsPage(String expectedText){
        String actualText = aboutUsText.getText();
        Assert.assertEquals("Text doesnt match", expectedText, actualText);

    }

    public void clickProductsandServices() throws InterruptedException {
        sleepFor(3);
        clickByXpath(productsAndServicesXp);

    }
    public void hoverOverHealthPlans() throws InterruptedException {
        hoverOver(driver,healthPlans );
    }
    public void clickAllHealthPlans(){
        clickByXpath(allHealthPlansXp);
    }

    public void verifyAllHealthPlanPage(String expectedText){
        String actualText=driver.getTitle();
        Assert.assertEquals("Title doesnt match", expectedText, actualText);
    }

    //***************************************************************************
    public void clickMedicare() throws InterruptedException {
        clickByXpath(medicareXp);
        sleepFor(3);
    }
    public void clickDental() throws InterruptedException {
        scrollByXPATH(dentalXp);
        sleepFor(3);
    }
    public void clickVision() throws InterruptedException {
        clickByXpath(visionxP);
        sleepFor(2);
    }

    public void clickPharmacy() throws InterruptedException {
            scrollByXPATH(pharmacyxP);
            sleepFor(2);
    }
    public void clickSupplemental() throws InterruptedException {
        clickByXpath(supplementalxP);
        sleepFor(2);
    }
    //***********************************************************

    public void hoverOverMemberPrograms() throws InterruptedException {
        hoverOver(driver,memberPrograms );
    }

    public void clickAllMemberPrograms() throws InterruptedException {
        scrollByXPATH(allmemberProgramsxP);
        sleepFor(2);
    }
    //*******************************************************************
    public void clickAetnaHealthapp(){
        clickByXpath(aetnaHelpappXp);

    }
    public void verifyHealthAppPage(String expectedText){
        String actualText=aetnaHelpapp.getText();
        Assert.assertEquals("Title doesnt match", expectedText, actualText);
    }
    //*******************************************************************

    public void clickBehavioralHealth(){
        clickByXpath(behavioralHealthxp);
    }
    //*******************************************************************

    public void clickCareManagement(){
        clickByXpath(careManagxP);
    }
    //**********************************************************
    public void clickCustomerService(){
        clickByXpath(customerServicexP);
    }
    //**********************************************************
    public void clickDiabetes(){
        clickByXpath(diabetesXp);
    }
    //**********************************************************
    public void clickMemberManangementPlatform(){
        clickByXpath(memberManagmentPlatformxP);
    }//**********************************************************
    public void clickTelehealth(){
        clickByXpath(teleHealthXp);
    }//**********************************************************
    public void clickWomensHealth(){
        clickByXpath(womensHealthXp);
    }
    //**********************************************************

    public void hoverOverAdminOfferings() throws InterruptedException {
        hoverOver(driver, administrationOffering);
    }
    public void clickAllAdminTools() {
        clickByXpath(allAdminToolsxP);
    }
    //******************************************************************
    public void clickPayFlex(){
        clickByXpath(payFlexXp);
    }
    //******************************************************************
    public void clickGetAQuote() throws InterruptedException {
        scrollByXPATH(getAQuoteXp);
        sleepFor(3);
    }
    public void getAllLinksFromQuotePage(){
        getListofWebElementsbyTag("a");
    }
//*****************************************************
    public void clickOnIndividualQuote(){
        scrollByXPATH(individualQuoteXp);
    }
    public void enterZipcode(String zipcode) throws InterruptedException {
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        WebElement element=driver.findElement(By.xpath(zipcodeBoxXp));
        executor.executeScript("arguments[0].scrollIntoView(true);",element);
        sleepFor(3);
        driver.findElement(By.xpath(zipcodeBoxXp)).sendKeys(zipcode);
    }

    public void clickGetAFreeQuote(){
        scrollByXPATH(getAFreeQuote);
    }
}
