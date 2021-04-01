package homepageheader_hotels;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepageheader_hotels.HotelsWebElement.*;

public class HotelsSearch extends WebAPI {
    @FindBy(how = How.XPATH, using = addRoomsButton)
    public WebElement addRooms;
    @FindBy(how = How.XPATH, using = addAdultsButton)
    public WebElement addAdults;
    @FindBy(how = How.XPATH, using = addChildrenButton)
    public WebElement addChildrens;


    public void whereToSearchBox() {
        clickByXpath(whereToSearchBox);
    }

    public void selectPopularDestination() {
        clickByXpath(popularDestinationsLocator);
    }

    public void verifyPageTitle(String expectedTitle) {
        String actualTitle = getTextByXpath(searchDestinationTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not a match");
    }


    public void checkInBox() {
        clickByXpath(checkInBox);
    }

    public void checkInDate() {
        clickByXpath(nextButton);
        clickByXpath(checkInDate);
    }

    public void checkOutDate() {
        clickByXpath(checkOutBox);
        clickByXpath(checkFromDate);
    }

    public void guestsUpdateButton() throws InterruptedException {
        sleepFor(3);
        clickByXpath(updateButton);
        sleepFor(3);
    }

    public void verifyHotelSearchResults(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    public void addRooms(Integer rooms) throws InterruptedException {
        sleepFor(3);
        for (int i = 1; i < rooms; i++) {
            addRooms.click();
        }
        sleepFor(3);
    }

    public void addAdults(Integer adults) throws InterruptedException {
        sleepFor(3);
        for (int i = 3; i < adults; i++) {
            addAdults.click();
        }
        sleepFor(3);
    }
    public void verifyNumberOfRooms(String expectedRoomsCount){
        String actualRoomsCount = getTextByXpath(verifyTheNumberOfRooms);
        Assert.assertEquals(actualRoomsCount,expectedRoomsCount,"Incorrect amount of rooms");
    }

    public void verifyNumberOfAdults(String expectedAdultsCount){
        String actualAdultsCount = getTextByXpath(verifyTheNumberOfAdults);
        Assert.assertEquals(actualAdultsCount,expectedAdultsCount,"Incorrect amount of adults");
    }

    public void addChildren(Integer children) throws InterruptedException {
        sleepFor(3);
        for (int i = 1; i < children; i++) {
            addChildrens.click();
        }
        sleepFor(3);
    }
    public void child1Age(Integer age){
        clickByXpath(ageDropdownForChild1);
        clickByXpath(ageThree);
    }
    public void child2Age(Integer age){
        clickByXpath(ageDropDownForChild2);
        clickByXpath(ageEight);
    }
    public void verifyNumberOfChildren(String expectedChildrensCount){
        String actualChildrensCount = getTextByXpath(verifyTheNumberOfChildren);
        Assert.assertEquals(actualChildrensCount,expectedChildrensCount,"Incorrect amount of Childrens");
    }

    public void filterPriceUsingSlider(Integer xOffset,Integer yOffset) throws InterruptedException {
        windowHalfPageScroll();
        slideByXpath(filterPriceLocator,xOffset,yOffset);
        sleepFor(5);
    }

    public void verifyFilteredPrice(String expectedPriceRange){
        String actualPriceRange = getTextByXpath(filterPriceResult);
        Assert.assertEquals(actualPriceRange,expectedPriceRange,"Incorrect price range");

    }


}
