package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("http://qa2magento.dev.evozon.com/checkout/cart/")
public class CartPage extends PageObject {
    @FindBy(id="shopping-cart-table")
    private WebElementFacade shoppingCartTable;


    @FindBy(css="#shopping-cart-table tbody > tr")
    private List<WebElementFacade> results;

    @FindBy(id="empty_cart_button")
    private WebElementFacade emptyCartButton;

    public Integer getNumberOfResults() {
        return results.size();
    }

    public List<WebElementFacade> getResults() {
        return results;
    }

    public WebElementFacade getQtyFieldText(Integer index) {
        return results.get(index).find(By.cssSelector("input.qty"));
    }

    public void clickOnEmptyCartButton() {
        if (emptyCartButton.isPresent())
            clickOn(emptyCartButton);
    }
}
