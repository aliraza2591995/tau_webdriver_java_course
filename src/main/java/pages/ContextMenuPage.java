package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By box = By.id("hot-spot");
    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public void rightClickBox(){
        Actions action = new Actions(driver);
        WebElement boxElement = driver.findElement(box);
        action.contextClick(boxElement).perform();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
