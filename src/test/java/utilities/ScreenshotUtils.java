package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    public static String captureScreenshot(WebDriver driver, String testName) {

        String timeStamp =new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        String screenshotPath =System.getProperty("user.dir") +"/screenshots/"+ testName+ "_"+ timeStamp+ ".png";

        try {

            File source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File destination =new File(screenshotPath);

            FileUtils.copyFile(source, destination);

            System.out.println("Screenshot saved : "+ screenshotPath);

        } catch (Exception e) {

            e.printStackTrace();
        }

        return screenshotPath;
    }
}
