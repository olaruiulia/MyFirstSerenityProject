package com.fast.features;
import com.fast.pages.HomePage;
import com.fast.steps.serenity.CartSteps;
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
    HomePage homePage;

    @Steps
    ProductsSteps productsSteps;

    @Steps
    CartSteps cartSteps;

    @Test
    public void changeProductQuantity(){
        homePage.open();
        homePage.clickShopButton();
        productsSteps.selectProduct();
        productsSteps.clickAddTOCart();
        cartSteps.navigateToCartButton();
        cartSteps.changeProductQuanity();
        cartSteps.clickUpdateCart();
    }




}
