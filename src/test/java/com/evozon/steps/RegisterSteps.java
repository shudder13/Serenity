package com.evozon.steps;

import com.evozon.models.Customer;
import com.evozon.pages.AccountPage;
import com.evozon.pages.HeaderPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;
    private HeaderPage headerPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToRegisterPage() {
        homePage.clickOnAccountLink();
        homePage.clickOnRegisterLink();
    }

    @Step
    public void enterFirstName(String firstName) {
        registerPage.setFirstNameField(firstName);
    }

    @Step
    public void enterMiddleName(String middleName) {
        registerPage.setMiddleNameField(middleName);
    }

    @Step
    public void enterLastName(String lastName) {
        registerPage.setLastNameField(lastName);
    }

    @Step
    public void enterEmail(String email) {
        registerPage.setEmailField(email);
    }

    @Step
    public void enterPassword(String password) {
        registerPage.setPasswordField(password);
    }

    @Step
    public void enterConfirmPassword(String password) {
        registerPage.setConfirmPasswordField(password);
    }

    @Step
    public void clickRegister() {
        registerPage.clickRegisterButton();
    }

    @Step
    public void completeForm(Customer customer) {
        enterFirstName(customer.getFirstName());
        enterMiddleName(customer.getMiddleName());
        enterLastName(customer.getLastName());
        enterEmail(customer.getEmail());
        enterPassword(customer.getPassword());
        enterConfirmPassword(customer.getPassword());
        clickRegister();
    }

    @Step
    public void verifyUserIsLoggedIn(Customer customer) {
        Assert.assertEquals("Hello, " + customer.getFullName() + "!",
                accountPage.getWelcomeText());
        Assert.assertEquals(("Welcome, " + customer.getFullName() + "!").toUpperCase(),
                headerPage.getWelcomeMessageText().toUpperCase());
    }
}
