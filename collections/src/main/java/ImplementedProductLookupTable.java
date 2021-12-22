import java.util.ArrayList;
import java.util.List;

public class ImplementedProductLookupTable implements  ProductLookupTable{
    private final List<Product> products = new ArrayList<>();

    @Override
    public Product lookupById(int id) {
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void clear() {

    }
}
