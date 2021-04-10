package homepage.searchbox_texas;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import static homepage.searchbox_texas.SearchBoxTexasWebElement.*;

public class SearchBoxTexas extends WebAPI {

    // Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.XPATH, using = searchWhereToLocator) public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchTexasBtnLocator) public WebElement searchBtn;
    @FindBy(how = How.XPATH, using = searchTexasHotelTabLocator) public WebElement searchTexasHotelTab;
    @FindBy(how = How.XPATH, using = texasHotelTextLocator) public WebElement texasHotelText;
    @FindBy(how = How.ID, using = texasHotelVacationRentalsLocator) public WebElement texasHotelVacationRentals;
    @FindBy(how = How.XPATH, using = texasHotelVacationRentalsTextLocator) public WebElement texasHotelVacationRentalsText;
    @FindBy(how = How.ID, using = texasRestaurantsLocator ) public WebElement texasRestaurantsTab;
    @FindBy(how = How.PARTIAL_LINK_TEXT, using = texasDallasRestaurantLocator ) public WebElement texasDallasRestaurantTab;
    @FindBy(how = How.XPATH, using = texasDallasRestaurantFeatureLocator ) public WebElement texasDallasRestaurantFeature;
    @FindBy(how = How.XPATH, using = texasDallasRestaurantMealsLocator ) public WebElement texasDallasRestaurantMeals ;
    @FindBy(how = How.XPATH, using = DallasMapleLeafLocator ) public WebElement DallasMapleLeafTab ;
    @FindBy(how = How.XPATH, using = mapleLeafImageLocator ) public WebElement mapleLeafImage ;
    //@FindBy(how = How.XPATH, using =  mapleLeafAllPhotosLocator ) public WebElement  mapleLeafAllPhotos;
    @FindBy(how = How.XPATH, using =  mapleLeafAllPhotosLocator ) public WebElement  mapleLeafAllPhotos;
    @FindBy(how = How.XPATH, using =  mapleLeafPhotoGalleryLocator ) public WebElement  mapleLeafPhotoGallery;

    public void WhereToSearchBox() {
     searchBox.sendKeys("Texas");
        }
    public void searchButtonClick() throws InterruptedException {
        searchBtn.click();
        sleepFor(2);
    }
    public void hotelButtonClick() { searchTexasHotelTab.click();
    }

    public void validateDestinationTexas(String expectedText) {
        String actualResult = texasHotelText.getText();
        Assert.assertEquals(expectedText,actualResult);
    }

    /**
     *  Vacation Rentals Test-2...............................................
     */
    public void vacationRentalsTabCheck() {
        texasHotelVacationRentals.click();
    }
    public void validateTexasHotelVacationRentals(String expectedText) {
        String actualResult = texasHotelVacationRentalsText.getText();
        Assert.assertEquals(expectedText,actualResult);
    }

    /**
     *  Food Image Test-3......................................................
     */

    public void restaurantTabCheck() {
        texasRestaurantsTab .click();
    }

    public void texasDallasRestaurant() throws InterruptedException {
        texasDallasRestaurantTab.click();
        sleepFor(2);
        driver.navigate().to("https://www.tripadvisor.com/Restaurants-g55711-Dallas_Texas.html");
    }

    public void texasDallasRestaurantFeatureCheckBox() throws InterruptedException {
        texasDallasRestaurantFeature.click();
        sleepFor(2);
    }
    public void texasDallasRestaurantMealsCheckBox() throws InterruptedException {
        texasDallasRestaurantMeals.click();
        sleepFor(2);}

    public void DallasMapleLeafClick() throws InterruptedException {
        DallasMapleLeafTab.click();
        sleepFor(2);
    driver.navigate().to("https://www.tripadvisor.com/Restaurant_Review-g55711-d8655210-Reviews-Maple_Leaf_Diner-Dallas_Texas.html");}

    public void verifyMapleLeafImageIsDisplayed() { mapleLeafImage.isDisplayed(); }


//    Test-4-MapleLeaf Diner Photos
    public void mapleLeafAllPhotosIsClickable() {
        mapleLeafAllPhotos.isEnabled();
        mapleLeafAllPhotos.click();}

    public void validatePhotoGalleryIsDisplayed() {
        boolean b=mapleLeafPhotoGallery.isDisplayed();
        Assert.assertTrue(b);
    }

//    public void validateAllPhotosDisplayed() {
//        .isDisplayed();
//    }





//    public void foodImageClick() {
//        foodImage.click();
//    }
//
//    public void restaurantGallery() {
//        restaurantGallery.click();
//    }
//
//


}
