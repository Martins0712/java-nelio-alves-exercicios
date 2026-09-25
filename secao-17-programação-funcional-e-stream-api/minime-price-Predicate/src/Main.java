import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main{

    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD CASE", 80.90));

        double min = 100.0;
        Predicate<Product> pred = p -> p.getPrice() >= min;

        list.removeIf(Product::staticProductPredicate);
        list.removeIf(product -> product.getPrice() >= 100);
        list.removeIf(Product::nonStaticProductPredicate);
        list.removeIf(pred);
        list.removeIf(p -> p.getPrice() >= min);

        for (Product p: list){
            System.out.println(p);
        }
    }
}