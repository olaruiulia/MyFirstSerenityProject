package com.fast.features;

import com.fast.steps.serenity.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AdminTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private AdminSteps adminSteps;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private ProductsSteps productsSteps;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Steps
    private SearchBarSteps searchBarSteps;

    @Test
    public void createProduct() {
        loginSteps.loginAsAdmin("Hello admin");
        adminSteps.selectDashboard();
        adminSteps.clickOnDashboard();
        adminSteps.selectMainMenuCategory("Products");
        adminSteps.clickOnAddNewProductButton();
        adminSteps.setRegularPrice();
        adminSteps.setSalePrice();
        adminSteps.clickOnInventoryButton();
        adminSteps.setSkuNumber();
        adminSteps.clickManageStockCheckbox();
        adminSteps.setStockQuantityField();
        adminSteps.clickAttributesButton();
        adminSteps.setCustomProductAttributeDropdown();
        adminSteps.clickOnSelectColor();
        adminSteps.clickOnAddAttributesButton();
        adminSteps.clickAttributesButton();
        adminSteps.chooseAllColor();
        adminSteps.clickOnSaveAttributes();
        adminSteps.clickOnProductImageButton();
        adminSteps.setMediaSearchField();
        adminSteps.clickOnProductThumbnail();
        adminSteps.clickOnSetProductImageButton();
        adminSteps.clickOnAccessoriesCheckBox();
        adminSteps.setNewTitleField();
        adminSteps.clickOnPublishButton();
        adminSteps.checkProductPublishMessage();
        adminSteps.adminBarMyAccountHoverOver();
        adminSteps.clickOnAdminLogOutButton();
        adminSteps.clickBackToPage();
        productsSteps.navigateToShopPage();
        productsSteps.selectProductFromList("Broland");
        searchBarSteps.checkSearchResultForProduct("Broland");

    }

    @Test
    public void deleteProduct() {
        loginSteps.loginAsAdmin("Hello admin");
        adminSteps.selectDashboard();
        adminSteps.clickOnDashboard();
        adminSteps.selectMainMenuCategory("Products");
        adminSteps.clickOnAllProductsButton();
        adminSteps.setAllProductsSearchField();
        adminSteps.clickOnSearchProductsButton();
        adminSteps.clickOnCheckColumnBox();
        adminSteps.hoverOverBulkActionsDropdown();
        adminSteps.clickOnMoveToTrashButton();
        adminSteps.clickOnApplyButtonForBulkActions();
        adminSteps.checkDeletedProductMessage();
    }


}
