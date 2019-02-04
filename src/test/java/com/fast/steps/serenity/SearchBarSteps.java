package com.fast.steps.serenity;

import com.fast.pages.MyAccountPage;
import com.fast.pages.SearchBarPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SearchBarSteps extends ScenarioSteps {


    LoginSteps loginSteps;
    MyAccountPage myAccountPage;
    SearchBarPage searchBarPage;

    @Step
    public void navigateToHomePage (){
        searchBarPage.open();
    }

    @Step
    public void navigateToSearchBar(){
        searchBarPage.navigateToSearchBar();
    }

    @Step
    public void writePorductName(){
        searchBarPage.enterProductCap();
    }

    @Step
    public void clickSearchBarButton(){
        searchBarPage.clickSearchBarButton();
    }

    @Step
    public void checkProductCap (){
        Assert.assertTrue(searchBarPage.checkSearchResultForCap());
    }
}
