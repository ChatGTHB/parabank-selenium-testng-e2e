import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();

    @Test(description = "Basarili kullanici girisi kontrolu")
    public void loginSuccessfulControl() {
        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLogin();

        homePage.accountControl("Welcome " + username);
    }

    @Test(description = "Basarisiz kullanici girisi kontrolu")
    public void loginUnsuccessfulControl() {
        loginPage.fillUsername(username)
                .fillPassword("12345")
                .clickLogin();

        mainPage.errorControlMessage("The username and password could not be verified.");
    }

    @Test(description = "Required kontrolu")
    public void loginRequiredControl() {
        loginPage.fillUsername("")
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Please enter a username and password.");

        loginPage.fillUsername(username)
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Please enter a username and password.");

        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLogin();

        homePage.accountControl("Welcome " + username);
    }
}
