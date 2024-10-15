package lesson1.ex2.input;

public class Keyboard implements Input {
    public void input() {
        System.out.println("Ввод через клавиатуру. ");
    }

    public void esc() {
        System.out.println("Кнопка выхода из программ. ");
    }
}
