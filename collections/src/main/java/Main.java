import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        System.out.println("Some working stuff here");

        Product book = new Product("book", 23);
        Product phone = new Product("iPhone", 34);

        Collection<Product> products = new ArrayList<>();
        products.add(book);
        products.add(phone);
        products.add(new Product("water", 122));

        System.out.println(products);
        System.out.println();

        // printing out all elements
        for (Product product: products) {
            System.out.println(product);
        }
    }
}
