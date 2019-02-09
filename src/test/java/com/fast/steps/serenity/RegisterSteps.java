package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.MyAccountPage;
import com.fast.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

public class RegisterSteps extends ScenarioSteps {

    HomePage homePage;
    RegisterPage registerPage;
    MyAccountPage myAccountPage;

    private String userName =RandomStringUtils.randomAlphanumeric(7);
    private String email = userName+"@email.com";

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void clickMyAccountButton (){
        homePage.clickMyAccountButton();
    }

    @Step
    public void setEmailField(){
        registerPage.setRegisterEmailField(email);
    }

    @Step
    public void setPasswordField(){
        registerPage.setRegisterPasswordField();
    }

    @Step
    public void clickRegisterButton(){
        registerPage.clickOnRegisterButton();
    }

    @Step
    public void checkRegistration(){
        Assert.assertTrue(myAccountPage.checkRegister(userName));

    }

    @StepGroup
    public void validRegister(){
        navigateToHomePage();
        clickMyAccountButton();
        setEmailField();
        setPasswordField();
    }
}
