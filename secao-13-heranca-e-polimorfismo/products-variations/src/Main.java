import model.ImportedProduct;
import model.Product;
import model.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner iUser = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberProducts = iUser.nextInt();
        iUser.nextLine();

        for (int i = 1; i <= numberProducts; i++) {
            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char cui = iUser.next().charAt(0);
            iUser.nextLine();

            if (cui == 'c') {
                System.out.print("Name: ");
                String nameProduct = iUser.nextLine();
                System.out.print("Price: ");
                double priceProduct = iUser.nextDouble();
                iUser.nextLine();

                products.add(new Product(nameProduct, priceProduct));

            } else if (cui == 'u') {
                System.out.print("Name: ");
                String nameProduct = iUser.nextLine();
                System.out.print("Price: ");
                double priceProduct = iUser.nextDouble();
                iUser.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manuFactureDate = iUser.nextLine();

                products.add(new UsedProduct(nameProduct, priceProduct, sdf.parse(manuFactureDate)));

            } else if (cui == 'i') {
                System.out.print("Name: ");
                String nameProduct = iUser.nextLine();
                System.out.print("Price: ");
                double priceProduct = iUser.nextDouble();
                iUser.nextLine();
                System.out.print("Customs fee: ");
                double customsFee = iUser.nextDouble();
                iUser.nextLine();

                products.add(new ImportedProduct(nameProduct, priceProduct, customsFee));

            } else {
                throw new NullPointerException("Insira um tipo de produto correto");
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : products){
            System.out.println(String.format("%s", product.priceTag()));
        }

        iUser.close();
    }
}