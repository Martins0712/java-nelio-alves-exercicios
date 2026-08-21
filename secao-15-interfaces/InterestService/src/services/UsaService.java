package services;

import java.security.InvalidParameterException;

public class UsaService implements InterestService{

    private double interestRate;

    public UsaService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
