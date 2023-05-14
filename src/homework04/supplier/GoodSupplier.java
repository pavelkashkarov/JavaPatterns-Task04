package homework04.supplier;

import homework04.AllProducts;

public class GoodSupplier extends AbstractSupplier {

    public GoodSupplier() {
        products.add(AllProducts.RTX_3080);
        products.add(AllProducts.Core_I7);
        products.add(AllProducts.RGB_500W);
    }

    @Override
    public void howDelivery() {
        System.out.println("Для доставки используется скромная служебная машина Aston Martin");
    }
}