package com.fast.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=7")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = ".login p.form-row button")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce-error li " )
    private WebElementFacade invalidLoginMessage;

    public void setEmailField(){
        waitFor(emailField);
        typeInto(emailField,"olaru_iulia@yahoo.com");
    }

    public void setPasswordField(){
        typeInto(passwordField, "NewPassword!1993");
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public void setEmailFieldAdmin(){
        waitFor(emailField);
        typeInto(emailField,"admin");
    }

    public void setPasswordFieldAdmin(){
        typeInto(passwordField, "parola11");
    }

    public boolean checkInvalidLoginMessage(){
        waitFor(invalidLoginMessage);
        return invalidLoginMessage.containsText("ERROR");
    }

    public boolean invalidLoginIfNextStep(){
        if (invalidLoginMessage.getText().contains("ERROR")){
            typeInto(passwordField,"NewPassword!1993");
            return true;
        }
        return false;
    }

    public void setPasswordField2(){
        typeInto(passwordField, "NewPassword!");
    }
}

