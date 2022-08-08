package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2magento.dev.evozon.com/customer/account/")
public class AccountPage extends PageObject {

    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeTextParagraph;


    public String getWelcomeText(){
        return welcomeTextParagraph.getText();
    }
}
