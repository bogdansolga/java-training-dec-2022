package d01.s02.fruits;

import domain.Fruit;

public class FruitMain {

    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.setName("Green apple");
        apple.setCanMakeJuiceFromIt(true);

        Fruit banana = new Fruit();
        banana.setName("Yellow banana");
        banana.setCanMakeJuiceFromIt(false);
    }
}
