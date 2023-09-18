package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;
import static org.testng.Assert.*;

public class ForgotPasswordTest extends BaseTests {
    private String email = "ali@example.com";
    @Test
    public void testForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmailField(email);

        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrieveButton();
        assertTrue(emailSentPage.getAlertText().contains("Internal Server Error"), "Alert text is incorrect");
    }
}