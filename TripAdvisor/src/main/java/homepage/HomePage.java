package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.ID, using = where)
    public WebElement where1;
    @FindBy(how = How.ID, using = whereto)
    public WebElement whereto1;

    public void where() {
        clickByXpath(where);

    }

    public void Florida() {
        where1.sendKeys("florida");
    }

    public void CheckTitle2(String exResult) throws InterruptedException {
        String acResult = driver.getTitle();
        Assert.assertEquals("Text Does not Match", exResult, acResult);
    }

    //********************************************************************************************************************
    //Hotels
    public void ClickOnHotels() {
        clickByXpath(hotels);

    }

    public void wheretotext() {
        String expectedText = "where to ?";
        String actualText = whereto1.getText();
        org.junit.Assert.assertEquals("Text doesn't match", expectedText, actualText);
    }

    public void more() {
        clickByXpath(More);

    }

    public void place() {
        clickByXpath(addAPlace);
    }
    public void Airline() {
        clickByXpath(Airline);
    }
 public void Flights() {
        clickByXpath(Flights);
    }

 public void Cruise() {
        clickByXpath(Cruises);
    }

 public void HireaTrip() {
        clickByXpath(HireATripDesigner);
    }
public void insurance() {
        clickByXpath(insurance);
    }
public void RentalCars() {
        clickByXpath(rentalCars);
    }
public void roadTrip() {
        clickByXpath(roadTrip);
    }
public void TravlersChoice() {
        clickByXpath(travlersChoice);
    }
public void vacationPackages() {
        clickByXpath(vacationPackages);
    }


}

