package com.evozon.steps;

import com.evozon.pages.CheckoutPage;
import com.evozon.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class CheckoutSteps {

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
    public void clickProductCategory() {homePage.clickProductCategory();}
    @Step
    public void clickPearlStudEarrings() {homePage.clickPearlStudEarrings();}
    @Step
    public void clickAddToCartButton() {homePage.clickAddToCartButton();}
    @Step
    public void clickCheckOutButton() {homePage.clickCheckOutButton();}

    @Step
    public void setAdress(String value){
        checkoutPage.setAdressField(value);
    }
    @Step
    public void enterCityName(String cityName) {checkoutPage.setCityField(cityName);
    }
//    @Step
//    public void clickStateField() {checkoutPage.clickStateField();}
//    @Step
//    public void selectState(String state) {
//        checkoutPage.setStateSelect(state);
//    }
    @Step
    public void setZipCode(String zipCode){
        checkoutPage.setZipField(zipCode);
    }
    @Step
    public void clickCountryField() {checkoutPage.clickCountryField();}

    @Step
    public void selectCountry(String country) {
        checkoutPage.setCountrySelect(country);
    }
    @Step
    public void setTelephoneNumber(String value) {
        checkoutPage.setTepephoneField(value);
    }
    @Step
    public void clickBillingInformationButton(){
        checkoutPage.clickFinalBillingInformationButton();
    }
    @Step
    public void clickShippingInformationButton(){
        checkoutPage.clickShippingInformationButton();
    }
    @Step
    public void clickShippingInformationButtonStep2(){
        checkoutPage.clickShippingInformationStep2();
    }
    @Step
    public void clickFlatRate(){
        checkoutPage.clickFlatRate();
    }

    @Step
    public void clickContiuneShippingMethodButton(){
        checkoutPage.clickContinueShippingMethodButton();
    }

    @Step
    public void clickContinuePaymentMethodButton(){
        checkoutPage.clickContinuePaymentInformation();
    }
    @Step
    public void clickPlaceOrderButton() {
        checkoutPage.clickPlaceOrder();
    }
}
