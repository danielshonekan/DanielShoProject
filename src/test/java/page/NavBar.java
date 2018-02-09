package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 09/02/2018.
 */
public class NavBar extends GeneralMethod {

    public NavBar (WebDriver driver) {
        super(driver);
    }

    private static final By ABOUT = By.xpath("//a[@href='/about/']/span") ;
    private static final By WORK = By.xpath("//a[@href='/work/']/span") ;
    private static final By SERVICES = By.xpath("//a[@href='/services/']/span") ;
    private static final By CONTACT_ICON = By.xpath("//div[@class='left-border']/a") ;


    public void goToAboutPage () {
        click(ABOUT);
    }

    public void goToWorkPage () {
        click(WORK);
    }

    public void goToServices () {
        click(SERVICES);
    }

    public void goToContactPage () {
        click(CONTACT_ICON);
    }

}
