package com.herokuappqa.tests;

import com.herokuappqa.pages.DragAndDropPage;
import com.herokuappqa.pages.HomePage;
import com.herokuappqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver);
        new SidePanel(driver).selectDragAndDrop();
    }

    @Test
    public void actionDragMeTest() {
        new DragAndDropPage(driver).actionDragA();
    }
}
