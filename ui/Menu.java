package ui;

import java.util.Scanner;
import service.CustomerService;

public class Menu {

    Scanner sc = new Scanner(System.in);
    CustomerService customerService = new CustomerService();

    public void start() {

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println(" SALON APPOINTMENT BOOKING SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Customer");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    int customerChoice;

                    do {

                        System.out.println("\n===== CUSTOMER MENU =====");
                        System.out.println("1. Register Customer");
                        System.out.println("2. View Customers");
                        System.out.println("3. Back");
                        System.out.print("Enter Choice : ");

                        customerChoice = sc.nextInt();

                        switch (customerChoice) {

                            case 1:
                                customerService.registerCustomer();
                                break;

                            case 2:
                                customerService.viewCustomers();
                                break;

                            case 3:
                                break;

                            default:
                                System.out.println("Invalid Choice!");

                        }

                    } while (customerChoice != 3);

                    break;

                case 2:
                    System.out.println("Admin Module");
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 3);

    }

}