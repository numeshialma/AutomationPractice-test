//package AutomationPractice;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import utils.TestApp;
//
//public class MyStepdefs {
//
//    HomePage homePage;
//    SignInPage signInPage;
//    RegisterPage registerPage;
//    RegisterSuccessPage registerSuccessPage;
//        @Given("^User enter Email Address as {string}$")
//    public void setUp(String arg0) {
//        TestApp.getInstance().openBrowser();
//        TestApp.getInstance().navigateToURL();
//        homePage = PageFactory.initElements
//                (TestApp.getInstance().getDriver(), HomePage.class);
//        signInPage = homePage.selectSignMenu();
//    }
//
//    @Then("^User click on create an account button$")
//    public void createAnAccount() {
//        registerPage=signInPage
//                .setEmail("num11123412364@gmail.com")
//                .selectRegisterMenu();
//    }
//
//    @And("User enter first name as {string}")
//    public void setFirstName(String firstName) {
//        registerPage=registerPage.setFirstname(firstName);
//    }
//
//    @And("User enter last name as {string}")
//    public void setLastName(String lastName) {
//        registerPage=registerPage.setLastName(lastName);
//    }
//
//    @And("User enter email as {string}")
//    public void setEnterEmail(String email) {
//        registerPage=registerPage.setEmail(email);
//    }
//
//    @And("User enter password as {string}")
//    public void setPassword(String password) {
//        registerPage=registerPage.setPassword(password);
//    }
//
//    @And("User select date")
//    public void selectDate(String date) {
//        registerPage=registerPage.selectDate(date);
//    }
//
//
//    @And("^User select year$")
//    public void selectYear(String year) {
//        registerPage=registerPage.selectYear(year);
//    }
//
//    @And("^User select Sign up for our newsletter!$")
//    public void selectNewsletter() {
//        registerPage=registerPage.clickNewsLetter();
//    }
//
//    @And("^User select Receive special offers from our partners!$")
//    public void selectOffers() {
//        registerPage=registerPage.clickReceiveOffers();
//    }
//
//
//    @And("^User select state$")
//    public void selectState(String state) {
//        registerPage=registerPage.selectState(state);
//    }
//
//
//    @And("^User select country$")
//    public void selectCountry(String country) {
//        registerPage=registerPage.selectCountry(country);
//    }
//
//
//    @When("^User clicks on Register$")
//    public void Register() {
//        registerSuccessPage=registerPage.submit();
//    }
//
//    @Then("^Salutation message will display as \"Welcome to your account. Here you can manage all of your personal information and orders.$")
//    public void verifyMessage() {
//        Assert.assertEquals(registerSuccessPage.getSalutationMessage(),
//                "Welcome to your account. Here you can manage all of your personal information and orders.",
//                "Failed to create New User :");
//    }
//
//
//    @Given("User enter Email Address as {string}")
//    public void setEmailAddress(String emailAddress) {
//            registerPage=registerPage.setEmail(emailAddress);
//    }
//
//    @Given("User select title")
//    public void selectTitle() {
//        registerPage=registerPage.selectTitle();
//    }
//
//    @And("User select month")
//    public void selectMonth(String month) {
//        registerPage=registerPage.selectMonth(month);
//    }
//
//    @And("User enter firstname as {string}")
//    public void setFirstnameAs(String firstnameAs) {
//        registerPage=registerPage.setFirstnameOne(firstnameAs);
//    }
//
//    @And("User enter lastname as {string}")
//    public void setLastnameAs(String lastnameAs) {
//        registerPage=registerPage.setLastNameOne(lastnameAs);
//    }
//
//    @And("User enter company as {string}")
//    public void setCompany(String company) {
//        registerPage=registerPage.setCompany(company);
//    }
//
//    @And("User enter addressOne as {string}")
//    public void setAddressOne(String addressOne) {
//        registerPage=registerPage.setAddressOne(addressOne);
//    }
//
//    @And("User enter addressTwo as {string}")
//    public void setAddressTwo(String addressTwo) {
//        registerPage=registerPage.setAddressTwo(addressTwo);
//    }
//
//    @And("User enter city as {string}")
//    public void setCity(String city) {
//        registerPage=registerPage.setCity(city);
//    }
//
//    @And("User enter postal code as {string}")
//    public void setPostalCode(String postalCode) {
//        registerPage=registerPage.setPostalCode(postalCode);
//    }
//
//    @And("User enter additional information as {string}")
//    public void setAdditionalInformation(String additionalInformation) {
//        registerPage=registerPage.setAdditionalInformation(additionalInformation);
//    }
//
//    @And("User enter home phone as {string}")
//    public void setHomePhone(String homePhone) {
//        registerPage=registerPage.setHomePhone(homePhone);
//    }
//
//    @And("User enter mobile phone as {string}")
//    public void setMobilePhone(String mobilePhone) {
//        registerPage=registerPage.setMobilePhone(mobilePhone);
//    }
//
//    @And("User enter alias as {string}")
//    public void setAlias(String alias) {
//        registerPage=registerPage.setAlias(alias);
//    }
//}