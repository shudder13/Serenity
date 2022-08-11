package com.evozon.features;

import com.evozon.steps.CheckoutSteps;
import com.evozon.steps.LoginSteps;
import com.evozon.utils.Constants;
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
    public void validCheckoutTest() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterEmail(Constants.VALID_USER_EMAIL);
        loginSteps.enterPassword(Constants.VALID_USER_PASSWORD);
        loginSteps.clickLogin();
        checkoutSteps.navigateToHomepage();
        checkoutSteps.clickProductCategory();
        checkoutSteps.clickJewelrySubcategory();
        checkoutSteps.clickPearlStudEarrings();
        checkoutSteps.clickAddToCartButton();
        checkoutSteps.clickCheckOutButton();
        checkoutSteps.setAdress("Str. Florilor, nr. 2");
        checkoutSteps.enterCityName("Cluj");
        checkoutSteps.setZipCode("42001");
        checkoutSteps.selectCountry("Albania");
        checkoutSteps.setTelephoneNumber("0765437890");
        checkoutSteps.clickOnShipToThisAddressRadioButton();
        checkoutSteps.clickOnBillingInformationContinueButton();
        checkoutSteps.clickOnShippingInformationLink();
        checkoutSteps.clickOnShippingInformationContinueButton();
        checkoutSteps.clickOnFlatRateRadioButton();
        checkoutSteps.clickOnShippingMethodContinueButton();
        checkoutSteps.clickOnPaymentMethodContinueButton();
        checkoutSteps.clickOnPlaceOrderButton();
    }
}
