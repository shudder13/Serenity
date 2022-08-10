package com.evozon.steps;

import com.evozon.pages.HomePage;
import com.evozon.pages.SearchPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;

public class SearchSteps {
    private HomePage homePage;

    private SearchPage searchPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }
    @Step
    public void enterSearchWord (String productName) {
        searchPage.setSearchField(productName);

    }
    @Step
    public void clickToSearchIcon() {
        searchPage.clickSearchIcon();
    }
    @Step
    public void clickToProduct() {
        searchPage.clickProduct();
    }

    @Step
    public void verifyKeyword(String productName) {
        Assert.assertTrue(searchPage.getProductDescription().contains(productName));
    }

    @Step
    public void verifyResultsHaveProduct(String productName) {
        List<WebElementFacade> products = searchPage.getResults();
        for (WebElementFacade product : products) {
            if (product.getAttribute("title").equals(productName))
                return;
        }
        throw new AssertionError("Product not found");
    }
}
