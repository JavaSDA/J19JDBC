import controllers.Customer;
import controllers.Item;
import controllers.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Customer.createCustomerTable();
        Item.createItemsTable();
        // subsequent objects will have their create table
        // methods here

        Menu.mainMenu();
    }

    // 25 mins
    // Add 2 features to this application that allows the user to view
    // all the orders and all the sales.


}
