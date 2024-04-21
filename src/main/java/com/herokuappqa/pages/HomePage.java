package com.herokuappqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/javascript_alerts']")
    WebElement javaScriptAlerts;

    public HomePage getJavaScriptAlerts() {
        clickWithJS(javaScriptAlerts,0,300);
        return new HomePage(driver);
    }

    @FindBy(css="a[href*='/windows']")
    WebElement newWindows;
    public HomePage selectWindow() {
        click(newWindows);
        return new HomePage(driver);
    }

    @FindBy(css="a[href='/broken_images']")
    WebElement elements;

    public SidePanel getElements() {
       // clickWithJS(elements,0,300);
        click(elements);
        return new SidePanel(driver);
    }
}


