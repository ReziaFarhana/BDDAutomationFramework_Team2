package homepage;

public class UAWebElement {
    // WebElement class for Locators only and some other properties

    public static final String dealsLocator ="//span[contains(text(),'DEALS')]";
    public static final String currentOffersLinksLocator ="//span[contains(text(),'Current offers and promos')]";
    public static final String offerTextLocator ="//h3[contains(text(),'OFFERS')]";
    public static final String currentOffersLinksTetLocator ="//h1[normalize-space()='Deals & offers']";
    public static final String mileagePlusLocator ="//span[contains(text(),'MileagePlus news and offers')]";
    public static final String mileagePlusLocatorText ="//h1[normalize-space()='MileagePlus deals & offers']";
    public static final String ageDiscountsLocator ="//span[contains(text(),'Discounts for 18 to 22 year olds')]";
    public static final String offersSectionsHeadTextLocator ="main[id='main-content'] h1";
    public static final String veteransDiscountLocator ="//span[contains(text(),'Veterans Advantage discount')]";
    public static final String redeemCertLocator ="//span[contains(text(),'Redeem eCertificate')]";
    public static final String redeemCertTextLocator ="main-heading";
    public static final String scrollToElectronicTravelLocator ="//span[normalize-space()='Electronic travel certificate']";
    public static final String toEnterYearInfoLocator ="#etcBalance-year";
    public static final String enterPONLocator ="#etcBalance-pin";
    public static final String enterLastNameLocator ="#etcBalance-lastName";
    public static final String clickOnConfirmButtonLocator ="#etcBalance-submit";
    public static final String verifyeCeritificateLocator ="div.atm-l-linelength-container:nth-child(1) > div";
//    public static final String Locator ="";

    //~ ~~ Destination Section of UA deals

    public static final String getPopularDestinationsLocator ="//h3[.='DESTINATION DEALS']";
    public static final String popularDestinationsLocator ="//span[contains(.,'Flights to popular destinations')]";
    public static final String flightToNationalParksLocator ="//span[.='Flights to national parks']";
    public static final String toSanFranciscoLocator ="//span[contains(.,'Flights to San Francisco')]";
    public static final String toNewYorkLocator ="//span[contains(.,'Flights to New York/Newark')]";
    public static final String toHoustonLocator ="//span[contains(.,'Flights to Houston')]";
    public static final String toChicagoLocator ="//span[contains(.,'Flights to Chicago')]";
    public static final String toLosAngelesLocator ="//span[contains(.,'Flights to Los Angeles')]";
    public static final String toFloaridaLocator ="//span[contains(.,'Flights to Orlando')]";
    public static final String Locator ="";

        // /html/body/div[2]/div[1]/div/div/ol/li[4]/a/span

    public static final String destinationDealsNewPageTextLocator ="//div[contains(@class,'module-row module-row--breadcrumbs')]//li[4]";



}
