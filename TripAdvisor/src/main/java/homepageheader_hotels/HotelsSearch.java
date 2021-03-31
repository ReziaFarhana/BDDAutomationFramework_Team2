package homepageheader_hotels;

import common.WebAPI;
import org.junit.Assert;

import static homepageheader_hotels.HotelsWebElement.*;

public class HotelsSearch extends WebAPI {
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

    public void guestsUpdateButton() {
        clickByXpath(updateButton);
    }

    public void verifyHotelSearchResults(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }
}
