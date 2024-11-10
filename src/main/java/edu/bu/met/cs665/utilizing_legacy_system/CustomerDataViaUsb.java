/**
 * File Name: CustomerDataViaUsb.java
 * Description: This interface defines the legacy system's method for accessing customer data.
 * Specifically, it outlines how customer data can be accessed and printed via a USB connection.
 * The interface includes methods to retrieve and print customer details.
 */

package edu.bu.met.cs665.utilizing_legacy_system;

public interface CustomerDataViaUsb {
    void printCustomer(int customerId);
    Customer getCustomerViaUsb(int customerId);
}

