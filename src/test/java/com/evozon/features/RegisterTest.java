package com.evozon.features;

import com.evozon.models.Customer;
import com.evozon.steps.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void validRegisterTest() throws IOException {
        Customer customer = new Customer();

        registerSteps.navigateToHomepage();
        withTestDataFrom("src/test/java/com/evozon/data/register.csv").run(registerSteps).registerAndLogOut(customer);
    }

    @Test
    public void wrongConfirmationPasswordOnRegisterTest() {
        Customer customer = new Customer();
        customer.setConfirmPassword(" " + customer.getConfirmPassword());

        registerSteps.navigateToHomepage();
        registerSteps.navigateToRegisterPage();
        registerSteps.completeForm(customer);
        registerSteps.verifyDifferentPasswordsErrorIsDisplayed();
    }

    @Test
    public void noLastNameEnteredOnRegisterTest() {
        Customer customer = new Customer();
        customer.setLastName("");

        registerSteps.navigateToHomepage();
        registerSteps.navigateToRegisterPage();
        registerSteps.completeForm(customer);
        registerSteps.verifyLastNameIsARequiredField();
    }
}
