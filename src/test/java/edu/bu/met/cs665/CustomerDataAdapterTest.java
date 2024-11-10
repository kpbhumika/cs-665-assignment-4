/**
 * File Name: CustomerDataAdapterTest.java
 * Description: This class contains unit tests for the `CustomerDataAdapter` class.
 * The tests ensure that the adapter correctly delegates calls from the legacy system (USB interface)
 * to the new system (HTTPS interface). It verifies the proper retrieval and printing of customer data.
 */

package edu.bu.met.cs665;
import edu.bu.met.cs665.utilizing_legacy_system.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerDataAdapterTest {

    private CustomerDataViaHttps mockHttpsDataSource;
    private CustomerDataAdapter customerDataAdapter;

    @Before
    public void setUp() {
        mockHttpsDataSource = new MockCustomerDataViaHttps();

        customerDataAdapter = new CustomerDataAdapter(mockHttpsDataSource);
    }

    @Test
    public void testPrintCustomer() {
        int customerId = 1;
        customerDataAdapter.printCustomer(customerId);
    }

    @Test
    public void testGetCustomerViaUsb() {
        int customerId = 2;
        Customer expectedCustomer = new Customer(customerId, "Jane Doe");

        Customer result = customerDataAdapter.getCustomerViaUsb(customerId);

        assertEquals(expectedCustomer.getId(), result.getId());
        assertEquals(expectedCustomer.getName(), result.getName());
    }

    @Test
    public void testCorrectCustomerRetrieval() {
        int customerId = 3;
        Customer expectedCustomer = new Customer(customerId, "Alice Smith");

        Customer result = customerDataAdapter.getCustomerViaUsb(customerId);

        assertNotNull(result);
        assertEquals(expectedCustomer.getId(), result.getId());
        assertEquals(expectedCustomer.getName(), result.getName());
    }

    private class MockCustomerDataViaHttps implements CustomerDataViaHttps {

        @Override
        public void printCustomer(int customerId) {
            System.out.println("Printing customer from HTTPS: Customer ID " + customerId);
        }

        @Override
        public Customer getCustomerViaHttps(int customerId) {
            if (customerId == 2) {
                return new Customer(customerId, "Jane Doe");
            } else if (customerId == 3) {
                return new Customer(customerId, "Alice Smith");
            }
            return null;
        }
    }
}
