package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class transferPage {
    loginPage l = new loginPage();
//    ChromeDriver driver = l.driver;
    public WebElement originAccount;
    public WebElement destinationAccount;
    public WebElement amount;
    public WebElement socialSNumber;
    public WebElement pin;
    public WebElement transferFunds;

    public void transferElements() {
        originAccount = loginPage.driver.findElement(By.xpath("(//mat-select[@tabindex='0'])[1]"));
        destinationAccount = loginPage.driver.findElement(By.xpath("(//mat-select[@tabindex='0'])[2]"));
        amount = loginPage.driver.findElement(By.xpath("//input[@placeholder='Amount']"));
        socialSNumber = loginPage.driver.findElement(By.xpath("//input[@placeholder='Social Security Number']"));
        pin = loginPage.driver.findElement(By.xpath("//input[@placeholder='ATM PIN']"));
        transferFunds = loginPage.driver.findElement(By.xpath("//button[@color='primary']"));
    }
}