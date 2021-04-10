package unitedairlineshome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static unitedairlineshome.UnitedAirlinesHomeWebElement.*;

public class UnitedAirlinesHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = bookButtonWebElement) public WebElement bookButton;
    @FindBy(how = How.XPATH, using = hotelsButtonWebElement) public WebElement hotelsButton;
    @FindBy(how = How.XPATH, using = whereToSearchBoxWebElement) public WebElement whereToSearch1;
    @FindBy(how = How.XPATH, using = bookHotelsValidationText) public WebElement bookHotelsText;
    @FindBy(xpath = flightStatusLocator) public WebElement flightStatus;
    @FindBy(xpath = fromFieldLocator) public WebElement fromField;
    @FindBy(xpath = toFieldLocator) public WebElement toField;
    @FindBy(xpath = flightNumberBtnLocator) public WebElement flightNumber;
    @FindBy(xpath = dropDownBtnLocator) public WebElement dropDownBtn;
    @FindBy(xpath = selectDateLocator) public WebElement selectedDate;
    @FindBy(xpath = searchBtnLocator) public WebElement searchButton;
    @FindBy(xpath = textLocator) public WebElement validateText;
    @FindBy(xpath = checkInLocator) public WebElement checkIn;
    @FindBy(xpath = ticketNumberLocator) public WebElement ticketNumber;
    @FindBy(xpath = lastNameLocator) public WebElement lastName;//
    @FindBy(xpath = SearchBtnLocator) public WebElement searchBtn; //
    @FindBy(xpath = checkInTextLocator) public WebElement checkInText;
    @FindBy(xpath = myTripsLocator) public WebElement myTrips;
    @FindBy(xpath = myTripConfirmationsLocator) public WebElement myTripConfirmation;
    @FindBy(xpath = myTripLastNameLocator) public WebElement myTripLastName;
    @FindBy(xpath = myTripSearchBoxLocator) public WebElement myTripSearchBox;
    @FindBy(xpath = myTripValidateLocator) public WebElement myTripValidate;
    @FindBy(xpath = searchIconLocator) public WebElement searchIcon;
    @FindBy(xpath = coronaVirusUpdateLocator) public WebElement coronavirusUpdateClick;
    @FindBy(xpath = requestRefundLocator) public WebElement requestRefundClick;
    @FindBy(xpath = searchButtonTextLocator) public WebElement searchBtnText;
    @FindBy(xpath = flightReceiptLocator) public WebElement flightReceipt;
    @FindBy(xpath = radioBtnLocator) public WebElement radioBtn;
    @FindBy(xpath = travelerFirstNameLocator) public WebElement travelerFistName;
    @FindBy(xpath = travelerLastNameLocator) public WebElement travelerLastName;
    @FindBy(xpath = cardNumberLocator) public WebElement cardNumber;
    @FindBy(xpath = travelerSearchBtnLocator) public WebElement travelerSearchBtn;
    @FindBy(xpath = travelerTextLocator) public WebElement validateTravelerText;




    public void flightStatusTab() {
        flightStatus.click();
    }

    public void fromAndToField() throws InterruptedException {
        fromField.sendKeys("New York");
        toField.sendKeys("Dhaka");
        sleepFor(3);
    }

    public void flightNumberAndDateField() {
        flightNumber.sendKeys("2797");
        dropDownBtn.click();
        selectedDate.click();

//        Select select=new Select(dateDropDownBtn);
//        select.deselectByVisibleText("Sep 13,2020");
    }

    public void searchBtnCheck() {
        searchButton.click();
    }

    public void validateFlightStatus() {
        String expectedResult = "DEPARTURE";
        String actualResult = validateText.getText();
        Assert.assertEquals(expectedResult, actualResult);

    }

    public void checkInTab() {
        checkIn.click();
    }

    public void ticketNumberField() {
        ticketNumber.sendKeys("37474747474");
    }

    public void lastNameField() {
        lastName.sendKeys("Khan");
    }

    public void searchButtonClick() {
        searchBtn.submit();
    }

    public void validateCheckInfield() {
        String actualResult = "We couldn't find a reservation with the provided information.";
        String expectedResult = checkInText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    // My Trip
    public void myTripTab() {
        myTrips.click();
    }

    public void confirmationNumberField() {
        myTripConfirmation.sendKeys("B2JUWE");
    }

    public void myTripLastNameField() {
        myTripLastName.sendKeys("Khan");
    }

    public void myTripSearchButtonClick() {
        myTripSearchBox.submit();
    }

    public void validateMyTripfield() {
        String actualResult = "Your confirmation number, a 6 character alphanumeric code, and/or last name is not valid.";
        String expectedResult = checkInText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    //    SearchIcon
    public void searchIconCheck() {
        searchIcon.click();
    }

    public void coronavirusUpdate() throws InterruptedException {
        coronavirusUpdateClick.click();
        sleepFor(2);
    }

    public void requestRefundClick() throws InterruptedException {
        requestRefundClick.click();
        sleepFor(2);
    }

    public void validateSearchIcon() {
        String actualResult = "Refund policies";
        String expectedResult = searchBtnText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    // Flight Receipt
    public void flightReceiptCheck() throws InterruptedException {
        flightReceipt.click();
        sleepFor(7);
        radioBtn.click();
    }

    public void enterFirstName() {
        travelerFistName.sendKeys("Farhana");
    }

    public void enterLastName() {
        travelerLastName.sendKeys("Khan");
    }

    public void enterCardNumber() {
        cardNumber.sendKeys("12345678");
    }

    public void searchButtonCheck() {
        travelerSearchBtn.click();
    }

    public void validateFlightReceipt() {
        String actualResult = "We couldn't find your receipt";
        String expectedResult = validateTravelerText.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    /**
     * Book button Check
     */

    public void clickOnBookButton() throws InterruptedException {
        bookButton.click();
    }

    public void clickOnHotelButton() throws InterruptedException {
        hotelsButton.click();
    }

    public void textOnWhereToSearchBox(String searchItem) throws InterruptedException {
        driver.navigate().to("https://hotels.united.com/");
        whereToSearch1.sendKeys(searchItem);
        whereToSearch1.submit();
        Thread.sleep(3000);
    }

    public void validateLandedPageText() throws InterruptedException {
        String expectedText = "Miami Beach, Florida, United States of America";
        String actualText = bookHotelsText.getText();
        Assert.assertEquals("Text doesn't match", expectedText, actualText);
        Thread.sleep(3000);
    }
    /**
     * verify Page URL
     */

    public void verifyPageURL(String expectedText){
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals("Title doesn't match", expectedText, actualText);
    }
}
