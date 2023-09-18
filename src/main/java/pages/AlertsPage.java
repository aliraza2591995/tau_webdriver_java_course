package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By jsAlert = By.xpath("//button[text()='Click for JS Alert']");
    private By JSConfirm = By.xpath("//button[text()='Click for JS Confirm']");
    private By JSPrompt = By.xpath("//button[text()='Click for JS Prompt']");
    private By AlertResult = By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickJSAlertButton(){
        driver.findElement(jsAlert).click();
    }
    public void clickJSConfirmButton(){
        driver.findElement(JSConfirm).click();
    }
    public void clickJSPrompt(){
        driver.findElement(JSPrompt).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void dismissConfirmation(){
        driver.switchTo().alert().dismiss();
    }
    public void enterPromptText(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(AlertResult).getText();
    }
}
