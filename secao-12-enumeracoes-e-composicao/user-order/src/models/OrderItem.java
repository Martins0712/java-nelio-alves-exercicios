package models;

public class OrderItem {
    private Integer quantity;
    private double price;
    private Product product;

    public double subTotal() {
        double subTotal;
        subTotal = price * quantity;
        return subTotal;
    }

    public OrderItem(Product product, Integer quantity ) {
        this.product = product;
        this.price = product.getPrice();
        this.quantity = quantity;

    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return product.getName() + ", " +
                 "$" + product.getPrice() + ", " +
                "Quantity: " + quantity + ", " +
                "Sub Total: R$ " + subTotal();
    }
}
