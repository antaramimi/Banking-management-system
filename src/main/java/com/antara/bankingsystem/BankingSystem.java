package com.antara.bankingsystem;

import java.util.*;

public class BankingSystem {

    Map<String, Integer> map = new HashMap<>();

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
                    System.out.println("Enter an amount you want to deposit");
                    int amount = sc.nextInt();
                    if (map.containsKey(customerName)) {
                        map.put(customerName, map.get(customerName) + amount);
                    } else {
                        map.put(customerName, amount);
                    }
                    System.out.println("Thank you");
                    break;
                case 2:
                    System.out.println("Enter the customer name");
                    String customerUserName = sc.next();
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        System.out.println("customerUserName = " + entry.getKey() +
                                ", Balance = " + entry.getValue());
                    }
                    break;
                case 3:
                    System.out.println("Enter the customer name");
                    String customerUserNames = sc.next();
                    System.out.println("Enter the amount you like to withdraw");
                    int amounts = sc.nextInt();
                    if (map.containsKey(customerUserNames)) {
                        map.put(customerUserNames, map.get(customerUserNames) - amounts);
                    } else {
                        System.out.println("No balance");
                    }
                    break;

            }


        }

    }
}