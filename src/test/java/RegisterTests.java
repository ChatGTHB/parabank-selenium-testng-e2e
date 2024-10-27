import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTests extends BaseTest {

    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test(description = "Kullanici olusturma kontrolu")
    public void loginSuccessfulControl() {
        String username = createUserName();

        loginPage.clickRegister();

        registerPage.fillFirstName("Test")
                .fillLastName("QA")
                .fillAddress("Ankara Cad.")
                .fillCity("Ankara")
                .fillState("State")
                .fillZipCode("06000")
                .fillPhoneNumber("123456789")
                .fillSSN("123456789")
                .fillUsername(username)
                .fillPassword("123456789")
                .repeatPassword("123456789")
                .registerClick();

        homePage.registerControl("Welcome " + username);
    }
}
