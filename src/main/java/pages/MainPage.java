package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MainPage extends BaseTest {

    @Step("Hata mesaji kontrol edilir.")
    public MainPage errorControlMessage(String message) {
        String text = driver.findElement(By.cssSelector("[class='error']")).getText();
        Assert.assertEquals(message, text);
        return this;
    }
}

