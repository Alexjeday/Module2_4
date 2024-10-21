package homework.homework2.ex2;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LuggageWeightCounter {
    public static void main(String[] args) {
       String fileName = "D:\\CursJava\\Module2_4\\Module2\\out\\resources\\luggage.csv";
        try {
            Map<String, Integer> result = calcluggageWeights(fileName);
            result.forEach((category, totalWeight) -> System.out.println(category + ";" + totalWeight));
        } catch (FileNotFoundException e) {
            System.out.println("Error: file is not found -" + e.getMessage());
        }
   }
   public static Map<String, Integer> calcluggageWeights(String fileName) throws FileNotFoundException {

        Map<String, Integer> luggageWeightMap = new HashMap<>();
        luggageWeightMap.put("light" , 0);
        luggageWeightMap.put("middle" , 0);
        luggageWeightMap.put("hard" , 0);
       File file = new File(fileName);
       Scanner scanner = new Scanner(file);
       while (scanner.hasNextLine()) {
           String line = scanner.nextLine();
           try {
               int weight = Integer.parseInt(line);

               if (weight < 5) {
                   luggageWeightMap.put("light", luggageWeightMap.get("light") + weight);
               } else if (weight <= 10) {
                   luggageWeightMap.put("middle", luggageWeightMap.get("middle") + weight);
               } else {
                   luggageWeightMap.put("hard", luggageWeightMap.get("hard") + weight);
               }
           } catch (NumberFormatException e) {
               System.out.println("Incorrect meaning to weight: " + line);
           }
       }
       scanner.close();
       return luggageWeightMap;
   }
}
