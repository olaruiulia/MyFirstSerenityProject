package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import java.util.List;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?post_type=product")
public class ShopPage extends PageObject {

    @FindBy(id = "menu-item-73")
    private WebElementFacade shopButton;

    @FindBy(css = ".collection_title h3")
    List<WebElementFacade> listOfProducts;

    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade addToCart;

    public void clickShopButton(){
        clickOn(shopButton);
    }

    public boolean selectProduct(){
        for (WebElementFacade product : listOfProducts){
            if (product.getText().contains("Belt")){
                clickOn(product);
                return true;
            }
        }
        return false;
    }


    public void clickAddToCart(){
        clickOn(addToCart);
    }


}
