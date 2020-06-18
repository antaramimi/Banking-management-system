package com.antara.bankingsystem;

import java.util.Objects;

public class User {

    String customerName;
    int customerId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return customerId == user.customerId &&
                customerName.equals(user.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, customerId);
    }

    public User(String customerName) {
        this.customerName = customerName;
        this.customerId = customerId;
    }
}
