package d05.s01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionMain {

    public static void main(String[] args) {
        Function<Integer, String> displayIt = value -> "The value is " + value;
        System.out.println(displayIt.apply(20));

        Function<String, Integer> parser = Integer::parseInt;
        System.out.println(parser.apply("30"));

        // chaining two or more functions
        parser.andThen(displayIt)
              .apply("50");

        List<String> strings = Arrays.asList("Some text to be processed".split( " "));
        strings.stream()
               .map(String::toLowerCase) // the 'map' method is using a Function as a parameter
               .collect(Collectors.toSet());
    }
}
