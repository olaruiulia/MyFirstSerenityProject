package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=6")
public class CheckoutPage extends PageObject {

    @FindBy(css = ".wc-proceed-to-checkout a")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(id = "billing_first_name")
    private WebElementFacade billingFirstName;

    @FindBy(id = "billing_last_name")
    private WebElementFacade billingLastName;

    @FindBy(id = "billing_country")
    private WebElementFacade dropdownCountry;

    @FindBy(id = "billing_address_1")
    private WebElementFacade streetAddress;

    @FindBy(id = "billing_city")
    private WebElementFacade cityName;

    @FindBy(id = "billing_postcode")
    private WebElementFacade billingPostCode;

    @FindBy(id = "billing_phone")
    private WebElementFacade billingPhoneNumber;

    @FindBy(id = "billing_email")
    private WebElementFacade billingEmail;

    @FindBy(id = "createaccount")
    private WebElementFacade createAccountCheckBox;

    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(id = "order_comments")
    private WebElementFacade orderCommnets;

    @FindBy(css = ".content-page p.woocommerce-notice")
    private WebElementFacade orderRecievedMessage;

    @FindBy(css = ".woocommerce-NoticeGroup li:nth-child(1)")
    private WebElementFacade missingPhone;

    @FindBy(css = ".woocommerce-NoticeGroup li:nth-child(2)")
    private WebElementFacade wrongEmail;

    public void clickOnProceedToCheckOutButton(){
        clickOn(proceedToCheckoutButton);
    }

    public void setBillingFirstName(){
        typeInto(billingFirstName,"Lilla");
    }

    public void setBillingLastName(){
        typeInto(billingLastName,"Okoska");
    }

    public void clickOnCountryDropDown(){
        dropdownCountry.selectByVisibleText("Romania");
    }

    public void setStreetAddress (){
        typeInto(streetAddress, "blabla");
    }

    public void setCityName (){
        typeInto(cityName,"Cluj");
    }

    public void setBillingPostCode(){
        typeInto(billingPostCode,"225478");
    }

    public void setBillingPhoneNumber(){
        typeInto(billingPhoneNumber,"4875874569554");
    }

    public void setBillingPhoneNumberWithoutValue(){
        typeInto(billingPhoneNumber,"");
    }

    public void setBillingEmail(){
        typeInto(billingEmail, "hahahah@email.com");
    }

    public void setBillingEmailInvalid(){
        typeInto(billingEmail,"hhh@.com");
    }

    public void createAccountCheckBox(){
        clickOn(createAccountCheckBox);
    }

    public void clickOnPlaceOrderButton(){
        clickOn(placeOrderButton);
    }

    public void setOrderCommnets(){
        typeInto(orderCommnets,"i don't have anything to add");
    }

    public boolean checkOrderPlacement(){
        waitFor(orderRecievedMessage);
        System.out.println(orderRecievedMessage.getText());
        return orderRecievedMessage.containsText("Thank you. Your order has been received.");
    }

    public boolean missingDetails(){
        if ((missingPhone.getText().contains("Billing Phone is a required field.")) && (wrongEmail.getText().contains("Billing Email address is not a valid email address."))){
            System.out.println("You better work!");
            clickOn(setBillingPhoneNumber();
            return true;
        }
        return false;
    }


}

