package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class SearchBarPage extends PageObject {

    @FindBy(css = ".search-form .search-field")
    private WebElementFacade searchBarField;

    @FindBy(css = ".search-form .searchsubmit")
    private WebElementFacade searchBarButton;


    public String searchTermLength = RandomStringUtils.randomAlphabetic(25);

    public void navigateToSearchBar() {
        clickOn(searchBarField);
    }

    public void enterProductCap() {
        typeInto(searchBarField, "Cap");
    }

    public void clickSearchBarButton() {
        clickOn(searchBarButton);
    }

    public void enterSearchTermLength(String searchTermLength){
        typeInto(searchBarField,searchTermLength);
    }

     private ArrayList<String> listSearchTerms = new ArrayList<>();

    public void setListSearchTerms (){
        listSearchTerms.add("Hoodie with Zipper");
        listSearchTerms.add("blue");
        listSearchTerms.add("album");
        listSearchTerms.add("yellow");
        listSearchTerms.add("car");
        listSearchTerms.add("25789");
        listSearchTerms.add("ELEMENT");
        listSearchTerms.add("%$&!** !");
        listSearchTerms.add("belt");
        listSearchTerms.add("polo");

        String listA = listSearchTerms.get(5);
        typeInto(searchBarField, listA);

    }


}
