package d02.s02;

import domain.animals.AbstractAnimal;
import domain.animals.Cow;
import domain.animals.Hamster;
import domain.Fruit;
import domain.Product;

import java.util.ArrayList;
import java.util.List;

public class AnimalsMain {

    public static void main(String[] args) {
        //AbstractAnimal animal = new AbstractAnimal();
        Cow cow = new Cow();
        cow.setName("The Lady");

        Hamster hamster = new Hamster();
        hamster.setName("Jerry");
        hamster.setFluffiness(25);

        List<AbstractAnimal> animals = new ArrayList<>();
        animals.add(cow);
        animals.add(hamster);

        for (AbstractAnimal animal : animals) {
            animal.displayDetails();
            System.out.println("\thas fur: " + animal.hasFur() + ", can bark: " + animal.canBark());
        }

        // the List interface works on a generic type of elements (E)
        // when using it, the type becomes specific - Animal, String, Fruit
        List<? extends Product> strings = new ArrayList<>();
        List<Fruit> fruits = new ArrayList<>();

        final List<?> listOfItems = getListOfItems();
    }

    private static List<?> getListOfItems() {
        return new ArrayList<>(); // just an example for the returned object
    }

    // T is an inline (/ad-hoc) generic type --> it is available just in the current method
    public static <T> void display(List<T> items, int until) {
        for (int i = 0; i < until; i++) { // ... perform actions
        }
    }
}
