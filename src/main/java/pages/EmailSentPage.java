package pages;

import org.openqa.selenium.*;

public class EmailSentPage {
    private WebDriver driver;
    private By statusAlert = By.xpath("//h1");
    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}