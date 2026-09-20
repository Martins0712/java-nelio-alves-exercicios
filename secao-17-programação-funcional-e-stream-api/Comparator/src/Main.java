import entities.Product;

import java.util.*;

public class Main{
    public static void main(String[] args){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Comparator<Product> comp = (p1, p2) -> p1.getProductName().toUpperCase().compareTo(p2.getProductName().toUpperCase());

        list.sort(new MyComparator());
        list.sort(comp);
        list.sort((p1, p2) -> p1.getProductName().toUpperCase().compareTo(p2.getProductName().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }

        System.out.println(list);
    }
}