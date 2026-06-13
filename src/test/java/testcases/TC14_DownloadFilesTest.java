package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC14_DownloadFilesTest extends BaseTest {

    @Test
    public void verifyDownloadFiles() {

        driver.get( "https://testautomationpractice.blogspot.com/p/download-files_25.html");

        GUIElementsPage page = new GUIElementsPage(driver);

        page.enterDownloadText( "Selenium Automation Testing");

        page.generateTextFile();

        page.generatePdfFile();

        Assert.assertTrue(page.isPdfLinkDisplayed(), "PDF Download Link was not generated");

        System.out.println("PDF Download Link Generated Successfully");

        page.clickPdfLink();

        System.out.println( "Current URL : " + driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().length() > 0, "PDF URL is empty");

        System.out.println( "Download Files Test Passed");
    }
}
