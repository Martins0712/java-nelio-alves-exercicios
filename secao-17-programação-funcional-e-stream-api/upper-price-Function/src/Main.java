import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main{

    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD CASE", 80.90));
        list.add(new Product("--------------------", 80.90));


        List<String> namesMethod1 = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        List<String> namesMethod2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        List<String> namesMethod3 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        Function<Product, String> func = product -> product.getName().toUpperCase();
        List<String> namesMethod4 = list.stream().map(func).collect(Collectors.toList());

        List<String> namesMethod5 = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());


        namesMethod1.forEach(System.out::println);
        namesMethod2.forEach(System.out::println);
        namesMethod3.forEach(System.out::println);
        namesMethod4.forEach(System.out::println);
        namesMethod5.forEach(System.out::println);
    }
}