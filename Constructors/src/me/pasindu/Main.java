package me.pasindu;

public class Main {

    public static void main(String[] args) {
//        Bank_Account bobsBankAccount = new Bank_Account("12345", 0.00, "Bob Brown", "bobb@mymail.com",
//                "(+94) 123-456789");
//        Bank_Account bobsBankAccount = new Bank_Account();
//        System.out.println(bobsBankAccount.getAccountNumber());
//        System.out.println(bobsBankAccount.getCustomerEmail());
//        System.out.println(bobsBankAccount.getCustomerName());
//        bobsBankAccount.withdrawFunds(100.0);
//
//        bobsBankAccount.depositFunds(50.0);
//        bobsBankAccount.withdrawFunds(100.0);
//
//        bobsBankAccount.depositFunds(51.0);
//        bobsBankAccount.withdrawFunds(100.0);
//
//        Bank_Account timsAccount = new Bank_Account("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());

    }
}