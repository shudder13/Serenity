package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("http://qa2magento.dev.evozon.com/")
public class CheckoutPage extends PageObject {

    @FindBy(css = "#co-billing-form [title = \"Street Address\"]")
    private WebElementFacade adressField;

    @FindBy(css = "#co-billing-form [title = \"City\"]")
    private WebElementFacade cityField;

//    @FindBy(css="div.field.validate-select.required-entry")
//    private WebElementFacade stateSelectElement;

    @FindBy(css = "#co-billing-form [title = \"Zip/Postal Code\"]")
    private WebElementFacade zipField;

    @FindBy(css = "#co-billing-form [title = \"Country\"]")
    private WebElementFacade countrySelectElement;

    @FindBy(css = "#co-billing-form [title = \"Telephone\"]")
    private WebElementFacade telephoneField;

    @FindBy(css = "#billing-buttons-container button")
    private WebElementFacade finalBillingInformation;

    @FindBy(css = "#opc-shipping div.step-title a")
    private WebElementFacade editButton;
    @FindBy(css = "#opc-shipping div.step-title")
    private WebElementFacade selectShippingInformation;

    @FindBy(css = "#co-shipping-form [title = \"Continue\"]")
    private WebElementFacade shippingInformationButtonStep2;

    @FindBy(css = "#co-shipping-method-form [value=\"freeshipping_freeshipping\"]")
    private WebElementFacade chooseFlatRate;

    @FindBy(css = "#shipping-method-buttons-container .button")
    private WebElementFacade shippingMethodButton;

    @FindBy(css = "#payment-buttons-container .button")
    private WebElementFacade paymentInformationButton;

    @FindBy(css = "#review-buttons-container .button.btn-checkout")
    private WebElementFacade placeOrderButton;

    public void setAdressField(String value) {
        typeInto(adressField, value);
    }

    public void setCityField(String value) {
        typeInto(cityField, value);
    }

//    public void clickStateField(){
//        clickOn(stateSelectElement);
//    }

//    public void setStateSelect(String state) {
//        Select stateSelect = new Select(stateSelectElement);
//        stateSelect.selectByVisibleText(state);
//    }

    public void setZipField(String value) {
        typeInto(zipField, value);
    }

    public void clickCountryField() {
        clickOn(countrySelectElement);
    }

    public void setCountrySelect(String country) {
        Select countrySelect = new Select(countrySelectElement);
        countrySelect.selectByVisibleText(country);
    }

    public void setTelephoneField(String value) {
        typeInto(telephoneField, value);
    }

    public void clickFinalBillingInformationButton() {
        finalBillingInformation.waitUntilVisible();
        clickOn(finalBillingInformation);
//        waitFor(editButton);
    }

    public void clickShippingInformationButton() {
        selectShippingInformation.waitUntilClickable();
        clickOn(selectShippingInformation);
    }

    public void clickShippingInformationStep2() {
//        waitABit(5000000);
        shippingInformationButtonStep2.waitUntilClickable();
//        waitFor(editButton);
        clickOn(shippingInformationButtonStep2);

    }

    public void clickFlatRate() {
        chooseFlatRate.waitUntilClickable();
//        waitABit(5000000);
        clickOn(chooseFlatRate);
    }

    public void clickContinueShippingMethodButton() {
        shippingMethodButton.waitUntilVisible();
        shippingMethodButton.waitUntilClickable();
        clickOn(shippingMethodButton);

    }

    public void clickContinuePaymentInformation() {
        paymentInformationButton.waitUntilClickable();
        clickOn(paymentInformationButton);
    }

    public void clickPlaceOrder() {
        placeOrderButton.waitUntilVisible();
        clickOn(placeOrderButton);
    }

}


