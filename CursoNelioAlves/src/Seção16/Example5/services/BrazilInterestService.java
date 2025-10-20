package Seção16.Example5.services;

public class BrazilInterestService implements InterestService {
    private double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
