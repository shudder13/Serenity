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

    @FindBy(css="a[title='Log Out']")
    private WebElementFacade logoutLink;

    @FindBy(css="a[title='Register']")
    private WebElementFacade registerLink;

    @FindBy(css="#nav .level0.nav-1 > a")
    private WebElementFacade womenCategory;

    @FindBy(css="#nav .level1.nav-1-1 > a")
    private WebElementFacade womenNewArrivalsSubcategory;

    @FindBy(css="#nav .level0.nav-6 > a")
    private WebElementFacade vipCategory;

    public void clickOnAccountLink() {
        clickOn(accountLink);
    }

    public void clickOnLoginLink() {
        clickOn(logInLink);
    }

    public void clickOnLogoutLink() {
        clickOn(logoutLink);
    }

    public void clickOnRegisterLink() {
        clickOn(registerLink);
    }

    public void clickOnVipCategory() {
        clickOn(vipCategory);
    }

    public void hoverWomenCategory() {
        withAction().moveToElement(element(womenCategory)).build().perform();
    }

    public void clickOnWomenNewArrivalsSubcategory() {
        hoverWomenCategory();
        clickOn(womenNewArrivalsSubcategory);
    }
}
