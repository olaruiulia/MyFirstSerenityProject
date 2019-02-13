package com.fast.features;


import com.fast.steps.serenity.SearchBarSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchBarTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    SearchBarSteps searchBarSteps;

    @Test
    public void searchByProductName(){
        searchBarSteps.navigateToHomePage();
        searchBarSteps.navigateToSearchBar();
        searchBarSteps.writeProductName();
        searchBarSteps.clickSearchBarButton();
        searchBarSteps.checkProductCap();
    }

    @Test
    public void searchTermLength(){
        searchBarSteps.navigateToHomePage();
        searchBarSteps.navigateToSearchBar();
        searchBarSteps.enterSearchTermLength();
        searchBarSteps.clickSearchBarButton();
        searchBarSteps.checkMessageSearchBar();
    }

    @Test
    public void writeFromList(){
        searchBarSteps.navigateToHomePage();
        searchBarSteps.navigateToSearchBar();
        searchBarSteps.writeFromList();
    }
}
