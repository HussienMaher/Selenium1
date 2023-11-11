package assertions;

import locators.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class messageElement {
    loginPage l = new loginPage();
//    ChromeDriver driver = l.driver;
    public static String loginHeader;
    public static String homeHeader;
    public static String transferHeader;
    public static String successMessage;
    public void headers(){
    homeHeader = loginPage.driver.findElement(By.xpath("//div[@fxlayout='column']//mat-card//mat-card-title[@class='mat-card-title']")).getText();
    loginHeader = loginPage.driver.findElement(By.tagName("h1")).getText();
    successMessage = loginPage.driver.findElement(By.xpath("//mat-icon[@role='img'")).getText();
    transferHeader = loginPage.driver.findElement(By.xpath("//mat-card-title[@class='mat-card-title'")).getText();
    }
}
