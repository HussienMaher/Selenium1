import actions.Methods;
import actions.data;
import locators.loginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class test {
    Methods actions = new Methods();
    String email =data.email1;
    String password = data.password1;
    String origin = data.origin1;
    String destination = data.destination1;
    int amount = data.amount1;
    int SSNumber = data.SSNumber1;
    int pin = data.pin1;

    @Test
    public void validLogin() {
        loginPage.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        actions.login(email,password);
    }
    @Test
    public void goToTransfer(){
        actions.openTransferPage(email,password);
    }
    @Test
    public void transfer(){
        actions.transfer(email, password, origin, destination, amount, SSNumber, pin);
    }
}
