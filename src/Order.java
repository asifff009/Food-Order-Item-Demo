import java.util.*;

public class Order {
    private String orderDate;
    private int quantity;
    private Customer customer;
    private Item[] item = new Item[2];


    public Order(String orderDate, int quantity, Item item, Customer customer) {
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.customer = customer;
    }

    public void setItem(int index, Item item) {
        this.item[index] = item;
    }

    public void display() {
        System.out.println("Order Date : " + orderDate + " Quantity: " + quantity);
        customer.display();

        for (int i = 0; i < item.length; i++) {
            item[i].display();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id, name, orderDate;
        int phoneNo, quantity;
        double price;

        // Step 1: Customer Info
        System.out.print("Enter Customer ID : ");
        id = sc.nextLine();
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();
        System.out.print("Enter Customer Phone Number : ");
        phoneNo = sc.nextInt();
        Customer customer = new Customer(id, name, phoneNo);

        // Step 2: Order Info
        sc.nextLine(); // consume newline
        System.out.print("Enter Order Date (YYYY-MM-DD): ");
        orderDate = sc.nextLine();
        System.out.print("Enter Quantity (for each item): ");
        quantity = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 3: Create dummy item first, update later
        Item tempItem = new Item("0", "Temp", 0.0);
        Order order = new Order(orderDate, quantity, tempItem, customer); // temporary item

        // Step 4: Input for 2 Food Items
        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Item " + (i + 1));
            System.out.print("Enter Item ID : ");
            String itemId = sc.nextLine();
            System.out.print("Enter Item Name : ");
            String itemName = sc.nextLine();
            System.out.print("Enter Item Price : ");
            price = sc.nextDouble();
            sc.nextLine(); // consume newline

            Item item = new Item(itemId, itemName, price);
            order.setItem(i, item);
        }

        // Step 5: Display Order Details
        System.out.println("\n========= ORDER SUMMARY =========");
        order.display();

        sc.close();
    }

}
