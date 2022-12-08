package d04.s04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingMain {

    public static void main(String[] args) {
        //simplePattern();

        //capturingGroups();

        regexExercises();
    }

    private static void simplePattern() {
        Pattern pattern = Pattern.compile("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}");
        Matcher matcher = pattern.matcher("8/12/2022");
        System.out.println(matcher.matches());
    }

    private static void capturingGroups() {
        Pattern pattern = Pattern.compile("([0-9]{1,2})/([0-9]{1,2})/([0-9]{4})");
        Matcher matcher = pattern.matcher("08/12/2022");
        if (matcher.matches()) {
            System.out.println(matcher.group(1)); // 08
            System.out.println(matcher.group(2)); // 12
        }
    }

    private static void regexExercises() {
        // TODO validate an username that must have:
        //  a minimum of 4 characters and a maximum of 12
        //  at least one letter (upper or lower-case word)
        //  maybe one special character?

        // TODO validate a password, that must have:
        //  a minimum of 8 characters and a maximum of 20
        //  at least one lower case letter
        //  at least one upper case letter
        //  at least one special character
    }
}
