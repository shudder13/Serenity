package com.evozon.steps;

import com.evozon.pages.AccountPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToLoginPage() {
        homePage.clickOnAccountLink();
        homePage.clickOnLoginLink();
    }

    @Step
    public void enterEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void enterPassword(String pass) {
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyUserIsLoggedIn(String userName) {
        Assert.assertEquals("Hello, " + userName + "!",
                accountPage.getWelcomeText());
    }

    @Step
    public void doLogin(String email, String pass) {
        navigateToHomepage();
        navigateToLoginPage();
        enterEmail(email);
        enterPassword(pass);
        clickLogin();
    }
}
