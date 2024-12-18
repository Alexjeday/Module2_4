package homework.homework3.ex5;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;



public class Runner {
    public static void main(String[] args) {
        Comparator<Feedback> feedbackComparator = Comparator.comparing(Feedback::getCountLikes)
                .thenComparing(Feedback::getLocalDateTime)
                .thenComparing(Feedback::getId)
                .reversed();
        TreeSet<Feedback> feedbacks = new TreeSet<>(feedbackComparator);
        List<Feedback> feedbackList = List.of(
            new Feedback(
                1,
                200,
                 LocalDateTime.of(2024,1,25,13,37),
                "Grete product!"),
            new Feedback(
                 2,
                 100,
                 LocalDateTime.of(2024,1,25,16,37),
                 "Product is so so!"),
            new Feedback(
                 3,
                 100,
                 LocalDateTime.of(2024,1,25,13,37),
                 "It's a bad product!"),
            new Feedback(
                 4,
                 100,
                 LocalDateTime.of(2024,1,25,13,37),
                "It's a bad product!")
        );
        feedbacks.addAll(feedbackList);
        feedbacks.forEach(System.out::println);




        //Создать коллекцию, которая хранит отсортированные отзывы по:
        // 1.лайкам
        // 2.(Если лайки совпадают) дата + время отзыва
        // 3.(Если лайки и дата + время отзыва совпадают) id

        //Уникальность определяется на основе сортировки.
        //Создать comparator через лямбда выражение, для сортировки отзывов:

        //Пример, отсортированный :
        //          (id, текст, кол-во лайков, дата+время)
        //отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
        //отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
        //отзыв №4: 4, плохой товар, 100, 25.01.2024 13:37
        //отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
    }
    private static int compare(Feedback feedback1, Feedback feedback2) {
        if (feedback1.getCountLikes().compareTo(feedback2.getCountLikes())  != 0) {
            return (feedback1.getCountLikes().compareTo(feedback2.getCountLikes()));
        }
        if (feedback1.getLocalDateTime().compareTo(feedback2.getLocalDateTime()) != 0) {
            return (feedback1.getLocalDateTime().compareTo(feedback2.getLocalDateTime()));
        }
        return feedback1.getId().compareTo(feedback2.getId());
     }
}
