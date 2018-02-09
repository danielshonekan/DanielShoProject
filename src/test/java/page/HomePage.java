package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class HomePage extends GeneralMethod {

    public HomePage (WebDriver driver) {
        super(driver);
    }

    private static final By LATEST_NEWS_SECTION = By.cssSelector("div.bloglisting.news-post__listing") ;


    public void latestNewsSectionIsDisplayed() {
        Assert.assertTrue(elementPresent(LATEST_NEWS_SECTION));
    }
}
