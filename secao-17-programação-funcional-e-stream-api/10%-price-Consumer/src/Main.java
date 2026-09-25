import entities.Product;
import util.PriceUdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Main{

    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD CASE", 80.90));

        list.forEach(new PriceUdate());
        list.forEach(System.out::println);

        list.forEach(Product::staticPriceUpdate);
        list.forEach(System.out::println);

        list.forEach(Product::nonStaticPriceUpdate);
        list.forEach(System.out::println);

        double factor = 1.1;
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
        list.forEach(cons);
        list.forEach(System.out::println);

        list.forEach(p -> p.setPrice(p.getPrice() * factor));
        list.forEach(System.out::println);

    }
}