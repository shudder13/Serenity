package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("http://qa2magento.dev.evozon.com/")
public class CheckoutPage extends PageObject {

    @FindBy(css = "#co-billing-form [title = \"Street Address\"]")
    private WebElementFacade adressField;

    @FindBy(css = "#co-billing-form [title = \"City\"]")
    private WebElementFacade cityField;

    @FindBy(css = "#co-billing-form [title = \"Zip/Postal Code\"]")
    private WebElementFacade zipField;

    @FindBy(css = "#co-billing-form [title = \"Country\"]")
    private WebElementFacade countrySelectElement;

    @FindBy(css = "#co-billing-form [title = \"Telephone\"]")
    private WebElementFacade telephoneField;

    @FindBy(id = "s_method_flatrate_flatrate")
    private WebElementFacade flatRateRadioButton;

    @FindBy(css = "#shipping-method-buttons-container .button")
    private WebElementFacade shippingMethodContinueButton;

    @FindBy(css = "#payment-buttons-container .button")
    private WebElementFacade paymentInformationContinueButton;

    @FindBy(css = "#review-buttons-container button")
    private WebElementFacade placeOrderButton;

    @FindBy(css="div.col-main .sub-title")
    private WebElementFacade successMessage;

    @FindBy(css="#billing-buttons-container button[title='Continue']")
    private WebElementFacade billingInformationContinueButton;

    @FindBy(id="opc-shipping")
    private WebElementFacade shippingInformationSection;

    @FindBy(css="#opc-shipping > div > a")
    private WebElementFacade shippingInformationEditLink;

    @FindBy(css="#shipping-buttons-container button[title=Continue]")
    private WebElementFacade shippingInformationContinueButton;

    @FindBy(id="billing:use_for_shipping_yes")
    private WebElementFacade shipToThisAddressRadioButton;

    public WebElementFacade getSuccessMessage() {
        return successMessage;
    }

    public void setAdressField(String value) {
        typeInto(adressField, value);
    }

    public void setCityField(String value) {
        typeInto(cityField, value);
    }

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

    public void clickOnFlatRateRadioButton() {
        // flatRateRadioButton.waitUntilVisible();
        flatRateRadioButton.select();
    }

    public void clickOnShippingMethodContinueButton() {
        shippingMethodContinueButton.waitUntilClickable();
        clickOn(shippingMethodContinueButton);

    }

    public void clickOnPaymentInformationContinueButton() {
        paymentInformationContinueButton.waitUntilClickable();
        clickOn(paymentInformationContinueButton);
    }

    public void clickOnPlaceOrderButton() {
        placeOrderButton.waitUntilClickable();
        clickOn(placeOrderButton);
    }

    public void setSuccessMessage(String value){
        typeInto(successMessage, value);
    }

    public void clickOnBillingInformationContinueButton() {
        clickOn(billingInformationContinueButton);
    }

    public void waitUntilShippingEditLinkIsVisible() {
        shippingInformationEditLink.waitUntilVisible();
    }

    public void clickOnShippingInformationLink() {
        shippingInformationEditLink.click();
    }

    public boolean isShippingInformationSectionActive() {
        return shippingInformationSection.hasClass("active");
    }

    public void clickOnShippingInformationContinueButton() {
        shippingInformationContinueButton.waitUntilClickable();
        shippingInformationContinueButton.click();
    }

    public void clickOnShipToThisAddressRadioButton() {
        shipToThisAddressRadioButton.click();
    }
}
