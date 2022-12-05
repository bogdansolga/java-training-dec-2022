package d01.s02;

// an immutable class --> the property is set via constructor, it only has a getter for it
// --> we cannot modify an object after we create it, as there is no setter on the class
public class Cat {

    // blank final usage --> the name is marked as 'final', but it is not initialized
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
