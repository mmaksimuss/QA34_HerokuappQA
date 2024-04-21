package com.herokuappqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {
    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[.='Click for JS Alert']")
    WebElement alerts;

    public AlertsPage selectAlert() {
        click(alerts);
        return new AlertsPage(driver);
    }

    @FindBy(css = "a[href='/broken_images']")
    WebElement brokenImages;

    public BrokenImagesPage selectBrokenImages() {
        click(brokenImages);
        return new BrokenImagesPage(driver);
    }

    @FindBy(css = "a[href='/drag_and_drop']")
    WebElement dragAndDrop;

    public DragAndDropPage selectDragAndDrop() {
        click(dragAndDrop);
        return new DragAndDropPage(driver);
    }
}
