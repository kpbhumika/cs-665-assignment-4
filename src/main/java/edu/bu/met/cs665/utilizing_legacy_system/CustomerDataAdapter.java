/**
 * File Name: CustomerDataAdapter.java
 * Description: This adapter class implements the legacy interface `CustomerDataViaUsb` and
 * delegates calls to the new system's interface `CustomerDataViaHttps`. It allows the legacy
 * system to interact with the new system without needing modifications to the legacy code.
 */


package edu.bu.met.cs665.utilizing_legacy_system;

public class CustomerDataAdapter implements CustomerDataViaUsb {
    private final CustomerDataViaHttps httpsDataSource;

    public CustomerDataAdapter(CustomerDataViaHttps httpsDataSource) {
        this.httpsDataSource = httpsDataSource;
    }

    @Override
    public void printCustomer(int customerId) {
        httpsDataSource.printCustomer(customerId);
    }

    @Override
    public Customer getCustomerViaUsb(int customerId) {
        return httpsDataSource.getCustomerViaHttps(customerId);
    }
}

