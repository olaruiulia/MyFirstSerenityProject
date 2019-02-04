package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?post_type=product")
public class ShopPage extends PageObject {


    @FindBy(css = "div.price-cart a[href*='add-to-cart=26']")
    private WebElementFacade beanieItemAddToCart;

    public void addBeanieToCart(){
        clickOn(beanieItemAddToCart);
    }
}
