package Operation;

public class MicroCreditOrg extends CreditOrganization {

    private boolean purpose;

    public MicroCreditOrg(){}

    public MicroCreditOrg(String name, double interestAnnualRate, String currency, int durationDays, boolean purpose) {
        super(name, interestAnnualRate, currency, durationDays);
        this.purpose = purpose;
    }

    @Override
    public String toString(){
        String message = "The Micro Credit organizaton name: " + getName() + ", annual interest rate: "
                + getInterestAnnualRate() + "%, credit is to be given for 1 year (" + getDurationDays()
                + " days).";
        return message;
    }
    public void setPurpose(boolean purpose) {
        this.purpose = purpose;
    }

    public boolean isPurpose() {
        return purpose;
    }
}
