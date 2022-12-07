package d03.s03;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringsMain {

    public static void main(String[] args) {
        //simpleExamples();

        //stringBuilderExample();

        stringTokenizerExample();
    }

    private static void simpleExamples() {
        String text = "Christmas is coming, with a lot of free time";

        String[] parts = text.split(" ");
        System.out.println(Arrays.asList(parts));

        final String substring = text.substring(0, 7);
        System.out.println(substring);

        System.out.println(text.toUpperCase());
        final boolean coming = text.contains("coming");

        final String replaced = text.replace("a lot of", "not enough");
        System.out.println(replaced);

        final int length = "something".length();
    }

    private static void stringBuilderExample() {
        StringBuilder stringBuilder = new StringBuilder("Winter ");
        stringBuilder.append("is coming, ")
                     .append("sooner or later, ")
                     .append("with or without snow");
        System.out.println(stringBuilder.toString());
    }

    private static void stringTokenizerExample() {
        String wish = "I want a holiday, not just a weekend";
        StringTokenizer tokenizer = new StringTokenizer(wish, ", ");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
