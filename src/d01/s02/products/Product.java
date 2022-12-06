package d01.s02.products;

public class Product {

    private static final String TABLE_NAME = "product";

    static {
        System.out.println("Initializing the class...");
    }

    private int id;

    private String name;

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

    // a factory method --> creates Product objects, hides the implementation
    public static Product createProduct(int id, String name) {
        return new Product(id, name);
    }

    public void process() {
        System.out.println("Processing the current '" + name + "'...");
    }

    // an inner (or private) class - can be used just in the current class
    private static class Discount {
        int percentage;

        double value;
    }
}
