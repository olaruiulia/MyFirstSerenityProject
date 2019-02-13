package com.fast.features;


import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.CheckoutSteps;
import com.fast.steps.serenity.ProductsSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTests {

    @Managed(uniqueSession = true)
    private WebDriver webDriver;

    @Steps
    ProductsSteps productsSteps;

    @Steps
    CartSteps cartSteps;

    @Steps
    CheckoutSteps checkoutSteps;

    @Test
    public void checkout() {

        productsSteps.addToCartItem();
        cartSteps.clickCheckoutButton();
        checkoutSteps.setFirstName();
        checkoutSteps.setLastName();
        checkoutSteps.chooseCountry();
        checkoutSteps.setCityName();
        checkoutSteps.setStreetAddress();
        checkoutSteps.setPostcode();
        checkoutSteps.setPhoneNumber();
        checkoutSteps.setEmailAddress();
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkOrderRecievedMessage();
    }

    @Test
    public void checkoutInvalid(){
        productsSteps.addToCartItem();
        cartSteps.clickCheckoutButton();
        checkoutSteps.setFirstName();
        checkoutSteps.setLastName();
        checkoutSteps.chooseCountry();
        checkoutSteps.setCityName();
        checkoutSteps.setStreetAddress();
        checkoutSteps.setPostcode();
        checkoutSteps.setPhoneWithoutValue();
        checkoutSteps.setWrongEmail();
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkWrongThings();
    }
}
