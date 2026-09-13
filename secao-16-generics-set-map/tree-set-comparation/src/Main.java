import entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args){

        Set<Product> myProducts = new TreeSet<>();

        myProducts.add(new Product("TV", 900.0));
        myProducts.add(new Product("Notebook", 2500.0));
        myProducts.add(new Product("Cubo", 1800.0));
        myProducts.add(new Product("Celular", 1800.0));

        System.out.println(myProducts);
    }
}