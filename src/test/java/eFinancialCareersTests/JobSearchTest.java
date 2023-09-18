package eFinancialCareersTests;

import eFinancialCareersPages.JobPage;
import eFinancialCareersPages.JobSearchPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class JobSearchTest extends BaseTest{
    private By hiddenElement = By.xpath("//*[@id=\"fsp-fileUpload\"]");

    @Test
    public void testJobSearch(){
        homepage.clickSignIn();
        System.out.println(homepage.getOverlayText());
        assertEquals(homepage.getOverlayText(), "Welcome to your next opportunity", "Didn't clicked login button correctly");

        homepage.enterEmail("aliomessi.19@gmail.com");
        homepage.enterPassword("Aliraza.10");
        homepage.clickProfileButton();
        System.out.println(homepage.checkLoginStatus());
        assertEquals(homepage.checkLoginStatus(), "Ali Raza", "Login failed");

        JobSearchPage jobSearchPage = homepage.jobSearch();
        System.out.println(jobSearchPage.getJobSearchResultText());
        assertTrue(jobSearchPage.getJobSearchResultText().contains("QA Engineer jobs"), "Job search failed");

        JobPage jobPage = jobSearchPage.clickJobLink();
        System.out.println(jobPage.checkJobPageStatus());
        assertEquals(jobPage.checkJobPageStatus(), "Apply now", "Click job link failed");

        jobPage.applyForJob();
        System.out.println(jobPage.checkJobApplicationModal());
        assertEquals(jobPage.checkJobApplicationModal(), "Your application", "Job application modal not found");

        jobPage.loadNewCV();

        System.out.println(jobPage.fileDropAreaText());
        assertEquals(jobPage.fileDropAreaText(), "Select Files to Upload", "File drop area not found");

        jobPage.unhiddenUploadElement(hiddenElement);

        jobPage.uploadCV();
    }
}