package lesson1.ex2;

import lesson1.ex2.input.Keyboard;
import lesson1.ex2.output.Monitor;

public class Runner {
    public static void main(String[] args) {
        Keyboard keyBoard = new Keyboard();
        Monitor monitor = new Monitor();
        Computer<Keyboard, Monitor> computer = new Computer<>(monitor, keyBoard);
        computer.input();
        Keyboard inputObject = computer.getInputobject();
        Monitor monitor1 = computer.getOutputObject();
        monitor1.show();
        keyBoard.esc();
    }
}
