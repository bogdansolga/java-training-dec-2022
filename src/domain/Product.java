package domain;

import java.util.Objects;

public class Product {

    private static final String TABLE_NAME = "product";

    static {
        System.out.println("Initializing the class...");
    }

    private int id;

    private String name;

    private Fruit fruit;

    private Discount discount;

    public Product(int id, String name) { // the recommended object creation method
        this.id = id;
        this.name = name;
    }

    // default (/ no params) constructor
    // it exists (in the class) even without writing it
    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    // a factory method --> creates Product objects, hides the implementation
    public static Product createProduct(int id, String name) {
        return new Product(id, name);
    }

    public void process() {
        System.out.println("Processing the current '" + name + "'...");
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fruit='" + fruit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    // an inner (or private) class - can be used just in the current class
    private static class Discount {
        int percentage;

        double value;
    }
}
