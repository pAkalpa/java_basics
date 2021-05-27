package me.pasindu;

public class Main {

    public static void main(String[] args) {
//        Bank_Account bobsBankAccount = new Bank_Account("12345", 0.00, "Bob Brown", "bobb@mymail.com",
//                "(+94) 123-456789");
        Bank_Account bobsBankAccount = new Bank_Account();
        System.out.println(bobsBankAccount.getAccountNumber());
        System.out.println(bobsBankAccount.getCustomerEmail());
        System.out.println(bobsBankAccount.getCustomerName());
        bobsBankAccount.withdrawFunds(100.0);

        bobsBankAccount.depositFunds(50.0);
        bobsBankAccount.withdrawFunds(100.0);

        bobsBankAccount.depositFunds(51.0);
        bobsBankAccount.withdrawFunds(100.0);
    }
}