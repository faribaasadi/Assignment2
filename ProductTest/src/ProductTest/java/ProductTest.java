package ProductTest.java;

public class ProductTest {

    public static void main(String[] args) {
        Product product = new Product("Shampoo" , "Gluten Free" , 9.99 , 100);
        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getMax());

    }
}
