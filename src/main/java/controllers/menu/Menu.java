package controllers.menu;

import controllers.CustomerController;
import controllers.ItemController;
import controllers.OrdersController;
import controllers.SalesController;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("Pick a submenu number to continue: ");
        System.out.println("1. Items");
        System.out.println("2. Customer");
        System.out.println("3. Sales");
        System.out.println("4. Orders");

        System.out.println();
        System.out.print("Select an option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                itemsMenu();
                break;
            case 2:
                customerMenu();
                break;
            case 3:
                salesMenu();
                break;
            case 4:
                orderMenu();
                break;
            default:
                System.out.println("Invalid option.");
                mainMenu();
                break;
        }
    }

    public static void itemsMenu() {
        System.out.println("Pick a submenu number to continue: ");
        System.out.println("1. Get All Items");
        System.out.println("2. Create New Item");

        System.out.println();
        System.out.print("Select an option or enter 0 to go back to the main menu: ");
        int option = scanner.nextInt();

        switch (option) {
            case 0:
                mainMenu();
                break;
            case 1:
                ItemController.getAllItems();
                itemsMenu();
                break;
            case 2:
                ItemController.createNewItem();
                itemsMenu();
                break;
            default:
                System.out.println("Invalid option.");
                itemsMenu();
                break;
        }
    }

    public static void customerMenu() {
        System.out.println("Pick a submenu number to continue: ");
        System.out.println("1. Get All Customers");
        System.out.println("2. Create New Customer");
        System.out.println("3. Update Customer");
        System.out.println("4. Delete Customer");

        System.out.println();
        System.out.print("Select an option or enter 0 to go back to the main menu: ");
        int option = scanner.nextInt();

        switch (option) {
            case 0:
                mainMenu();
                break;
            case 1:
                CustomerController.getAllCustomers();
                customerMenu();
                break;
            case 2:
                CustomerController.createNewCustomer();
                customerMenu();
                break;
            case 3:
                CustomerController.updateCustomer();
                customerMenu();
                break;
            case 4:
                CustomerController.deleteCustomer();
                customerMenu();
                break;
            default:
                System.out.println("Invalid option.");
                customerMenu();
                break;
        }
    }

    public static void salesMenu() {
        System.out.println("Pick a submenu number to continue: ");
        System.out.println("1. Get All Sales");
        System.out.println("2. Create New Sale and Orders");
//        System.out.println("3. Update Customer");
//        System.out.println("4. Delete Customer");

        System.out.println();
        System.out.print("Select an option or enter 0 to go back to the main menu: ");
        int option = scanner.nextInt();

        switch (option) {
            case 0:
                mainMenu();
                break;
            case 1:
                SalesController.getAllSales();
                salesMenu();
                break;
            case 2:
                SalesController.createSaleAndOrder();
                salesMenu();
                break;
//            case 3:
//                Customer.updateCustomer();
//                customerMenu();
//                break;
//            case 4:
//                Customer.deleteCustomer();
//                customerMenu();
//                break;
            default:
                System.out.println("Invalid option.");
                salesMenu();
                break;
        }
    }

    public static void orderMenu() {
        System.out.println("Pick a submenu number to continue: ");
        System.out.println("1. Get All Orders");
//        System.out.println("3. Update Customer");
//        System.out.println("4. Delete Customer");

        System.out.println();
        System.out.print("Select an option or enter 0 to go back to the main menu: ");
        int option = scanner.nextInt();

        switch (option) {
            case 0:
                mainMenu();
                break;
            case 1:
                OrdersController.getAllOrders();
                orderMenu();
                break;
//            case 3:
//                Customer.updateCustomer();
//                customerMenu();
//                break;
//            case 4:
//                Customer.deleteCustomer();
//                customerMenu();
//                break;
            default:
                System.out.println("Invalid option.");
                salesMenu();
                break;
        }
    }
}
