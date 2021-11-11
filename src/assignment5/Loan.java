package assignment5;

public interface Loan {
    double interest = 0;
    double getRateOfInterest();
    double calculateInterest(double baseCapital, int years);
}
