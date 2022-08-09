package com.evozon.features;

import com.evozon.models.Customer;
import com.evozon.pages.HomePage;
import com.evozon.steps.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void validRegisterTest() {
        Customer customer = new Customer();
        registerSteps.navigateToHomepage();
        registerSteps.navigateToRegisterPage();
        registerSteps.completeForm(customer);
        registerSteps.verifyUserIsLoggedIn(customer);
    }

}
