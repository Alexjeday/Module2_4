package homework.homework4.ex11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<Car> carList1 = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            String number = String.format("k%02dce178", i);
            carList1.add(new Car(number));
        }

        List<Car> carList2 = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            String number = String.format("a%02dah799", i);
            carList2.add(new Car(number));
        }

        List<Car> allCars = Stream.concat(carList2.stream(), carList1.stream()).collect(Collectors.toList());
        List<String> officialsNumber = allCars.stream()
                .map(Car::getNumber)
                .filter(number -> number.contains("04"))
                .collect(Collectors.toList());

        if (officialsNumber.isEmpty()) {
            System.out.println("Not needed  numbers for officials.");
        } else {
            System.out.println("Numbers for officials");
            officialsNumber.forEach(System.out::println);
        }
    }
}
