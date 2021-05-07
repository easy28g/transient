package megacom;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Subscriber subscriber = new Subscriber("aza@gmail.com", "azamat", "password", "+996555001677");
        System.out.println(subscriber);
        String transientJson = gson.toJson(subscriber);
        System.out.println(transientJson);
    }
}
