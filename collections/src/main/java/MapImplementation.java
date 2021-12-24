import java.util.HashMap;
import java.util.Map;

public class MapImplementation implements ProductLookupTable{
    Map<Integer, Product> mapOfProducts = new HashMap<>();

    @Override
    public Product lookupById(int id) {
        return mapOfProducts.get(id);
    }

    @Override
    public void addProduct(final Product productToBeAdded) {
        int id = productToBeAdded.getId();

        if (mapOfProducts.containsKey(id)) {
            throw new IllegalArgumentException("Unable to add product." + productToBeAdded.getName() + " already exists.");
        }

        mapOfProducts.put(id, productToBeAdded);
    }

    @Override
    public void removeProduct(final Product productToBeRemoved) {

        int id = productToBeRemoved.getId();

        mapOfProducts.remove(id);
    }

    @Override
    public void clear() {
        mapOfProducts.clear();
    }
}
