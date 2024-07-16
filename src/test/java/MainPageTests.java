import com.codeborne.selenide.Selenide;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.Category;
import pages.ElementsPage;
import pages.MainPage;
import pages.components.LeftMenuComponent;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTests {
    MainPage mainPage =  new MainPage();
    ElementsPage elementsPage = new ElementsPage();
    LeftMenuComponent leftMenuComponent = new LeftMenuComponent();

//
//    static Stream<Arguments> testData(Category category, List<String> options){
//        return Stream.of(
//                Arguments.of(Category.ELEMENTS.name(), Category.ELEMENTS.getListOfOptions()),
//                Arguments.of(Category.FORMS.name(), Category.FORMS.getListOfOptions()),
//                Arguments.of(Category.ALERTS_FRAMES_WINDOWS.name(), Category.ALERTS_FRAMES_WINDOWS.getListOfOptions()),
//                Arguments.of(Category.WIDGETS.name(), Category.WIDGETS.getListOfOptions()),
//                Arguments.of(Category.BOOK_STORE_APPLICATION.name(), Category.BOOK_STORE_APPLICATION.getListOfOptions())
//                );
//    }
//
//    @MethodSource("testData")
//    @ParameterizedTest (name = "Проверка, что при переходе c главной страницы в категорию {0}, список подкатегорий равен {1}")
//    public void testOpeningBlocksFromMainPage(Category categoryName, List<String> options){
//        open("https://demoqa.com/");
//        mainPage.closeAddBanners();
//        mainPage.openCategoryPage(categoryName);
//        Selenide.refresh();
//        elementsPage.assertThatElementPageIsOpened();
//        leftMenuComponent.assertThatGroupOfBlocksContainsElements(options);
//    }
}
