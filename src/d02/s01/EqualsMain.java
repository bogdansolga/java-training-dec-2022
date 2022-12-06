package d02.s01;

import domain.Product;

public class EqualsMain {

    public static void main(String[] args) {
        Product product = new Product(1, "Chair");
        Product another = product; // the two objects will have the same memory reference
        System.out.println(product.equals(another));

        Product watch = new Product(1, "Watch");
        System.out.println(product.equals(watch));
    }
}
