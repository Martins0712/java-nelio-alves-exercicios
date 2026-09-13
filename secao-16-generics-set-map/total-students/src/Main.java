import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args){

        Scanner iUser = new Scanner(System.in);

        Set<Student> myStudent = new HashSet<>();

        char[] courses = {'A', 'B', 'C'};

        for (int i = 0; i < courses.length; i++){
            System.out.print("How many students for course " + courses[i]+ "? ");
            int numStudents = iUser.nextInt();
            iUser.nextLine();

            for (int u = 1; u <= numStudents; u++) {

                System.out.print("Student " + u + ": ");
                int student = iUser.nextInt();
                iUser.nextLine();

                myStudent.add(new Student(student));
            }
        }
        System.out.println("Total students: " + myStudent.size());
    }
}