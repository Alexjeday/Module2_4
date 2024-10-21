package homework.homework2.ex1;
import homework.homework2.Luggage;
import homework.homework2.LuggageDeserializeUtil;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {
    private static final int LUGGAGE_TAPE_LIMIT_SIZE = 10;
    private static final String DELIMITER = ";";
    public static void main(String[] args) {
        unloadBaggage("luggage.csv");
    }

    private static void unloadBaggage(String filename) {
        try (Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename))) {
            skipFirstLineFromFile(scanner);
            unloadBaggage(scanner);
        }
    }

    private static void unloadBaggage(Scanner scanner) {
        LinkedList<Luggage> luggageTape = new LinkedList<>();
        while (scanner.hasNext()) {
            loadOnTapeByPortion(scanner, luggageTape, LUGGAGE_TAPE_LIMIT_SIZE);
            System.out.println("Лента загружена, начинается выдача багажа");
            unloadTape(luggageTape);
        }
    }

    /**
     * Загрузка на ленту порциями по n штук.
     */
    private static void loadOnTapeByPortion(Scanner scanner,
                                            LinkedList<Luggage> luggageTape,
                                            int portion) {
        System.out.println("Начинается загрузка на ленту");
        while (luggageTape.size() < (portion + 1) && scanner.hasNext()) {
            Luggage luggage = LuggageDeserializeUtil.deserializeLuggage(scanner.nextLine().split(DELIMITER));
            luggageTape.add(luggage);

        }
    }
    private static void unloadTape(LinkedList<Luggage> luggageTape) {
        while (luggageTape.size() > 0) {
            Luggage luggage = luggageTape.poll();
            System.out.printf("%s - выдан\n", luggage.getNumber());
        }
        System.out.println("Лента пустая, закончена выдача багажа");
    }



    private static void skipFirstLineFromFile(Scanner scanner) {
        if (scanner.hasNext()) {
            scanner.nextLine();
        }
    }


}
