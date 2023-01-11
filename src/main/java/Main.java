import controllers.CustomerController;
import db.Database;
import entities.Customer;
import entities.Order;
import entities.Sale;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        CustomerController.createCustomerTable();
//        Customer.createCustomerTable();
//        Item.createItemsTable();
//        Sales.createSalesTable();
//        Orders.createOrderTable();
        // subsequent objects will have their create table
        // methods here

//        Menu.mainMenu();

        Session session = Database.getHibSesh();

//        Customer.listCustomers();
//        Sale sale = session.find(Sale.class, 1);
//        System.out.println(sale);

//        Order order = session.find(Order.class, 1);
//        System.out.println(order);

//        Customer minaj = new Customer("Nicki", "Minaj", "minaj@gmail.com");
//        Customer minaj = new Customer();

//        Customer.updateCustomer("David", 6);
        Customer.deleteCustomer(6);
        Customer.listCustomers();
//        System.out.println(minaj);
//        Customer.createCustomer(minaj);
//        Customer.listCustomers();

        // - How to hack the select * from []; query
        // - Differences between certain hibernate methods
    }



    // 25 mins
    // Add 2 features to this application that allows the user to view
    // all the orders and all the sales.


    // Exercise:
    // Complete the sales class by adding the following methods.
    // Add a method called createNewSale:
    // - collate the total price of all the items bought using the
    // handleItemsTotal method and log the total to the console.


    // 45 mins
    // Create a table called Students and another table called Grades
    // The columns on the students table should be as follows: id, name, age
    // Complete the controllers for the students table by adding methods
    // handle CRD operations on each record in the table.

    // On the Grades table, store the students id, score and the Grade where
    // The columns on Grades should be: id, student_id, score, grade and
    // where for each Grade:
    // 0 - 40 = F, 41 - 49 = D, 50 - 59 = C, 60 - 69 = B, 70 - 100 = A.
    // Complete the controller on the Grades table to have Create, Read, Delete Operations
    // For the read operation, you should be able to see the students information as well



    // Using Hibernate create the entity object for the items class and
    // make find queries on the items table to retrieve any items you
    // previously stored in it.
    // Also, demonstrate how you would save a new entry into the items table.


    // 30 mins.
    // Using Hibernate create the entity object for the orders class and
    // make find queries on the order table to test your work.

}
