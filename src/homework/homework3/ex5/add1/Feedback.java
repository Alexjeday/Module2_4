package homework.homework3.ex5.add1;

import java.time.LocalDateTime;

public class Feedback {
    private int id;
    private String text;
    private int likes;
    private LocalDateTime dateTime;

    public Feedback(int id, String text, int likes, LocalDateTime dateTime) {
        this.id = id;
        this.text = text;
        this.likes = likes;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", likes=" + likes +
                ", dateTime=" + dateTime +
                '}';
    }
}
