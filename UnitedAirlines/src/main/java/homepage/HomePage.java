package homepage;



import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation: First Approach
    public void enterLocationFrom() {
        driver.findElement(By.id(bookFlightsOriginID)).sendKeys("Albany", Keys.ENTER);
    }
    public void enterLocationTo(){
        driver.findElement(By.id(bookFlightsToID)).sendKeys("Cancun", Keys.ENTER);
    }

    public void selectDates(){
        driver.findElement(By.xpath(departDate));
        driver.findElement(By.xpath(returnDate)).sendKeys(Keys.ENTER);
    }

    public void selectFlightClass(){
        clickByXpath(premiumEcoXp);
    }

    public void clickFindFlightsBtn(){
        clickByXpath(findFlightsBtn);
    }


}
