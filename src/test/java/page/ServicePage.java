package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Wale on 09/02/2018.
 */
public class ServicePage extends GeneralMethod {

    public ServicePage (WebDriver driver) {
        super(driver);
    }

    private static final By SERVICE_PAGE_HEADER = By.xpath("//div[@class='page-header']/h1") ;

    public void h1ServicePageHeaderIsDisplayed () {
       Assert.assertTrue(getText(SERVICE_PAGE_HEADER).equals("Services"));
    }
}
