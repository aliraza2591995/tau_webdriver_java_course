package contextMenu;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import static org.testng.Assert.*;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testContextMenu(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickBox();
        assertEquals(contextMenuPage.getAlertText(), "You selected a context menu", "Incorrect alert");
        System.out.println(contextMenuPage.getAlertText());
        contextMenuPage.acceptAlert();
    }
}
