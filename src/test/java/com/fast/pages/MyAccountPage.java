package com.fast.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=7")
public class MyAccountPage extends PageObject {


    @FindBy(css = "div.woocommerce-MyAccount-content p:first-of-type")
    private WebElementFacade welcomeMessageStrong;

    public boolean checkLoggedIn(){
        waitFor(welcomeMessageStrong);
        return welcomeMessageStrong.containsText("Hello olaru_iulia (not olaru_iulia? Log out)");
    }

    public boolean checkRegister(String username){
        waitFor(welcomeMessageStrong);
        System.out.println(welcomeMessageStrong.getText());
        return welcomeMessageStrong.containsText("Hello " + username);
    }
}
