/**
 * File Name: MockCustomerDataViaHttps.java
 * Description: This class provides a mock implementation of the `CustomerDataViaHttps` interface
 * to simulate the new system's behavior. It returns mock customer data and prints messages
 * when interacting with the customer data.
 */

package edu.bu.met.cs665.utilizing_legacy_system;

public class MockCustomerDataViaHttps implements CustomerDataViaHttps {
    @Override
    public void printCustomer(int customerId) {
        System.out.println("Printing customer from HTTPS: Customer ID " + customerId);
    }

    @Override
    public Customer getCustomerViaHttps(int customerId) {
        return new Customer(customerId, "John Doe");
    }
}

