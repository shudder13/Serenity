package com.evozon.features;

import com.evozon.steps.CartSteps;
import com.evozon.steps.LoginSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void addToCartTest() {
        loginSteps.doLogin(Constants.VALID_USER_EMAIL, Constants.VALID_USER_PASSWORD);
        cartSteps.navigateToCart();
        cartSteps.emptyCart();
        loginSteps.navigateToHomepage();
        cartSteps.clickOnVipCategory();
        cartSteps.clickOnProduct(0);
        cartSteps.setQuantityTo(2);
        cartSteps.clickOnAddToCartButton();
        cartSteps.verifyNumberOfProductsInCartIsEqualTo(1);
        cartSteps.verifyQtyOfProductIsEqualTo(0, 2);
        cartSteps.clickOnVipCategory();
        cartSteps.clickOnProduct(2);
        cartSteps.setQuantityTo(3);
        cartSteps.clickOnAddToCartButton();
        cartSteps.verifyNumberOfProductsInCartIsEqualTo(2);
        cartSteps.verifyQtyOfProductIsEqualTo(0, 2);
        cartSteps.verifyQtyOfProductIsEqualTo(1, 3);
    }

    @Test
    public void addConfigurableProductToCartTest() throws InterruptedException {
        loginSteps.doLogin(Constants.VALID_USER_EMAIL, Constants.VALID_USER_PASSWORD);
        cartSteps.navigateToCart();
        cartSteps.emptyCart();
        loginSteps.navigateToHomepage();
        cartSteps.clickOnWomenNewArrivalsSubcategory();
        cartSteps.clickOnProduct(1);
        cartSteps.clickOnProductColor(1);
        cartSteps.clickOnProductSize(1);
        cartSteps.setQuantityTo(3);
        cartSteps.clickOnAddToCartButton();
        cartSteps.verifyNumberOfProductsInCartIsEqualTo(1);
        cartSteps.verifyQtyOfProductIsEqualTo(0, 3);
    }
}
