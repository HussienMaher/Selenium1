package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
    public static ChromeDriver driver = new ChromeDriver();
    public String url;
    public WebElement email;
    public WebElement password;
    public WebElement loginButton;

    public void websiteURL(){
        url ="https://usdemo.vee24.com/#/";
    }
    public void  loginElements(){
        email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        password =  driver.findElement(By.xpath("//input[@placeholder='Password']"));
        loginButton =  driver.findElement(By.xpath("//button[@class='mat-raised-button mat-primary']"));
    }
}
