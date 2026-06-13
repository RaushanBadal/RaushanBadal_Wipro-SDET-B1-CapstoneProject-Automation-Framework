package testcases;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC05_DatePickerTest extends BaseTest {

    @Test
    public void verifyDatePickers() {

        GUIElementsPage page = new GUIElementsPage(driver);

        page.enterDatePicker1("06/08/2026");

        page.enterDatePicker2("08/06/2026");

        page.enterStartDate("2026-06-08");

        page.enterEndDate("2026-06-15");

       // page.clickDateSubmit();
    }
}