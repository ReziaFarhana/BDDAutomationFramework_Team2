package tdBank;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static tdBank.WebElement.*;

public class TDBankHomepage extends WebAPI {


    @FindBy(how = How.XPATH,using = shouldSeeTypesOfLoan)public WebElement typesOfLoan;

    public static final String adChoicesAndPersonalizationXButton = "//*[@id=\"ensCall\"]/span[2]";

    public void locateSearchBox(){

        clickByXpath(adChoicesAndPersonalizationXButton);

        //clickByXpath(searchBoxLocator);
        clickByXpath("//a[@class='td-desktop-search-show-btn']");
    }

    public void typeInSearchBox(String keyword) throws InterruptedException {

        //driver.findElement(By.xpath("//input[@class='td-search-input ng-pristine ng-valid ng-empty ng-touched']")).sendKeys(keyword, Keys.ENTER);
       // sleepFor(2);
       // typeOnElementNEnter("//input[@class='td-search-input ng-pristine ng-valid ng-empty ng-touched']",keyword);
        sleepFor(2);
            typeOnElementAndEnterbyXpath("(//input[@type='text'])[1]",keyword);

    }


    public void shouldSeeTypeOfLoan(String expectedText){

        String actualText=getTextByXpath(shouldSeeTypesOfLoan);
        Assert.assertEquals(actualText,expectedText,"The Text did not match");
    }
 //----------------------morgage loan--
    public  void mortgageLoanButton(){
        clickByLinkText("Mortgages");
    }

    public void calculateMortgageButton(){
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)");
        clickByXpath(calculateMyMortgageRate);

    }
    public void enterMortgageCredentials(){
        //enter zip code
       // typeByXpath(propertyZipCode,"11590");
        //enter purchase price
        typeByXpath("/html/body/app-root/section/app-loan-form/div[1]/form/div/div[1]/div[2]/div/div/input","600000");
        //percent for downpayment
        typeByXpath(percentDownBoxLocator,"10");
    }
    public void getMyOptionButton(){

        clickByXpath(getMyOptionButton);
    }

//----------personal Loan----

    public void personalLoanButton(){
       clickByXpath(personalLoanButton);

    }
    public void personalLoanPageVerification(){
        String expectedText="TD Bank Personal Loans";
        String actualText=getTextByXpath("//h1[normalize-space()='TD Bank Personal Loans']");
        Assert.assertEquals(actualText,expectedText,"Text did not match");
    }

    //---------------------------Small business Loans-----

    public void smallBusinessLoans() throws InterruptedException {
        clickByXpath(readMore);
        clickByXpath(smallBusinessLoansLink);
        sleepFor(2);



    }
    public void selectregion(){

        Select selectState = new Select(driver.findElement(By.id("state")));
        selectState.selectByVisibleText("New York");
        Select selectCity = new Select(driver.findElement(By.id("city")));
        selectCity.selectByVisibleText("Farmingdale");
        clickByXpath("//input[contains(@name,'go')]");
    }

    public void smallBusinessmMonthlyCalculation(){
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,1500)");

        typeByXpath("//input[contains(@id,'loanAmount')][1]","50000");
        typeByXpath("//input[contains(@id,'interestRate')][1]","3");
    }
    public void monthlyPaymentDisplayed(){
        String expectedText="Based on what you entered your monthly payment could be";
        String actualText=getTextByXpath("//p[contains(text(),'Based on what you entered your monthly payment could be')][1]");
    }

    //-----------------------Commercial Loans--------------

    public void commercialLoan(){

        clickByXpath(readMore);
        clickByXpath(commercialLoanLink);
    }

    public void requestACall(){
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,1500)");
        clickByXpath(requestACallButton);


    }
    public void enterCredentialsForCommercialLoan(){

        typeOnElementAndEnterbyXpath(firstNameTextBox,"Sonia");
        typeOnElementAndEnterbyXpath(lastNameTextBox,"Smith");
        typeOnElementAndEnterbyXpath(businessNameTextBox,"Paisley");
        typeOnElementAndEnterbyXpath(phoneNumberTextBox,"1234567895");
        typeOnElementAndEnterbyXpath(emailTextBox,"luvlaugh@gmail.com");
        //WebElement radio1=  driver.findElement(By.xpath("//button[contains(@class,'td-button td-button-block td-button-secondary')]")).click();
        clickByXpath(tdCustomer);
        clickByXpath(iAmNotRobot);


    }
    public void submitButtonforCommercialForm(){
        clickByXpath(submitForApptForm);
    }

    public void shouldDisplayThankYouMessage(){
        String expectedText= "'Thank you for reaching out to us";
        String actualText=getTextByXpath("//h5[contains(@class,'text-center td-margin-top-0 td-margin-right-20 td-margin-bottom-40 ng-binding')][1]");
        Assert.assertEquals(actualText,expectedText,"Text di not match");

    }
    //-----------------Home Equity Loans--------------

    public void homeEquityLoan(){
       clickByXpath(homeEquityLink);
    }

    public void setYourLocation(){
        Select selectState = new Select(driver.findElement(By.id("state")));
        selectState.selectByVisibleText("New York");
        Select selectcity = new Select(driver.findElement(By.id("city")));
        selectcity.selectByVisibleText("Farmingdale");
        clickByXpath(setMyLocationButton);
    }

    public void enterValidEquityInfo(){
        setYourLocation();

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,1000)");

        typeOnElementAndEnterbyXpath(requestedLoanAmt,"50000");
        typeOnElementAndEnterbyXpath(propertyValue, "600000");
        typeOnElementAndEnterbyXpath(propertyBalance,"300000");
        typeOnElementAndEnterbyXpath(zipCodeForEquity,"11590");

    }

    public void getRatesLink(){

        clickByXpath(getRates);
    }

    public void verifyPersonalEquityQuote(){
        String expectedText="Your personalized Home Equity quote";
        String actualText=getTextByXpath(personalizedEquityQuote);
        Assert.assertEquals(actualText,expectedText,"Text Does not Match");



    }
}
