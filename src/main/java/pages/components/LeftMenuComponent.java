package pages.components;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class LeftMenuComponent {

    private SelenideElement leftMenu = $x("//div[@class = \"left-pannel\"]");
    private ElementsCollection groupOfBlocks = $$(".group-header");
    private ElementsCollection groupOptions = $$(".btn-light");

    public void assertThatLeftMenuComponentIsVisible(){
        leftMenu.shouldBe(visible);
    }

    public void assertThatGroupOfBlocksContainsElements(List<String> options){
        groupOptions.filter(visible).shouldHave(texts(options));
    }


}
