package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.SearchBarPage;
import com.fast.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

public class SearchBarSteps extends ScenarioSteps {


    HomePage homePage;
    SearchBarPage searchBarPage;
    ShopPage shopPage;


    private String searchTermLength = RandomStringUtils.randomAlphabetic(25);

    @Step
    public void navigateToHomePage (){
        getDriver().manage().window().maximize();
        homePage.open();
    }

    @Step
    public void navigateToSearchBar(){
        searchBarPage.navigateToSearchBar();
    }

    @Step
    public void writeProductName(){
        searchBarPage.enterProductCap();
    }

    @Step
    public void clickSearchBarButton(){
        searchBarPage.clickSearchBarButton();
    }

    @Step
    public void enterSearchTermLength (){
        searchBarPage.enterSearchTermLength(searchTermLength);
    }

    @Step
    public void checkProductCap (){
        Assert.assertTrue(shopPage.checkSearchResultForCap());
    }

    @Step
    public void checkMessageSearchBarNoProductFound(){
        Assert.assertTrue(shopPage.checkMessageSearchBarNoProductFound());
    }

    @Step
    public void writeFromList(){
        searchBarPage.setListSearchTerms();
    }

    @Step
    public void checkMessageSearchBarNoProductList(){
        Assert.assertTrue(shopPage.checkMessageSearchBarNoProductList());
    }
}
