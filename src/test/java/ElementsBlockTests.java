import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ElementsPage;

import pages.components.ResultTableComponent;
import utils.DataUtils;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ElementsBlockTests {
    ElementsPage elementsPage = new ElementsPage();
    DataUtils dataUtils = new DataUtils();
    ResultTableComponent resultTableComponent = new ResultTableComponent();

    @Test
    @DisplayName("Заполнение формы с заполнением всех полей")
    public void textBoxPageTestWithAllFieldFilled(){

        open("https://demoqa.com/elements");
        elementsPage.closeAddBanners();
        elementsPage.
                openTextBoxPage()
                .fillFullNameField(dataUtils.fullName)
                .fillEmailFieldField(dataUtils.email)
                .fillCurrentAddressField(dataUtils.currentAddress)
                .fillPermanentAddressField(dataUtils.permanentAddress)
                .clickSubmitButton();
        assertAll(
                () -> assertEquals(dataUtils.fullName, resultTableComponent.getNameFromResultTable()),
                () -> assertEquals(dataUtils.email, resultTableComponent.getEmailFromResultTable()),
                () -> assertEquals(dataUtils.currentAddress, resultTableComponent.getCurrentAddressFromResultTable()),
                () -> assertEquals(dataUtils.permanentAddress, resultTableComponent.getPermanentAddressFromResultTable())
        );
    }

    @Test
    @DisplayName("Заполнение формы без поля email")
    public void textBoxPageTestWithoutEmail(){
        open("https://demoqa.com/elements");
        elementsPage.closeAddBanners();
        elementsPage.
                openTextBoxPage()
                .fillFullNameField(dataUtils.fullName)
                .fillCurrentAddressField(dataUtils.currentAddress)
                .fillPermanentAddressField(dataUtils.permanentAddress)
                .clickSubmitButton();
        assertAll(
                () -> assertEquals(dataUtils.fullName, resultTableComponent.getNameFromResultTable()),
                () -> assertEquals(dataUtils.currentAddress, resultTableComponent.getCurrentAddressFromResultTable()),
                () -> assertEquals(dataUtils.permanentAddress, resultTableComponent.getPermanentAddressFromResultTable())
        );
    }

    @Test
    @DisplayName("Заполнение формв без поля FullName")
    public void textBoxPageTestWithoutFullName(){
        open("https://demoqa.com/elements");
        elementsPage.closeAddBanners();
        elementsPage.
                openTextBoxPage()
                .fillEmailFieldField(dataUtils.email)
                .fillCurrentAddressField(dataUtils.currentAddress)
                .fillPermanentAddressField(dataUtils.permanentAddress)
                .clickSubmitButton();
        assertAll(
                () -> assertEquals(dataUtils.email, resultTableComponent.getEmailFromResultTable()),
                () -> assertEquals(dataUtils.currentAddress, resultTableComponent.getCurrentAddressFromResultTable()),
                () -> assertEquals(dataUtils.permanentAddress, resultTableComponent.getPermanentAddressFromResultTable())
        );

    }
    @Test
    @DisplayName("Заполнение формы без текущего адреса")
    public void textBoxPageTestWithoutCurrentAddress(){
        open("https://demoqa.com/elements");
        elementsPage.closeAddBanners();
        elementsPage.
                openTextBoxPage()
                .fillFullNameField(dataUtils.fullName)
                .fillEmailFieldField(dataUtils.email)
                .fillPermanentAddressField(dataUtils.permanentAddress)
                .clickSubmitButton();
        assertAll(
                () -> assertEquals(dataUtils.fullName, resultTableComponent.getNameFromResultTable()),
                () -> assertEquals(dataUtils.email, resultTableComponent.getEmailFromResultTable()),
                () -> assertEquals(dataUtils.permanentAddress, resultTableComponent.getPermanentAddressFromResultTable())
        );

    }

    @Test
    @DisplayName("Заполнение формы без постоянного адреса")
    public void textBoxPageTestWithoutPermanentAddress(){
        open("https://demoqa.com/elements");
        elementsPage.closeAddBanners();
        elementsPage.
                openTextBoxPage()
                .fillFullNameField(dataUtils.fullName)
                .fillEmailFieldField(dataUtils.email)
                .fillCurrentAddressField(dataUtils.currentAddress)
                .clickSubmitButton();
        assertAll(
                () -> assertEquals(dataUtils.fullName, resultTableComponent.getNameFromResultTable()),
                () -> assertEquals(dataUtils.email, resultTableComponent.getEmailFromResultTable()),
                () -> assertEquals(dataUtils.currentAddress, resultTableComponent.getCurrentAddressFromResultTable())
        );
    }
}
