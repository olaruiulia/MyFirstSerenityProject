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
    private WebElementFacade searchResultProductCap;

    @FindBy(css = "div.content-inner p")
    private WebElementFacade noSearchResultMessage;

    public void clickShopButton(){
        clickOn(shopButton);
    }

    public boolean selectProduct(){
        for (WebElementFacade product : listOfProducts){
            if (product.getText().contains("Polo")){
                clickOn(product);
                return true;
            }
        }
        return false;
    }

    public boolean selectProductFromList(){
        for (WebElementFacade product : listOfProducts){
            if (product.getText().contains("Hoodie with Logo")){
                clickOn(product);
                return true;
            }
        }
        return false;
    }

    public boolean findProductFromListWithIf(){
        for (WebElementFacade findProduct : listOfProducts){
            if (findProduct.getText().contains("YES")){
                clickOn(findProduct);
                return true;
            }else if (findProduct.getText().contains("Single")){
                clickOn(findProduct);
                return true;
            }
        }
        return false;
    }

    public void clickAddToCart(){
        clickOn(addToCart);
    }

    public boolean checkSearchResultForCap() {
        waitFor(searchResultProductCap);
        return searchResultProductCap.containsText("Cap");
    }

    public boolean checkMessageSearchBarNoProductFound(){
        waitFor(noSearchResultMessage);
        System.out.println(noSearchResultMessage.getText());
        return noSearchResultMessage.containsText("No products were found matching your selection.");
    }

    public boolean checkMessageSearchBarNoProductList(){
        waitFor(noSearchResultMessage);
        System.out.println(noSearchResultMessage.getText());
        return noSearchResultMessage.containsText("No products were found matching your selection.");
    }

}
