package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
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

    @FindBy(css = "li[id='opc-shipping'][class*='section allow']")
    private WebElementFacade shippingInformationButtonStep2;

    @FindBy(id = "s_method_flatrate_flatrate")
    private WebElementFacade chooseFlatRate;

    @FindBy(css = "li[id='opc-shipping_method'][class*='section allow']")
    private WebElementFacade shippingMethodButton;

    @FindBy(css = "#payment-buttons-container .button")
    private WebElementFacade paymentInformationButton;

    @FindBy(css = "#review-buttons-container button")
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

    public void setTepephoneField(String value) {
        typeInto(telephoneField, value);
    }

    public void clickFinalBillingInformationButton() {
        finalBillingInformation.waitUntilVisible();
        clickOn(finalBillingInformation);
//        waitFor(editButton);
    }

    public void clickShippingInformationButton() {
        selectShippingInformation.waitUntilVisible();
        clickOn(selectShippingInformation);
    }

    public void clickShippingInformationStep2() {
//        waitABit(5000000);
        shippingInformationButtonStep2.waitUntilPresent();
        clickOn(shippingInformationButtonStep2);
//        waitFor(editButton);
    }

    public void clickFlatRate() {
        chooseFlatRate.waitUntilVisible();
//        waitABit(5000000);
        clickOn(chooseFlatRate);
    }

    public void clickContinueShippingMethodButton() {
        shippingMethodButton.waitUntilVisible();
        shippingMethodButton.waitUntilClickable();
        clickOn(shippingMethodButton);

    }

    public void clickContinuePaymentInformation() {
        paymentInformationButton.waitUntilVisible();
        clickOn(paymentInformationButton);
    }

    public void clickPlaceOrder() {
        placeOrderButton.waitUntilVisible();
        clickOn(placeOrderButton);
    }
}


