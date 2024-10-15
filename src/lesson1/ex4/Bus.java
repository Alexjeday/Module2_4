package lesson1.ex4;

public class Bus extends Car {
    @Override
    public String toString() {
        return "Автобус " +
                "чистый " + isClean +
                "\nвыезжай ";
    }
}
