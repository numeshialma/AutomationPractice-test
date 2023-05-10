package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestApp;

import java.time.Duration;

public class RegisterSuccessPage {

    @FindBy(xpath = "//*[contains(text(),'Welcome')]")
    private WebElement salutationMessageElement;

    public String getSalutationMessage(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[contains(text(),'Welcome')]"),
                Duration.ofSeconds(10));

        return salutationMessageElement.getText();
    }

}

//Welcome to your account. Here you can manage all of your personal information and orders.