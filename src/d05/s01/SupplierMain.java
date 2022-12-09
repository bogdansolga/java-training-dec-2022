package d05.s01;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "a static text";                // a static value
        Supplier<Integer> randomValueSupplier = () -> new Random().nextInt();   // dynamic values
        Supplier<RuntimeException> exceptionSupplier = () -> new RuntimeException("Oops");

        System.out.println(stringSupplier.get());
        System.out.println(randomValueSupplier.get());

        // we will further see Supplier objects used in the Optional class
    }
}
