package homework04.supplier;

import homework04.AllProducts;

public class BadSupplier extends AbstractSupplier {

    public BadSupplier() {
        products.add(AllProducts.ARC_A380);
        products.add(AllProducts.Corsair_DDR4);
        products.add(AllProducts.RX_7900XT);
    }

    @Override
    public void howDelivery() {
        System.out.println("Доставка только пешком :(");
    }
}