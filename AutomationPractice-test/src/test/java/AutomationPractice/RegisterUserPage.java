package AutomationPractice;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class RegisterUserPage {

    HomePage homePage;
    SignInPage signInPage;
    RegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage;

    @BeforeMethod
    public void setUp() {
        
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage= PageFactory.initElements(TestApp.getInstance().getDriver(),
                HomePage.class);
        signInPage=homePage.selectSignMenu();
        signInPage=signInPage.setEmail("num11123412344@gmail.com");
        registerPage=signInPage.selectRegisterMenu();
        
    }



    @Test
    public void testRegisterNewUser(){

        String firstName="Amali";
        String lastName="Rathnayaka";

        registerSuccessPage= registerPage.selectTitle()
                .setFirstname(firstName)
                .setLastName(lastName)
                .setPassword("Amali@123")
                .selectDate("6")
                .selectMonth("March")
                .selectYear("1992")
                .clickNewsLetter()
                .clickReceiveOffers()
                .setFirstnameOne(firstName)
                .setLastNameOne(lastName)
                .setCompany("ABC Company")
                .setAddressOne("main street")
                .setAddressTwo("Main Road")
                .setCity("Abc")
                .selectState("Florida")
                .setPostalCode("10111")
                .selectCountry("United States")
                .setAdditionalInformation("Hi ")
                .setHomePhone("1234567891")
                .setMobilePhone("0123456789")
                .setAlias("Abcd")
                .submit();

        Assert.assertEquals(registerSuccessPage.getSalutationMessage(),
                "Welcome to your account. Here you can manage all of your personal information and orders.",
                "Failed to create new user.");



    }

    @AfterMethod
    public void tearDown() {
        TestApp.getInstance().closeBrowser();
    }
}
