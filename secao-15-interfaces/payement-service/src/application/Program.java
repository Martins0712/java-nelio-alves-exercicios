package application;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());

        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(date,number, totalValue);

        System.out.print("Enter number of installments: ");
        int months = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, months);

        System.out.println();
        System.out.println("INSTALLMENTS:");

        for (Installment installment : contract.getInstallments()) {
            System.out.println(sdf.format(installment.getDueDate()) + " - " + String.format("%.2f", installment.getAmount()));
        }

        sc.close();
    }
}
