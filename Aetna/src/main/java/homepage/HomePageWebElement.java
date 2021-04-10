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

}
