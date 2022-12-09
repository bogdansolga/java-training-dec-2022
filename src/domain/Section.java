package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Section {

    private final int id;

    private final String name;

    private List<Product> products;

    public Section(int id, String name) {
        this.id = id;
        this.name = name;

        this.products = new ArrayList<>();
        IntStream.range(0, new Random().nextInt(20))
                 .forEach(it -> products.add(new Product(it, "The " + name + " with the ID " + it)));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
