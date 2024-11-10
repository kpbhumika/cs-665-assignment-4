/**
 * File Name: CustomerDataViaHttps.java
 * Description: This interface defines the new system's method for accessing customer data
 * via HTTPS. It outlines how customer data can be retrieved and printed over a secure web connection.
 * The interface includes methods to retrieve and print customer details.
 */

package edu.bu.met.cs665.utilizing_legacy_system;

public interface CustomerDataViaHttps {
    void printCustomer(int customerId);
    Customer getCustomerViaHttps(int customerId);
}
