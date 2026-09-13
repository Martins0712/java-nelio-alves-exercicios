package entities;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other){

        int priceCompare = this.price.compareTo(other.price);

        if (priceCompare != 0){
            return priceCompare;
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + "(R$ " + price + ")\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
