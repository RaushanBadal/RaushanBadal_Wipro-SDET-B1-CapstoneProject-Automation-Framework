package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class BaseTest {

    public WebDriver driver;

    // Log4j Logger
    public static Logger logger =LogManager.getLogger(BaseTest.class);

    @BeforeMethod
    public void setup() {

        logger.info("========== Test Execution Started ==========");

        logger.info("Setting up ChromeDriver");

        WebDriverManager.chromedriver().setup();

        logger.info("Launching Chrome Browser");

        driver = new ChromeDriver();

        logger.info("Maximizing Browser Window");

        driver.manage().window().maximize();

        logger.info("Applying Implicit Wait");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigReader.getInt("implicit.wait")));

        logger.info("Opening Application URL");

        driver.get(ConfigReader.get("url"));

        logger.info("Application Loaded Successfully");
    }

    @AfterMethod
    public void tearDown() {

        logger.info("Closing Browser");

        if (driver != null) {
            driver.quit();
        }

        logger.info("========== Test Execution Completed ==========");
    }
}