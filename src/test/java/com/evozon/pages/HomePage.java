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

    @FindBy(css="#nav .level0.nav-6 > a")
    private WebElementFacade vipCategory;
    
    @FindBy(css=".level0.nav-3")
    private WebElementFacade productCategory;

    @FindBy(css="body > div > div > div.main-container.col1-layout > div > div.col-main > ul > li:nth-child(2) > a > img")
    private WebElementFacade jewelrySubcategory;

    @FindBy(id="product-collection-image-551")
    private WebElementFacade chooseProduct;

    @FindBy(css=".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCart;

    @FindBy(css=".method-checkout-cart-methods-onepage-bottom")
    private WebElementFacade checkoutButton;

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
    public void clickProductCategory() {clickOn(productCategory);}
    
    public void clickJewelrySubcategory(){
        clickOn(jewelrySubcategory);
    }
    public void clickPearlStudEarrings(){
        clickOn(chooseProduct);
    }
    public void clickAddToCartButton(){
        clickOn(addToCart);
    }
    
    public void clickCheckOutButton() {clickOn(checkoutButton);}

}
