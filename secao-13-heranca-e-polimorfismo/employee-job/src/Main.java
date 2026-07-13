import model.Employee;
import model.OutSourcedEmployee;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
        public static void main(String[] args){

        Scanner iUser = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberEmployees = iUser.nextInt();
        iUser.nextLine();

        Employee gerenciadorGeral = new Employee(0, "Gerenciador", 0.0);

        for (int i = 1; i <= numberEmployees; i++ ){
            System.out.println("Employee #"+ i + " data:");
            System.out.print("Outsourced (y/n)?");
            String employeeOutsourced = iUser.nextLine();

            System.out.print("Name: ");
            String employeeName = iUser.nextLine();
            System.out.print("Hours: ");
            int employeeHours = iUser.nextInt();
            iUser.nextLine();
            System.out.print("Value per hour: ");
            Double employeeValuePerHours = iUser.nextDouble();
            iUser.nextLine();

            Employee employee = null;

            if (employeeOutsourced.equalsIgnoreCase("n")) {
                employee = new Employee( employeeHours,employeeName, employeeValuePerHours);
            }else{
                System.out.print("Additional charge: ");
                Double employeeAdditionalCharge = iUser.nextDouble();
                iUser.nextLine();
                employee = new OutSourcedEmployee( employeeHours, employeeName, employeeValuePerHours, employeeAdditionalCharge);
            }
            gerenciadorGeral.addTeam(employee);
        }
        System.out.println();
        System.out.println(gerenciadorGeral.toString());

        iUser.close();
    }
}

