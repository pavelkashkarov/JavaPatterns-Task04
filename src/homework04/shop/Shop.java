package homework04.shop;

import homework04.ProductsCart;
import homework04.model.Product;
import homework04.supplier.Supplier;

import java.util.List;

public interface Shop {

    ProductsCart getCart();

    List<Product> getProducts();

    boolean addToShoppingCart(Product product);

    boolean orderProduct(Supplier supplier, Product product);
}