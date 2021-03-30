package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class EmployersPage extends WebAPI {

    @FindBy(how = How.CLASS_NAME, using =aboutUsPageTextClass ) public WebElement aboutUsText;
    @FindBy(how = How.XPATH, using =healthPlansXp) public WebElement healthPlans;
    @FindBy(how = How.XPATH, using =memberProgramsxP) public WebElement memberPrograms;


    public void clickDropDown(){
        clickByXpath(exploreDropDownToggleClass);
    }
    public void clickAboutUsNav(){
        clickByXpath(aboutUsLinkXp);
    }
    public void verifyAboutUsPage(String expectedText){
        String actualText = aboutUsText.getText();
        Assert.assertEquals("Text doesnt match", expectedText, actualText);

    }

    public void clickProductsandServices() throws InterruptedException {
        sleepFor(3);
        clickByXpath(productsAndServicesXp);

    }
    public void hoverOverHealthPlans() throws InterruptedException {
        hoverOver(driver,healthPlans );
    }
    public void clickAllHealthPlans(){
        clickByXpath(allHealthPlansXp);
    }

    public void verifyAllHealthPlanPage(String expectedText){
        String actualText=driver.getTitle();
        Assert.assertEquals("Title doesnt match", expectedText, actualText);
    }

    //***************************************************************************
    public void clickMedicare() throws InterruptedException {
        clickByXpath(medicareXp);
        sleepFor(3);
    }
    public void clickDental() throws InterruptedException {
        scrollByXPATH(dentalXp);
        sleepFor(3);
    }
    public void clickVision() throws InterruptedException {
        clickByXpath(visionxP);
        sleepFor(2);
    }
    public void clickPharmacy() throws InterruptedException {
            scrollByXPATH(pharmacyxP);
            sleepFor(2);
    }
    public void clickSupplemental() throws InterruptedException {
        clickByXpath(supplementalxP);
        sleepFor(2);
    }
    //***********************************************************

    public void hoverOverMemberPrograms() throws InterruptedException {
        hoverOver(driver,memberPrograms );
    }

    public void clickAllMemberPrograms() throws InterruptedException {
        scrollByXPATH(allmemberProgramsxP);
        sleepFor(2);
    }


}
