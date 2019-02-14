package com.fast.features;
import com.fast.pages.HomePage;
import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.ProductsSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    HomePage homePage;

    @Steps
    ProductsSteps productsSteps;

    @Steps
    CartSteps cartSteps;

    @Test
    public void changeProductQuantity(){
        cartSteps.navigateToHomePage();
        cartSteps.navigateToShopButton();
        productsSteps.selectProduct();
        productsSteps.clickAddToCart();
        cartSteps.navigateToCartButton();
        cartSteps.changeProductQuantity();
        cartSteps.clickUpdateCart();
        cartSteps.checkQuantityPriceUpdate();
    }

    @Test
    public void deleteFromCart(){
        cartSteps.navigateToHomePage();
        loginSteps.login();
        cartSteps.navigateToShopButton();
        productsSteps.selectProductFromList();
        productsSteps.clickAddToCart();
        cartSteps.navigateToCartButton();
        cartSteps.clickOnProductRemoveButton();
        cartSteps.checkProductRemove();


    }





}
