package com.fast.features;

import com.fast.steps.serenity.*;
import com.fast.utils.Constants;
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
    LoginSteps loginSteps;

    @Steps
    private ProductsSteps productsSteps;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Steps
    private AdminSteps adminSteps;

    @Test
    public void checkout(){
        productsSteps.addToCartItem("Polo");
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
        checkoutSteps.checkOrderReceivedMessage();
    }

    @Test
    public void checkoutInvalid(){
        productsSteps.addToCartItem("Polo");
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
        checkoutSteps.missingDetails();
        checkoutSteps.createAccountInBilling();
        checkoutSteps.setCreateAccountPasswordInCheckout();
        checkoutSteps.setOrderComments();
    }

    @Test
    public void checkOrderInAdmin() {
        loginSteps.login("Hello olaru_iulia");
        productsSteps.addToCartItem("Beanie with Logo");
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
        checkoutSteps.checkOrderReceivedMessage();
        loginSteps.clickMyAccountButton();
        loginSteps.clickLogoutButton();
        loginSteps.setUserEmail(Constants.ADMIN_USERNAME);
        loginSteps.setPassword(Constants.ADMIN_PASSWORD);
        loginSteps.clickOnLoginButton();
        adminSteps.selectDashboard();
        adminSteps.clickOnDashboard();
        adminSteps.selectMainMenuCategory("WooCommerce");
        adminSteps.clickOnOrdersButton();
        adminSteps.checkOrderUsernameList();
    }
}
