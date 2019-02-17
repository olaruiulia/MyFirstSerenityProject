package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.SearchBarPage;
import com.fast.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

public class SearchBarSteps extends ScenarioSteps {


    private HomePage homePage;
    private SearchBarPage searchBarPage;
    private ShopPage shopPage;


    private String searchTermLength = RandomStringUtils.randomAlphabetic(50);

    @Step
    public void navigateToHomePage() {
        getDriver().manage().window().maximize();
        homePage.open();
    }

    @Step
    public void navigateToSearchBar() {
        searchBarPage.navigateToSearchBar();
    }

    @Step
    public void writeProductName(String productName) {
        searchBarPage.enterProduct(productName);
    }

    @Step
    public void clickSearchBarButton() {
        searchBarPage.clickSearchBarButton();
    }

    @Step
    public void enterSearchTermLength() {
        searchBarPage.enterSearchTermLength(searchTermLength);
    }

    @Step
    public void writeFromList() {
        searchBarPage.setListSearchTerms("Hoodie with Zipper", "blue", "album", "yellow", "car", "25789", "ELEMENT", "%$&!** !");
    }

    @Step
    public void checkSearchResultForProduct(String productNameResult) {
        Assert.assertTrue(shopPage.checkSearchResultForProduct(productNameResult));
    }

    @Step
    public void checkMessageSearchBarNoProductFound() {
        Assert.assertTrue(shopPage.checkMessageSearchBarNoProductFound("No products were found matching your selection."));
    }

}
