package domain.animals;

import java.util.Objects;

public class Hamster extends AbstractAnimal implements Comparable<Hamster> {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamster hamster = (Hamster) o;
        return Objects.equals(name, hamster.name) && Objects.equals(color, hamster.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public int compareTo(Hamster other) {
        return name.compareTo(other.getName());
    }
}
