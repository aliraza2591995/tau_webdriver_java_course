package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;
import static org.testng.Assert.*;

public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickJSAlertButton();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Alert was not accepted correctly");
        System.out.println(alertsPage.getResult());
    }

    @Test
    public void testDismissConfirmation() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickJSConfirmButton();
        alertsPage.dismissConfirmation();
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "Confirmation was not dismissed correctly");
        System.out.println(alertsPage.getResult());
    }
    @Test
    public void testPromptText(){
        String text = "Ali Raza";
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickJSPrompt();
        alertsPage.enterPromptText(text);
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Prompt input failed");
        System.out.println(alertsPage.getResult());
    }
}
