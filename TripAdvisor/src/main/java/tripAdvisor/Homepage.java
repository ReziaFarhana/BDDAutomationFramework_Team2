package tripAdvisor;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import  org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

import static tripAdvisor.WebElement.*;

public class Homepage extends WebAPI {


    public void openTripAdvisor() throws IOException {  //1

        openBrowser(tripAdvisorURL);
    }

    //------------vacational rental
    public void goToVacationRentals() {

        clickByXpath(vRentals);
    }

    //--------------------enter location
    public void enterLocationForVacRental(String location) throws InterruptedException {
        sleepFor(3);

        typeOnElementAndEnterbyXpath(enterLocation, location);
        sleepFor(3);
        windowHandle();
        sleepFor(2);
    }

    //------------reviewa and opnions
    public void reviewsAndOpinions() throws InterruptedException {
        clickByXpath(tampa);
        sleepFor(3);
        windowHandle();
        sleepFor(3);

    }
    public void verifyExploreTampaText(String expectedText) {
        String actualText = getTextByXpath(tampaVacationRentalTextLocater);
        Assert.assertEquals(actualText, expectedText, "Text does not match");
    }


//------------verify tampa vacation rental displays
    public void verifyTampaVacationrental(String expectedTitle){
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title did not match");
    }

//--------------filters
    public void checkinBox(){
        clickByXpath(checkinBox);
    }
    public void pickADate(String date1,String date2) throws InterruptedException {
    clickByXpath(checkinDate);
    clickByXpath(checkOut);
    sleepFor(3);
    }

    public void guestNumber(){
        clickByXpath(guests);

    }
    public void addBedrooms() throws InterruptedException {

        clickByXpath(numberOfBedrooms);
        sleepFor(3);


    }//can use for loop,
    public void addGuests() throws InterruptedException {
        clickByXpath(numberOfGuest);
        sleepFor(2);



    }
    public void addBathrooms() throws InterruptedException {
        clickByXpath(numberOfBathrooms);
        sleepFor(2);

    }
    public void applyButton(){
        clickByXpath(applyButton);

    }
    public void verifyFiltersAppear(String expectedText){
        String actualText=getTextByXpath(verifyfiltertextLocater);
        Assert.assertEquals(actualText,expectedText,"The Text does not match");


    }
    //--------------Sort DD
    public void sortDD(){
        clickByXpath(sortDD);


    }
    public void priceLowToHigh(){
        clickByXpath(priceLowToHigh);


    }
    public void verifyPricechange(String expectedText){
        String actualText=getTextByXpath(pricePerNight);
        Assert.assertEquals(actualText,expectedText,"Text does Not match");


    }
    //-------------slide to min
    public void leftSliderButton(){
        scrollByXPATH(scrolltoDistanceFrom);
        clickByXpath(sliderMinimum);

    }

    public void sliderMinimum(){
        scrollByXPATH(scrolltoDistanceFrom);

        WebElement slideMin = driver.findElement(By.xpath(sliderMinimum));
        Actions move = new Actions(driver);
        move.moveToElement(slideMin).clickAndHold().moveByOffset(0,10).release().perform();


    }
    public void verifyMinimuAmountdisplayed(String expectedText){
        String actualText=getTextByXpath(minimumAmountText);
        Assert.assertEquals(actualText,expectedText);

    }
    //-----------slide to max
    public void rightSliderButton(){
        clickByXpath(sliderMaximum);

    }
    public void sliderToMaximum(){
        WebElement slideMin = driver.findElement(By.xpath(sliderMaximum));
        Actions move = new Actions(driver);
        move.moveToElement(slideMin).clickAndHold().moveByOffset(0,500).release().perform();

    }
    public void verifyMaximumAmountDisplayd(String expectedText){
        String actualText=getTextByXpath(minimumAmountText);
        Assert.assertEquals(actualText,expectedText);


    }


}
