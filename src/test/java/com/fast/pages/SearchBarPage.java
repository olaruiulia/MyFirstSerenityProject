package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class SearchBarPage extends PageObject {

    @FindBy(css = ".search-form .search-field")
    private WebElementFacade SearchBarField;

    @FindBy(css = ".search-form .searchsubmit")
    private WebElementFacade SearchBarButton;

    @FindBy(css = ".summary h1")
    private WebElementFacade searchResultProductCap;

    public void navigateToSearchBar(){
        clickOn(SearchBarField);
    }
    public void enterProductCap (){
        typeInto(SearchBarField,"Cap");
    }
    public void clickSearchBarButton(){
        clickOn(SearchBarButton);
    }

    public boolean checkSearchResultForCap(){
        waitFor(searchResultProductCap);
        return searchResultProductCap.containsText("Cap");
    }


}
