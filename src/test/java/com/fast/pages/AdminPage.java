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

    @FindBy(css = "#menu-posts-product .wp-has-submenu")
    private WebElementFacade allProductsButton;

    @FindBy(css = ".wp-first-item a[href*=users]")
    private WebElementFacade allUsersButton;

    @FindBy(id = "wp-admin-bar-my-account")
    private WebElementFacade adminBarMyAccount;

    @FindBy(css = ".ab-item[href*='logout']")
    private WebElementFacade adminLogOutButton;

    @FindBy(css = "#backtoblog a")
    private WebElementFacade backToHomePage;

    @FindBy(css = ".username strong a")
    List<WebElementFacade> newUsernames;

    @FindBy(id = "user-search-input")
    private WebElementFacade userSearchField;

    @FindBy(id = "search-submit")
    private WebElementFacade searchUsersButton;

    @FindBy(css = ".wp-first-item a[href*='shop_order']")
    private WebElementFacade ordersButton;

    @FindBy(id = ".order-view strong")
    List<WebElementFacade> ordersList;


    public void selectDashboardHoverOver() {
        Actions action = new Actions(getDriver());
        WebElementFacade e = dashBoardHoverOver;
        action.moveToElement(e).perform();
    }

    public void clickOnDashboard() {
        clickOn(dashBoardButton);
    }

    public boolean selectMainMenuCategory(String categories) {
        Actions action = new Actions(getDriver());
        for (WebElementFacade category : mainMenuCategories) {
            if (category.getText().contains(categories)) {
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

    public void clickOnAllUsersButton() {
        clickOn(allUsersButton);
    }

    public void setNewTitleField(String newProductName) {
        typeInto(newTitleField, newProductName);
    }

    public void setDescriptionField(String description) {
        typeInto(shortDescriptionField, description);
    }

    public void setRegularPrice(String price) {
        typeInto(regularPrice, price);
    }

    public void setSalePrice(String sale) {
        typeInto(salePrice, sale);
    }

    public void clickOnInventoryButton() {
        clickOn(inventoryButton);
    }

    public void setSkuNumber(String skuNo) {
        typeInto(skuNumber, skuNo);
    }

    public void clickManageStockCheckbox() {
        clickOn(manageStockCheckBox);
    }

    public void setStockQuantityField(String stockQuantity) {
        typeInto(stockQuantatyField, stockQuantity);
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

    public void clickOnNewTitleField() {
        waitFor(newTitleField);
        clickOn(newTitleField);
    }

    public void clickOnPublishButton() {
        waitFor(publishButton);
        clickOn(publishButton);

    }

    public boolean checkProductPublishMessage(String publishMessage) {
        waitFor(checkProductPublishMessage);
        System.out.println(checkProductPublishMessage);
        return checkProductPublishMessage.containsText(publishMessage);
    }

    public void clickOnAllProductsButton() {
        clickOn(allProductsButton);
    }

    public void adminBarMyAccountHoverOver() {
        Actions action = new Actions(getDriver());
        WebElementFacade e = adminBarMyAccount;
        action.moveToElement(e).perform();
    }

    public boolean usernameList(String username) {
        for (WebElementFacade userNames : newUsernames) {
            if (userNames.getText().contains(username)) {
                System.out.println("The username exits!");
                return true;
            }
        }
        return false;
    }

    public void clickOnAdminLogOutButton() {
        clickOn(adminLogOutButton);
    }

    public void clickBackToPage() {
        clickOn(backToHomePage);
    }

    public void setUserSearchField(String username) {
        typeInto(userSearchField, username);
    }

    public void clickOnSearchUsersButton() {
        clickOn(searchUsersButton);
    }

    public void clickOnOrdersButton() {
        clickOn(ordersButton);
    }

    public boolean orderUsernameList(String orderUsername) {
        for (WebElementFacade orders : ordersList) {
            if (orders.getText().contains(orderUsername)) {
                System.out.println("The username exits!");
                return true;
            }
        }
        return false;
    }


}


