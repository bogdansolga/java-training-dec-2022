package d02.s05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {

    public static void main(String[] args) {
        //listsExamples();

        //setsExamples();

        mapsExamples();
    }

    private static void listsExamples() {
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.addAll(Arrays.asList("Tuesday", "Wednesday"));
        System.out.println("There are now " + weekDays.size() + " days");

        final boolean wasRemoved = weekDays.remove("Tuesday");
        final String removedItem = weekDays.remove(1);

        for (String weekDay : weekDays) {
            System.out.println(weekDay);
        }
    }

    private static void setsExamples() {
        Set<String> strings = new HashSet<>();
        strings.add("something");
        strings.add("something");

        strings.add("before");
        strings.add("after");

        for (String string : strings) {
            //System.out.println(string);
        }

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("first");
        treeSet.add("second");
        treeSet.add("fourth");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }

    private static void mapsExamples() {
        Map<Integer, String> map = new HashMap<>(20);
        map.put(5, "Monday");
        map.put(6, "Tuesday");
        map.put(1, "Saturday");

        System.out.println(map.keySet());
        System.out.println(map.values());

        for (Map.Entry<Integer, String> entrySet : map.entrySet()) {
            System.out.println(entrySet.getKey() + " -> " + entrySet.getValue());
        }
    }
}
