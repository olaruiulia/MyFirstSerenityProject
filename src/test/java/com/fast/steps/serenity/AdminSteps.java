package com.fast.steps.serenity;

import com.fast.pages.AdminPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AdminSteps extends ScenarioSteps {


    AdminPage adminPage;

    @Step
    public void selectDashboard() {
        adminPage.selectDashboardHoverOver();
    }

    @Step
    public void clickOnDashboard() {
        adminPage.clickOnDashboard();
    }

    @Step
    public void selectMainMenuCategory(String category) {
        adminPage.selectMainMenuCategory(category);
    }

    @Step
    public void clickOnAddNewProductButton() {
        adminPage.clickOnAddNewProductButton();
    }

    @Step
    public void setNewTitleField() {
        adminPage.setNewTitleField("Broland sunglasses");
    }

    @Step
    public void setDescriptionField() {
        adminPage.setDescriptionField("If you'r not too cool for school, buy a backpack!");
    }

    @Step
    public void setRegularPrice() {
        adminPage.setRegularPrice("251");
    }

    @Step
    public void setSalePrice() {
        adminPage.setSalePrice("249.90");
    }

    @Step
    public void clickOnInventoryButton() {
        adminPage.clickOnInventoryButton();
    }

    @Step
    public void setSkuNumber() {
        adminPage.setSkuNumber("DK48569");
    }

    @Step
    public void setStockQuantityField() {
        adminPage.setStockQuantityField("10");
    }

    @Step
    public void clickManageStockCheckbox() {
        adminPage.clickManageStockCheckbox();
    }

    @Step
    public void clickAttributesButton() {
        adminPage.clickAttributesButton();
    }

    @Step
    public void setCustomProductAttributeDropdown() {
        adminPage.setCustomProductAttributeDropdown();
    }

    @Step
    public void clickOnSelectColor() {
        adminPage.clickOnSelectColor();
    }

    @Step
    public void clickOnAddAttributesButton() {
        adminPage.clickOnAddAttributesButton();
    }

    @Step
    public void chooseAllColor() {
        adminPage.chooseAllColor();
    }

    @Step
    public void clickOnSaveAttributes() {
        adminPage.clickOnSaveAttributesButton();

    }

    @Step
    public void clickOnAccessoriesCheckBox() {
        adminPage.clickOnAccessoriesCheckBox();
    }

    @Step
    public void clickOnNewTitleField() {
        adminPage.clickOnNewTitleField();
    }


    @Step
    public void clickOnPublishButton() {
        adminPage.clickOnPublishButton();
    }

    @Step
    public void checkProductPublishMessage() {
        adminPage.checkProductPublishMessage("Product published.");
    }

    @Step
    public void clickOnAllProductsButton(){
        adminPage.clickOnAllProductsButton();
    }

    @Step
    public void clickOnAllUsersButton(){
        adminPage.clickOnAllUsersButton();
    }

    @Step
    public void adminBarMyAccountHoverOver(){
        adminPage.adminBarMyAccountHoverOver();
    }

    @Step
    public void clickOnAdminLogOutButton(){
        adminPage.clickOnAdminLogOutButton();
    }

    @Step
    public void clickBackToPage(){
        adminPage.clickBackToPage();
    }

    @Step
    public void checkExistingUser(String username){
        Assert.assertTrue(adminPage.usernameList(username));
    }

    @Step
    public void setUserSearchField(String username){
        adminPage.setUserSearchField(username);
    }

    @Step
    public void clickOnSearchUsersButton(){
        adminPage.clickOnSearchUsersButton();
    }

    @Step
    public void clickOnOrdersButton(){
        adminPage.clickOnOrdersButton();
    }

    @Step
    public void checkOrderUsernameList(){
        adminPage.orderUsernameList("Lilla");
    }




}
