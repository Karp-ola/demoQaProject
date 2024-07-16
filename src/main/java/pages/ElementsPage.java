package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.LeftMenuComponent;

import java.util.List;

import static com.codeborne.selenide.Selenide.$x;

public class ElementsPage extends BasePage {
    private SelenideElement textBoxOption = $x("//span[text()='Text Box']");
    LeftMenuComponent leftMenuComponent = new LeftMenuComponent();

  //  private List<String> listOfOptions = List.of("Text Box", "Check Box", "Radio Button", "Web Tables", "Buttons", "Links",
  //          "Broken Links - Images", "Upload and Download", "Dynamic Properties");

    public void assertThatElementPageIsOpened(){
        leftMenuComponent.assertThatLeftMenuComponentIsVisible();
    }

//    public void assertThatPageContainsOptionsOnMenu(){
//        leftMenuComponent.assertThatGroupOfBlocksContainsElements(listOfOptions);
//    }

    public TextBoxPage openTextBoxPage(){
        textBoxOption.click();
        return new TextBoxPage();
    }


}
