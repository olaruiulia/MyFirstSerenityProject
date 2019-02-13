package com.fast.steps.serenity;

import com.fast.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CheckoutSteps extends ScenarioSteps {

    CheckoutPage checkoutPage;

    @Step
    public void setFirstName(){
        checkoutPage.setBillingFirstName();
    }

    @Step
    public void setLastName(){
        checkoutPage.setBillingLastName();
    }

    @Step
    public void chooseCountry(){
        checkoutPage.clickOnCountryDropDown();
    }

    @Step
    public void setStreetAddress(){
        checkoutPage.setStreetAddress();
    }

    @Step
    public void setCityName(){
        checkoutPage.setCityName();
    }

    @Step
    public void setPostcode(){
        checkoutPage.setBillingPostCode();
    }

    @Step
    public void setPhoneNumber(){
        checkoutPage.setBillingPhoneNumber();
    }

    @Step
    public void setEmailAddress(){
        checkoutPage.setBillingEmail();
    }

    @Step
    public void createAccountInBilling(){
        checkoutPage.createAccountCheckBox();
    }

    @Step
    public void clickPlaceOrderButton(){
        checkoutPage.clickOnPlaceOrderButton();
    }

    @Step
    public void checkOrderRecievedMessage(){
        Assert.assertTrue(checkoutPage.checkOrderPlacement());
    }

    @Step
    public void setPhoneWithoutValue(){
        checkoutPage.setBillingPhoneNumberWithoutValue();
    }

    @Step
    public void setWrongEmail(){
        checkoutPage.setBillingEmailInvalid();
    }

    @Step
    public void checkWrongThings(){
        checkoutPage.missingDetails();
    }

    @StepGroup
    public void setCheckoutPage(){
        setFirstName();
        setLastName();
        chooseCountry();
        setStreetAddress();
        setCityName();
        setPostcode();
        setPhoneNumber();
        setEmailAddress();
        clickPlaceOrderButton();
        checkOrderRecievedMessage();

    }
}
