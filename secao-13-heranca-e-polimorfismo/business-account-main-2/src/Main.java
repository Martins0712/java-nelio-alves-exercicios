import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccounts;

import java.lang.reflect.AccessFlag;

public  class Main{
    public static void main(String[] args){

        Account acc1 = new Account(1000.00, "Alex", 1001);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccounts(1000.0, "Maria", 1002, 0.01);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1000.0, "João", 1003, 500.00);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());
    }
}