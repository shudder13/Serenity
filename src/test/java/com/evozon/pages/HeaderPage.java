package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HeaderPage extends PageObject {
    @FindBy(css="div.header-language-container p.welcome-msg")
    private WebElementFacade welcomeMessageText;

    public String getWelcomeMessageText() {
        return welcomeMessageText.getText();
    }
}
