package com.evozon.steps;

import com.evozon.pages.CheckoutPage;
import com.evozon.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CheckoutSteps extends ScenarioSteps {

    private HomePage homePage;

    private CheckoutPage checkoutPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void clickJewelrySubcategory() {
        homePage.clickJewelrySubcategory();
    }

    @Step
    public void clickProductCategory() {
        homePage.clickProductCategory();
    }

    @Step
    public void clickPearlStudEarrings() {
        homePage.clickPearlStudEarrings();
    }

    @Step
    public void clickAddToCartButton() {
        homePage.clickAddToCartButton();
        Assert.assertEquals("Pearl Stud Earrings was added to your shopping cart.\n", checkoutPage.getSuccessMessage());

    }

    @Step
    public void clickCheckOutButton() {
        homePage.clickCheckOutButton();
    }

    @Step
    public void setAdress(String value) {
        checkoutPage.setAdressField(value);
    }

    @Step
    public void enterCityName(String cityName) {
        checkoutPage.setCityField(cityName);
    }

    @Step
    public void setZipCode(String zipCode) {
        checkoutPage.setZipField(zipCode);
    }

    @Step
    public void clickCountryField() {
        checkoutPage.clickCountryField();
    }

    @Step
    public void selectCountry(String country) {
        checkoutPage.setCountrySelect(country);
    }

    @Step
    public void setTelephoneNumber(String value) {
        checkoutPage.setTelephoneField(value);
    }

    @Step
    public void clickOnFlatRateRadioButton() {
        checkoutPage.clickOnFlatRateRadioButton();
    }

    @Step
    public void clickOnShippingMethodContinueButton() {
        checkoutPage.clickOnShippingMethodContinueButton();
    }

    @Step
    public void clickOnPaymentMethodContinueButton() {
        checkoutPage.clickOnPaymentInformationContinueButton();
    }

    @Step
    public void clickOnPlaceOrderButton() {
        checkoutPage.clickOnPlaceOrderButton();
    }

    @Step
    public void setSuccessMessage(String value) {
        checkoutPage.setSuccessMessage(value);
        Assert.assertEquals("THANK YOU FOR YOUR PURCHASE!\n", checkoutPage.getSuccessMessage());
    }

    @Step
    public void clickOnBillingInformationContinueButton() {
        checkoutPage.clickOnBillingInformationContinueButton();
    }

    @Step
    public void clickOnShippingInformationLink() {
        checkoutPage.waitUntilShippingEditLinkIsVisible();
        if (!checkoutPage.isShippingInformationSectionActive())
            checkoutPage.clickOnShippingInformationLink();
    }

    @Step
    public void clickOnShippingInformationContinueButton() {
        checkoutPage.clickOnShippingInformationContinueButton();
    }

    @Step
    public void clickOnShipToThisAddressRadioButton() {
        checkoutPage.clickOnShipToThisAddressRadioButton();
    }
}
