package entities;

public class Account {
    private String accountOwner;
    private final int accountNumber;
    private double accountBalance;


    //Constructor
    public Account(String accountOwner, int accountNumber) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
    }

    //Getters and Setters
    public String getAccountOwner() {
        return this.accountOwner;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountOwner(String ownerName) {
        this.accountOwner = ownerName;
    }

    //Methods
    public void depositValue(double quantity) {
        this.accountBalance += quantity;
    }

    public void withdrawValue(double quantity) {
        this.accountBalance = this.accountBalance - (quantity + 5.00);
    }

    public String toString(){
        return "Account: " + getAccountNumber()
                + ", Holder: " +getAccountOwner()
                + ", Balance: R$" + getAccountBalance();
    }
}

