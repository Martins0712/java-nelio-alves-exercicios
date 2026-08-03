package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    Integer number;
    Date date;
    Double totalValue;

    private List<Installment> installments;

    public Contract(){
        this.installments = new ArrayList<>();
    }

    public Contract(Date date, Integer number, Double totalValue) {
        this.date = date;
        this.number = number;
        this.totalValue = totalValue;
        this.installments = new ArrayList<>();
    }

    public void addInstallment(Installment installment) {
        this.installments.add(installment);
    }

    public void removeInstallment(Installment installment) {
        this.installments.remove(installment);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
