package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC06_FileUploadTest extends BaseTest {

    @Test
    public void verifySingleFileUpload() {

        GUIElementsPage page = new GUIElementsPage(driver);

        String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.txt";

        page.uploadSingleFile(filePath);

        page.clickUploadSingleFile();
    }
}
