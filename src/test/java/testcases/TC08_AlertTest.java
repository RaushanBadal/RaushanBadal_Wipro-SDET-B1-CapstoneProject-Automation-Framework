package testcases;


import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC08_AlertTest extends BaseTest {

    @Test
    public void verifyAlerts() {

        GUIElementsPage page =  new GUIElementsPage(driver);

        page.clickSimpleAlert();
        driver.switchTo().alert().accept();

        page.clickConfirmationAlert();
        driver.switchTo().alert().accept();

        page.clickPromptAlert();

        driver.switchTo().alert() .sendKeys("Raushan Badal");

        driver.switchTo().alert().accept();
    }
}
