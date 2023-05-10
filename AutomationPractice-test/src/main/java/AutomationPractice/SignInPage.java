package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

import java.time.Duration;

public class SignInPage {

    @FindBy(id = "SubmitCreate")
    private WebElement registerMenuElement = null;

    @FindBy(id="email_create")
    private WebElement emailElement;

    public  SignInPage setEmail(String email){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("email_create"),
                Duration.ofSeconds(10));
        emailElement.sendKeys(email);
        return this;
    }

    public RegisterPage selectRegisterMenu(){

        TestApp.getInstance().waitUntilNextElementAppears(By.id("SubmitCreate"),
                Duration.ofSeconds(10));
        registerMenuElement.click();

        return PageFactory.initElements(TestApp.getInstance().getDriver(),
                RegisterPage.class);

    }

}
