package utilities;

import io.codearte.jfairy.Fairy;

import java.util.Calendar;
import java.util.HashMap;

public class FakeDataGenerator {
    private static final Fairy fairy;

    static {
        fairy = Fairy.create();
    }

    public String getUsername(){
        return fairy.person().getUsername();
    }

    public String getPassword() {
        return fairy.person().getPassword();
    }

    public HashMap<String, String> getPlaceOrderData() {
        HashMap<String, String> data = new HashMap<>();
        data.put("NAME", fairy.person().getFullName());
        data.put("COUNTRY", PropertyReader.getData("PLACE.ORDER.COUNTRY"));
        data.put("CITY", PropertyReader.getData("PLACE.ORDER.CITY"));
        data.put("CARD", String.valueOf(fairy.creditCard().hashCode()));
        data.put("MONTH", String.valueOf(Calendar.getInstance().get(Calendar.MONTH)));
        data.put("YEAR", String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
        return data;
    }
}
