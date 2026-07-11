import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccounts;

import java.lang.reflect.AccessFlag;

public  class Main{
    public static void main(String[] args){

        BusinessAccount account = new BusinessAccount();

        Account acc = new Account(0.0, "Alex", 1001);
        BusinessAccount bacc = new BusinessAccount(0.0 , "Maria",1002,500.00 );

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(0.0, "BOB", 1003, 200.00);
        Account acc3 = new SavingAccounts(0.0, "Anna", 1004, 0.02);

        // DownCasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
        }

        if (acc3 instanceof SavingAccounts){
            SavingAccounts acc5 = (SavingAccounts)acc3;
            System.out.println("Update");
        }
    }
}