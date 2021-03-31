package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    public void verifyMemberSupportClicked() {
        boolean expected = isElementDisplayed(dropDownBlock);
        Assert.assertEquals("Test failed", expected, true);
    }

    public void verifyLoginPage(String expected) {
        String actual = getTextByXpath(textMemberLogin);
        Assert.assertNotEquals("Test failed", expected, actual);
    }

    public void verifyFindDrPage(String expected) {
        String actual = getTextByCss(verifyFindDr);
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void verifyPharmacyPage(String expected) {
        String actual = getTextByXpath(verifyPharmacyPage);
        Assert.assertEquals("Test failed", expected, actual);
    }

    @FindBy(css = selectPharmacyType)
    public WebElement pharmacy;

    public void selectAPharmacy() {
        Select select = new Select(pharmacy);
        select.selectByVisibleText("Retail Pharmacy Locations");
//       WebElement firstSelect = select.getFirstSelectedOption();
//       firstSelect.getText();
    }

    @FindBy(xpath = clickOnZIPCode)
    public WebElement zip;

    public void selectZIPCode() {
        if (zip.isSelected()) {
        } else
            zip.click();
    }

    @FindBy(xpath = clickOnCityRadio)
    public WebElement citySelection;

    public void ClickCityRadeo() {
        if (citySelection.isSelected()) {
        } else
            citySelection.click();

    }

    @FindBy(css = distanceInMile)
    public WebElement inMile;

    public void selectDistanceInMile() throws InterruptedException {
        Select select = new Select(inMile);
        select.selectByVisibleText("20 miles");
        sleepFor(2);
    }


    @FindBy(css = selectPlan)
    public WebElement networkPlan;

    public void selectPlanNetwork() {
        Select select = new Select(networkPlan);
        select.selectByVisibleText("   Aetna Rx Value Network");
    }

    public void verifySearchResult(String expected) {
        String actual = getTextByCss(verifySearchText);
        Assert.assertEquals("Test failed", expected, actual);
    }

    @FindBy(xpath = selectAState)
    public WebElement state;

    public void selectState() throws InterruptedException {
        Select select = new Select(state);
        select.selectByVisibleText("Virginia");
        sleepFor(2);
    }

    @FindBy(css = selectDistanceInMiles)
    public WebElement distanceMile;

    public void selectDistanceAway() {
        Select away = new Select(distanceMile);
        away.selectByVisibleText("30 miles");
    }

    public void verifySearchByName(String expected) {
        String actual = getTextByXpath(verfiyPharmacyName);
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void verifyAdvanceSearchResult(String expected) {
        String actual = getTextByXpath(verifyTextOfSearch);
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void verifyMedicinCostPage(String expected) {
        String actual = driver.getTitle();
        Assert.assertEquals("Test failed", expected, actual);
    }

    public void verifyMedicareAetnaPage(){
        boolean actual = isElementDisplayed(verifyAetnaMedicarePage);
        Assert.assertEquals("Test failed",true,actual);
    }

    public void verifyEmailSubscritption(String text){
        String actual = getTextByXpath(subscriptionVerificationText);
    }




}
