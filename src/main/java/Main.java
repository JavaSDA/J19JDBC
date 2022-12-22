import controllers.Item;
import controllers.Orders;
import controllers.Sales;
import controllers.menu.Menu;
import db.Database;
import entities.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Session session = Database.getHibSesh();
//        Customer.createCustomerTable();
//        Item.createItemsTable();
//        Sales.createSalesTable();
//        Orders.createOrderTable();
        // subsequent objects will have their create table
        // methods here

//        Menu.mainMenu();

        Customer cust = session.find(Customer.class, 1);
        System.out.println(cust);
        Customer cust1 = new Customer("Harry", "Potter", "harry@gmail.com");

        try {
            Transaction trans = session.beginTransaction();
            session.save(cust1);
            trans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // 25 mins
    // Add 2 features to this application that allows the user to view
    // all the orders and all the sales.


    // Exercise:
    // Complete the sales class by adding the following methods.
    // Add a method called createNewSale:
    // - collate the total price of all the items bought using the
    // handleItemsTotal method and log the total to the console.






}
