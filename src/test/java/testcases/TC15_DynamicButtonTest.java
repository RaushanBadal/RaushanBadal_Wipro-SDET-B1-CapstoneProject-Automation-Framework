package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC15_DynamicButtonTest
        extends BaseTest {

    @Test
    public void verifyDynamicButton() {

        GUIElementsPage page =
                new GUIElementsPage(driver);

        Assert.assertTrue( page.isDynamicButtonDisplayed(),"Dynamic Button is not displayed");

        // START → STOP
        page.clickAndWaitForStateChange();

        // STOP → START
        page.clickAndWaitForStateChange();

        System.out.println(

                "START -> STOP -> START sequence completed successfully");
    }
}
