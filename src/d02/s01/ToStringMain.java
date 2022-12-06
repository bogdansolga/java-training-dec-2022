package d02.s01;

import domain.Fruit;
import domain.Product;

public class ToStringMain {

    public static void main(String[] args) {
        Product product = new Product(1, "Lego");
        final Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setCanMakeJuiceFromIt(true);
        product.setFruit(fruit);

        System.out.println(product);
    }
}
