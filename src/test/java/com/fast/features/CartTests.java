package com.fast.features;

import com.fast.steps.serenity.CartSteps;
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
    CartSteps cartSteps;

    @Test
    public void addToCart() {
        cartSteps.navigateToHomePage();
        cartSteps.navigateToShopPage();
        cartSteps.addBeanieItemToCart();
        cartSteps.navigateToCart();
    }
}
