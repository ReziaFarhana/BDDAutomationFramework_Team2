package aetna;

public class WebElement {

    public static final String aetnaURL = "https://www.aetna.com/individuals-families.html";
    public static final String contactUs = "//a[@target='_self'][normalize-space()='Contact us']";
    //public static final String contactUs2 = "(//a[text()='Contact us'])[1]";
    public static final String logo = "//a[@href='https://www.aetna.com/' ][1]";
    public static final String homePageTitle = "Individual & Family Health Insurance Plans | Aetna";

    //---------------------------Shop For A Plan--------------------
    public static final String shopForAPlan = "(//button[text()='Shop for a plan'])[1]";
    public static final String medicare = "(//button[text()='Medicare'])[1]";
    public static final String browseAetnaMedicarePlan = "(//a[text()='Browse Aetna Medicare plans '])[1]";
    public static final String medicarePlans = "Medicare Plans - Medicare Advantage, Part D, and Supplement Plans | Aetna Medicare";
    public static final String medicareAdvantagePlans = "(//span[text()='Medicare Advantage plans'])[1]";
    public static final String zipCodeForMedicareAdvantage = "//input[@title='Enter a valid 5-digit ZIP code']";
    public static final String view2021Plans = "(//span[text()='View 2021 plans'])[1]";

    public static final String verifyPlanListTitle = "Aetna Medicare - Plan List";
    //--------------------------medicare plan filters-------------
    public static final String sortEstimatedCostDD = "(//span[text()='Total Estimated Cost'])[1]";
    public static final String planPremiumLowToHighDD = "//button[contains(text(),' Plan Premium (Low to High)')]";
    public static final String medicareStarRatingDD = "//button[contains(text(),'Medicare Star Ratings')]";
    public static final String addToCartMedicarePlan = "(//button[contains(text(),'Add to cart ')])[2]";
    public static final String verifyCartForMedicarePlan = "Aetna Medicare - My cart";
    public static final String actualMyCartText = "//h1[text()='My cart']";
    public static final String expectedMyCartText = "My cart";
    //-------------------medicare cart-----------------------
    public static final String newAetnaRadioButton = "//input[@id='non_member']";
    public static final String optionalAddOnDentalAndVision = "(//button[text()=' Add '])[2]";
    public static final String proceedToCheckoutMedicarePlan = "(//span[text()='Proceed to checkout'])";
    public static final String verifyTotalMonthlyPremium = "(//h4[text()='Total monthly premium'])";
    public static final String verifyPersonalInfoTextLocator = "//h1[contains(text(),'Personal Information')]";
    //----------medicare Doctors-----------------------
    public static final String doctor = "(//a[@class='megamenu__tertiary--link link__text--inline--tertiary' and text()='Find a doctor '])[1]";
    public static final String locationForPurchaseYourselfPlan = "//input[@id='medZip']";
    public static final String sliderButtonForPurchaseYourselfPlan = "//span[@class='rz-pointer rz-pointer-min']";
    public static final String purchaseYourselfPlans2021 = "(//button[@class='primaryPurple BtnWidth mgbutton w400'])[1]";
    public static final String suffolkCountyDD = "//option[@label='SUFFOLK, NY']";
    public static final String countyDD = "//select[@class='dropdown width220px member_dropdown ng-pristine ng-valid ng-empty ng-touched']";
    public static final String skipPlanSelection = "//div[@id='skipTileDiv']";
    public static final String urgentCare = "//a[contains( text(),'Urgent Care')]";
    //------personal Information form-----
    public static final String firstNamePersonalForm = "(//input[@class='DFLeft' and @name='ApplicantFirstName'])";
    public static final String middleInitalPersonalForm = "(//input[@class='DFLeft' and @name='ApplicantMiddleInitial'])";
    public static final String lastNamePersonalForm = "(//input[@class='DFLeft' and @name='ApplicantLastName'])";
    public static final String birthdatePersonalForm = "(//input[@class='DFLeft' and @name='ApplicantBirthDate'])";
    public static final String genderFemaleSelectTab = "(//label[text()='Female'])";
    public static final String genderMaleSelectTab = "(//label[text()='Male'])";
    public static final String primaryPhoneNumPersonalForm = "(//input[@name='ApplicantPhone_hopetemp'])";
    public static final String emailAddPersonalForm = "(//input[@name='ApplicantEmailAddress'])";
    public static final String specialEnrollmentPeriodCheckBox = "(//input[@id='SEPReasons_132_1'])";
    public static final String contactAetnaText = "(//span[contains(text(),'Contact Aetna')])[1]'";
    //-----Who We Are
    public static final String whoWeAreDD = "(//*[@class='menuToggleItem megaMenu' ])[1]";
    public static final String ourValues = "//a[text()='Our values']";
    public static final String ourMission = "//h2[normalize-space(text())='Our mission']";
    //--healthcare reform
    public static final String healthCareReform = "(//a[text()='Healthcare reform'])[1]";
    public static final String healthCareReformActualText = "//h1[text()='Health Care Reform']";
    public static final String healthcareExpectedText="Health Care Reform";
    //--Initiative
    public static final String initiativesTab = "(//a[contains(text(),'Initiatives')])[1]";
    public static final String nationalInitiatives = "//a[normalize-space()='Find out more about our national initiatives']";
    public static final String nationalInitiativesPageTitle = "National Health Initiatives | Aetna";
    public static final String corporateResponsibility = "(//a[text()='Corporate responsibility'])[1]";
    public static final String doingBusinessWithUs = "(//a[text()='Doing business with us'])[1]";
    public static final String doingBUsinessWithUsTitlePage = "Doing Business With Us | Aetna";
    public static final String doingBusinessWithusText = "(//h1[contains(text(),'Doing Business with Us')])";
    //---Investor
    public static final String investorsTab = "(//a[contains(text(),'Investors')])[1]";
    public static final String healthSection = "(//a[normalize-space(text())='Health section'])[1]";
    public static final String investorsOverview = "(//a[text()='Investors overview'])[1]";
    public static final String investorInformation = "Investor Information";
    public static final String community = "(//a[text()='Community'])[1]";
    public static final String searchBoxLocator = "//input[@id='globalSearch']";
    public static final String searchresultTitle = "Search Results";
    public static final String communityTitlePage = "News & insights | CVS Health";
    public static final String companyValuesTitlePage = "Company Values | Aetna";
    public static final String aetnaHomePageTitle = "Individual & Family Health Insurance Plans | Aetna";
    public static final String aetnaSearchResultLocater = "//span[@class='redText']";
    public static final String searchButton = "(//input[@type='submit' and @class='search'])[1]";

    public static final String searchResult = "//*[@id=\"main\"]/div[1]/div[1]/div[3]/div[1]/p[1]/span";


}
