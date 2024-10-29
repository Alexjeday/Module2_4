package homework.homework3.ex5;

import java.time.LocalDateTime;

public class Feedback {
    private Integer id;
    private Integer countLikes;
    private LocalDateTime localDateTime;
    private String text;

    public Integer getId() {
        return id;
    }

    public Integer getCountLikes() {
        return countLikes;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", countLikes=" + countLikes +
                ", localDateTime=" + localDateTime +
                ", text='" + text + '\'' +
                '}';
    }

    public Feedback(Integer id, Integer countLikes, LocalDateTime localDateTime, String text) {
        this.id = id;
        this.countLikes = countLikes;
        this.localDateTime = localDateTime;
        this.text = text;




    }
}
