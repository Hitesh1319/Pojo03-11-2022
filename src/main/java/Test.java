import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonParser;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File(System.getProperty("user.dir") + "/src/main/java/Data.json");
        JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
        JsonObject fileObject = fileElement.getAsJsonObject();

        JsonArray jsonArrayOfCars = fileObject.get("cars").getAsJsonArray();
        List<PlainOldJavaObject> cars = new ArrayList();

        for (JsonElement carsElement : jsonArrayOfCars.getAsJsonArray()) {
            JsonObject carJsonObject = carsElement.getAsJsonObject();
            PlainOldJavaObject carData = new PlainOldJavaObject(carJsonObject.get("car").toString(), carJsonObject.get("colour").toString());
            cars.add(carData);
        }
        System.out.println("All my cars are:- " + cars);
    }
}