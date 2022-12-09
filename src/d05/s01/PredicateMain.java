package d05.s01;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {
        Predicate<Integer> isEven = value -> value %2 == 0; // %2 == 0 --> the division by 2 will have a rest of 0
        System.out.println(isEven.test(20));
        System.out.println(isEven.test(15));

        // Q: which one to use / choose? A: as you wish :-), recommended to be decided per project, for consistency
        Predicate<String> isEmptyWMR = String::isEmpty;
        Predicate<String> isEmptyWLE = string -> string.isEmpty();

        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isNotNull = isNull.negate();

        Predicate<String> isNullOrEmpty = isEmptyWMR.or(isNull);
        System.out.println(isNullOrEmpty.test(""));
        // explicit invocations / usages

        List<String> strings = Arrays.asList("Some text to be processed".split( " "));
        strings.stream()
               .filter(isNotNull) // implicit invocation / usage --> the filter method has a Predicate as a param
               .count();
    }
}
