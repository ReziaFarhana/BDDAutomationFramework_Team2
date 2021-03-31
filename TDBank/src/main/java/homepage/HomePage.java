package homepage;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how= How.XPATH, using= productsdropdownCusXp) public WebElement productsDropDown;
    @FindBy(how= How.XPATH, using= checkingCusXp) public WebElement checking;

    public void hoverOverProductsDropDown() throws InterruptedException {
        hoverOver(driver, productsDropDown);

    }

    public void verifyTitle(String expectedText){
        String actualText = driver.getTitle();
        Assert.assertEquals("Text doesnt match", expectedText, actualText);
    }
    //************************************************************
    public void clickChecking(){
        driver.findElement(By.xpath(checkingCusXp)).click();
    }
    //************************************************************
    public void clickSavings(){
        driver.findElement(By.xpath(savingsCusXp)).click();
    }
    public void clickCD(){
        driver.findElement(By.xpath(cdsCusXp)).click();
    }
    public void clickCreditCards(){
        driver.findElement(By.xpath(creditCardsXp)).click();
    }
    public void clickHomeEquityLoansandLines(){
        driver.findElement(By.xpath(homeEquityLoansCusXp)).click();
    }
    public void clickMortgage(){
        driver.findElement(By.xpath(mortgageCusXp)).click();
    }
    public void clickPersonalLoans(){
        driver.findElement(By.xpath(personalLoansCusXp)).click();
    }
    public void clickIRAs(){
        driver.findElement(By.xpath(iraCusXp)).click();
    }
    public void clickDebitCards(){
        driver.findElement(By.xpath(debitCardsCusXp)).click();
    }
    public void clickPrepaidCards(){
        driver.findElement(By.xpath(prepaidCardsCusXp)).click();
    }
    public void clickSpecialOffer(){
        driver.findElement(By.xpath(specialOffCusXp)).click();
    }




}
