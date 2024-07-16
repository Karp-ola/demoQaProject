package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage{

    private Category categoryName;
    private SelenideElement elementsBlock = $x("//h5[text()='" + categoryName + "']");


    public void openCategoryPage(Category categoryName){
        //elementsBlock.click();
        $x("//h5[text()='" + categoryName + "']").click();

    }
}

