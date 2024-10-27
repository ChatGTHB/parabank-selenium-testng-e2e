package base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class BaseLibrary extends Data {

    public static WebDriver driver;

    public String createUserName() {
        Random random = new Random();
        String text = "test" + random.nextInt(1000000);
        return text;
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
