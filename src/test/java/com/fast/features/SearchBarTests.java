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
    private SearchBarSteps searchBarSteps;

    @Test
    public void searchByProductName() {
        searchBarSteps.navigateToHomePage();
        searchBarSteps.navigateToSearchBar();
        searchBarSteps.writeProductName("cap");
        searchBarSteps.clickSearchBarButton();
        searchBarSteps.checkSearchResultForProduct("Cap");
    }

    @Test
    public void searchWithRandomString() {
        searchBarSteps.navigateToHomePage();
        searchBarSteps.navigateToSearchBar();
        searchBarSteps.enterSearchTermLength();
        searchBarSteps.clickSearchBarButton();
        searchBarSteps.checkMessageSearchBarNoProductFound();
    }

    @Test
    public void writeFromList() {
        searchBarSteps.navigateToHomePage();
        searchBarSteps.navigateToSearchBar();
        searchBarSteps.writeFromList();
        searchBarSteps.clickSearchBarButton();
        searchBarSteps.checkMessageSearchBarNoProductFound();
    }

    @Test
    public void searchWithAllCaps() {
        searchBarSteps.navigateToHomePage();
        searchBarSteps.navigateToSearchBar();
        searchBarSteps.writeProductName("V NECK");
        searchBarSteps.clickSearchBarButton();
        searchBarSteps.checkSearchResultForProduct("V-Neck");
    }
}
