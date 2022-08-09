package com.evozon.features;

import com.evozon.steps.CheckoutSteps;
import com.evozon.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void validCheckoutTest() throws InterruptedException {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterEmail("gotea1@gmail.com");
        loginSteps.enterPassword("asdf1234");
        loginSteps.clickLogin();
        checkoutSteps.navigateToHomepage();
        checkoutSteps.clickProductCategory();
        checkoutSteps.clickJewelrySubcategory();
        checkoutSteps.clickPearlStudEarrings();
        checkoutSteps.clickAddToCartButton();
        checkoutSteps.clickCheckOutButton();
        checkoutSteps.enterCityName("Cluj");
//        checkoutSteps.clickStateField();
        checkoutSteps.selectState("Alabama");
        checkoutSteps.setZipCode("42001");



    }
}
