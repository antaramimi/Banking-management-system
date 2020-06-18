package com.antara.bankingsystem;

import java.util.Objects;

public class User {

    String customerName;
    int customerId;
    int customerpin;

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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerpin() {
        return customerpin;
    }

    public void setCustomerpin(int customerpin) {
        this.customerpin = customerpin;
    }

    public User(String customerName, int customerpin) {
        this.customerName = customerName;
        this.customerpin = customerpin;
    }

}
