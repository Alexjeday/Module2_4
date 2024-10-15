package lesson2.ex1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>(List.of(1, 2,3,5,7));
        ArrayList<Integer> secondList = new ArrayList<>(List.of(1, 2,4, 3, 8, 9));
        firstList.retainAll(secondList);
        System.out.println(firstList);
    }
}
