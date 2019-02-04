package com.fast.features;

import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void validLoginTest(){
       loginSteps.navigateToHomepage();
       loginSteps.goToLogin();
       loginSteps.setUser();
       loginSteps.setPassword();
       loginSteps.clickOnLoginButton();
       loginSteps.checkLoggedIn();
    }

    @Test
    public void validLogin(){
        loginSteps.login();
    }

}
