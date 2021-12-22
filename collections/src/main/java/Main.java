import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

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
//        for (Product product: products) {
//            System.out.println(product);
//        }

        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();

            if (product.getWeight() > 100) {
                System.out.println("Removing element weighing greater than 100.........");
                iterator.remove();
            }
        }

        System.out.println(products);
        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(book));
        System.out.println(products.contains(new Product("water", 122)));
    }
}
