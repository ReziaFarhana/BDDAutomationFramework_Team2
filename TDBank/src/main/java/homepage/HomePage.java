package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepage.HomePageWebElement.*;


public class HomePage extends WebAPI {

// Action Method class

    // Find By Annotation:


    @FindBy(how = How.XPATH, using = Personal) public WebElement personal;
    @FindBy (how = How.XPATH, using = WeAreHereToHelp) public WebElement weareheretohelp;
     @FindBy(how = How.XPATH, using = checkingAccount) public WebElement  checkingaccount;
    @FindBy (how = How.XPATH, using = checkingAccount) public WebElement Checkingaccount1;
    @FindBy (how = How.XPATH, using = BeyoundCheckingGetText) public WebElement BeyoundCheckingGetText1 ;


    public void personal(){
       personal.click();
    }

    public void personalWeAreHereToHelp() {
    // String expectedTex =" We're here to help.";
     String actualResult=weareheretohelp.getText();
    //Assert.assertEquals("text does not match", expectedTex,actualResult);


}

    public void Checkingaccount() throws InterruptedException {
        checkingaccount.click();
        Thread.sleep(5000);

    }
    public void CheckingAccountGetText(){
       String exResult="TD Beyond Checking";
       String acResult=   BeyoundCheckingGetText1.getText();
       Assert.assertEquals("Text Does not Match", exResult,acResult);



    }


}
