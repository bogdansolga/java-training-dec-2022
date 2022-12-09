package d05.s01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// a few examples for the difference between imperative and functional programming
public class ImperativeVsFunctionalMain {

    public static void main(String[] args) {
        String text = "Java 8 added a lot of new features and goodies";
        List<String> words = new ArrayList<>(Arrays.asList(text.split("\\s")));

        // req - remove the words shorter than 3 chars

        //imperativeProcessing(words);
        functionalProcessing(words);
        System.out.println("Remaining words: " + words);
    }

    private static void imperativeProcessing(List<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() < 3) {
                iterator.remove();
            }
        }
    }

    private static void functionalProcessing(List<String> words) {
        words.removeIf(word -> word.length() < 3);
    }
}
