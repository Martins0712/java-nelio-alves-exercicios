package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Installment {
    Date dueDate;
    Double amount;


    public Installment(){
    }

    public Installment(Double amount, Date dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }



    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }


}
