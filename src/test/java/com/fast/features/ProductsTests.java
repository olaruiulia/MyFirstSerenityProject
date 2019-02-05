package com.fast.features;
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
        LoginSteps loginSteps;

        @Steps
        ProductsSteps productsSteps;

        @Test
        public void addToCart() {
            loginSteps.login();
            productsSteps.navigateToShopPage();
            productsSteps.selectProduct();
            productsSteps.clickAddTOCart();
            productsSteps.navigateToCartButton();
            productsSteps.checkProductAddedToCart();
        }
    }
