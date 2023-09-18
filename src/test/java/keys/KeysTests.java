package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.KeyPressesPage;
import static org.testng.Assert.*;

public class KeysTests extends BaseTests {
    @Test
    public void testBackspace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE");
        System.out.println(keyPressesPage.getResult());
    }

    @Test
    public void Pi(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPi();
        assertEquals(keyPressesPage.getResult(), "You entered: 4");
        System.out.println(keyPressesPage.getResult());
    }
}
