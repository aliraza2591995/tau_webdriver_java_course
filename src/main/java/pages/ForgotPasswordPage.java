package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrieveButton = By.xpath("//i[contains(@class, 'icon-2x icon-signin')]");
    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public EmailSentPage clickRetrieveButton(){
        driver.findElement(retrieveButton).click();
        return new EmailSentPage(driver);
    }
}
