package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("http://qa2magento.dev.evozon.com/")
public class CheckoutPage extends PageObject {

@FindBy(id = "billing:city")
    private WebElementFacade cityField;

//    @FindBy(css="div.field.validate-select.required-entry")
//    private WebElementFacade stateSelectElement;

    @FindBy(id="billing:postcode")
    private WebElementFacade zipField;

    @FindBy(id="billing:country_id")
    private WebElementFacade countrySelectElement;

    @FindBy(id="billing:telephone")
    private WebElementFacade telephoneField;

    @FindBy(css = "#billing-buttons-container button")
    private WebElementFacade finalBillingInformation;

    @FindBy(css="#opc-shipping div.step-title a")
    private WebElementFacade editButton;

    @FindBy(css = "#opc-shipping div.step-title")
    private WebElementFacade selectShippingInformation;

    @FindBy(css = "#shipping-buttons-container .button")
    private WebElementFacade shippingInformationButtonStep2;

    public void setCityField(String value){
        typeInto(cityField, value);
    }

//    public void clickStateField(){
//        clickOn(stateSelectElement);
//    }

//    public void setStateSelect(String state) {
//        Select stateSelect = new Select(stateSelectElement);
//        stateSelect.selectByVisibleText(state);
//    }

    public void setZipField(String value) {typeInto(zipField, value);
    }

    public void clickCountryField(){
        clickOn(countrySelectElement);
    }
    public void setCountrySelect(String country){
        Select countrySelect = new Select(countrySelectElement);
        countrySelect.selectByVisibleText(country);
    }

    public void setTepephoneField(String value){
        typeInto(telephoneField, value);
    }

    public void clickFinalBillingInformationButton(){
        clickOn(finalBillingInformation);
        waitFor(editButton);
    }

    public void clickShippingInformationButton(){
        clickOn(selectShippingInformation);
    }

    public void clickShippingInformationStep2(){
        clickOn(shippingInformationButtonStep2);
    }

}
