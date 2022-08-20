package com.evozon.features;

import com.evozon.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/java/com/evozon/data/user.csv")
public class LoginTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    private String username, password;

    @Test
    public void validLoginTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterEmail(username);
        loginSteps.enterPassword(password);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("Andreea i. Gotea");
    }
}
