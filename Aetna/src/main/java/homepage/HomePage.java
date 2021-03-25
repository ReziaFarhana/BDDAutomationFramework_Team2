package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    HomePageWebElement element;
    @FindBy(id = productName) public WebElement x;


}
