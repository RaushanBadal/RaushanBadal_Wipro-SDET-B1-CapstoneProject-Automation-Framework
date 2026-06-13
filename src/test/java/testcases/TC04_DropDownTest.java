package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC04_DropDownTest extends BaseTest {

    @Test
    public void verifyDropDowns() {

        GUIElementsPage page = new GUIElementsPage(driver);

        page.selectCountry("India");

        page.selectColor("Red");

        page.selectAnimal("Cheetah");

        Assert.assertEquals( page.getSelectedCountry(),"India");

        Assert.assertEquals(page.getSelectedColor(),"Red");

        Assert.assertEquals( page.getSelectedAnimal(),"Cheetah");
    }
}
