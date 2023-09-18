package horizontalSlider;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;
import static org.testng.Assert.*;

import java.security.Key;

public class SliderTests extends BaseTests {
    @Test
    public void testRightArrow(){
        String value = "4";
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.moveSlider(value);
        System.out.println("Slider value: " + horizontalSliderPage.getResult());
        assertEquals(horizontalSliderPage.getResult(), value, "Slider value is not correct");
    }
}
