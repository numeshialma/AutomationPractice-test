package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

import java.time.Duration;

public class HomePage {

    @FindBy(linkText = "Sign in")
    private WebElement signMenuElement = null;

    public SignInPage selectSignMenu(){

        TestApp.getInstance().waitUntilNextElementAppears(By.linkText("Sign in"),
                Duration.ofSeconds(10));
        signMenuElement.click();

        return PageFactory.initElements(TestApp.getInstance().getDriver(),
                SignInPage.class);

    }


}
