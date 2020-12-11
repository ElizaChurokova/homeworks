package CreditOrg;

public class Credit {
    private int id;
    private double sum;
    private String period;
    private int interestRate;
    private static int numberOfCredits;
    private static int sumOfCredits;

    public Credit (){}

    public Credit(int id, double sum, String period, int interestRate) {
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.interestRate = interestRate;
        numberOfCredits++;
        sumOfCredits += sum;
        }
        public static double averageSum(){

        return sumOfCredits / numberOfCredits;
        }

    public void setId(int id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getId() {
        return id;
    }

    public static int getNumberOfCredits() {
        return numberOfCredits;
    }

    public static int getSumOfCredits() {
        return sumOfCredits;
    }
}
