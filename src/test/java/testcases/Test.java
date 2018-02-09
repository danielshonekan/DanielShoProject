package testcases;

import config.DriverFactory;
import page.*;

/**
 * Created by Wale on 09/02/2018.
 */
public class Test extends DriverFactory{


    @org.testng.annotations.Test
        public void runTest () {
        AboutPage aboutPage = new AboutPage(driver) ;
        ContactPage contactPage = new ContactPage(driver) ;
        HomePage homePage = new HomePage(driver) ;
        NavBar navBar = new NavBar(driver) ;
        ServicePage servicePage = new ServicePage(driver) ;
        WorkPage workPage = new WorkPage(driver) ;


        homePage.latestNewsSectionIsDisplayed();
        navBar.goToAboutPage();
        aboutPage.h1HeaderIsDisplayedInAboutPage();
        navBar.goToServices();
        servicePage.h1ServicePageHeaderIsDisplayed();
        navBar.goToWorkPage();
        workPage.h1WorkPageHeaderIsDisplayed();
        navBar.goToContactPage();
        contactPage.getListOFBranches();
    }
}
