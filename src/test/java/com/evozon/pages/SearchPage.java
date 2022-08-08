package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2magento.dev.evozon.com/customer/account/create/")
public class SearchPage extends PageObject {

    @FindBy(id="search")
    private WebElementFacade searchButton;

    @FindBy(id="search")
    private WebElementFacade

    public void setSearchField(String value){
        typeInto(searchButton, value);
    }

    public void clickSearchIcon(){
        clickOn();
    }
}

