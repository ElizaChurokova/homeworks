package Operation;

public class CreditUnite extends CreditOrganization {
    private int maxCreditSum;

    public CreditUnite(){}

    public CreditUnite(String name, double interestAnnualRate, String currency, int durationDays, int maxCreditSum) {
        super(name, interestAnnualRate, currency, durationDays);
        this.maxCreditSum = maxCreditSum;
    }

    @Override
    public String toString(){
        String message = "Credit Unite name: " + getName() + ", annual interest rate: " + getInterestAnnualRate()
                + "%, credit is to be given for 1 year (" + getDurationDays() + " days). The maximum amount of available credit is " + getMaxCreditSum() + getCurrency() + ".";
        return message;
    }

    public void setMaxCreditSum(int maxCreditSum) {
        this.maxCreditSum = maxCreditSum;
    }

    public int getMaxCreditSum() {
        return maxCreditSum;
    }
}
