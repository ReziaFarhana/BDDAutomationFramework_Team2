package stepDefinitions;

import common.WebAPI;
import homepage.UAActionHome;

import io.cucumber.java.BeforeStep;

import org.openqa.selenium.support.PageFactory;

import static homepage.UAWebElement.*;

public class Mukera extends WebAPI {

    UAActionHome act;


    @BeforeStep
    public void getInit() {
        act = PageFactory.initElements(driver, UAActionHome.class);
    }



    

}
