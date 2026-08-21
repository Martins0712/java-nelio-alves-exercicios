package services;

import java.security.InvalidParameterException;

public class BrazilianService implements InterestService{

    private double interestRate;

    public BrazilianService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
