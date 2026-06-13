package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC10_DoubleClickTest extends BaseTest {

    @Test
    public void verifyDoubleClick() {

        GUIElementsPage page =
                new GUIElementsPage(driver);

        page.performDoubleClick();

        Assert.assertEquals(
                page.getField2Text(),
                page.getField1Text());
    }
}
