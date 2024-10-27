package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("Kullanici adi alani doldurulur")
    public LoginPage fillUsername(String text) {
        driver.findElement(By.name("username")).sendKeys(text);
        return this;
    }

    @Step("Password alani doldurulur")
    public LoginPage fillPassword(String text) {
        driver.findElement(By.name("password")).sendKeys(text);
        return this;
    }

    @Step("Login butonu tiklanir")
    public LoginPage clickLogin() {
        driver.findElement(By.cssSelector("[value='Log In']")).click();
        screenshot();
        return this;
    }

    @Step("Register linki tiklanir")
    public LoginPage clickRegister() {
        driver.findElement(By.cssSelector("[href*='register.htm']")).click();
        return this;
    }
}
