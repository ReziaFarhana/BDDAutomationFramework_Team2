package stepDefinitions;

import common.WebAPI;
import homepage.ProductsPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

public class ProductsPageStepDefinition extends WebAPI {

    static ProductsPage productspage;
    @AfterStep
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png","demo1");  // embed it in the report
        }
    }

    @BeforeStep
    public static void getInit(){
        productspage= PageFactory.initElements(driver, ProductsPage.class);
    }

//    @After
//    public void closeBrowser(){
//        cleanUp();
//    }

}
