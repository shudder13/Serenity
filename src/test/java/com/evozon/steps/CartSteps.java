package com.evozon.steps;

import com.evozon.pages.CartPage;
import com.evozon.pages.CategoryPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps {
    private HomePage homePage;

    private CategoryPage categoryPage;

    private ProductPage productPage;

    private CartPage cartPage;

    @Step
    public void navigateToCart() {
        cartPage.open();
    }

    @Step
    public void clickOnVipCategory() {
        homePage.clickOnVipCategory();
    }

    @Step
    public void clickOnProduct(Integer index) {
        categoryPage.getResults().get(index).click();
    }

    @Step
    public void setQuantityTo(Integer newQty) {
        productPage.setQtyField(newQty);
    }

    @Step
    public void clickOnAddToCartButton() {
        productPage.clickOnAddToCartButton();
    }

    @Step
    public void verifyNumberOfProductsInCartIsEqualTo(Integer number) {
        Assert.assertEquals(number, cartPage.getNumberOfResults());
    }

    @Step
    public void verifyQtyOfProductIsEqualTo(Integer index, Integer expectedQty) {
        Assert.assertEquals(expectedQty.toString(), cartPage.getQtyFieldText(index).getAttribute("value"));
    }

    @Step
    public void emptyCart() {
        cartPage.clickOnEmptyCartButton();
    }
}
