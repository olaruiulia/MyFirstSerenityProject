package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void goToLogin(){
        homePage.clickMyAccountButton();

    }

    @Step
    public void setUser(){
        loginPage.setEmailField();
    }

    @Step
    public void setPassword(){
        loginPage.setPasswordField();
    }

    @Step
    public void clickOnLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void checkLoggedIn(){
        Assert.assertTrue(myAccountPage.checkLoggedIn());
    }

    @StepGroup
    public void login(){
        navigateToHomepage();
        goToLogin();
        setUser();
        setPassword();
        clickOnLoginButton();
        checkLoggedIn();
    }
}
