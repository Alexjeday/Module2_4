package homework.homework3.ex5.add2;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        Comparator<Feedback> feedbackComparator = (r1, r2) -> {
            int likeComparison = Integer.compare(r2.getLikes(), r1.getLikes());
            if (likeComparison != 0) {
                return likeComparison;
            }
            int dateComparison = r1.getDateTime().compareTo(r2.getDateTime());
            if (dateComparison != 0) {
                return dateComparison;
            }
            return Integer.compare(r1.getId(), r2.getId());
        };
        TreeSet<Feedback> feedbacks = new TreeSet<>(feedbackComparator);

        feedbacks.add(new Feedback(1, "Greate product", 200, LocalDateTime.of(2024, 1, 25, 13, 37)));
        feedbacks.add(new Feedback(2, "Product is so so", 100, LocalDateTime.of(2024, 1, 25, 16, 37)));
        feedbacks.add(new Feedback(3, "Product is bad", 100, LocalDateTime.of(2024, 1, 25, 13, 37)));
        feedbacks.add(new Feedback(4, "Product is bad", 100, LocalDateTime.of(2024, 1, 25, 13, 37)));

        feedbacks.forEach(System.out::println);
    }
}
