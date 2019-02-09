package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;
import org.yecht.Data;
import java.util.Random;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=7")
public class RegisterPage extends PageObject {

    @FindBy (id = "reg_email" )
    private WebElementFacade registerEmailField;

    @FindBy (id = "reg_password")
    private WebElementFacade registerPasswordField;

    @FindBy (css = "button[name=register]")
    private WebElementFacade registerButton;


    public void setRegisterEmailField(String email){
        typeInto(registerEmailField,email);
    }

    public void setRegisterPasswordField(){
        typeInto(registerPasswordField,"somethingelse1234");
    }

    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }


}
