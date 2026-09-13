package entities;

import java.util.Objects;

public class Student {

    private int quantityStudents;

    public Student(int quantityStudents) {
        this.quantityStudents = quantityStudents;
    }

    public int getQuantityStudents() {
        return quantityStudents;
    }

    public void setQuantityStudents(int quantityStudents) {
        this.quantityStudents = quantityStudents;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return quantityStudents == student.quantityStudents;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(quantityStudents);
    }
}
