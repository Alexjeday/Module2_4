import java.util.ArrayList;
import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {
        int number = 0;
        while (number < 10){
            if (number == 0) {
                continue;
            }
            number++;
        }
        System.out.println(number);
    }

}
