package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import com.fast.pages.HomePage;
import com.fast.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CartSteps extends ScenarioSteps {

    HomePage homePage;
    ShopPage shopPage;


    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToShopPage(){
        homePage.clickShopButton();
    }

    @Step
    public void addBeanieItemToCart(){
        shopPage.addBeanieToCart();
    }

    @Step
    public void navigateToCart(){
        homePage.clickCartButton();
    }
}
