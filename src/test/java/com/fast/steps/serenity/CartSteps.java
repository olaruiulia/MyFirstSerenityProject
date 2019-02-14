package com.fast.steps.serenity;
import com.fast.pages.CartPage;
import com.fast.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {


    CartPage cartPage;
    HomePage homePage;

    @Step
    public void navigateToHomePage(){
        getDriver().manage().window().maximize();
        homePage.open();
    }

    @Step
    public void navigateToShopButton(){
        homePage.clickShopButton();
    }

    @Step
    public void navigateToCartButton(){
        homePage.clickCartButton();
    }

    @Step
    public void changeProductQuantity(){
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

    @Step
    public void clickOnProductRemoveButton(){
        cartPage.clickOnProductRemoveButton();
    }

    @Step
    public void checkProductRemove(){
        Assert.assertTrue(cartPage.checkProductRemove());
    }
}
