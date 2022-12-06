package domain;

public class Fruit { // modelling (/ describing) a fruit in the code
    private int id;

    private String name;

    private String color;

    private boolean canMakeJuiceFromIt;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanMakeJuiceFromIt() {
        return canMakeJuiceFromIt;
    }

    public void setCanMakeJuiceFromIt(boolean canMakeJuiceFromIt) {
        this.canMakeJuiceFromIt = canMakeJuiceFromIt;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", canMakeJuiceFromIt=" + canMakeJuiceFromIt +
                '}';
    }
}
