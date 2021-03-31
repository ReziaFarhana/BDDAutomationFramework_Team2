package homepage;

public class HomePageWebElement {
    // WebElement class for Locators only and some other properties

    public static final String memberSupportHomePageLink="/html/body/div[2]/div/nav/div/ul/li[2]/div/button";
    public static final String dropDownBlock = "div[class='megamenu__dropdown'] div[class='row row__wrapper'] ";
    public static final String accountManagementLink = "/html/body/div[2]/div/nav/div/ul[1]/li[2]/div[2]/div/div/section/ul/li[1]/div[1]/button";
    public static final String memberWebsiteLink="li[class='megamenu__secondary--item megamenu__secondary--clicklink secondaryblock--active'] li:nth-child(1) a:nth-child(1)";
    public static final String textMemberLogin="//h1[1]";
    public static final String clickOnFindDr="//ul[@class='megamenu__tertiary--main']//a[@class='megamenu__tertiary--link link__text--inline--tertiary'][normalize-space()='Find a doctor']";
    public static final String verifyFindDr="h1[class=' title__hero']";
    public static final String clickOnPharmacyLink="//span[contains(@class,'btn--secondary')]";
    public static final String verifyPharmacyPage="//a[.='Aetna Pharmacy Home']";
    public static final String selectPharmacyType="#pharmacy_spec_prctc_cd";
    public static final String clickOnZIPCode="//div[@id='geo_attr_pharmacy_div']//input[1]";
    public static final String clickOnCityRadio="//div[@id='geo_attr_pharmacy_div']//input[2]";
    public static final String enterAZIPCode="#zipcode";
    public static final String distanceInMile="#input_distance_div > select";
    public static final String selectPlan="#pharmacy_plans";
    public static final String clickOnSearchButton="advanced_submit";
    public static final String verifySearchText="td[id='your_plan_text_rd'] b";
    public static final String enterCityName="//input[@id='city']";
    public static final String selectAState="//select[@id='state']";
    public static final String clickOnSearchByName="//span[normalize-space()='Search by Name']";
    public static final String enterPharmacyName="#pharmacy_pharmacy_name";
    public static final String selectDistanceInMiles="#miles";  //120
    public static final String getClickOnSearchButton2="button[id='advanced_submit'] span";
    public static final String verfiyPharmacyName="//td[normalize-space()='Pharmacy Name:']";
    public static final String clickOnAdvanceSearch="//span[normalize-space()='Advanced Search']";
    public static final String verifyTextOfSearch="//tr[@id='changeMySearchSettinsTr']//h2[contains(text(),'Search Settings')]";
    public static final String findMedicineCost="//ul[@class='megamenu__tertiary--main']//a[@class='megamenu__tertiary--link link__text--inline--tertiary'][normalize-space()='Find medicine and costs']";
    public static final String medicareOption= "//span[normalize-space()='Explore Medicare options']";
    public static final String verifyAetnaMedicarePage="//a[@class='megamenu__logo logo--cobranded']//img[@alt='Aetna Medicare Solutions heart logo']";

    public static final String fNameEmailSubscription="#FirstName";
    public static final String lNameEmailSubscription="#LastName";
    public static final String emailAddressSubscription="#Email";
    public static final String subscriptionVerificationText="//p[contains(text(),'Thanks! Be sure to check your email for periodic u')]";
    public static final String clickOnSignUpButton="input[value='Sign up']";
//    public static final String productName="";
//    public static final String productName="";
//    public static final String productName="";







}
