package homepage;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static homepage.IndividualPageWebElement.*;

public class ShopHeader extends WebAPI {

    @FindBy(xpath = medicareTabLocator)
    public WebElement medicare;
    @FindBy(xpath = healthCoverTabLocator)
    public WebElement healthcare;


    public void clickShopTab() {
        waitTimeExplicit(shopForPlanTabLocator);
        clickByXpath(shopForPlanTabLocator);
    }


    public void hoverMedicare() throws InterruptedException {
        hoverOver(driver, medicare);
        sleepFor(1);
    }

    public void hoverHealthCoverage() throws InterruptedException {
        hoverOver(driver, healthcare);
        sleepFor(1);
    }


    public void verifyPlans() {
        assertEqualByXpath(browsePlansTabLocator, "Browse Aetna Medicare plans");

    }


    public void findDoctor() {
        assertEqualByXpath(findaDoctorTabLocator, "Find a doctor");

    }


    public void findStudent() {
        assertEqualByXpath(studentPlansTabLocator, "Student plans");

    }

    public void findHealthCoverage() {
        assertEqualByXpath(healthCoverTabLocator, "Health coverage");

    }


    public void findEmployerPlans() {
        assertEqualByXpath(employerPlansTabLocator, "Plans through an employer");

    }


    public void verifyPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    public void verifyPageUrl(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Title does not match");
    }

    public void clickfindaDoctor() {
        waitTimeExplicit(findaDoctorTabLocator);
        clickByXpath(findaDoctorTabLocator);


    }

    public void clickBrowsePlans() {
        waitTimeExplicit(browsePlansTabLocator);
        clickByXpath(browsePlansTabLocator);


    }


    public void clickDrugList() {
        waitTimeExplicit(drugListTabLocator);
        clickByXpath(drugListTabLocator);



    }

    public void findDrugList() {
        assertEqualByXpath(drugListTabLocator, "Check our drug list");


    }

    public void clickEmployerPlans() {
        waitTimeExplicit(employerPlansTabLocator);
        clickByXpath(employerPlansTabLocator);


    }

    public void clickStudentPlans() {
        waitTimeExplicit(studentPlansTabLocator);
        clickByXpath(studentPlansTabLocator);


    }

}
