package com.fast.features;

import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTests {

        @Managed(uniqueSession = true)
        private WebDriver driver;

        @Steps
        RegisterSteps registerSteps;

        @Test
        public void validRegister(){
        registerSteps.navigateToHomePage();
        registerSteps.clickMyAccountButton();
        registerSteps.setEmailField();
        registerSteps.setPasswordField();
        registerSteps.clickRegisterButton();
        registerSteps.checkRegistration();

        }
}
