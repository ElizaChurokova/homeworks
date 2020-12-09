package Operation;

public class Bank extends CreditOrganization {
    private int minDepositSum;
    private double depositAnnualRate;
    private Account[] accounts;

    public Bank(){}

    public Bank(String name, double interestAnnualRate, String currency, int durationDays, int minDepositSum, double depositAnnualRate, Account[] accounts) {
        super(name, interestAnnualRate, currency, durationDays);
        this.minDepositSum = minDepositSum;
        this.depositAnnualRate = depositAnnualRate;
        this.accounts = accounts;
    }

    @Override
    public  String toString(){
        String message = "Operation.Bank name: " + getName() + ", annual interest rate: " + getInterestAnnualRate() + "%, credit is to be given for 1 year (" + getDurationDays() + " days). Extra services: bank provides deposit and transactions. Minimum amount of deposit is " + getMinDepositSum() + "KGS by " + getDepositAnnualRate() + "%. ";
        return message;
    }

    public void setMinDepositSum(int minDepositSum) {
        this.minDepositSum = minDepositSum;
    }

    public void setDepositAnnualRate(double depositAnnualRate) {
        this.depositAnnualRate = depositAnnualRate;
    }

    public void setAccount(Account[] accounts) {
        this.accounts = accounts;
    }

    public int getMinDepositSum() {
        return minDepositSum;
    }

    public double getDepositAnnualRate() {
        return depositAnnualRate;
    }

    public Account[] getAccounts() {
        return accounts;
    }
}
