package homework.homework4.ex1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    private static final int COUNT_NUMBERS_IN_CAR_NUMBER = 3;
    private static final String FIRST_CAR_NUMBER_PATTERN = "а%sан799";
    private static final String SECOND_CAR_NUMBER_PATTERN = "к%sсе178";
    private static final int COUNT_CARS = 50;
    public static void main(String[] args) {
        Stream<Car> firstCarStream = generateCars(FIRST_CAR_NUMBER_PATTERN, COUNT_CARS);
        Stream<Car> secondCarStream = generateCars(SECOND_CAR_NUMBER_PATTERN, COUNT_CARS);
        Stream.concat(firstCarStream, secondCarStream)
                .filter(car -> isClerkNumber(car.getNumber()))
                .map(Car::getNumber)
                .forEach(carNumber -> System.out.println(carNumber));
        //String firstPattern = "а%sан799";
        //System.out.println(createNumber(FIRST_CAR_NUMBER_PATTERN, 909));

    }

    private static boolean isClerkNumber(String number) {
        Integer carNumber = Integer.valueOf(number.substring(1, 4));
        return carNumber >= 40 && carNumber <= 49;

    }
    private static String createNumber(String numberPattern, Integer number) {
        String textNumber = "0".repeat(COUNT_NUMBERS_IN_CAR_NUMBER - number.toString().length())
                .concat(number.toString());
        return numberPattern.formatted(textNumber);
    }

    private static Stream<Car> generateCars(String numberPattern, Integer countCars) {
        AtomicInteger carNumber = new AtomicInteger(0);
        return Stream.generate(() -> new Car(createNumber(numberPattern, carNumber.addAndGet(1))))
                .limit(countCars);
    }


}
