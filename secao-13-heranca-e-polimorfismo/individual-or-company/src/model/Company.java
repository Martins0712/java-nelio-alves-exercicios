package model;

public class Company extends Individual{
    private Integer employees;


    public Company(String name, Double annualIncome, Integer employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public Double totalTax() {
        return (employees < 10) ? getAnnualIncome() * 0.16: getAnnualIncome() * 0.14;
    }

    @Override
    public String toString() {
        return getName() + ": $ " + totalTax();
    }
}
