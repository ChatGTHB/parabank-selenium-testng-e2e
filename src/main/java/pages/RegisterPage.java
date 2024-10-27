package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    @Step("First Name alani doldurulur")
    public RegisterPage fillFirstName(String text) {
        driver.findElement(By.id("customer.firstName")).sendKeys(text);
        return this;
    }

    @Step("Last Name alani doldurulur")
    public RegisterPage fillLastName(String text) {
        driver.findElement(By.id("customer.lastName")).sendKeys(text);
        return this;
    }


    @Step("Adres alani doldurulur")
    public RegisterPage fillAddress(String text) {
        driver.findElement(By.id("customer.address.street")).sendKeys(text);
        return this;
    }

    @Step("City alani doldurulur")
    public RegisterPage fillCity(String text) {
        driver.findElement(By.id("customer.address.city")).sendKeys(text);
        return this;
    }

    @Step("State alani doldurulur")
    public RegisterPage fillState(String text) {
        driver.findElement(By.id("customer.address.state")).sendKeys(text);
        return this;
    }

    @Step("Zip Code alani doldurulur")
    public RegisterPage fillZipCode(String text) {
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(text);
        return this;
    }

    @Step("Phone Number alani doldurulur")
    public RegisterPage fillPhoneNumber(String text) {
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(text);
        return this;
    }

    @Step("SSN alani doldurulur")
    public RegisterPage fillSSN(String text) {
        driver.findElement(By.id("customer.ssn")).sendKeys(text);
        return this;
    }

    @Step("Username alani doldurulur")
    public RegisterPage fillUsername(String text) {
        driver.findElement(By.id("customer.username")).sendKeys(text);
        return this;
    }

    @Step("Password alani doldurulur")
    public RegisterPage fillPassword(String text) {
        driver.findElement(By.id("customer.password")).sendKeys(text);
        return this;
    }

    @Step("Password kontrol alani doldurulur")
    public RegisterPage repeatPassword(String text) {
        driver.findElement(By.id("repeatedPassword")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step("Register butonu tiklanir")
    public RegisterPage registerClick() {
        driver.findElement(By.cssSelector("[value='Register']")).click();
        return this;
    }
}
