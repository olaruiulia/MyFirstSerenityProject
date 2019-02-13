package com.fast.steps.serenity;
import com.fast.pages.CartPage;
import com.fast.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CartSteps extends ScenarioSteps {


    CartPage cartPage;


    @Step
    public void navigateToCartButton(){
        cartPage.clickCartButton();
    }

    @Step
    public void changeProductQuanity(){
        cartPage.changeQuantity();
    }

    @Step
    public void clickUpdateCart(){
        cartPage.clickUpdateCartButton();
    }

    @Step
    public void clickCheckoutButton(){
        cartPage.proceedToCheckoutButton();
    }

    @Step
    public void checkQuantityPriceUpdate(){
        cartPage.checkQuantityPriceUpdate();
    }
}
