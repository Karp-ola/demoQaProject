package pages.components;

import com.codeborne.selenide.ElementsCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$$;

public class ResultTableComponent {

    private ElementsCollection resultField = $$("div#output>div>p");

    public Map<String, String> getResultTable(){
        Map<String, String> results = new HashMap<>();

        List<String> resultList =new ArrayList<>(resultField.texts());
        for(String resultField: resultList){
            String[] items = resultField.split(":");
            results.put(items[0], items[1]);
        }
        return results;
    }

    public String getNameFromResultTable(){
        return getResultTable().get("Name");
    }

    public String getEmailFromResultTable(){
        return getResultTable().get("Email");
    }
    public String getCurrentAddressFromResultTable(){
        return getResultTable().get("Current Address ");
    }
    public String getPermanentAddressFromResultTable(){
        return getResultTable().get("Permananet Address ");
    }
}
