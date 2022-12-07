package domain.animals;

public class Hamster extends AbstractAnimal {

    private int fluffiness;

    private String name;

    private String color;

    public int getFluffiness() {
        return fluffiness;
    }

    public void setFluffiness(int fluffiness) {
        this.fluffiness = fluffiness;
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
    public boolean canBark() {
        return false;
    }

    @Override
    public boolean hasFur() {
        return true;
    }

    @Override
    public int getAge() {
        return 0;
    }
}
