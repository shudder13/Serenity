package com.evozon.steps;

import com.evozon.pages.HomePage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchSteps {
    private HomePage homePage;

    @Step
    public void enterProductName(String productName) {
        homePage.setSearchField(productName);

    }

}
