package homework.homework1.restaurant;
import java.util.ArrayList;
import java.util.List;



public class Restaurant {
    public static void main(String[] args) {
        List<String> monday = List.of("Чебуречная №1", "Реберная", "Андерсон", "Ниппон", "Фо бо");
        List<String> tuesday = List.of("Вареничная №1", "Андерсон", "Ниппон", "Фо бо", "Реберная");
        List<String> wednesday = List.of("Чебуречная №1",  "Пушкин", "Майя", "Ниппон", "Реберная", "Фо бо");
        List<String> thursday = List.of("Грех", "Ваниль",  "Реберная", "Пянсе", "Фо бо");
        List<String> friday = List.of("Бердс", "Реберная", "Андерсон", "Ниппон","Фо бо", "Чифанька");
        List<String> resultList = new ArrayList<>(monday);
        for (List<String> day : List.of(tuesday, wednesday, thursday, friday)) {
            resultList.retainAll(day);
        }
        System.out.println(resultList);
    }
}
