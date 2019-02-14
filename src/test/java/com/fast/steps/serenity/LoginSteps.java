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
        getDriver().manage().window().maximize();
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

    @Step
    public void setUserAdmin(){
        loginPage.setEmailFieldAdmin();
    }

    @Step
    public void setPasswordAdmin(){
        loginPage.setPasswordFieldAdmin();
    }

    @Step
    public void checkLoggedInAdmin(){
        Assert.assertTrue(myAccountPage.checkLoggedInAdmin());
    }

    @Step
    public void checkInvalidLoginMessage(){
        Assert.assertTrue(loginPage.checkInvalidLoginMessage());
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

    @StepGroup
    public void loginAsAdmin(){
        navigateToHomepage();
        goToLogin();
        setUserAdmin();
        setPasswordAdmin();
        clickOnLoginButton();
        checkLoggedInAdmin();
    }

    @Step
    public void invalidLoginIfStep(){
        loginPage.invalidLoginIfNextStep();
    }

    @Step
    public void setPassword2(){
        loginPage.setPasswordField2();
    }

}
