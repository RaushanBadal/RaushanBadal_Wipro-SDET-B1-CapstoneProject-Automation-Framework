package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC07_SliderTest extends BaseTest {

    @Test
    public void verifySlider() {

        GUIElementsPage page =
                new GUIElementsPage(driver);

        page.moveSlider();
    }
}
