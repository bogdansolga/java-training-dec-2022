package d03.s01;

import domain.animals.AbstractAnimal;
import domain.animals.Cow;
import domain.animals.Hamster;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsSortingMain {

    public static void main(String[] args) {
        //setExample();

        //mapExample();

        //listExample();

        comparatorExample();
    }

    private static void setExample() {
        Set<Hamster> hamsters = new TreeSet<>();
        // DRY - Don't Repeat Yourself
        hamsters.add(createHamster("Tom"));
        hamsters.add(createHamster("Mickey"));
        hamsters.add(createHamster("Jane"));

        displayItems(hamsters);
    }

    private static Hamster createHamster(String name) { // Rename --> Shift + F6
        Hamster hamster = new Hamster();
        hamster.setName(name); // Ctrl + Alt + M --> Extract method
        return hamster;
    }

    private static void displayItems(Collection<? extends AbstractAnimal> animals) {
        for (AbstractAnimal animal : animals) {
            System.out.println("\t" + animal.getName());
        }
    }

    private static void mapExample() {
        Map<String, Hamster> hamstersMap = new TreeMap<>();
        hamstersMap.put("Jane", createHamster("Jane"));
        hamstersMap.put("Tom", createHamster("Tom"));
        hamstersMap.put("Mike", createHamster("Mike"));

        for (Map.Entry<String, Hamster> entry : hamstersMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().getName());
        }
    }

    private static void listExample() {
        List<Hamster> hamsters = new ArrayList<>();
        hamsters.add(createHamster("Tom"));
        hamsters.add(createHamster("Mickey"));
        hamsters.add(createHamster("Jane"));

        System.out.println("Before sorting:");
        displayItems(hamsters);

        Collections.sort(hamsters);

        System.out.println("After sorting:");
        displayItems(hamsters);
    }

    private static void comparatorExample() {
        List<Cow> cows = new ArrayList<>();
        cows.add(new Cow("Angela", "Brown"));
        cows.add(new Cow("Marie", "Blue"));
        cows.add(new Cow("Cristina", "Yellow"));

        System.out.println("Before sorting:");
        displayItems(cows);

        cows.sort(new CowComparator());

        System.out.println("After sorting:");
        displayItems(cows);
    }

    private static class CowComparator implements Comparator<Cow> {

        @Override
        public int compare(Cow first, Cow second) {
            return first.getName().compareTo(second.getName());
        }
    }
}
