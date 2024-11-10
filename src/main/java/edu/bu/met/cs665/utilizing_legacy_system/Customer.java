/**
 * File Name: Customer.java
 * Description: This class represents the customer data model used by both the legacy and new systems.
 * It contains basic fields such as `id` and `name` and provides methods for retrieving
 * and displaying customer information.
 */

package edu.bu.met.cs665.utilizing_legacy_system;

public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer : id=" + id + ", name='" + name + "'";
    }
}

