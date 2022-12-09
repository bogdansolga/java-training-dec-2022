package d05.s01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String[] args) {
        Consumer<String> display = value -> System.out.println(value);
        display.accept("Something");

        // statement lambda expressions = lambda expressions defined on more than one line
        Consumer<String> statementLambda = value -> {
            if (value.length() > 4) {
                System.out.println(value);
            } else {
                System.out.println("not long enough");
            }
        };

        Consumer<String> lambdaExpressionAsAMethod = lambdaExpressionAsAMethod();

        display.andThen(statementLambda)
               .andThen(lambdaExpressionAsAMethod)
               .accept("something");

        // main usage context - Optional class and Streams API
        List<String> stringList = Arrays.asList("An example of a text to be used".split(" "));
        stringList.forEach(lambdaExpressionAsAMethod);
    }

    private static Consumer<String> lambdaExpressionAsAMethod() {
        return param -> System.out.println(param);
    }
}
