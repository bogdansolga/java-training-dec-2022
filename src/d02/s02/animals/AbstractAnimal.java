package d02.s02.animals;

public abstract class AbstractAnimal {

    public static AbstractAnimal createFromString(String string) {
        return new Cow(); // just an example; a real implementation will return the animal by its type
    }

    abstract boolean canBark();

    abstract boolean hasFur();

    abstract String getName();

    abstract String getColor();

    abstract int getAge();

    public AbstractAnimal() {
        // invoked from the extending classes, using the 'super' call
        System.out.println("Something done / initialized in the parent class");
    }

    @Deprecated
    public void displayDetails() {
        System.out.println("Displaying the details of a " + getClass().getSimpleName());
    }
}
