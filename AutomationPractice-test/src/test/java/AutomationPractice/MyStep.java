package AutomationPractice;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

public class MyStep {

    HomePage homePage;
    SignInPage signInPage;
    RegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage;
    @Given("User enter Email Address as {string}")
    public void setup() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = PageFactory.initElements
                (TestApp.getInstance().getDriver(), HomePage.class);
        signInPage = homePage.selectSignMenu();
    }

    @Then("User click on create an account button")
    public void userClickOnCreateAnAccountButton() {
    }

    @Given("User select title")
    public void userSelectTitle() {
    }

    @And("User enter first name as {string}")
    public void userEnterFirstNameAs(String arg0) {
    }

    @And("User enter last name as {string}")
    public void userEnterLastNameAs(String arg0) {
    }

    @And("User enter email as {string}")
    public void userEnterEmailAs(String arg0) {
    }

    @And("User enter password as {string}")
    public void userEnterPasswordAs(String arg0) {
    }

    @And("User select date")
    public void userSelectDate() {
    }

    @And("User select month")
    public void userSelectMonth() {
    }

    @And("User select year")
    public void userSelectYear() {
    }

    @And("User select Sign up for our newsletter!")
    public void userSelectSignUpForOurNewsletter() {
    }

    @And("User select Receive special offers from our partners!")
    public void userSelectReceiveSpecialOffersFromOurPartners() {
    }

    @And("User enter firstname as {string}")
    public void userEnterFirstnameAs(String arg0) {
    }

    @And("User enter lastname as {string}")
    public void userEnterLastnameAs(String arg0) {
    }

    @And("User enter company as {string}")
    public void userEnterCompanyAs(String arg0) {
    }

    @And("User enter addressOne as {string}")
    public void userEnterAddressOneAs(String arg0) {
    }

    @And("User enter addressTwo as {string}")
    public void userEnterAddressTwoAs(String arg0) {
    }

    @And("User enter city as {string}")
    public void userEnterCityAs(String arg0) {
    }

    @And("User select state")
    public void userSelectState() {
    }

    @And("User enter postal code as {string}")
    public void userEnterPostalCodeAs(String arg0) {
    }

    @And("User select country")
    public void userSelectCountry() {
    }

    @And("User enter additional information as {string}")
    public void userEnterAdditionalInformationAs(String arg0) {
    }

    @And("User enter home phone as {string}")
    public void userEnterHomePhoneAs(String arg0) {
    }

    @And("User enter mobile phone as {string}")
    public void userEnterMobilePhoneAs(String arg0) {
    }

    @And("User enter alias as {string}")
    public void userEnterAliasAs(String arg0) {
    }

    @When("User clicks on Register")
    public void userClicksOnRegister() {
    }

    @Then("Salutation message will display as \"Welcome to your account. Here you can manage all of your personal information and orders.")
    public void salutationMessageWillDisplayAsWelcomeToYourAccountHereYouCanManageAllOfYourPersonalInformationAndOrders() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }
}
