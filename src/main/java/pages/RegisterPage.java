package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    @Step("Fill in the First Name field")
    public RegisterPage fillFirstName(String text) {
        driver.findElement(By.id("customer.firstName")).sendKeys(text);
        return this;
    }

    @Step("Fill in the Last Name field")
    public RegisterPage fillLastName(String text) {
        driver.findElement(By.id("customer.lastName")).sendKeys(text);
        return this;
    }

    @Step("Fill in the Address field")
    public RegisterPage fillAddress(String text) {
        driver.findElement(By.id("customer.address.street")).sendKeys(text);
        return this;
    }

    @Step("Fill in the City field")
    public RegisterPage fillCity(String text) {
        driver.findElement(By.id("customer.address.city")).sendKeys(text);
        return this;
    }

    @Step("Fill in the State field")
    public RegisterPage fillState(String text) {
        driver.findElement(By.id("customer.address.state")).sendKeys(text);
        return this;
    }

    @Step("Fill in the Zip Code field")
    public RegisterPage fillZipCode(String text) {
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(text);
        return this;
    }

    @Step("Fill in the Phone Number field")
    public RegisterPage fillPhoneNumber(String text) {
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(text);
        return this;
    }

    @Step("Fill in the SSN field")
    public RegisterPage fillSSN(String text) {
        driver.findElement(By.id("customer.ssn")).sendKeys(text);
        return this;
    }

    @Step("Fill in the Username field")
    public RegisterPage fillUsername(String text) {
        driver.findElement(By.id("customer.username")).sendKeys(text);
        return this;
    }

    @Step("Fill in the Password field")
    public RegisterPage fillPassword(String text) {
        driver.findElement(By.id("customer.password")).sendKeys(text);
        return this;
    }

    @Step("Fill in the Password confirmation field")
    public RegisterPage repeatPassword(String text) {
        driver.findElement(By.id("repeatedPassword")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step("Click the Register button")
    public RegisterPage registerClick() {
        driver.findElement(By.cssSelector("[value='Register']")).click();
        return this;
    }
}
