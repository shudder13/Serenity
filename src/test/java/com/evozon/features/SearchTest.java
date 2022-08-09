package com.evozon.features;

import com.evozon.pages.HomePage;
import com.evozon.pages.SearchPage;
import com.evozon.steps.LoginSteps;
import com.evozon.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void validSearchTest(){
        searchSteps.navigateToHomepage();
        searchSteps.enterSearchWord("women");
        searchSteps.clickToSearchIcon();
        searchSteps.clickToProduct();
        searchSteps.verifyKeyword("women");

    }
}
