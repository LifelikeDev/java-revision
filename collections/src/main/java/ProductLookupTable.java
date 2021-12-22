public interface ProductLookupTable {
    // return a product by its id
    Product lookupById(int id);

    // add a product
    void addProduct(Product product);

    // clear the list of products
    void clear();
}
