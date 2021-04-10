package homepage.flightbooking;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import static homepage.flightbooking.FlightBookingWebElement.*;

public class FlightBooking extends WebAPI {
    @FindBy(how = How.XPATH, using =forumFlightLocator) public WebElement forumFlightTab;
    @FindBy(how = How.XPATH, using =searchWhereFromLocator) public WebElement searchWhereFromTab;
    @FindBy(how = How.XPATH, using =searchWhereToLocator) public WebElement searchWhereToTab;
    @FindBy(how = How.XPATH, using =calenderLocator) public WebElement calender;
    @FindBy(how = How.XPATH, using =startDateLocator) public WebElement startDate;
    @FindBy(how = How.XPATH, using =endDateLocator) public WebElement endDate;
    @FindBy(how = How.XPATH, using =personLocator) public WebElement person;
    @FindBy(how = How.XPATH, using =addPersonLocator) public WebElement addPerson;
    @FindBy(how = How.XPATH, using =closeLocator) public WebElement closeBtn;
    @FindBy(how = How.XPATH, using =findFlightLocator) public WebElement findFlight;
    @FindBy(how = How.XPATH, using =covidPoliciesLocator) public WebElement covidPoliciesText;
    @FindBy(how = How.XPATH, using =dhakaThingsToDoLocator) public WebElement dhakaThingsToDo;
    @FindBy(how = How.XPATH, using =dhakaMonumentsStatuesLocator) public WebElement dhakaMonumentsStatues;
    @FindBy(how = How.XPATH, using =shahidMinarLocator) public WebElement shahidMinarTab;
    @FindBy(how = How.XPATH, using =shahidMinarFullViewLocator) public WebElement shahidMinarFullView;
    @FindBy(how = How.XPATH, using =shahidMinarGalleryLocator) public WebElement shahidMinarGallery;
    @FindBy(how = How.XPATH, using =shahidMinarViewAllPhotoLocator) public WebElement shahidMinarViewAllPhoto;
    @FindBy(how = How.XPATH, using =oneWayTripLocator) public WebElement oneWayTripBtn;
    @FindBy(how = How.XPATH, using =oneWayCalenderLocator) public WebElement oneWayCalenderBtn;
    @FindBy(how = How.XPATH, using =departureDateLocator) public WebElement departureDateBtn;
//    @FindBy(how = How.XPATH, using =whereFromLocator) public WebElement whereFromBtn;
//    @FindBy(how = How.XPATH, using =whereToLocator) public WebElement whereToBtn;
    @FindBy(how = How.CSS, using =flightBtnLocator) public WebElement flightBtn;

    public void flightTab() throws InterruptedException {
        forumFlightTab.isEnabled();
        clickByXpath(forumFlightLocator);
        sleepFor(3);
    }

    public void whereFromToField() throws InterruptedException {
        searchWhereFromTab.sendKeys("New York");
        sleepFor(3);
        searchWhereToTab.sendKeys("Dhaka");
        sleepFor(3);
    }

    public void calenderCheckIn() throws InterruptedException {
        calender.click();
        startDate.click();
        sleepFor(3);
        endDate.click();
        sleepFor(3);
    }

//    public void personField() throws InterruptedException {
//        person.click();
//        sleepFor(3);
//        addPerson.click();
//        sleepFor(2);
//        closeBtn.click();
//
//    }

    public void findFlightBox() throws InterruptedException {
        findFlight.click();
        sleepFor(5);
        driver.navigate().to("https://www.tripadvisor.com/CheapFlightsSearchResults-g293936-a_airport0.NYC-a_airport1.DAC-a_cos.0-a_date0.20210410-a_date1.20210430-a_formImp.f2fa37d7__2D__6d62__2D__4af5__2D__9304__2D__fa58b42b7175__2E__1007-a_nearby0.no-a_nearby1.no-a_nonstop.no-a_pax0.a-a_travelers.1-Dhaka_City_Dhaka_Division.html");
    }

    public void validateTravelForum(String expectedText) {
        String actualText = covidPoliciesText.getText();
        Assert.assertEquals(expectedText,actualText);
    }
//Test-2....Dhaka Things To Do................
public void verifyDhakaThingsToDo() throws InterruptedException {
    dhakaThingsToDo.click();
    sleepFor(5);
    }
    public void verifyDhakaMonumentsStatues() throws InterruptedException {
        dhakaMonumentsStatues.click();
        sleepFor(5);
    }
    public void verifyShahidMinarTabIsClickable() throws InterruptedException {
        Actions actions=new Actions(driver);
        actions.moveToElement(shahidMinarTab).perform();
        shahidMinarTab.click();
        sleepFor(5);
        driver.navigate().to("https://www.tripadvisor.com/Attraction_Review-g293936-d554724-Reviews-Shahid_Minar-Dhaka_City_Dhaka_Division.html");

    }
    public void verifyFullViewIsClickable() throws InterruptedException {
        shahidMinarFullView.click();
        sleepFor(5);
    }

    public void verifyPhotoGalleryIsClickable() throws InterruptedException {
        shahidMinarGallery.click();
        sleepFor(5);
    }
    public void validateThingsToDo() {
       String expectedText="THE 5 BEST Dhaka City Monuments & Statues (with Photos) - Tripadvisor";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText);
    }
//.................................................................................
    public void ValidateGetlinksFromTravelForumPage(){
        getListofWebElementsbyTag("a");
        System.out.println("a");
    }

    //**************************************************************

    public void rightClickandOpenBrowseDestinationLinks() throws InterruptedException {
        openMultipleTabsAtOnce(browseByDestination);
    }
    public void verifyAllTitles() throws InterruptedException {
        getTitlesOfMultipleTabs();
    }

//    ..................Test one way Trip..........
public void verifyOneWayTripBtnIsClickable() {
   oneWayTripBtn.click();
}

    public void verifyNewYorkToZurich() throws InterruptedException {
        searchWhereFromTab.sendKeys("New York");
        sleepFor(3);
        searchWhereToTab.sendKeys("Zurich");
        sleepFor(3);
    }
    public void verifyOneWayCalenderBtnIsClickable() throws InterruptedException {
        oneWayCalenderBtn.click();
        sleepFor(3);
        departureDateBtn.click();
    }
    public void findFlightBox2() throws InterruptedException {
        flightBtn.click();
        sleepFor(5);
        driver.navigate().to(" https://www.tripadvisor.com/CheapFlightsSearchResults-g188113-a_airport0.NYC-a_airport1.ZRH-a_cos.0-a_date0.20210410-a_formImp.ea3d471b__2D__241f__2D__452f__2D__be55__2D__bda8ef0353c1__2E__2277-a_nearby0.no-a_nearby1.no-a_nonstop.no-a_pax0.a-a_travelers.1-Zurich.html");
    }


    public void validateZurichAsPageTitle() {
        String expectedText="Cheap flights to Zurich (ZRH) - Tripadvisor";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText);
    }

//    //**************************************************************
//    public void clickOnTravelingWithPets() throws InterruptedException {
//        //opens new tab after clicking link
//        rightClickandOpenNewTabUsingLink(travelingwPetsLink);
//        //switches to that tab
//
//
//    }


}
