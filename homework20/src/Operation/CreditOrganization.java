package Operation;

public class CreditOrganization {
    protected String name;
    protected double interestAnnualRate;
    protected String currency;
    protected int durationDays;

    public CreditOrganization(){}

    public CreditOrganization(String name, double interestAnnualRate, String currency, int durationDays) {
        this.name = name;
        this.interestAnnualRate = interestAnnualRate;
        this.currency = currency;
        this.durationDays = durationDays;
    }


    public void setName(String name) { this.name = name; }

    public void setInterestAnnualRate(double interestAnnualRate) { this.interestAnnualRate = interestAnnualRate; }

    public void setCurrency(String currency) { this.currency = currency; }

    public void setDurationDays(int durationDays) { this.durationDays = durationDays; }


    public String getName() {
        return name;
    }

    public double getInterestAnnualRate() {
        return interestAnnualRate;
    }

    public String getCurrency() {
        return currency;
    }

    public int getDurationDays() {
        return durationDays;
    }
}
