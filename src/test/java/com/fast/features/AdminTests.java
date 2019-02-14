package com.fast.features;

import com.fast.steps.serenity.AdminSteps;
import com.fast.steps.serenity.LoginSteps;
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
    LoginSteps loginSteps;

    @Steps
    AdminSteps adminSteps;

    @Test
    public void createProduct(){
        loginSteps.loginAsAdmin();
        adminSteps.selectDashboard();
        adminSteps.clickOnDashboard();
        adminSteps.selectMainMenuCategory();
        adminSteps.clickOnAddNewProductButton();
        adminSteps.setNewTitleField();
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
        adminSteps.clickOnAccessoriesCheckBox();
        adminSteps.setNewTitleField();
        adminSteps.clickOnPublishButton();
        adminSteps.checkProductPublishMessage();
    }
}
