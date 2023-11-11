package actions;

import locators.homePage;
import locators.loginPage;
import locators.transferPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Methods {
    loginPage l = new loginPage();
    homePage h = new homePage();
    transferPage t = new transferPage();
//    ChromeDriver driver = l.driver;
    public void OpenSite(){
        l.websiteURL();
        loginPage.driver.get(l.url);
    }
    public void login(String email,String password){
        OpenSite();
        l.loginElements();
        l.email.sendKeys(email);
        l.password.sendKeys(password);
        l.loginButton.click();
    }
    public void openTransferPage(String email,String password){
        login(email,password);
        h.homeElements();
        h.transferNButton.click();
    }
    public void transfer(String email,String password,String origin, String destination,int amount, int SSNumber, int pin){
        openTransferPage(email,password);
        t.transferElements();
//        Select selectOrigin = new Select(t.originAccount);
//        Select selectDestination = new Select(t.destinationAccount);
//        selectOrigin.selectByValue(origin);
//        selectDestination.selectByValue(destination);
        t.originAccount.sendKeys("Personal");
        t.destinationAccount.sendKeys("Personal");
        t.amount.sendKeys(String.valueOf(amount));
        t.socialSNumber.sendKeys(String.valueOf(SSNumber));
        t.pin.sendKeys(String.valueOf(pin));
        t.transferFunds.click();
    }
}
