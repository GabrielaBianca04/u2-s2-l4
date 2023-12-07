import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static List<Customer> customers = new ArrayList<>();
    static List<Order> orders = new ArrayList<>();
    static List<Product> warehouse = new ArrayList<>();
    HashMap<Customer, Order> ordiniEffettuati = new HashMap<Customer, Order>();
    public static void main(String[] args) {
        createCustomers();
        placeOrders();

        System.out.println("--------------------------------- PRODUCTS ----------------------------------");
        warehouse.forEach(System.out::println);
        System.out.println("--------------------------------- CUSTOMERS ----------------------------------");
        customers.forEach(System.out::println);
        System.out.println("--------------------------------- ORDERS ----------------------------------");
        orders.forEach(System.out::println);
    }


    public static void initializeWarehouse() {
        Product iPhone = new Product("IPhone", "Smartphones", 2000.0);
        Product lotrBook = new Product("LOTR", "Books", 101);
        Product itBook = new Product("IT", "Books", 2);
        Product davinciBook = new Product("Da Vinci's Code", "Books", 2);
        Product diapers = new Product("Pampers", "Baby", 3);
        Product toyCar = new Product("Car", "Boys", 15);
        Product toyPlane = new Product("Plane", "Boys", 25);
        Product lego = new Product("Lego Star Wars", "Boys", 500);

        warehouse.addAll(Arrays.asList(iPhone, lotrBook, itBook, davinciBook, diapers, toyCar, toyPlane, lego));
    }
        public static void createCustomers() {
            Customer Aldo = new Customer();
            Customer Giovanni = new Customer();
            Customer Giacomo= new Customer();


            customers.add(Aldo);
            customers.add(Giovanni);
            customers.add(Giacomo);


    }

        public static void placeOrders() {
            Order aldoOrder = new Order(customers.get(0));
            Order giovanniOrder = new Order(customers.get(1));
            Order giacomoOrder = new Order(customers.get(2));

            Product iPhone = warehouse.get(0);
            Product lotrBook = warehouse.get(1);
            Product itBook = warehouse.get(2);
            Product davinciBook = warehouse.get(3);
            Product diaper = warehouse.get(4);

            aldoOrder.addProduct(iPhone);
            aldoOrder.addProduct(lotrBook);
            aldoOrder.addProduct(diaper);

            giovanniOrder.addProduct(itBook);
            giovanniOrder.addProduct(davinciBook);
            giovanniOrder.addProduct(iPhone);

            giacomoOrder.addProduct(lotrBook);
            giacomoOrder.addProduct(diaper);

            orders.add(aldoOrder);
            orders.add(giovanniOrder);
            orders.add(giacomoOrder);
        }

    public static void ordiniEffettuati(){
       ordiniEffettuati.put("Aldo","aldoOrder");
        ordiniEffettuati.put("Giacomo", "giacomoOrder");
        ordiniEffettuati.put("Giovanni", "giovanniOrder");

        }
    }
