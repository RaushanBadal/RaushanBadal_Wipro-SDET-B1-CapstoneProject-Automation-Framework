package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;
import utilities.ExcelDataProvider;

public class TC13_ExcelDataDrivenTest extends BaseTest {

    @Test(dataProvider="excelData",
          dataProviderClass=ExcelDataProvider.class)

    public void verifyTextFieldsUsingExcel(
            String name,
            String email,
            String phone,
            String address) {

        GUIElementsPage page =
                new GUIElementsPage(driver);

        page.enterName(name);

        page.enterEmail(email);

        page.enterPhone(phone);

        page.enterAddress(address);

        Assert.assertEquals( page.getNameValue(),name);

        Assert.assertEquals( page.getEmailValue(), email);

        Assert.assertEquals( page.getPhoneValue(), phone);

        Assert.assertEquals( page.getAddressValue(), address);
    }
}