package lesson1.ex2.input;

public class Mouse implements Input {
    public void input() {
        System.out.println("Ввод данных с помощью мыши. ");
    }

    public void scroll(){
        System.out.println("Крутим колесико у мышки. ");
    }
}
