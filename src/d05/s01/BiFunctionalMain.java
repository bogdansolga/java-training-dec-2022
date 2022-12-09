package d05.s01;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalMain {

    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (first, second) -> first.length() > 3 && second > 5;
        BiPredicate<String, Integer> biPredicateWithTypes = (String first, Integer second)
                -> first.length() > 3 && second > 5;

        BiFunction<String, Integer, String> biFunction = (first, second) -> "something";
    }
}
