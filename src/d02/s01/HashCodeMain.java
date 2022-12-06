package d02.s01;

import domain.Product;

public class HashCodeMain {

    public static void main(String[] args) {
        Product product = new Product(1, "Coffee");
        System.out.println(product.hashCode());
    }
}
