package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import constants.TestData;
import pages.GUIElementsPage;

public class TC01_TextFieldsTest extends BaseTest {

    @Test
    public void verifyTextFields() {

        // Create Page Object
        GUIElementsPage page =new GUIElementsPage(driver);

        page.enterName(TestData.NAME);

        page.enterEmail(TestData.EMAIL);

        page.enterPhone(TestData.PHONE);

        page.enterAddress(TestData.ADDRESS);

        Assert.assertEquals(page.getNameValue(),TestData.NAME,"Name verification failed");

        Assert.assertEquals(page.getEmailValue(),TestData.EMAIL,"Email verification failed");

        Assert.assertEquals( page.getPhoneValue(),TestData.PHONE,"Phone verification failed");

        Assert.assertEquals(page.getAddressValue(),TestData.ADDRESS,"Address verification failed");
    }
}
