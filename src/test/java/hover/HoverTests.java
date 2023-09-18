package hover;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HoversPage;
import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        HoversPage hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(0);
        System.out.println(caption.getTitle());
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title is incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}