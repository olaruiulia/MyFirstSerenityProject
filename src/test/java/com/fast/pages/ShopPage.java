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
            if (product.getText().contains("Belt")){
                clickOn(product);
                return true;
            }
        }
        return false;
    }

    public boolean selectProductAlbum(){
        for (WebElementFacade product : listOfProducts){
            if (product.getText().contains("Album")){
                clickOn(product);
                return true;
            }
        }
        return false;
    }

    public boolean findProduct(){
        for (WebElementFacade product : listOfProducts){
            if (product.getText().contains("YES")){
                clickOn(product);
            }else {
                product.getText().contains("Album");
                clickOn(product);
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

    public boolean checkMessageSearchBar(){
        waitFor(noSearchResultMessage);
        System.out.println(noSearchResultMessage.getText());
        return noSearchResultMessage.containsText("No products were found matching your selection.");
    }

}
