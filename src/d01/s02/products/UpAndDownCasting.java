package d01.s02.products;

public class UpAndDownCasting {

    public static void main(String[] args) {
        Product product = new Product(20, "Phone");
        Tablet tablet = new Tablet();
        tablet.setProducer("Someone");

        Product anotherProduct = (Product) tablet;  // up-casting       --> the extra properties are lost
        Tablet anotherTablet = (Tablet) product;    // down-casting     --> the extra properties are null
        System.out.println(anotherTablet.getProducer());
    }
}
