package homepageheader_book;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepageheader_book.BookWebElement.*;

public class BookRoundTrip extends WebAPI {
    @FindBy(how = How.XPATH, using = addMoreAdultButton)
    public WebElement addMoreAdult;

    public void fromLocationField(String location) throws InterruptedException {
        clickById(fromLocation);
        sleepFor(3);
        clearFieldById(fromLocation);
        sleepFor(3);
        typeOnElementNew(fromLocation, location);
    }

    public void toLocationField(String location) {
        typeById(toLocation, location);
    }

    public void departDateField(String date) {
        clickByXpath(departDateInputBox);
        clickByXpath(clearDateField);
        typeByXpath(departDateInputBox, date);
    }

    public void returnDateField(String date) throws InterruptedException {
        typeOnElementByXpathNEnter(returnDateInputBox, date);
        sleepFor(3);
    }

    public void verifySearchPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }

    public void departDate() {
        clickByXpath(departDateInputBox);
        clickByXpath(clearDateField);
        clickByXpath(departDateInputBox);

    }

    public void selectDepartDate() {
        clickByXpath(arrowButtonToNextMonth);
        clickByXpath(departDateSelect);
    }

    public void returnDate() {

        clickByXpath(returnDateInputBox);
    }

    public void selectReturnDate() throws InterruptedException {
        clickByXpath(returnDateSelect);
        sleepFor(3);
    }

    public void findFlightsButton() throws InterruptedException {
        clickByXpath(findFlightsButton);
        sleepFor(3);
//        windowHalfPageScroll();
//        sleepFor(5);
    }

    public void verifySearchPageText(String expectedErrorMessage) {
        String actualErrorMessage = getTextByXpath(errorMessage);
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Text is not a match");
    }

    public void travellersButton() {
        clickByXpath(travellersButton);
    }

    public void addMoreAdultsButton() throws InterruptedException {
        for (int i = 0; i <= 5; i++) {
            addMoreAdult.click();
        }
        clickByXpath(closeTravllersBox);
        sleepFor(5);
    }

    public void verifyAddedAdultTravellersAmount(String expectedAdultAmount) {
        String actualAdultAmount = getTextByXpath(verifyAdultTravellersAmount);
        Assert.assertEquals(actualAdultAmount, expectedAdultAmount, "The amount is wrong");
    }

}
