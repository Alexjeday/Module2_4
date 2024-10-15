package homework.homework1.gidrocenter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.ZERO;
import static java.math.BigDecimal.valueOf;

public class Runner {
    public static void main(String[] args) {
       List<Integer> januaryTemperature = List.of( 0,-1,-1,-2,-5,-6,-7,-8,-9,-10,-5,-5,-2,-7,-3,-1,
               -8,-9,-8,-8,-18,-20,-23,-24,-25,-9,-8,-7,-6,-5,-1);
       List<Integer> februaryTemperature = List.of(-8,-10,-12,-13,-15,-16,-12,-7,-8,-10,-10,-9,-8,
               -8,-8,-9,-10,-9,-5,-6,-8,-7,-8,-9,-6,-5,-3,-1);
        ArrayList<Integer> result = new ArrayList<>(januaryTemperature);
        result.addAll(februaryTemperature);
        BigDecimal sumTemperature = ZERO;
        for (Integer temperatureDay : result) {
            sumTemperature = sumTemperature.add(valueOf(temperatureDay));
        }
        System.out.println(sumTemperature.divide(valueOf(result.size()),5, BigDecimal.ROUND_HALF_UP));

    }
}
