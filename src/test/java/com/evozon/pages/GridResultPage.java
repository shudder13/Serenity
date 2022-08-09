package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public abstract class GridResultPage extends PageObject {
    @FindBy(css="ul.products-grid")
    private WebElementFacade resultList;

    @FindBy(css="ul.products-grid > li.item.last > a")
    private List<WebElementFacade> results;

    public Integer getNumberOfResults() {
        return results.size();
    }

    public List<WebElementFacade> getResults() {
        return results;
    }
}
