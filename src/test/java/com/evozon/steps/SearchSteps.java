package com.evozon.steps;

import com.evozon.pages.HomePage;
import com.evozon.pages.SearchPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

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
}
