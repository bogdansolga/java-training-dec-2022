package d01.s02.fruits;

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
}
