package lesson3.train;

import java.util.LinkedList;

public class LinkedListPrimer {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String first = list.getFirst();
        System.out.println("First element = " + first);
        String last = list.getLast();
        System.out.println("Last element = " + last);
        String second = list.get(2);
        System.out.println("Second element " + second);
    }
}
