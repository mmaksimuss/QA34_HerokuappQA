package com.herokuappqa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    WebElement clickAlertButton;
    public AlertsPage clickForJSAlert() {
       pause(2000);
        click(clickAlertButton);
        driver.switchTo().alert().accept();
       // new  AlertsPage(driver);
//        Alert alert1 = driver.switchTo().alert();
//        alert1.accept();
//       // driver.switchTo().alert().accept();
//        String result = driver.findElement((By) btnClickAlert).getText();
//        Assert.assertEquals(result,"You successfully clicked an alert");
        return this;
    }

    @FindBy(xpath = "//button[.='Click for JS Confirm']")
            WebElement confirmButton;
    public AlertsPage selectResult(String confirm) {
        click(confirmButton);
        if (confirm != null && confirm.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement confirmResult;

    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(confirmResult.getText().contains(text));
        return this;
    }

    @FindBy(xpath = "//button[.='Click for JS Prompt']")
    WebElement promtButton;
    public AlertsPage sendMessageToAlert(String message) {
        click(promtButton);
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }
    @FindBy(id = "result")
    WebElement promptResult;
    public AlertsPage verifyMessage(String text) {
        Assert.assertTrue(promptResult.getText().contains(text));
        return this;
    }
}
