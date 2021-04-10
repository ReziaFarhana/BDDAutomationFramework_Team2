package homepage;

public class HomePageWebElement {


    public static final String locatorForMoreTab="button[aria-label='Explore Tripadvisor: More']";
    public static final String locatorForAddAPlace="#menu-item-0 > span";
    public static final String locatorToVerifyAddPlace="div[class='heading ui_icon map-pin']";
    public static final String locatorForAirlines="#menu-item-1";
    public static final String locatorToVerifyAirlinesLink="//h1[normalize-space()='Airlines']";
    public static final String locatorForCruse="#menu-item-2";
    public static final String locatorForFlight="#menu-item-3";
    public static final String locatorForCareRental="#menu-item-7";
    public static final String locatorHireTripDesigner="#menu-item-5";
    public static final String locatorOfInsurance ="#menu-item-6";
    public static final String locatorOfTripProtection="div[id='lp-pom-image-13'] img";

    public static final String singleInsuranceQuotelocator="a[id='lp-pom-button-226'] span[class='label']";
    public static final String toVerifySingleInsurancerlocator="div[id='lp-pom-text-845'] p";
    public static final String iframeLocator ="#lp-code-857 > iframe"; // #lp-code-857 > iframe:nth-child(1)
    public static final String stateOfResidencelocator="#stateDrop";

    public static final String stateSelectionIframe="//*[@id=\"tripCost\"]";

    public static final String selectStatelocator="form.ng-pristine.ng-valid.ng-valid-mask.ng-valid-pattern.ng-valid-maxlength select#stateDrop.form-control.ng-pristine.ng-untouched.ng-valid";
    public static final String tripCostlocator="form.ng-pristine.ng-valid.ng-valid-mask.ng-valid-pattern.ng-valid-maxlength #tripCost";
    public static final String age2locator="form.ng-pristine.ng-valid.ng-valid-mask.ng-valid-pattern.ng-valid-maxlength  div.age-inputs:nth-child(1) > input:nth-child(3) ";
    public static final String age1locator="form.ng-pristine.ng-valid.ng-valid-mask.ng-valid-pattern.ng-valid-maxlength  div.age-inputs:nth-child(1) > input:nth-child(4) ";
    public static final String departureDatelocator="form.ng-pristine.ng-valid.ng-valid-mask.ng-valid-pattern.ng-valid-maxlength #depDate";
    public static final String returnDatelocator="form.ng-pristine.ng-valid.ng-valid-mask.ng-valid-pattern.ng-valid-maxlength #retDate";
    public static final String initialDepositDatelocator="form.ng-pristine.ng-valid.ng-valid-mask.ng-valid-pattern.ng-valid-maxlength #initDate";
    public static final String getQuote="form.ng-pristine.ng-valid.ng-valid-mask.ng-valid-pattern.ng-valid-maxlength span.ng-scope";
//    public static final String iframelocator="div[id='lp-code-857'] iframe";
//    public static final String locator="";
    public static final String locatorIframe="#qm-widget-body > div:nth-child(1) > h4:nth-child(1)";

    public static final String locatorWhereToInCruise="#cruise_destination_picker";
    public static final String locatorMonthInCruise="#cruise_lander_month_picker";
    public static final String locatorToClickSearchInCruise="div[class='_1TbcMZPy']";
    public static final String locatorToSelectCaribbean="//span[contains(text(),'Mexico')]";
    public static final String locatorToSelectMay="//div[normalize-space()='May']";

    public static final String locator="//div[contains(@class,'_2H0J1fLT')]";
    public static final String locator1="//div[@class='yF-2QEPN']//div[@class='_2H0J1fLT']";

        // working on Insurance link
    public static final String locatorToAccessMyPlan="a[id='lp-pom-button-804'] span[class='label']";
    public static final String locatorToVerifyAccessMyPlan="div[id='quote'] div[class='content-caption']";
    public static final String locatorToSelectState="#state";
    public static final String locatorToEnterTripCost="#totalTripCost";
    public static final String locatorToSelectDestination="input[role='combobox']";
    public static final String locatorToIdentifyDepartureAndReturnDate="input[class='ng-tns-c23-0 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']";
    public static final String locatorForDepartureDate="//span[@id='330']";
    public static final String locatorForReturnDate="//span[@id='415']";
    public static final String locatorToIntialDepositDate="input[class='ng-tns-c23-1 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']";
    public static final String locatorSelectIntialDepositDate="//tbody/tr[2]/td[5]/a[1]";
    public static final String locatorForTravelerAge="input[class='form-control col-12 popover-input']";
    public static final String locatorToEnterTavelersAge="input[class='form-control age-field col-2 ng-untouched ng-pristine ng-invalid']";
    public static final String locatorToClickOnDone="button[class='link done mat-button']";
    public static final String locatorToClickOnQouteButton="#age-rated-btn";
    public static final String locatorToVirifyQoute="p[class='d-flex align-items-center']";
    public static final String locatorToLocateQoute="#quote-tab";


    public static final String locatorForAirlinesSearch="input[placeholder='Search airlines']";
    public static final String locatorToClickOnAirlinesSearch="h1[class='_3ggwzaPV']";
    public static final String locatorToClickOnFlightsLink="#global-nav-flights";
    public static final String locatorToVerifyClickOnFlightsLink="//div[@class='ui_columns']//child::h1";
    public static final String locatorDeparture="(//input[@class='query origWithLabel'])[1]";
    public static final String locatorForDestination="(//input[@class='query destWithLabel'])[1]";
    public static final String locatorDateDepartReturn="div[class='ui_column is-3-tablet dp_column']";  // #rt_ui_picker
    public static final String locatorButtonFindFlight="div[class='ui_column submit_wrap'] button[class='form_submit searchBtn en_US en']";
    public static final String locatorToVerifyFlightBooking="//input[@value='Addis Ababa (ADD)']";
//    public static final String locator="";
//    public static final String locator="";
//    public static final String locator="";  //input[@value='Addis Ababa (ADD)']   span[class='ui_icon minus']


}
