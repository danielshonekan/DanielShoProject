package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Wale on 09/02/2018.
 */
public class WorkPage extends GeneralMethod {

    public WorkPage (WebDriver driver) {
        super(driver);
    }

    private static final By WORK_PAGE_HEADER = By.xpath("//div[@class='page-header']/h1") ;

    public void h1WorkPageHeaderIsDisplayed () {
       Assert.assertTrue(getText(WORK_PAGE_HEADER).equals("Work"));
    }
}
