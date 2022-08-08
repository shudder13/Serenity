package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2magento.dev.evozon.com/")
public class HomePage extends PageObject {

    @FindBy(css = "a.skip-account")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade logInLink;

    @FindBy(css="a[title='Register']")
    private WebElementFacade registerLink;

    public void clickOnAccountLink() {
        clickOn(accountLink);
    }

    public void clickOnLoginLink() {
        clickOn(logInLink);
    }

    public void clickOnRegisterLink() {
        clickOn(registerLink);
    }

}
