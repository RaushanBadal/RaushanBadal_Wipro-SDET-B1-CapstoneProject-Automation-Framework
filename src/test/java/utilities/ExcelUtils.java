package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    static Workbook workbook;
    static Sheet sheet;

    public static void loadExcel(String filePath, String sheetName)throws Exception {

        FileInputStream fis = new FileInputStream(filePath);

        workbook = new XSSFWorkbook(fis);

        sheet = workbook.getSheet(sheetName);
    }

    public static int getRowCount() {

        return sheet.getLastRowNum();
    }

    public static int getColumnCount() {

        return sheet.getRow(0).getLastCellNum();
    }

    public static String getCellData(int row, int col) {

        return sheet.getRow(row)
                    .getCell(col)
                    .toString();
    }

    public static Object[][] getExcelData()
            throws Exception {

        String path =
                System.getProperty("user.dir") + "/src/test/resources/TextFieldsData.xlsx";

        loadExcel(path, "UserData");

        int rows = getRowCount();

        int cols = getColumnCount();

        Object[][] data = new Object[rows][cols];

        for(int i=1;i<=rows;i++) {

            for(int j=0;j<cols;j++) {

                data[i-1][j] = getCellData(i,j);
            }
        }

        workbook.close();

        return data;
    }
}
