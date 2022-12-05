package d01.s02;

public class Product {
    private int id;

    private String name;

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
}
