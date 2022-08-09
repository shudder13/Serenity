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

    @FindBy(id="billing:region_id")
    private WebElementFacade stateSelectElement;

    @FindBy(id="billing:postcode")
    private WebElementFacade zipField;

    public void setCityField(String value){
        typeInto(cityField, value);
    }

    public void clickStateField(){
        clickOn(stateSelectElement);
    }

    public void setStateSelect(String state) {
        Select stateSelect = new Select(stateSelectElement);
        stateSelect.selectByVisibleText(state);
    }

    public void setZipField(String value) {typeInto(zipField, value);
    }

}
