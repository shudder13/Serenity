package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends PageObject {

    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeTextParagraph;


    public String getWelcomeText(){
        return welcomeTextParagraph.getText();
    }
}
