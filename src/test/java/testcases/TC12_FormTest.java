package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC12_FormTest extends BaseTest {

    @Test
    public void verifyFormSection() {

        // Create Page Object
        GUIElementsPage page = new GUIElementsPage(driver);

        page.enterSection1Text("Section1 Data");

        page.clickSection1Submit();

        Assert.assertEquals(page.getSection1Value(),"Section1 Data", "Section 1 Text Verification Failed");


        page.enterSection2Text("Section2 Data");

        page.clickSection2Submit();

        Assert.assertEquals(
                page.getSection2Value(),
                "Section2 Data",
                "Section 2 Text Verification Failed");


        page.enterSection3Text("Section3 Data");

        page.clickSection3Submit();

        Assert.assertEquals(
                page.getSection3Value(),
                "Section3 Data",
                "Section 3 Text Verification Failed");

        System.out.println("Form Section Test Passed Successfully");
    }
}
