package homepage;

public class HomePageWebElement {
    // WebElement class for Locators only and some other properties

   // public static final String shopForAPlanLocator = "//div[starts-with(@class,'megamenu')]/nav[@class='megamenu__navigation']//button[.='Shop for a plan']";//xpath
    public static final String shopForAPlanLocator = "public static final String shopForAPlan = \"(//button[text()='Shop for a plan'])[1]";//xpath
    public static final String healthCoverageLocator = "(//div[starts-with(@class,'megamenu__secondary')])[2]";
    public static final String  studentPlansLocator = "Student pla";//partial Link
//    public static final String validateSHWelcomeTextLocator = "//h1[.='Welcome to Aetna Student Health']";
    public static final String validateSHWelcomeTextLocator = "//h2[.='Helpful links']";
    public static final String plansThroughAnEmployerLocator = "//ul[@class='megamenu__tertiary--main']//a[contains(.,'Plans through an employer')]";
    public static final String plansEmployerTextLocator = " title__hero";//class
    public static final String dentalTextLocator = "//h1[contains(text(),'Dental insurance plans for individuals and familie')]";//xpath
    public static final String findDoctorLocator = "(//ul[starts-with(@class,'megamenu')]//a[starts-with(@class,'megamenu')][normalize-space()='Find a doctor'])[2]";//xpath
    public static final String covidAlertTextLocator = "//h2[normalize-space()='COVID-19 Alert']";//xpath
    public static final String planForAnEmployee = "//a[normalize-space()='Plan from an employer']";
    public static final String searchingAsMemberTextLocator = "texth2_194";//id
    public static final String visionInsurancePlanText = "//h1[normalize-space()='Vision insurance for individuals']";//xpath
    public static final String findADentistLocator = "(//ul[starts-with(@class,'megamenu')]//a[starts-with(@class,'megamenu')][normalize-space()='Find a dentist'])[1]";//xpath
    public static final String medicare = "(//button[text()='Medicare'])[1]";
    public static final String browseAetnaMedicarePlan = "(//a[text()='Browse Aetna Medicare plans '])[1]";
    public static final String shopForAPlan = "(//button[text()='Shop for a plan'])[1]";

    public static final String medicarePlans = "Medicare Plans - Medicare Advantage, Part D, and Supplement Plans | Aetna Medicare";
    public static final String medicareAdvantagePlans = "(//span[text()='Medicare Advantage plans'])[1]";
    public static final String zipCodeForMedicareAdvantage = "//input[@title='Enter a valid 5-digit ZIP code']";
    public static final String view2021Plans = "(//span[text()='View 2021 plans'])[1]";
    public static final String specialEnrollmentPeriodCheckBox = "(//input[@id='SEPReasons_132_1'])";
    public static final String verifyPlanListTitle = "Aetna Medicare - Plan List";
    public static final String addtoCartLocator = "(//div[@class='col-12 col-md-9']/div[1]//div[@class='p-0 pb-1']//button[starts-with(@class,'btn')])[2]";

    public static final String sortEstimatedCostDD = "(//span[text()='Total Estimated Cost'])[1]";
    public static final String planPremiumLowToHighDD = "//button[contains(text(),' Plan Premium (Low to High)')]";
    public static final String medicareStarRatingDD = "//button[contains(text(),'Medicare Star Ratings')]";
    public static final String addToCartMedicarePlan = "(//button[contains(text(),'Add to cart ')])[2]";
    public static final String verifyCartForMedicarePlan = "Aetna Medicare - My cart";
    public static final String actualMyCartText = "//h1[text()='My cart']";
    public static final String expectedMyCartText = "My cart";
    public static final String optionalAddOnDentalAndVision = "(//button[text()=' Add '])[2]";
    public static final String newAetnaRadioButton = "//input[@id='non_member']";

    public static final String proceedToCheckoutMedicarePlan = "(//span[text()='Proceed to checkout'])";
    public static final String verifyTotalMonthlyPremium = "(//h4[text()='Total monthly premium'])";
    public static final String verifyPersonalInfoTextLocator = "//h1[contains(text(),'Personal Information')]";
    public static final String firstNamePersonalForm = "(//input[@class='DFLeft' and @name='ApplicantFirstName'])";
    public static final String middleInitalPersonalForm = "(//input[@class='DFLeft' and @name='ApplicantMiddleInitial'])";
    public static final String lastNamePersonalForm = "(//input[@class='DFLeft' and @name='ApplicantLastName'])";
    public static final String birthdatePersonalForm = "(//input[@class='DFLeft' and @name='ApplicantBirthDate'])";
    public static final String genderFemaleSelectLocator = "//label[text()='Female']";
    public static final String primaryPhoneNumPersonalForm = "(//input[@name='ApplicantPhone_hopetemp'])";
    public static final String emailAddPersonalForm = "(//input[@name='ApplicantEmailAddress'])";
    public static final String AddressLocator = "//div[@class='DFCLeft DFFullWidth GroupDiv']/div[8]//div[4]//input[@class='DFLeft']";
    public static final String contactAetnaText = "(//span[contains(text(),'Contact Aetna')])[1]'";
    public static final String mailingOptionTextLocator = "//h3[.='Mailing Address (Optional)']";

}
