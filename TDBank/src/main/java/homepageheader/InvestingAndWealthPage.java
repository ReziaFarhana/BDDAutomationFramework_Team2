package homepageheader;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepageheader.HomePageHeaderWebElement.*;

public class InvestingAndWealthPage extends WebAPI {
    @FindBy(how = How.XPATH, using = financialGoalsLocator)
    public WebElement financialGoals;
    @FindBy(how = How.XPATH, using = preserveYourWealthOption)
    public WebElement preserveYourWealth;
    @FindBy(how = How.XPATH,using = findAStoreSearchBox)public WebElement findAStore;

    public void investingAndWealthTab() {
        clickByLinkText(investingAndWealthTabLocator);
    }

    public void hoverOverFinancialGoalsAndSelectPreserveWealth() throws InterruptedException {
        sleepFor(3);
    hoverAndClick(financialGoals,preserveYourWealth);
    }

    public void verifyPreserveWealthPageTitle(String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title is not a match");
    }

    public void investmentManagementFindOutMoreLink(){
        clickByXpath(investmentAndManagementfindOutMoreLink);
    }

    public void ourProcessTab(){
        clickByXpath(ourProcesTab);
    }

    public void verfiyOurProcessTitle(String expectedTitle){
        String actualTitle = getTextByXpath(ourProcessTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Title is not a match");
    }

    public void individualsAndFamilies(){
        clickByXpath(individualAndFamiliesIcon);
    }

    public void findATDBankLocation(){
        clickByXpath(findATDBankButton);
    }

    public void findAStoreSearchBox(String state) throws InterruptedException {
        findAStore.sendKeys(state, Keys.ENTER);
        sleepFor(3);
    }

    public void verifySearchedState(String expectedState){
        String actualState = getTextByXpath(resultSummaryText);
        Assert.assertEquals(actualState,expectedState, "Wrong state is displayed");
    }

    public void businessOwner() throws InterruptedException {
        sleepFor(3);
        clickByXpath(businessOwnersIcon);
    }

    public void privateBankingLink(){
        clickByXpath(privateBankingLink);
    }

    public void paymentSolutionTab(){
        clickByXpath(paymentSolutionsTab);
    }

    public void verifyPaymentSolutionTitle(String expectedTitle){
        String actualTitle = getTextByXpath(paymentSolutionsTitle);
        Assert.assertEquals(actualTitle,expectedTitle, "Title is wrong");
    }

    public void retirementAndWealthPlanning(){
        clickByXpath(retirementPlanningIcon);
    }

    public void legacyAndPhilanthropicPlanningLink(){
        clickByXpath(legacyAndPhilanthropicPlanningLink);
    }

    public void watchVideoButton() {
        clickByXpath(watchVideoButton);

    }
    public void transcriptButton() throws InterruptedException {
        clickByXpath(transcript);
        sleepFor(3);
    }

    public void verifyFirstSenenteceOfTheTranscript(String expectedText){
        String actualText = getTextByXpath(transcriptFirstText);
        Assert.assertEquals(actualText,expectedText, "First sentence is incorrect");
    }





















    }






