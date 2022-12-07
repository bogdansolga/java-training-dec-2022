package d03.s02;

import domain.animals.Cow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

    public static void main(String[] args) {
        List<Cow> cows = new ArrayList<>();
        cows.add(new Cow("Angela", "Brown"));
        cows.add(new Cow("Marie", "Blue"));
        cows.add(new Cow("Cristina", "Yellow"));

        final Iterator<Cow> iterator = cows.iterator();
        while (iterator.hasNext()) {
            Cow next = iterator.next();
            if (next.getColor().equals("Blue")) {
                iterator.remove();
            }
        }

        System.out.println("There are now just " + cows.size() + " cows");

        Cow[] cowsArray = new Cow[]{new Cow("Jane", "Brow"), new Cow("Joe", "Brown")};
        List<Cow> fromAnArray = Arrays.asList(cowsArray);
    }
}
