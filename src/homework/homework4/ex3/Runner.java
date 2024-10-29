package homework.homework4.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Skyscraper> skyscrapers = new ArrayList<>();
        skyscrapers.add(new Skyscraper("Всемирный торговый центр", 541));
        skyscrapers.add(new Skyscraper("Шанхайская башня", 632));
        skyscrapers.add(new Skyscraper("Бурдж-Халифа", 1012));
        skyscrapers.add(new Skyscraper("Международный финансовый центр Пинань", 599));
        skyscrapers.add(new Skyscraper("Абрадж аль-Бейт", 6000));
        skyscrapers.add(new Skyscraper("Всемирный центр Лотте", 555));
        skyscrapers.add(new Skyscraper("Бурдж-Халифа", 828));

        List<Skyscraper> uniqueSkyscrapers =  skyscrapers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Первые три небоскреба:");
        uniqueSkyscrapers.stream()
                .limit(3)
                .forEach(System.out::println);

        uniqueSkyscrapers.stream()
                .max(Comparator.comparingInt(Skyscraper::getHeight))
                .ifPresent(max -> System.out.println("\nСамый высокий небоскреб: " + max));

        List<Skyscraper> skyscrapersOveroneKm = uniqueSkyscrapers.stream()
                .filter(s -> s.getHeight() > 1000)
                .collect(Collectors.toList());

        System.out.println("\nНебоскребы выше километра: ");
        if (skyscrapersOveroneKm.isEmpty()) {
            System.out.println("Небоскреба выше километра нет. ");
        } else {
            skyscrapersOveroneKm.forEach(System.out::println);
        }
    }
}
