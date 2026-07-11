import entities.enums.OrderStatus;
import models.Client;
import models.Order;
import models.OrderItem;
import models.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main (String[] args ) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner iUser = new Scanner(System.in);

        System.out.println("ENTER CLIENT DATA:");
        System.out.print("Name: ");
        String nameClient = iUser.nextLine();
        System.out.print("Email: ");
        String emailClient = iUser.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String birthDateClient = iUser.nextLine();
        Client client = new Client(nameClient, emailClient, sdf.parse(birthDateClient));

        System.out.println("ENTER ORDER DATA:");
        System.out.print("Status: ");
        String statusOrder = iUser.nextLine();
        System.out.print("How many items to this order: ");
        int orderQuantity = iUser.nextInt();
        iUser.nextLine();
        entities.enums.OrderStatus statusConvertido = OrderStatus.valueOf(statusOrder.trim().toUpperCase());

        Order order = new Order(new Date(), statusConvertido, client);

        for (int i = 0; i < orderQuantity; i++){
            System.out.printf("Enter #%d item data:\n", i + 1);
            System.out.print("Product Name: ");
            String productName = iUser.nextLine();
            System.out.print("Product Price: ");
            double productPrice = iUser.nextDouble();
            System.out.print("Quantity: ");
            int quantityProducts = iUser.nextInt();
            iUser.nextLine();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(product, quantityProducts);
            order.addItems(orderItem);
        }
        System.out.println(order);





    }
}
