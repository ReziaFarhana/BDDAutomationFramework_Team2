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
    public static final String destinationDealsNewPageTextLocator ="//div[contains(@class,'module-row module-row--breadcrumbs')]//li[4]";
    public static final String bookFromLocator ="#cmp-origin-id";
    public static final String bookToLocator ="#cmp-destination-id";
    public static final String bookDepartureDateLocator ="#cmp-departure-date-id";
    public static final String bookReturnDateLocator ="#cmp-return-date-id";
    public static final String travelersInfoLocator ="#cmp-travelers-id";
    public static final String selectEconomy ="#cmp-travel-class-label-id";
    public static final String promotionalCodeLocator ="#cmp-promo-code-id";
    public static final String searchButtonLocator ="//button[.='Search flights']";
    public static final String moveToAdultLocator ="body.page-template-home:nth-child(2) div.module-row.module-row--header:nth-child(7) div.booking-backdrop div.container div.trfx-component.trfx-component-booking.airline-ua.desktop div.default.no-icons div.form-container.clearfix.default.no-icons div.clearfix.fields:nth-child(4) div.col-xs-24.col-md-16.col-sm-24.padding-none:nth-child(1) div.col-xs-24.col-md-12.col-sm-12.padding:nth-child(1) div.field.field-travelers.form-group div.input-group:nth-child(2) div.travelers-selector div.travelers-popover:nth-child(2) div:nth-child(1) fieldset.clearfix.section.TravelerContainer:nth-child(2) div.form-group.TravelerSelector.row:nth-child(2) div.col-xs-12.TravelerSelectorLabelContainer:nth-child(1) > label:nth-child(1)";
    public static final String inputAdultNumberLocator ="input[value='1']"; // select one
    public static final String decreaseAdultLocator ="//div[@class='travelers-popover']//div//div//div[1]//div[2]//div[1]//div[1]//span[1]//button[1]//i[1]";
    public static final String increaseAdultLocator ="//div[@class='travelers-popover']//div//div//div[1]//div[2]//div[1]//div[1]//span[2]//button[1]//i[1]";
    public static final String doneButtonLocator ="button[class='btn btn-sm btn-link']";
    public static final String leftCalenderClickLocator ="//a[@class='react-datepicker__navigation react-datepicker__navigation--previous']";
    public static final String rightCalenderClickLocator ="//a[@class='react-datepicker__navigation react-datepicker__navigation--next']";
    public static final String departureDateLocator ="//div[@class='react-datepicker__day'][normalize-space()='21']";
    public static final String returnDateLocator ="//div[@class='react-datepicker__day react-datepicker__day--weekend'][normalize-space()='2']";

    public static final String verifyBookingLocator ="//h2[.='We could not process your request. Please see the message below and make revisions.']";
    public static final String verifyNoPromoCodeLocator ="#fl-search-segment-header-wrap";
    public static final String bookWithMileLocator ="#use-miles-popup";
    public static final String verifyBookWithMileLocator ="#ui-id-1";
    public static final String ClickOnchangeBagRulesLocator = "//a[normalize-space()='Changed bag rules']";             //"//a[.='Changed bag rules']";
    public static final String textVerifyOnBagRulesLocator ="h1[class='temphead']";

    public static final String locateAnyTabLocator ="//h2[.='How much will it cost to check my bag?']";
    public static final String clickOnAnyFlightTabLocator ="//a[normalize-space()='Any flights']";
    public static final String toLocateBagInfoLocator ="//div[@class='dynamicBagFees']";
    public static final String addCityFromLocator ="#ctl00_ContentInfo_BaggageFeeForm_Airports01_Origin_txtOrigin";
    public static final String addCityToLocator ="//input[@aria-autocomplete='list']";
    public static final String verifyBagPriceLocator ="//label[.='Standard checked bag price']";
//    public static final String Locator ="";
//    public static final String Locator ="";






}
