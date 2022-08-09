package com.evozon.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa2magento.dev.evozon.com/customer/account/create/")
public class RegisterPage extends PageObject {
    @FindBy(id="firstname")
    private WebElementFacade firstNameField;

    @FindBy(id="middlename")
    private WebElementFacade middleNameField;

    @FindBy(id="lastname")
    private WebElementFacade lastNameField;

    @FindBy(id="email_address")
    private WebElementFacade emailField;

    @FindBy(id="password")
    private WebElementFacade passwordField;

    @FindBy(id="confirmation")
    private WebElementFacade confirmPasswordField;

    @FindBy(css="button[title='Register']")
    private WebElementFacade registerButton;

    @FindBy(id="advice-validate-cpassword-confirmation")
    private WebElementFacade differentPasswordsError;

    @FindBy(id="advice-required-entry-lastname")
    private WebElementFacade lastNameError;

    public void setFirstNameField(String value) {
        typeInto(firstNameField, value);
    }

    public void setMiddleNameField(String value) {
        typeInto(middleNameField, value);
    }

    public void setLastNameField(String value) {
        typeInto(lastNameField, value);
    }

    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void setConfirmPasswordField(String value) {
        typeInto(confirmPasswordField, value);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    public WebElementFacade getDifferentPasswordsErrorElement() {
        return differentPasswordsError;
    }

    public WebElementFacade getLastNameError() {
        return lastNameError;
    }
}
