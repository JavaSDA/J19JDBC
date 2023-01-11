import controllers.Item;
import controllers.Orders;
import controllers.Sales;
import controllers.menu.Menu;
import db.Database;
import entities.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.xml.crypto.Data;
import java.util.List;

public class Main {
    static Session session = Database.getHibSesh();
    public static void main(String[] args) {
//        Customer.createCustomerTable();
//        Item.createItemsTable();
//        Sales.createSalesTable();
//        Orders.createOrderTable();
        // subsequent objects will have their create table
        // methods here

//        Menu.mainMenu();

//        Customer cust = session.find(Customer.class, 1);
//        Customer cust1 = new Customer("Dwayne", "Johnson", "dwayne@gmail.com");
        Customer terry = session.get(Customer.class, 5);
        terry.setFirstName("Terry");






        try {
            Transaction trans = session.beginTransaction();
//            session.persist(cust1);
            session.update(terry);
//            session.flush();

            trans.commit();

            listCustomerNames();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void listCustomerNames() {
        try {
            session.beginTransaction();
            List<Customer> customers = session.createQuery("from customer").list();

            for (Customer customer : customers) {
                System.out.println("Name: " + customer.getFirstName());
            }
            session.getTransaction().commit();
            session.close();
//            System.out.println(session.contains("customer", Customer.class));
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
