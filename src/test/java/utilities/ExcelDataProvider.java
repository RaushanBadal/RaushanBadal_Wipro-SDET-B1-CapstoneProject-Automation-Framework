package utilities;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

    @DataProvider(name= "excelData")
    public Object[][] getData() throws Exception {

        return ExcelUtils.getExcelData();
    }
}
