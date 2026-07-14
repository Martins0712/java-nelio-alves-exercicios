
import model.Company;
import model.Individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Individual> taxPayer = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner iUser = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int taxPayers = iUser.nextInt();
        iUser.nextLine();

        for (int i = 1; i <= taxPayers; i++) {

            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char type = iUser.next().toUpperCase().charAt(0);
            iUser.nextLine();

            if (type == 'I') {
                System.out.print("Name: ");
                String name = iUser.nextLine();
                System.out.print("Annual income: ");
                Double annualIncome = iUser.nextDouble();
                iUser.nextLine();
                System.out.print("Health expenditures: ");
                Double healthExpenditures = iUser.nextDouble();
                iUser.nextLine();

                taxPayer.add(new Individual(name, annualIncome, healthExpenditures));
            } else if (type == 'C') {
                System.out.println("Selecionado: Company");
                System.out.print("Name: ");
                String name = iUser.nextLine();
                System.out.print("Annual income: ");
                Double annualIncome = iUser.nextDouble();
                iUser.nextLine();
                System.out.print("Number of employees: ");
                int numberEmployeer = iUser.nextInt();
                iUser.nextLine();

                taxPayer.add(new Company(name, annualIncome, numberEmployeer));

            } else {
                System.out.println("Opção inválida.");
            }
        }
        System.out.println("\nTAXES PAID: ");
        double totalTax = 0.0;
        for (Individual tax : taxPayer){
            System.out.println(tax);
            totalTax += tax.totalTax();
        }
        System.out.println();
        System.out.print("TOTAL TAXES: $ "+ totalTax);

        iUser.close();
    }
}