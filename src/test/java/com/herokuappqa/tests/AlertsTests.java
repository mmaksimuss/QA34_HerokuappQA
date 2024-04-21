package com.herokuappqa.tests;

import com.herokuappqa.pages.AlertsPage;
import com.herokuappqa.pages.HomePage;
import com.herokuappqa.pages.SidePanel;
import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getJavaScriptAlerts();
        new SidePanel(driver).selectAlert();
    }

//    @Test
//    public void clickForJSAlertTest() {
//        new AlertsPage(driver).clickForJSAlert();
//
//    }

//    @Test
//    public void alertWithSelectTest() {
//        new AlertsPage(driver).selectResult("Cancel")
//                .verifyResult("Cancel");
//    }

//    @Test
//    public void sendMessageToAlertTest() {
//        new AlertsPage(driver).sendMessageToAlert("I am a JS Alert")
//                .verifyMessage("I am a JS Alert");
//    }

}
