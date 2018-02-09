package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Wale on 09/02/2018.
 */
public abstract class GeneralMethod {

    WebDriver driver ;
    public GeneralMethod (WebDriver driver) {
        this.driver = driver;
    }

    public void click(By element){
        new WebDriverWait(driver, 20).until(
                ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();

    }


    public boolean elementPresent(By element){
        if (driver.findElements(element).size()>0){
            try {
                if (driver.findElement(element).isDisplayed()) {
                    return true;
                }
            }
            catch(Exception e) {
                return false;
            }
        }
        return false;
    }


    public String getText (By element){
        String value = driver.findElement(element).getText()  ;
        return value ;

    }
}
