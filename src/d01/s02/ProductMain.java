package d01.s02;

public class ProductMain {

    public static void main(String[] args) {
    // className objectName  instantiating the class
        Product theProduct = new Product();
        theProduct.setName("Phone");
        theProduct.setId(23);

        // an object (in OOP) is an instance of a class
        System.out.println(theProduct.getName());

        Product anotherProduct = new Product(20, "Laptop");
        System.out.println(anotherProduct.getName());
    }
}
