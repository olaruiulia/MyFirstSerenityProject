package com.fast.features;

import com.fast.steps.serenity.AdminSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.RegisterSteps;
import com.fast.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private AdminSteps adminSteps;

    private String userName = RandomStringUtils.randomAlphanumeric(7);
    private String email = userName + "@email.com";

    @Test
    public void validRegister() {
        registerSteps.navigateToHomePage();
        registerSteps.clickMyAccountButton();
        registerSteps.setEmailField(email);
        registerSteps.setPasswordField("somethingelse1234");
        registerSteps.clickRegisterButton();
        registerSteps.checkRegistration(userName);

    }

    @Test
    public void invalidRegister() {
        registerSteps.navigateToHomePage();
        registerSteps.clickMyAccountButton();
        registerSteps.setEmailField(email);
        registerSteps.setPasswordField("simple");
        registerSteps.checkWeakPasswordAlert();
    }

    @Test
    public void checkRegistrationInAdmin() {
        registerSteps.navigateToHomePage();
        registerSteps.clickMyAccountButton();
        registerSteps.setEmailField(email);
        registerSteps.setPasswordField("somethingelse54896");
        registerSteps.clickRegisterButton();
        loginSteps.clickLogoutButton();
        loginSteps.setUserEmail(Constants.ADMIN_USERNAME);
        loginSteps.setPassword(Constants.ADMIN_PASSWORD);
        loginSteps.clickOnLoginButton();
        loginSteps.checkLoggedIn("Hello admin");
        adminSteps.selectDashboard();
        adminSteps.clickOnDashboard();
        adminSteps.selectMainMenuCategory("Users");
        adminSteps.clickOnAllUsersButton();
        adminSteps.setUserSearchField(userName);
        adminSteps.clickOnSearchUsersButton();
        adminSteps.checkExistingUser(userName);

    }
}
