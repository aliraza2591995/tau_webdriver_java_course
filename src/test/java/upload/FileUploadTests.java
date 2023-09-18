package upload;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {
    protected String filePath = "C:/Users/hp/OneDrive/Desktop/Documents Required/Check Listv1.pdf";
    @Test
    public void fileUploadTest(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:/Users/hp/OneDrive/Desktop/Documents Required/Check Listv1.pdf");
        assertEquals(fileUploadPage.getResult(), "Check Listv1.pdf", "File upload fail");
        System.out.println("File uploaded: " + fileUploadPage.getResult());
    }
}