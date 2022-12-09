package d05.s02;

import domain.Fruit;
import domain.Product;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        String nullableValue = System.currentTimeMillis() %2 == 0 ? "23" : null;
        Optional<String> optional = Optional.ofNullable(nullableValue);

        // 1. orElse / orElseGet
        int parsedValue = optional.map(value -> Integer.parseInt(value))
                                  .orElse(0);
        System.out.println("The parsed value is " + parsedValue);

        // 2. orElseThrow
        int parsedOrThrow = optional.map(Integer::parseInt)
                                    .orElseThrow(() -> new IllegalArgumentException("Cannot use a null value"));
        System.out.println("The second parsed value is " + parsedOrThrow);

        // please remember - the Optional class is designed to be used as a _helper class_, to help us work with
        // potentially null values in a cleaner / more succinct way. It is NOT designed to be used as a standalone type

        Product product = new Product(1, "Travel ticket to Paradise");
        final Optional<Product.Discount> discount = product.getDiscount();
        final Fruit fruit = product.getFruit();

        // 3 - ifPresent
        discount.ifPresent(value -> System.out.println("The discount is " + value));

        // 4 - isPresent + get
        if (discount.isPresent()) {
            Product.Discount theDiscount = discount.get();
        }

        // 5 - flatMap
        product.getDiscount()
               .flatMap(value -> value.getPercentage())
               .ifPresent(value -> System.out.println("The discount percentage is " + value));
    }
}
