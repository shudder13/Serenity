package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ProductPage extends PageObject {
    @FindBy(id="qty")
    private WebElementFacade qtyField;

    @FindBy(css="div.add-to-cart button")
    private WebElementFacade addToCartButton;

    @FindBy(css="#configurable_swatch_color > li")
    private List<WebElementFacade> colors;

    @FindBy(css="#configurable_swatch_size > li")
    private List<WebElementFacade> sizes;

    public void setQtyField(Integer newQty) {
        qtyField.clear();
        qtyField.sendKeys(newQty.toString());
    }

    public void clickOnAddToCartButton() {
        clickOn(addToCartButton);
    }

    public void selectColor(Integer index) {
        colors.get(index).click();
    }

    public void selectSize(Integer index) {
        sizes.get(index).click();
    }
}
