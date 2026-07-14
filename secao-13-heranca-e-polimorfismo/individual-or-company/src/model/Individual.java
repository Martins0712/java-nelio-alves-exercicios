package model;

public class Individual {
    private String name;
    private Double annualIncome;
    private Double healthExpenditures;

    public Individual( String name, Double annualIncome, Double healthExpenditures) {
        this.name = name;
        this.annualIncome = annualIncome;
        this.healthExpenditures = healthExpenditures;
    }

    public Individual(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
        this.healthExpenditures = 0.0;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double totalTax(){
        double tax = 0.0;
        if (annualIncome < 20000.00){
            tax = (annualIncome * 15) / 100;
        }else if (annualIncome >= 20000.00){
            tax = (annualIncome * 25) / 100;
        }

        if (healthExpenditures > 0){
            return tax - (healthExpenditures * 0.50);
        }
        return tax;
    }

    @Override
    public String toString() {
        return name + ": $ " + totalTax();
    }
}
