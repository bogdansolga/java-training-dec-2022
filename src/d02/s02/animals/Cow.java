package d02.s02.animals;

@SuppressWarnings("unused")
public class Cow extends AbstractAnimal {

    private String name;

    private String color;

    public Cow(String name, String color) {
        super(); // invoking the constructor from the parent class
        this.name = name;
        this.color = color;
    }

    public Cow() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    boolean canBark() {
        return false;
    }

    @Override
    boolean hasFur() {
        return true;
    }

    @Override
    int getAge() {
        return 0;
    }
}
