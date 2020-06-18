package com.antara.bankingsystem;

import java.util.*;

public class BankingSystem {

    Map<User, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        BankingSystem bs = new BankingSystem();
        bs.showMenu();
    }


    public void showMenu() {
        int option;
        System.out.println("Banking management system\n");

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Deposit");
            System.out.println("2.Check the balance");
            System.out.println("3.Withdrawal");
            System.out.println("4.Transfer the money");
            System.out.println("5.Exit");

            option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter the customer name");
                    String customerName = sc.next();
                    User user = new User(customerName);
                    System.out.println("Enter an amount you want to deposit");
                    int amount = sc.nextInt();
                    if (map.containsKey(user)) {
                        map.put(user, map.get(user) + amount);
                    } else {
                        map.put(user, amount);
                    }
                    System.out.println("Thank you");
                    break;
                case 2:
                    System.out.println("Enter the customer name");
                    String customerUserName = sc.next();
                    User user5 = new User(customerUserName);
                    System.out.println("Balance = " + map.get(user5));
                    break;
                case 3:
                    System.out.println("Enter the customer name");
                    customerName = sc.next();
                    User user1 = new User(customerName);
                    System.out.println("Enter the amount you like to withdraw");
                    int amounts = sc.nextInt();
                    if (map.containsKey(user1)) {
                        map.put(user1, map.get(user1) - amounts);
                    } else {
                        System.out.println("No balance");
                    }
                    break;
                case 4:
                    System.out.println("Enter your customer name");
                    customerName = sc.next();
                    User user3 = new User(customerName);
                    System.out.println("Enter the customer name you can to transfer");
                    String customerName2 = sc.next();
                    User user4 = new User(customerName2);
                    System.out.println("Enter the amount you want to transfer");
                    int amountTransfer = sc.nextInt();
                    if (map.containsKey(user4)) {
                        map.put(user4, map.get(user4) + amountTransfer);
                        map.put(user3, map.get(user3) - amountTransfer);
                    } else {
                        System.out.println("Sorry customer doesn't exists");
                    }
                    break;
            }
        }
    }
}