package util;

import entities.Product;

import java.util.function.Consumer;

public class PriceUdate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
        System.out.println("___________________________________");
    }
}
