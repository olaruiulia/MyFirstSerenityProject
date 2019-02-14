package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")

public class AdminPage extends PageObject {

    @FindBy(css = "#wp-admin-bar-site-name.menupop")
    private WebElementFacade dashBoardHoverOver;

    @FindBy(css = "#wp-admin-bar-dashboard")
    private WebElementFacade dashBoardButton;

    @FindBy(css = ".wp-menu-name")
    List<WebElementFacade> mainMenuCategories;

    @FindBy(css = "#menu-posts-product a[href*='post-new']")
    private WebElementFacade addNewProductButton;

    @FindBy(css = "#titlewrap [type=text]")
    private WebElementFacade newTitleField;

    @FindBy(css = "#tinymce")
    private WebElementFacade shortDescriptionField;

    @FindBy(id = "_regular_price")
    private WebElementFacade regularPrice;

    @FindBy(id = "_sale_price")
    private WebElementFacade salePrice;

    @FindBy(css = "a[href*='#inventory']")
    private WebElementFacade inventoryButton;

    @FindBy(id = "_sku")
    private WebElementFacade skuNumber;

    @FindBy(id = "_manage_stock")
    private WebElementFacade manageStockCheckBox;

    @FindBy(id = "_stock")
    private WebElementFacade stockQuantatyField;

    @FindBy(css = "a[href='#product_attributes']")
    private WebElementFacade attributesButton;

    @FindBy(css = ".attribute_taxonomy")
    private WebElementFacade costumProductAttributeDropdown;

    @FindBy(css = ".attribute_taxonomy [value='pa_color']")
    private WebElementFacade selectColor;

    @FindBy(css = ".attribute_taxonomy [value='pa_size']")
    private WebElementFacade selectSize;

    @FindBy(css = ".button.add_attribute")
    private WebElementFacade addAttributesButton;

    @FindBy(css = ".button.save_attributes")
    private WebElementFacade saveAttributesButton;

    @FindBy(css = ".select_all_attributes")
    private WebElementFacade chooseAllColor;

    @FindBy(id = "in-product_cat-19")
    private WebElementFacade accessoriesCheckBox;

    @FindBy(id = "original_publish")
    private WebElementFacade hiddenElement;

    @FindBy(css = "#publishing-action .button")
    private WebElementFacade publishButton;

    @FindBy(css = ".updated p")
    private WebElementFacade checkProductPublishMessage;


    public void selectDashboardHoverOver() {
        Actions action = new Actions(getDriver());
        WebElementFacade e = dashBoardHoverOver;
        action.moveToElement(e).perform();
    }

    public void clickOnDashboard() {
        clickOn(dashBoardButton);
    }

    public boolean selectMainMenuCategory() {
        Actions action = new Actions(getDriver());
        for (WebElementFacade category : mainMenuCategories) {
            if (category.getText().contains("Products")) {
                WebElementFacade e = category;
                action.moveToElement(e).perform();
                return true;
            }
        }
        return false;
    }

    public void clickOnAddNewProductButton() {
        clickOn(addNewProductButton);
    }

    public void setNewTitleField() {
        typeInto(newTitleField, "Backpack3");
    }

    public void setDescriptionField() {
        typeInto(shortDescriptionField, "If you'r not too cool for school, buy a backpack!");
    }

    public void setRegularPrice() {
        typeInto(regularPrice, "250");
    }

    public void setSalePrice() {
        typeInto(salePrice, "249.90");
    }

    public void clickOnInventoryButton() {
        clickOn(inventoryButton);
    }

    public void setSkuNumber() {
        typeInto(skuNumber, "DK48567");
    }

    public void clickManageStockCheckbox() {
        clickOn(manageStockCheckBox);
    }

    public void setStockQuantityField() {
        typeInto(stockQuantatyField, "10");
    }

    public void clickAttributesButton() {
        clickOn(attributesButton);
    }

    public void setCustomProductAttributeDropdown() {
        Actions action = new Actions(getDriver());
        WebElementFacade e = costumProductAttributeDropdown;
        action.moveToElement(e).perform();
    }

    public void clickOnSelectColor() {
        clickOn(selectColor);
    }

    public void clickOnSelectSize() {
        clickOn(selectSize);
    }

    public void clickOnAddAttributesButton() {
        clickOn(addAttributesButton);
    }

    public void chooseAllColor() {
        clickOn(chooseAllColor);
    }

    public void clickOnSaveAttributesButton() {
        clickOn(saveAttributesButton);
    }

    public void clickOnAccessoriesCheckBox() {
        clickOn(accessoriesCheckBox);
    }

    public void clickOnPublishButton() {
        waitABit(5000);
        //hiddenElement.waitUntilClickable();
        clickOn(publishButton);

    }

    public boolean checkProductPublishMessage() {
        waitABit(7000);
        System.out.println(checkProductPublishMessage);
        return checkProductPublishMessage.containsText("Product published.");
    }


}


