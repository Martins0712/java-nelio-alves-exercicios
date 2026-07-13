package entities;

public final class SavingAccounts extends Account {

    private Double interestRate;

    public SavingAccounts(){
        super();
    }

    public SavingAccounts(Double balance, String holder, Integer number, Double interestRate) {
        super(balance, holder, number);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public final void withdraw(double amount){
        balance -= amount ;
    }
}
