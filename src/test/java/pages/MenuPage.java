package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class MenuPage {

        public static String menu_heading_xpath = "//h1[text()='Product Categories']";

        public static String visibility_Menu(){
           String actualMenu = driver.findElement(By.xpath(menu_heading_xpath)).getText();
           return actualMenu;
        }

    }

