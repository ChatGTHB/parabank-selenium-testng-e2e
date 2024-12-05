package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("Fill in the username field")
    public LoginPage fillUsername(String text) {
        driver.findElement(By.name("username")).sendKeys(text);
        return this;
    }

    @Step("Fill in the password field")
    public LoginPage fillPassword(String text) {
        driver.findElement(By.name("password")).sendKeys(text);
        return this;
    }

    @Step("Click the login button")
    public LoginPage clickLogin() {
        driver.findElement(By.cssSelector("[value='Log In']")).click();
        screenshot();
        return this;
    }

    @Step("Click the register link")
    public LoginPage clickRegister() {
        driver.findElement(By.cssSelector("[href*='register.htm']")).click();
        return this;
    }
}
