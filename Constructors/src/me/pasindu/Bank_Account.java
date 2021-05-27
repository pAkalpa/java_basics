package me.pasindu;

public class Bank_Account {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;

    public Bank_Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.95, customerName, customerEmail, customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Bank_Account() {
        this("5678", 2.50, "Default name", "default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public Bank_Account(String accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.accountBalance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if ((this.accountBalance - withdrawAmount) < 0) {
            System.out.println("Insufficient Balance!\nOnly " + this.accountBalance + " available. Withdrawal not processed");
        } else {
            this.accountBalance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance = " + this.accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    private String customerPhoneNumber;
}
