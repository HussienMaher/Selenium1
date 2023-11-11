package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePage {
    loginPage l = new loginPage();
//    ChromeDriver driver = l.driver;
        public WebElement transferNButton;
    public void homeElements(){
         transferNButton = loginPage.driver.findElement(By.xpath("//ul[@class='navigation-items']//li//a[@href='#/transfers']"));
    }
}
