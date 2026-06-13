package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC03_CheckBoxTest extends BaseTest {

    @Test
    public void verifyCheckBoxes() {

        GUIElementsPage page =new GUIElementsPage(driver);

        page.selectMonday();
        page.selectWednesday();
        page.selectFriday();

        Assert.assertTrue(page.isMondaySelected());

        Assert.assertTrue(page.isWednesdaySelected());

        Assert.assertTrue(page.isFridaySelected());
    }
}