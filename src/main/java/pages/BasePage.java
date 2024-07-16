package pages;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class BasePage {
    public void closeAddBanners(){
        executeJavaScript("arguments[0].remove()", $x("//*[@id=\"fixedban\"]"));
        executeJavaScript("arguments[0].remove()", $x("//footer"));
    }
}
