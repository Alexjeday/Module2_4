package homework.homework3.ex3;

import java.beans.Customizer;
import java.util.function.Consumer;

@FunctionalInterface

public interface Burnable<T> extends Consumer<T> {
    //void burn(T arg);
}
