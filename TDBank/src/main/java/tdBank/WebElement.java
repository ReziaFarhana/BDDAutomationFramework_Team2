package tdBank;

public class WebElement {

    public static final String searchButtonLocator = "(//span[@class='td-icon'])[3]";
    public static final String servicesNew="//a[@id='td-desktop-nav-dropdown-link-3']";
    public static final String searchBoxLocator = "//input[@class='td-search-input ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']";
    public static final String keywordjobSearchBox = "(//input[ @class='text_input keyword_suggest ui-autocomplete-input'])";
    public static final String shouldSeeTypesOfLoan = "//h2[text()='What types of loans do you offer?']";
    public static final String calculateMyMortgageRate = "//span[@id='get-quote' and text()='Calculate my rate']";
    public static final String propertyZipCode = "//input[contains(@class,'ng-pristine ng-invalid ng-touched')]";
    public static final String purchasePriceTextBoxLocator = "//input[ @class='sb-currency-field ng-pristine ng-invalid ng-touched']";
    public static final String percentDownBoxLocator = "//input[ @class='sb-dropdown-percent sb-value-present ng-pristine ng-valid ng-touched']";
    public static final String getMyOptionButton = "//div[@class='td-button-container td-col-sm-8 td-col-sm-offset-right-4 td-col-md-6 td-col-md-offset-right-6']//button[@class='td-button td-button-block td-button td-button-secondary']";
    public static final String searchTextBox = "input[class='td-search-input ng-pristine ng-valid ng-empty ng-touched']";
    public static final String requestACallFormMessgae = "/html/body/div[1]/div[2]/div/div/div/div[1]/div/div/div/div/section/div/div/h5[1]";
    public static final String personalLoanButton = "//a[text()='Personal loans ']";
    public static final String readMore = "//a[normalize-space()='Read more']";
    public static final String smallBusinessLoansLink = "//a[contains(text(),'Small Business loans')][1]";
    //---------------data table---------
    public static final String Savings = "(//a[contains(text(),'Savings')])[1]";
    //public static final String
    //-------------------Home Equity Loans-------------
    public static final String homeEquityLink = "//a[contains(text(),'Home equity loans and lines of credit')]";
    public static final String setState = "//select[contains(@id,'state')]";
    public static final String setCity = "//select[contains(@id,'city')]";
    public static final String setMyLocationButton = "//button[contains(@class,'td-button td-button-block td-button-secondary')]";
    public static final String getRates = "//button[contains(text(),'Get rates')]";
    public static final String personalizedEquityQuote = "//h1[contains(text(),'Your personalized Home Equity quote')]";
    public static final String requestedLoanAmt = "//input[contains(@id,'he_desired_cashout_amount')]";
    public static final String propertyValue = "//input[contains(@id,'he_property_value')]";
    public static final String propertyBalance = "//input[contains(@id,'he_mortgage_balance')]";
    public static final String zipCodeForEquity = "//input[contains(@id,'he_property_zip_code')]";
    //--------------------commercial loans---------------
    public static final String commercialLoanLink = "//a[contains(text(),'Commercial loans')][1]";
    public static final String requestACallButton = "//button[contains(@class,'td-custom-thirdpartyurl-action td-button td-button-block td-button-primary')][1]";
    public static final String firstNameTextBox = "//input[contains(@id,'firstName')][1]";
    public static final String lastNameTextBox = "//input[contains(@id,'lastName')][1]";
    public static final String businessNameTextBox = "//input[contains(@id,'businessName')][1]";
    public static final String phoneNumberTextBox = "//input[contains(@id,'contactNumber')][1]";
    public static final String emailTextBox = "//input[contains(@id,'customerEmail')][1]";
    public static final String tdCustomer = "//input[contains(@id,'areYouexistingCustomer1')][1]";
    public static final String iAmNotRobot = "//div[contains(@class,'recaptcha-checkbox-checkmark')]";
    public static final String submitForApptForm = "//button[contains(@class,'td-button td-button-block td-button-secondary')]";

    //----------------------SiteMap------------
    public static final String siteMap = "//a[contains(text(),'Site Map')]";
    public static final String studentchecking = "//h1[contains(text(),'(//a[contains(text(),'Student Banking')])[1]')]";
    public static final String studentBanking1 = "(//a[@class='td-link-standalone'])[1]";
    public static final String studentBanking2 = "(//span[contains(@class,'td-link-lastword')])[1]";
    public static final String studentCheckingText = "(//h1[contains(text(),'Student Checking & Other Services')])[1]";
    public static final String studentCheckingTextLocater = "//h1[normalize-space(text())='Student Checking & Other Services']";
    // public static final String travelTips=""
    //--------------------CAREER---------------------
    public static final String tdBankURL = "https://www.td.com/us/en/personal-banking/";
    public static final String careerButtonLocator = "//a[contains(text(),'Careers')][1]";
    public static final String jobSearchBoxLocator = "//label[text()='Keywords']";
    public static final String searchButton = "//input[@type='submit' and @value='Search'][1]";
    public static final String searchResultTextLocater = "//h1[text()='Search Results']";
    public static final String searchByLocation = "//input[contains(@id,'cws_quickjobsearch_location')]";
    public static final String liveResultsPageTextlocator = "//div[normalize-space(text()='Live Results')and @id='live-results'][1]";
    public static final String liveResultsPageText = "live Results";

    public static final String jobOpportunitiesDropDown = "//a[@aria-haspopup='true']//span[@class='avia-menu-text'][normalize-space()='Job Opportunities']";
    public static final String callCentersLocator = "(//span[text()='Call Center Opportunities'])[1]";
    public static final String callCenterTextLocator = "(//h1[text()='Every day is an adventure.'])[1]";

    public static final String retailOpportunitiesLocator = "(//span[text()='Retail Opportunities'])[1]";
    public static final String retailOpportunitiesExpectedText = "//h1[text()='//h1[text()='Retail Opportunities'][1]'][1]";


    //----------------------Search box--------------------
    public static final String youSearchedFor = "//h1[1]";
    //------------------Services--------------
    public static final String servicesTab = "//li[@class='td-dropdown active']";
    public static final String serviceSelectorsHub = "//body/div[@class='td-header-nav-top-message']/div" +
            "[@class='td_rq_header-nav td-header-nav']/header[@class='td-header-desktop']/div[@class='td-nav-primary']/div[@class='td-container']/div[@class='td-section-left']/nav/ul/li[2]";
    public static final String onlineBankingActualText = "//h1[normalize-space(text()='Online Banking')]";
    public static final String onlineBanking = "(//a[text()='Online Banking'])[1]";
    public static final String servicesBtnLocator = "#td-desktop-nav-dropdown-link-3";//css
    public static final String servicesTabHover = "(//a[normalize-space(text()='Services')])[1]";
    public static final String serviceArrowIcon = "(//span[@class='td-icon collapse'])[1]";
    public static final String serviceDD = "(//li[@class='td-dropdown td-dropdown-active'])[1]";
    //a[@id='td-desktop-nav-dropdown-link-3']
    public static final String svcTabNew="//a[@aria-haspopup='true'][normalize-space()='Services']";
    public static final String svcTab2="(//a[@aria-haspopup='true'][normalize-space(text()='Services')])[3]";
    //--------------Student Banking
    public static final String studentBanking = "(//a[contains(text(),'Student Banking')])[1]";
    public static final String studentbanking2="//ul[@class='td-dropdown-content']//*[@href='/us/en/personal-banking/student-services/']";
    public static final String studentActualTextLocater = "(//h1[normalize-space(text()='Student Checking & Other Services')])";
    public static final String studentBankingExpectedText = "Student Checking & Other Services";
    //------------------Cross border
    public static final String crossBordertab = "(//a[(text()='Cross Border')])[1]";
    public static final String tdCrossBorder = "(//h1[normalize-space(text()='TD Cross-Border Banking')])[1]";
    //------------------Travel Tips------------
    public static final String travelTips = "(//a[contains(text(),'Travel Tips')])[1]";
    public static final String internationalTravActualTextLocater = "(//h1[normalize-space(text()='International Travel Tips')])[1]";
    public static final String internationalTravExpectedText = "International Travel Tips";
    //------------Foreign Exchange--
    public static final String foreignExchange = "(//a[contains(text(),'Foreign Exchange Services')])[1]";
    public static final String foreignExchangeActualText = "(//h1[normalize-space(text()='Foreign Exchange Services')])[1]";
    public static final String foreignExchangeExpectedText = "Foreign Exchange Services";
    public static final String orderOnline="(//button[text()='Order online'])[1]";;
    public static final String orderCurrency="//a[normalize-space()='Order Currency']";
    public static final String orderCurrencyLink="//a[@href='/shop/en/tdbanknotes/bank-notes']";
    public static final String orderCurrencyLink1="//a[normalize-space()='Order Currency']";
    public static final String whereRUGoingTextBox="//select[@name='destinationCurrency']";
    public static final String austria="//option[text()='Austria (EUR)']";
    //public static final String austria
    public static final String dollarToBeExchangedBox="//input[@id='td-us-currency']";
    public static final String totalAmountVerified="//span[@class='td-us-currency-value']";
    public static final String foreignCurrencyAmount="//input[@id='td-foreign-currency']";
    public static final String austeriadisplayverificationlocaer="(//strong[text()='Austria (EUR)'])[1]";
    public static final String europe="(//strong[normalize-space(text()='Europe (EUR)')])[1]";
    public static final String europeNew="(//strong[@class='td-foreign-currency-summary-location'])[1]";

    public static final String currencyAddToCart="(//button[text()='Add To Cart'])[1]";
    public static final String successfullyAddedCartMessage="(//div[text()='The item has been successfully added to your shopping cart.'])[1]";
    public static final String successfulMessage="(//div[@class='toast toast-success'])[1]";
    public static final String cartIcon="(//span[text()='Cart'])[1]";
    public static final String usdAmountbox="//input[@id='td-us-currency-update_8870098']";
    public static final String usdAmntBx="//input[@placeholder='Cost in USD']";
    public static final String foreignAmountBox="(//input[@class='form-control td-currency-input text-right td-destination-currency-update'])[1]";
    public static final String forAmtBx="//input[@placeholder='Foreign currency amount']";
      public static final String updateCart="//button[@id='td-update-cart_8870098']";
      public static final String updtCart="(//button[@class='btn btn-block td-button-clear-green td-update-cart-button'])[1]";
      public static final String cartUpdatedMessage="(//div[text()='Your cart was successfully updated.'])[1]";
      public static final String checkoutCurrencyOrder="//button[@id='tdGuestShopperContinue']";
      public static final String checkoutPageTitle="Checkout | TD Foreign Exchange";
      public static final String prefixDD="//select[@id='td-customer-prefix']";
      public static final String prefixAttorney="//option[contains(text(),'Attorney')]";
      public static final String firstName="//input[@id='WC__shippingCreateEditArea_firstName_1']";
      public static final String lastName="//input[@id='WC__shippingCreateEditArea_lastName_1']";
      public static final String email="//input[@id='WC__shippingCreateEditArea_email1_1']";
      public static final String verificationButton="//a[@id='WC_UnregisteredCheckout_links_4']";
      public static final String personalVerificationText="//h1[text()='Personal Verification']";



}

//    public static final String
//    public static final String
//    public static final String


