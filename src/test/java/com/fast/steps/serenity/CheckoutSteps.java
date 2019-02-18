package com.fast.steps.serenity;

import com.fast.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CheckoutSteps extends ScenarioSteps {

    private CheckoutPage checkoutPage;

    @Step
    public void setFirstName(String firstName){
        checkoutPage.setBillingFirstName(firstName);
    }

    @Step
    public void setLastName(String lastName){
        checkoutPage.setBillingLastName(lastName);
    }

    @Step
    public void chooseCountry(){
        checkoutPage.clickOnCountryDropDown("Romania");
    }

    @Step
    public void setStreetAddress(){
        checkoutPage.setStreetAddress("Sunshine Boulevard");
    }

    @Step
    public void setCityName(){
        checkoutPage.setCityName("Cluj Napoca");
    }

    @Step
    public void setPostcode(){
        checkoutPage.setBillingPostCode("225478");
    }

    @Step
    public void setPhoneNumber(){
        checkoutPage.setBillingPhoneNumber("+00875874569554");
    }

    @Step
    public void setEmailAddress(){
        checkoutPage.setBillingEmail("formula1@email.com");
    }

    @Step
    public void createAccountInBilling(){
        checkoutPage.createAccountCheckBox();
    }

    @Step
    public void setCreateAccountPasswordInCheckout(){
        checkoutPage.setCreateAccountPasswordInCheckout("anythingispossible");
    }

    @Step
    public void setOrderComments(){
        checkoutPage.setOrderComments("Watch me race");
    }

    @Step
    public void clickPlaceOrderButton(){
        checkoutPage.clickOnPlaceOrderButton();
    }

    @Step
    public void checkOrderReceivedMessage(){
        Assert.assertTrue(checkoutPage.checkOrderPlacement("Thank you. Your order has been received."));
    }

    @Step
    public void setPhoneWithoutValue(){
        checkoutPage.setBillingPhoneNumberWithoutValue("");
    }

    @Step
    public void setWrongEmail(){
        checkoutPage.setBillingEmailInvalid("nonexisting@.com");
    }

    @Step
    public void missingDetails(){
        checkoutPage.missingDetails("Billing Phone is a required field.", "Billing Email address is not a valid email address.","0788569421","new.email@email.com" );
    }

}
