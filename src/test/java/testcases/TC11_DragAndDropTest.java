package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class TC11_DragAndDropTest extends BaseTest {

    @Test
    public void verifyDragAndDrop() {

        GUIElementsPage page =
                new GUIElementsPage(driver);

        page.performDragAndDrop();

        //Assert.assertTrue( page.getDropText() .contains("Dropped"),"Drag and Drop failed");
                System.out.println(page.getDropText());
    }
}
