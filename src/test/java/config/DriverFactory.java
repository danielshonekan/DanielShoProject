package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class DriverFactory {

    public static WebDriver driver = new FirefoxDriver() ;


    @BeforeTest
    public void setUp () {

        driver.get("https://www.valtech.com");
        driver.manage().window().maximize();
    }


    @AfterTest
    public void tearDown () {
        driver.close();
    }
}
