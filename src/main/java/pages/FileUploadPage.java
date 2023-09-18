package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By fileUploadResult = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    /** Provides complete filepath and clicks upload button
    * @param fileUploadPath The complete path of the file to upload
    **/
    public void uploadFile(String fileUploadPath){
        driver.findElement(chooseFile).sendKeys(fileUploadPath);
        clickUploadButton();
    }
    public String getResult(){
        return driver.findElement(fileUploadResult).getText();
    }
}
