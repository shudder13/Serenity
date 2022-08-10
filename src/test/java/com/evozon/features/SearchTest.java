package com.evozon.features;

import com.evozon.pages.HomePage;
import com.evozon.pages.SearchPage;
import com.evozon.steps.LoginSteps;
import com.evozon.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/java/com/evozon/data/product.csv")
public class SearchTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private SearchSteps searchSteps;

    private String productname;


    @Test
    public void validSearchTest(){
        searchSteps.navigateToHomepage();
        searchSteps.enterSearchWord(productname);
        searchSteps.clickToSearchIcon();
        searchSteps.clickToProduct();
        searchSteps.verifyKeyword(productname);

    }
}
