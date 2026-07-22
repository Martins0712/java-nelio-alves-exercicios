package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args){

        Scanner iUser = new Scanner(System.in);
        iUser.useLocale(Locale.US);

        try {

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = iUser.nextInt();
            iUser.nextLine();
            System.out.print("Holder: ");
            String name = iUser.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = iUser.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = iUser.nextDouble();

            Account account = new Account(initialBalance, name, number, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = iUser.nextDouble();
            account.withdraw(amount);
            System.out.println("New Balance: " + account.getBalance());
        }
        catch (DomainException e){
            System.out.print("Withdraw Error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected Error!");
        }
        iUser.close();
    }
}
