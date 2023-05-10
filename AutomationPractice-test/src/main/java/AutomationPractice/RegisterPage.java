package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

import java.time.Duration;

public class RegisterPage {

    @FindBy(id="id_gender2")
    private  WebElement titleElement;

    public RegisterPage selectTitle(){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("id_gender2"),
                Duration.ofSeconds(10));
        titleElement.click();
        return this;
    }

    @FindBy(id="customer_firstname")
    private WebElement firstNameElement;

    public RegisterPage setFirstname(String firstName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("customer_firstname"),
                Duration.ofSeconds(10));
        firstNameElement.sendKeys(firstName);
        return this;
    }

    @FindBy(id="customer_lastname")
    private WebElement lastNameElement;

    public RegisterPage setLastName(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("customer_firstname"),
                Duration.ofSeconds(10));
        lastNameElement.sendKeys(lastName);
        return this;
    }


    @FindBy(name="email")
    private WebElement emailElement;

    public RegisterPage setEmail(String email){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("email"),
                Duration.ofSeconds(10));
        emailElement.sendKeys(email);
        return this;
    }

    @FindBy(id="passwd")
    private  WebElement passwordElement;

    public RegisterPage setPassword(String password){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("passwd"),
                Duration.ofSeconds(10));
        passwordElement.sendKeys(password);
        return this;
    }

    @FindBy(name="days")
    private WebElement dateElement;

    public RegisterPage selectDate(String date){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("days"),
                Duration.ofSeconds(10));
        dateElement.sendKeys(date);
        return this;
    }

    @FindBy(id="months")
    private WebElement monthElement;

    public RegisterPage selectMonth(String month){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("months"),
                Duration.ofSeconds(10));
        monthElement.sendKeys(month);
        return this;
    }

    @FindBy(id="years")
    private WebElement yearElement;

    public RegisterPage selectYear(String year){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("years"),
                Duration.ofSeconds(10));
        yearElement.sendKeys(year);
        return this;
    }

    @FindBy(id="newsletter")
    private WebElement newsLetterElement;

    public RegisterPage clickNewsLetter(){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("newsletter"),
                Duration.ofSeconds(10));
        newsLetterElement.click();
        return this;
    }

    @FindBy(id="optin")
    private WebElement receiveOffersElement;

    public RegisterPage clickReceiveOffers(){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("optin"),
                Duration.ofSeconds(10));
        receiveOffersElement.click();
        return this;
    }

    @FindBy(id="firstname")
    private WebElement firstNameOneElement;

    public RegisterPage setFirstnameOne(String firstName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("firstname"),
                Duration.ofSeconds(10));
        firstNameOneElement.sendKeys(firstName);
        return this;
    }

    @FindBy(id="lastname")
    private WebElement lastNameOneElement;

    public RegisterPage setLastNameOne(String lastName){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("lastname"),
                Duration.ofSeconds(10));
        lastNameOneElement.sendKeys(lastName);
        return this;
    }

    @FindBy(id="company")
    private WebElement companyElement;

    public RegisterPage setCompany(String company){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("company"),
                Duration.ofSeconds(10));
        companyElement.sendKeys(company);
        return this;
    }

    @FindBy(id="address1")
    private WebElement AddressOneElement;

    public RegisterPage setAddressOne(String addressOne){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("address1"),
                Duration.ofSeconds(10));
        AddressOneElement.sendKeys(addressOne);
        return this;
    }

    @FindBy(id="address2")
    private WebElement AddressTwoElement;

    public RegisterPage setAddressTwo(String addressTwo){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("address2"),
                Duration.ofSeconds(10));
        AddressTwoElement.sendKeys(addressTwo);
        return this;
    }
    @FindBy(name="city")
    private WebElement cityElement;

    public RegisterPage setCity(String city){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("city"),
                Duration.ofSeconds(10));
        cityElement.sendKeys(city);
        return this;
    }

    @FindBy(id="id_state")
    private WebElement stateElement;

    public RegisterPage selectState(String state){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("id_state"),
                Duration.ofSeconds(10));
        stateElement.sendKeys(state);
        return this;
    }

    @FindBy(id="postcode")
    private WebElement postalCodeElement;

    public RegisterPage setPostalCode(String postalCode){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("postcode"),
                Duration.ofSeconds(10));
        postalCodeElement.sendKeys(postalCode);
        return this;
    }

    @FindBy(id="id_country")
    private WebElement countryElement;

    public RegisterPage selectCountry(String country){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("id_country"),
                Duration.ofSeconds(10));
        countryElement.sendKeys(country);
        return this;
    }

    @FindBy(id="other")
    private WebElement additionalInformationElement;

    public RegisterPage setAdditionalInformation(String additionalInformation){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("other"),
                Duration.ofSeconds(10));
        additionalInformationElement.sendKeys(additionalInformation);
        return this;
    }

    @FindBy(id="phone")
    private WebElement homePhoneElement;

    public RegisterPage setHomePhone(String homePhone){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("phone"),
                Duration.ofSeconds(10));
        homePhoneElement.sendKeys(homePhone);
        return this;
    }

    @FindBy(id="phone_mobile")
    private WebElement mobilePhoneElement;

    public RegisterPage setMobilePhone(String mobilePhone){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("phone_mobile"),
                Duration.ofSeconds(10));
        mobilePhoneElement.sendKeys(mobilePhone);
        return this;
    }

    @FindBy(id="alias")
    private WebElement aliasElement;

    public RegisterPage setAlias(String alias){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("alias"),
                Duration.ofSeconds(10));
        aliasElement.sendKeys(alias);
        return this;
    }

    @FindBy(id="submitAccount")
    private WebElement submitElement;

    public RegisterSuccessPage submit(){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("submitAccount"),
                Duration.ofSeconds(10));
        submitElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(),
                RegisterSuccessPage.class);
    }

}
