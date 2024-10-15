import java.util.ArrayList;
import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banane", 20);
        map.put("Strawberryes", 30);
        System.out.println("Count of apples: " + map.get("Apple"));

        if (map.containsKey("Banane")) {
            System.out.println("Counts of banane: " + map.get("Banane"));
        }
        map.remove("Strawberryes");
        System.out.println("Remains of fruits: " + map);
    }

}
