package model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    private List<Employee> employees = new ArrayList<>();

    public Double payment(){
        return hours * valuePerHour;
    }

    public Employee(Integer hours, String name, Double valuePerHour) {
        this.hours = hours;
        this.name = name;
        this.valuePerHour = valuePerHour;
    }

    public void addTeam(Employee employee){
        this.employees.add(employee);
    }

    public void removeTeam(Employee e){
        this.employees.add(e);
    }

    public Integer getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    @Override
    public String toString() {
        if (!employees.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("PAYMENTS:\n");
            for (Employee employee : employees) {
                sb.append(employee.getName()).append(" - $ ").append(String.format("%.2f", employee.payment())).append("\n");
            }
            return sb.toString();
        }

        return name + " - $ " + String.format("%.2f", payment());
    }
}
