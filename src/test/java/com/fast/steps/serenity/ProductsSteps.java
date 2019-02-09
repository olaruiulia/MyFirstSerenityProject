package com.fast.steps.serenity;
import com.fast.pages.CartPage;
import com.fast.pages.HomePage;
import com.fast.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class ProductsSteps extends ScenarioSteps {

    HomePage homePage;
    ShopPage shopPage;
    CartPage cartPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToShopPage(){
        homePage.clickShopButton();
    }

    @Step
    public void selectProduct(){
        Assert.assertTrue(shopPage.selectProduct());
    }

    @Step
    public void clickAddToCart(){
        shopPage.clickAddToCart();
    }

    @Step
    public void navigateToCartButton(){
        homePage.clickCartButton();
    }

    @Step
    public void checkProductAddedToCart(){
        Assert.assertTrue(cartPage.checkProductInCart());
    }
}
