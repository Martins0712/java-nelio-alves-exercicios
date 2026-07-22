package model.entities;

import model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private  Double withdrawLimit;

    public Account(Double balance, String holder, Integer number, Double withdrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void deposit(Double amount){
        double deposit = balance + amount;
    }

    public void withdraw(double amount) throws DomainException {
        if (balance < amount) {
            throw new DomainException("Not enough balance");
        }if (amount > withdrawLimit){
            throw new DomainException("The amount exceeds withdraw limit.");
        }if (amount <= 0){
            throw new DomainException("Withdraw amount must be greater than zero");
        }
        this.balance -= amount;
    }
}
