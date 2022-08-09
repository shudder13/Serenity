package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {
    @FindBy(id="qty")
    private WebElementFacade qtyField;

    @FindBy(css="div.add-to-cart button")
    private WebElementFacade addToCartButton;

    public void setQtyField(Integer newQty) {
        qtyField.clear();
        qtyField.sendKeys(newQty.toString());
    }

    public void clickOnAddToCartButton() {
        clickOn(addToCartButton);
    }
}
