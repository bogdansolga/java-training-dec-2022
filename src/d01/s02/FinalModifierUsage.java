package d01.s02;

import java.util.ArrayList;
import java.util.List;

public class FinalModifierUsage {

    public static void main(String[] args) {
        final int value = 23;
        //value = 24; // cannot re-assign a final variable

        final Integer another = 40;
        //another = 35; // cannot re-assign it

        final List<String> strings = new ArrayList<>();
        strings.add("Something"); // adds a value to the list
        //strings = new ArrayList<>(); // cannot re-assign the object
    }
}
