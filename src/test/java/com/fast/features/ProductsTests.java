package com.fast.features;

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
public class ProductsTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private ProductsSteps productsSteps;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addToCart() {
        loginSteps.login("Hello olaru_iulia");
        productsSteps.navigateToShopPage();
        productsSteps.selectProductFromList("Polo");
        productsSteps.checkSearchResultForProduct("Polo");
        productsSteps.clickAddToCart();
        productsSteps.navigateToCartButton();
        productsSteps.checkProductAddedToCart("Polo");
        cartSteps.clickOnProductRemoveButton();
        cartSteps.checkProductRemoveMessage();

    }

    @Test
    public void addToCartWithIfSelection() {
        loginSteps.login("Hello olaru_iulia");
        productsSteps.navigateToShopPage();
        productsSteps.findProductFromListWithIf("YES", "Single");
        productsSteps.checkSearchResultForProduct("Single");
        productsSteps.clickAddToCart();
        productsSteps.clickOnShoppingCartIcon();
        productsSteps.checkProductAddedToCart("Single");
        cartSteps.clickOnProductRemoveButton();
        cartSteps.checkProductRemoveMessage();
    }

    @Test
    public void addToCartMultipleProducts() {
        productsSteps.navigateToHomePage();
        productsSteps.navigateToShopPage();
        productsSteps.selectProductFromList("Hoodie with Zipper");
        productsSteps.checkSearchResultForProduct("Hoodie with Zipper");
        productsSteps.clickAddToCart();
        productsSteps.checkProductAddedToCartMessage();
        productsSteps.navigateToShopPage();
        productsSteps.selectProductFromList("Polo");
        productsSteps.checkSearchResultForProduct("Polo");
        productsSteps.clickAddToCart();
        productsSteps.checkProductAddedToCartMessage();
        productsSteps.navigateToShopPage();
        productsSteps.selectProductFromList("Long Sleeve Tee");
        productsSteps.checkSearchResultForProduct("Long Sleeve Tee");
        productsSteps.clickAddToCart();
        productsSteps.checkProductAddedToCartMessage();
        productsSteps.navigateToCartButton();

    }
}
