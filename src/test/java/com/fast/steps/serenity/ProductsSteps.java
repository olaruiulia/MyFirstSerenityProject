package com.fast.steps.serenity;
import com.fast.pages.CartPage;
import com.fast.pages.HomePage;
import com.fast.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class ProductsSteps extends ScenarioSteps {

    HomePage homePage;
    ShopPage shopPage;
    CartPage cartPage;

    @Step
    public void navigateToHomePage(){
        getDriver().manage().window().maximize();
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
    public void selectProductFromList(){
        Assert.assertTrue(shopPage.selectProductFromList());
    }

    @Step
    public void selectProductFromIfList(){
        shopPage.findProductFromListWithIf();
    }
    @Step
    public void clickAddToCart(){
        shopPage.clickAddToCart();
    }
    @Step
    public void clickOnShoppingCartIcon(){
        homePage.clickOnShoppingCartIcon();
    }

    @Step
    public void navigateToCartButton(){
        homePage.clickCartButton();
    }

    @Step
    public void checkProductAddedToCart(){
        Assert.assertTrue(cartPage.checkProductInCart());
    }

    @Step
    public void checkProductInCartFromIfList(){
        Assert.assertTrue(cartPage.checkIfProductInCart());
    }

    @StepGroup
    public void addToCartItem(){
        navigateToHomePage();
        navigateToShopPage();
        selectProduct();
        clickAddToCart();
        navigateToCartButton();
    }
}
