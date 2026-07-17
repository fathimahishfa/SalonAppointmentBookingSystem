package service;

import java.util.Scanner;
import data.DataStore;
import model.Customer;

public class CustomerService {

    Scanner sc = new Scanner(System.in);

    // Register Customer
    public void registerCustomer() {

        System.out.println("\n===== CUSTOMER REGISTRATION =====");

        System.out.print("Enter Customer ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number : ");
        String phone = sc.nextLine();

        System.out.print("Enter Email : ");
        String email = sc.nextLine();

        Customer customer = new Customer(id, name, phone, email);

        DataStore.customers[DataStore.customerCount] = customer;
        DataStore.customerCount++;

        System.out.println("\nCustomer Registered Successfully!");
    }

    // View Customers
    public void viewCustomers() {

        System.out.println("\n===== CUSTOMER LIST =====");

        if (DataStore.customerCount == 0) {
            System.out.println("No Customers Found.");
            return;
        }

        for (int i = 0; i < DataStore.customerCount; i++) {
            System.out.println("--------------------------");
            System.out.println(DataStore.customers[i]);
        }
    }
}
