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

    @FindBy(css = ".summary h1")
    private WebElementFacade searchResultProduct;

    @FindBy(css = "div.content-inner p")
    private WebElementFacade noSearchResultMessage;

    @FindBy(css = ".woocommerce-message ")
    private WebElementFacade productAddedToCartMessage;

    public void clickShopButton() {
        clickOn(shopButton);
    }

    public boolean selectProductFromList(String productName) {
        for (WebElementFacade product : listOfProducts) {
            if (product.getText().contains(productName)) {
                clickOn(product);
                return true;
            }
        }
        return false;
    }

    public boolean findProductFromListWithIf(String nonExistent, String existingProduct) {
        for (WebElementFacade findProduct : listOfProducts) {
            if (findProduct.getText().contains(nonExistent)) {
                clickOn(findProduct);
                return true;
            } else if (findProduct.getText().contains(existingProduct)) {
                clickOn(findProduct);
                return true;
            }
        }
        return false;
    }

    public void clickAddToCart() {
        clickOn(addToCart);
    }

    public boolean checkSearchResultForProduct(String productName) {
        waitFor(searchResultProduct);
        return searchResultProduct.containsText(productName);
    }

    public boolean checkMessageSearchBarNoProductFound(String errorMessage) {
        waitFor(noSearchResultMessage);
        return noSearchResultMessage.containsText(errorMessage);
    }

    public boolean checkProductAddedToCartMessage(String message){
        waitFor(productAddedToCartMessage);
        return productAddedToCartMessage.containsText(message);
    }


}
