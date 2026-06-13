package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC09_MouseHoverTest extends BaseTest {

    @Test
    public void verifyMouseHover() {

        GUIElementsPage page =
                new GUIElementsPage(driver);

        page.performMouseHover();
    }
}
