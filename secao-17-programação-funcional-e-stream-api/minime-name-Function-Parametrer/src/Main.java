import entities.Product;
import util.ProductService;

import java.util.ArrayList;
import java.util.List;


public class Main{

    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD CASE", 80.90));
        list.add(new Product("--------------------", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        
        System.out.println("Sum = " + String.format("%.2f", sum));

    }
}