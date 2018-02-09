package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 09/02/2018.
 */
public class ContactPage extends GeneralMethod {

    public ContactPage (WebDriver driver) {
        super(driver);
    }

    private static final By LIST_OF_BRANCHES = By.xpath("//a[contains(@href,'/about/contact-us/')]") ;

    public void getListOFBranches () {
        int a = driver.findElements(LIST_OF_BRANCHES).size() ;
        System.out.println(a);
    }
}
