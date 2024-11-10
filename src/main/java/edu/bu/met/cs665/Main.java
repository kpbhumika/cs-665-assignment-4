/**
 * Name: BHUMIKA KUSUGOLLI PARAMESWARA
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2024
 * File Name: Main.java
 * Description: This class demonstrates the use of the `CustomerDataAdapter` to allow the legacy
 * system to interact with the new system's data source. It creates instances of the mock data source
 * and the adapter, then demonstrates the process of printing and retrieving customer data.
 */

package edu.bu.met.cs665;
import edu.bu.met.cs665.utilizing_legacy_system.*;

/**
 * This is the Main class.
 */
public class Main {
  public static void main(String[] args) {

    CustomerDataViaHttps httpsDataSource = new MockCustomerDataViaHttps();

    CustomerDataViaUsb usbAdapter = new CustomerDataAdapter(httpsDataSource);

    int customerId = 1;

    System.out.println("Using legacy interface USB to access new system HTTPS:");

    usbAdapter.printCustomer(customerId);

    // Retrieve customer data using the legacy getCustomerViaUsb method
    Customer customer = usbAdapter.getCustomerViaUsb(customerId);
    System.out.println("Retrieved customer via USB adapter: " + customer);
  }
}
