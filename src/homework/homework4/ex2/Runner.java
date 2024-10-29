package homework.homework4.ex2;

import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Set<String> words = Set.of("тон", "тополь", "боль", "рой", "стройка");
        int totalCount = words.stream()
                .mapToInt(word -> (int) word.chars()
                        .filter(c -> c ==  'о')
                        .count())
                        .sum();
        System.out.println(totalCount > 0 ? totalCount : 0);
    }
}
