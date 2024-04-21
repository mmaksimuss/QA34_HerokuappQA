package com.herokuappqa.tests;

import com.herokuappqa.pages.BrokenImagesPage;
import com.herokuappqa.pages.HomePage;
import com.herokuappqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver);
        new SidePanel(driver).selectBrokenImages();
    }
    @Test
    public void checkBrokenImagesTest() {
        new BrokenImagesPage(driver).checkBrokenImages();
    }

}
