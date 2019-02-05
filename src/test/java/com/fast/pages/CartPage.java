package com.fast.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=5")
public class CartPage extends PageObject {

    @FindBy(id = "menu-item-72")
    private WebElementFacade cartButton;

    @FindBy(css = ".quantity .input-text")
    private WebElementFacade quantityfield;

    @FindBy(css = "button.button")
    private WebElementFacade updateButton;

    @FindBy(css = ".product-name a")
    private WebElementFacade productNameInCart;

    public void clickCartButton(){
        clickOn(cartButton);
    }

    public void changeQuantity(){
        waitFor(quantityfield);
        clickOn(quantityfield);
        typeInto(quantityfield,"17");
    }

    public void clickUpdateCartButton(){
        clickOn(updateButton);
    }

    public boolean checkProductInCart(){
        waitFor(productNameInCart);
        return productNameInCart.containsText("Belt");
    }


}
