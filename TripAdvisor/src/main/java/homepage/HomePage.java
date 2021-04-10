package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;


public class HomePage extends WebAPI {
    @FindBy(how=How.XPATH, using = searchBoxLoc) public WebElement searchBox;


}
