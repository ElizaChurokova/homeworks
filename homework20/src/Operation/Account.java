package Operation;

public class Account {
    private String accountNumber;
    private String type;
    private String owner;
    private int amount;

    public Account (){}

    public Account(String accountNumber, String type, String owner, int amount) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.owner = owner;
        this.amount = amount;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public String getOwner() {
        return owner;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
