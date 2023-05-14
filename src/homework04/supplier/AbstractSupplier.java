package homework04.supplier;

import homework04.model.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSupplier implements Supplier {

    protected List<Product> products = new ArrayList<>();

    public abstract void howDelivery();

    @Override
    public Product deliverProduct(Product product) {
        for (Product p : products) {
            if (p.equals(product)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}