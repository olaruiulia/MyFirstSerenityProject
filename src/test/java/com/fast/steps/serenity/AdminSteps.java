package com.fast.steps.serenity;

import com.fast.pages.AdminPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AdminSteps extends ScenarioSteps {


    AdminPage adminPage;

    @Step
    public void selectDashboard(){
        adminPage.selectDashboardHoverOver();
    }

    @Step
    public void clickOnDashboard(){
        adminPage.clickOnDashboard();
    }

    @Step
    public void selectMainMenuCategory(){
        adminPage.selectMainMenuCategory();
    }

    @Step
    public void clickOnAddNewProductButton(){
        adminPage.clickOnAddNewProductButton();
    }

    @Step
    public void setNewTitleField(){
        adminPage.setNewTitleField();
    }

    @Step
    public void setDescriptionField(){
        adminPage.setDescriptionField();
    }

    @Step
    public void setRegularPrice(){
        adminPage.setRegularPrice();
    }

    @Step
    public void setSalePrice(){
        adminPage.setSalePrice();
    }

    @Step
    public void clickOnInventoryButton(){
        adminPage.clickOnInventoryButton();
    }

    @Step
    public void setSkuNumber(){
        adminPage.setSkuNumber();
    }

    @Step
    public void setStockQuantityField(){
        adminPage.setStockQuantityField();
    }

    @Step
    public void clickManageStockCheckbox(){
        adminPage.clickManageStockCheckbox();
    }

    @Step
    public void clickAttributesButton(){
        adminPage.clickAttributesButton();
    }

    @Step
    public void setCustomProductAttributeDropdown(){
        adminPage.setCustomProductAttributeDropdown();
    }

    @Step
    public void clickOnSelectColor(){
        adminPage.clickOnSelectColor();
    }

    @Step
    public void clickOnAddAttributesButton(){
        adminPage.clickOnAddAttributesButton();
    }

    @Step
    public void chooseAllColor(){
        adminPage.chooseAllColor();
    }

    @Step
    public void clickOnSaveAttributes(){
        adminPage.clickOnSaveAttributesButton();

    }
    @Step
    public void clickOnAccessoriesCheckBox(){
        adminPage.clickOnAccessoriesCheckBox();
    }

    @Step
    public void clickOnPublishButton(){
        adminPage.clickOnPublishButton();
    }

    @Step
    public void checkProductPublishMessage(){
        adminPage.checkProductPublishMessage();
    }



}
