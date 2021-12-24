import java.util.ArrayList;
import java.util.List;

public class ImplementedProductLookupTable implements  ProductLookupTable{
    private final List<Product> products = new ArrayList<>();

    @Override
    public Product lookupById(int id) {

        for (Product product: products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    @Override
    public void addProduct(final Product productToBeAdded) {
        int id = productToBeAdded.getId();

        for (Product product: products) {

            if (product.getId() == id) {
                throw new IllegalArgumentException("Unable to add product. " + product.getName() + " already exists.");
            }

            products.add(product);
        }

    }


    @Override
    public void removeProduct(final Product productToBeRemoved) {
        int id = productToBeRemoved.getId();

        for (Product product: products) {

            if (product.getId() == id) {
                products.remove(id);
            }
            throw new IllegalArgumentException("Cannot remove product. " + product.getName() + " does not exist in the collection");
        }
    }

    @Override
    public void clear() {
        products.clear();
    }
}
