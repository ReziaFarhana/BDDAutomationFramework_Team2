package homepage.flightbooking;

public class FlightBookingWebElement {
    public static final String forumFlightLocator = "//span[.='Flights']";//xpath
    public static final String searchWhereFromLocator = "(//div[starts-with(@class,'orig')]//input[@placeholder='From where?'])[1]";//xpath
    public static final String searchWhereToLocator = "(//div[starts-with(@class,'dest')]//input[@placeholder='To where?'])[1]";//xpath
    public static final String calenderLocator = "//span[@data-datetype='DEPARTURE']//span[@class='ui_icon calendar pickerType']";//xpath
    public static final String startDateLocator = "//span[@class='rsdc-cell rsdc-day rsdc-startrange']";//xpath
    public static final String endDateLocator = "//div[@class='rsdc-months']/span[1]/span[.='30']";//xpath
    public static final String personLocator = "//div[@class='ui_column is-3-tablet cpp_column']//span[@class='ui_icon caret-down']";//xpath
    public static final String addPersonLocator = "(//div[starts-with(@class,'prw')]//div[@class='travelerRow adultRow']//span[@class='ui_icon plus-circle enabled'])[1]";//xpath
    public static final String closeLocator = "(//div[starts-with(@class,'prw_rup')]//span[@class='ui_link closeText'][normalize-space()='Close'])[3]";//xpath
    public static final String findFlightLocator = "//div[@class='ui_column submit_wrap']//span[@class='submit_text'][normalize-space()='Find flights']";//xpath
    public static final String covidPoliciesLocator = "//div[.='COVID-19 Policies']";//xpath
    public static final String dhakaThingsToDoLocator = "//a[@id='global-nav-attractions']";//xpath
    public static final String dhakaMonumentsStatuesLocator = "li:nth-child(2) span:nth-child(1) a:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(1)";//css
   // public static final String shahidMinarLocator = "//img[@alt='Shahid Minar']";//xpath
    public static final String shahidMinarLocator = "//section[2]//div[1]//span[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//a[1]//h3[1]//div[1]//span[1]//div[1]";//xpath
    //public static final String shahidMinarLocator = "//section[2]//div[@class='_1gpq3zsA _1zP41Z7X']";//xpath
    public static final String shahidMinarFullViewLocator = "//section[2]//div[@class='_1gpq3zsA _1zP41Z7X']";//xpath
    public static final String shahidMinarGalleryLocator = "//section[2]//div[@class='_1gpq3zsA _1zP41Z7X']";//xpath
    public static final String shahidMinarViewAllPhotoLocator = "//div[@class='ppr_rup ppr_priv_pv_resp_content_grid_zepto']";//xpath

    public static final String browseByDestination="//*[@id=\"lithium-root\"]/main/div[4]/div/div/div[3]/ul/li/ul";
    public static final String outdoorAdvenTravLink="Outdoors / Adventure Travel";
    public static final String oneWayTripLocator="//a[.='One-way']";//xpath
    public static final String oneWayCalenderLocator="//div[@class='prw_rup prw_datepickers_flights_single_date_datepicker']//span[@class='ui_icon calendar pickerType']";//xpath
    public static final String departureDateLocator="//span[@class='rsdc-cell rsdc-day rsdc-inrange']";
//    public static final String whereFromLocator = "( //div[@class='orig ui_column is-6 is-6-tablet map-pin-fill ui_icon pickerType ui_typeahead']";//xpath
//    public static final String whereToLocator = "(//div[starts-with(@class,'dest ui_column is-6')]//input[@placeholder='To where?'])[1]";//xpath
    public static final String flightBtnLocator = "div[class='ui_column submit_wrap'] span[class='submit_text']";//css

}
