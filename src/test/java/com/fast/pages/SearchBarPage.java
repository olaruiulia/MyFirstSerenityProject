package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;


@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class SearchBarPage extends PageObject {

    @FindBy(css = ".search-form .search-field")
    private WebElementFacade searchBarField;

    @FindBy(css = ".search-form .searchsubmit")
    private WebElementFacade searchBarButton;


    public void navigateToSearchBar() {
        clickOn(searchBarField);
    }

    public void enterProduct(String product) {
        typeInto(searchBarField, product);
    }

    public void enterSearchTermLength(String searchTermLength) {
        typeInto(searchBarField, searchTermLength);
    }

    public void clickSearchBarButton() {
        clickOn(searchBarButton);
    }

    private ArrayList<String> listSearchTerms = new ArrayList<>();

    public void setListSearchTerms(String prOne, String prTwo, String prThree, String prFour, String prFive, String prSix, String prSeven, String prEight) {
        listSearchTerms.add(prOne);
        listSearchTerms.add(prTwo);
        listSearchTerms.add(prThree);
        listSearchTerms.add(prFour);
        listSearchTerms.add(prFive);
        listSearchTerms.add(prSix);
        listSearchTerms.add(prSeven);
        listSearchTerms.add(prEight);

        String listA = listSearchTerms.get(5);
        typeInto(searchBarField, listA);

    }


}
