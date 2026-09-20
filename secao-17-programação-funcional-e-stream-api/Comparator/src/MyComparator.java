import entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getProductName().toUpperCase().compareTo(p2.getProductName().toUpperCase());
    }
}
