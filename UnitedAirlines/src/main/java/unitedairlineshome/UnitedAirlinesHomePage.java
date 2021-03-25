package unitedairlineshome;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static unitedairlineshome.UnitedAirlinesHomeWebElement.*;

public class UnitedAirlinesHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = bookButtonWebElement)
    public WebElement bookButton;
    @FindBy(how = How.XPATH, using = hotelsButtonWebElement)
    public WebElement hotelsButton;
    @FindBy(how = How.XPATH, using = whereToSearchBoxWebElement)
    public WebElement whereToSearch1;
    @FindBy(how = How.XPATH, using = bookHotelsValidationText)
    public WebElement bookHotelsText;
    @FindBy(xpath = flightStatusLocator)
    WebElement flightStatus;
    @FindBy(xpath = fromFieldLocator)
    WebElement fromField;
    @FindBy(xpath = toFieldLocator)
    WebElement toField;
    @FindBy(xpath = flightNumberBtnLocator)
    WebElement flightNumber;
    @FindBy(xpath = dropDownBtnLocator)
    WebElement dropDownBtn;
    @FindBy(xpath = selectDateLocator)
    WebElement selectedDate;
    @FindBy(xpath = searchBtnLocator)
    WebElement searchButton;
    @FindBy(xpath = textLocator)
    WebElement validateText;
    @FindBy(xpath = checkInLocator)
    WebElement checkIn;
    @FindBy(xpath = ticketNumberLocator)
    WebElement ticketNumber;
    @FindBy(xpath = lastNameLocator)
    WebElement lastName;//
    @FindBy(xpath = SearchBtnLocator)
    WebElement searchBtn; //
    @FindBy(xpath = checkInTextLocator)
    WebElement checkInText;
    @FindBy(xpath = myTripsLocator)
    WebElement myTrips;
    @FindBy(xpath = myTripConfirmationsLocator)
    WebElement myTripConfirmation;
    @FindBy(xpath = myTripLastNameLocator)
    WebElement myTripLastName;
    @FindBy(xpath = myTripSearchBoxLocator)
    WebElement myTripSearchBox;
    @FindBy(xpath = myTripValidateLocator)
    WebElement myTripValidate;
    @FindBy(xpath = searchIconLocator)
    WebElement searchIcon;
    @FindBy(xpath = coronaVirusUpdateLocator)
    WebElement coronavirusUpdateClick;
    @FindBy(xpath = requestRefundLocator)
    WebElement requestRefundClick;
    @FindBy(xpath = searchButtonTextLocator)
    WebElement searchBtnText;
    @FindBy(xpath = flightReceiptLocator)
    WebElement flightReceipt;
    @FindBy(xpath = radioBtnLocator)
    WebElement radioBtn;
    @FindBy(xpath = travelerFirstNameLocator)
    WebElement travelerFistName;
    @FindBy(xpath = travelerLastNameLocator)
    WebElement travelerLastName;
    @FindBy(xpath = cardNumberLocator)
    WebElement cardNumber;
    @FindBy(xpath = travelerSearchBtnLocator)
    WebElement travelerSearchBtn;
    @FindBy(xpath = travelerTextLocator)
    WebElement validateTravelerText;

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
        String actualResult = "DEPARTURE";
        String expectedResult = validateText.getText();
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
        cardNumber.sendKeys("1234");
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
        Assert.assertEquals("Text does not match", expectedText, actualText);
        Thread.sleep(3000);
    }
}
