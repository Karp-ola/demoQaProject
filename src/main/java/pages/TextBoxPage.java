package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage extends ElementsPage{
    private SelenideElement fullNameField = $x("//input[@id='userName']");
    private SelenideElement emailField = $x("//input[@id='userEmail']");
    private SelenideElement currentAddressField = $x("//textarea[@id='currentAddress']");
    private SelenideElement permanentAddressField = $x("//textarea[@id='permanentAddress']");
    private SelenideElement submitButton = $x("//button[@id='submit']");

     public TextBoxPage fillFullNameField(String value){
        fullNameField.setValue(value);
        return this;
    }

    public TextBoxPage fillEmailFieldField(String value){
        emailField.setValue(value);
        return this;
    }

    public TextBoxPage fillCurrentAddressField(String value){
        currentAddressField.setValue(value);
        return this;
    }

    public TextBoxPage fillPermanentAddressField(String value){
        permanentAddressField.setValue(value);
        return this;
    }

    public void clickSubmitButton(){
        submitButton.click();
    }


}
