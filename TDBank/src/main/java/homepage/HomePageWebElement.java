package homepage;

public class HomePageWebElement {
    // accessing Online Banking From the Service Header Option
    public static final String popupAtFrontPage="span[class='td-icon td-icon-close icon-small']";
    public static final String servicesLocator="#td-desktop-nav-dropdown-link-3";
    public static final String onlineBankingLocator="//ul[@class='td-dropdown-content']//a[normalize-space()='Online Banking']";
    public static final String verifyOnlineBaking = "//h1[normalize-space()='Online Banking']";

        // Scenario: accessing Online Banking From the Log In Option
    public static final String clickOnLoginOption="#td-desktop-nav-dropdown-link-4";
    public static final String onlineBankingInSignIn="//div[@class='td-col']//a[normalize-space()='Online Banking']";
    public static final String verifyonlineBankingInSignIn="h1[class='td-ui-login-app-title ng-binding']";

        //~~ Products options
    public static final String productsTab="//li[@role='button']//span[@class='td-menuItem-label ng-binding'][normalize-space()='Products']";
    public static final String solutionsTab="div[aria-label='Solutions'] span[class='title-text ng-binding td-margin-right-10']";
    public static final String crossBorderBanking="//span[normalize-space()='Cross Border Banking']";
//    public static final String productName="";
//    public static final String productName="";
//    public static final String productName="";
//    public static final String productName="";
//    public static final String productName="";





}
