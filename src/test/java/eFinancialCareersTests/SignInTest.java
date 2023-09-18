package eFinancialCareersTests;

import eFinancialCareersPages.HomePage;
import eFinancialCareersPages.JobSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SignInTest extends BaseTest {
    @Test
    public void testSignIn() {
        homepage.clickSignIn();
        System.out.println(homepage.getOverlayText());
        assertEquals(homepage.getOverlayText(), "Welcome to your next opportunity", "Didn't clicked signIn button correctly");
        homepage.enterEmail("aliomessi.19@gmail.com");
        homepage.enterPassword("Aliraza.10");
    }
}