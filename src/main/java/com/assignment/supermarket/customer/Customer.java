package com.assignment.supermarket.customer;
import com.assignment.supermarket.user.User;

import javax.persistence.*;

@Entity
@Table
public class Customer extends User{
    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    Long customerId;

    double account_balance;
    public Customer(Long customerId, String username, String phoneNumber, String email, String address,String password,double account_balance){
        super(username,phoneNumber,email,address,password);
        this.account_balance = account_balance;
        this.customerId = customerId;
    }
    public Customer(String username, String phoneNumber, String email, String address,String password,double account_balance){
        super(username,phoneNumber,email,address,password);
        this.account_balance = account_balance;

    }
    public Customer(){

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", account_balance=" + account_balance +
                '}';
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
