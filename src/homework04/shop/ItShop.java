package homework04.shop;

import homework04.AllProducts;
import homework04.ProductsCart;
import homework04.model.Product;
import homework04.supplier.Supplier;

import java.util.ArrayList;
import java.util.List;

public class ItShop implements Shop {

    private final ProductsCart cart = new ProductsCart();

    private final List<Product> products;

    public ItShop() {
        products = new ArrayList<>();
        products.add(AllProducts.RX_7900XT);
        products.add(AllProducts.RTX_3080);
        products.add(AllProducts.Corsair_DDR4);
    }

    @Override
    public ProductsCart getCart() {
        return cart;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean addToShoppingCart(Product product) {
        for (Product p : products) {
            if (p.equals(product)) {
                cart.addedProduct(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean orderProduct(Supplier supplier, Product product) {
        Product deliverProduct = supplier.deliverProduct(product);
        if (deliverProduct != null) {
            products.add(deliverProduct);
            return true;
        }
        return false;
    }
}