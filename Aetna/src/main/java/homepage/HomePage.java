package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

// Action Method class

    // Find By Annotation:
    @FindBy (css = "input#gh-btn") public WebElement searchField;

    public void writeonsearchField(){
        searchField.sendKeys("Java Books");
    }

}
