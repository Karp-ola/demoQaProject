package pages;

import java.util.List;

public enum Category {

    ELEMENTS (List.of("Text Box", "Check Box", "Radio Button", "Web Tables", "Buttons", "Links",
            "Broken Links - Images", "Upload and Download", "Dynamic Properties")),
    FORMS (List.of("Practice Form")),
    ALERTS_FRAMES_WINDOWS (List.of("Browser Windows", "Alerts", "Frames", "Nested Frames", "Modal Dialogs")),
    WIDGETS (List.of("Accordian", "Auto Complete", "Data Picker", "Slider", "Progress Bar", "Tabs",
            "Tool Tips", "Menu", "Select Menu" )),
    INTERACTIONS (List.of("Sortable", "Selectable", "Resizable", "Droppable", "Draggable")),
    BOOK_STORE_APPLICATION (List.of("Login", "Book Store", "Profile", "Book Store API"));

    private List<String> listOfOptions;
    Category(List<String> listOfOptions) {
        this.listOfOptions = listOfOptions;
    }

    public List<String> getListOfOptions() {
        return listOfOptions;
    }
}
