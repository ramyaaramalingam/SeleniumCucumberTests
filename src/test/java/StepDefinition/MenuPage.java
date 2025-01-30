package StepDefinition;

import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static pages.MenuPage.*;
public class MenuPage {
    @Then("^User should be able to view the menu page$")
    public void Menu_validation() throws InterruptedException {
        Thread.sleep(2000);
        String actualMenu = visibility_Menu();
        assertEquals(actualMenu,"Product Categories");
    }
}
