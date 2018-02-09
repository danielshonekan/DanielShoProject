package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class AboutPage extends GeneralMethod {

    public AboutPage (WebDriver driver) {
        super(driver);
    }

    private static final By ABOUT_PAGE_HEADER = By.xpath("//div[@class='page-header']/h1") ;


    public void h1HeaderIsDisplayedInAboutPage () {
        Assert.assertTrue(getText(ABOUT_PAGE_HEADER).equals("About"));
    }
}
