package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC02_RadioButtonTest extends BaseTest {

    @Test
    public void verifyMaleRadioButton() {

        GUIElementsPage page =new GUIElementsPage(driver);

        page.selectMale();

        Assert.assertTrue(page.isMaleSelected(),"Male radio button is not selected");
    }
}