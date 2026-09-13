import entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args){

        Map<String, String> stock = new TreeMap<>();

        stock.put("username", "Maria");
        stock.put("email", "maria@gmail.com");
        stock.put("phone", "9971112");

        stock.remove("email");
        stock.put("phone", "99771133");

        System.out.println("Contains 'phone' key: " + stock.containsKey("phone"));
        System.out.println("Phone number: " + stock.get("phone"));
        System.out.println("Email: " + stock.get("email"));
        System.out.println("Size: " + stock.size());


        System.out.println("ALL COOKIES");
        for (String key : stock.keySet()){
            System.out.println(key + ": " + stock.get(key));
        }
    }

    public static void demo(String[] args){
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("TV", 900.0);
        Product p3 = new Product("TV", 900.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product ("Tv", 900.0);

        System.out.println("Contains 'ps' key: "+ stock.containsKey(ps));

    }
}