import products.*;
import inventory.Inventory;

public class Main {
    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        bookInventory.addItem(new Book("A", 50.0, "Ghasem", "g", "i"));
        bookInventory.addItem(new Book("B", 45.0, "Amir", "h", "j"));

        notebookInventory.addItem(new Notebook("C", 10.0, 120, true));
        notebookInventory.addItem(new Notebook("D", 8.0, 60, false));

        accessoryInventory.addItem(new Accessory("E", 2.5, "Blue"));
        accessoryInventory.addItem(new Accessory("F", 3.0, "Red"));

        System.out.println("All Products");
        bookInventory.displayAll();
        notebookInventory.displayAll();
        accessoryInventory.displayAll();

        bookInventory.removeItemById("1001");
        notebookInventory.removeItemById("2001");

        System.out.println("\nTotal Prices");
        System.out.println("Books: " + calculateTotalPrice((Inventory<? extends Product>) bookInventory));
        System.out.println("Notebooks: " + calculateTotalPrice((Inventory<? extends Product>) notebookInventory));
        System.out.println("Accessories: " + calculateTotalPrice((Inventory<? extends Product>) accessoryInventory));

        System.out.println("\nSearch");
        System.out.println(bookInventory.findItemById("1002") != null ? "Book found" : "Book not found");
        System.out.println(bookInventory.findItemById("9999") != null ? "Book found" : "Book not found");

        bookInventory.applyDiscount("Design Patterns", 10);
        accessoryInventory.applyDiscount("Red Marker", 20);

        System.out.println("\nFinal Inventory");
        bookInventory.displayAll();
        notebookInventory.displayAll();
        accessoryInventory.displayAll();
    }

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double total = 0;
        for (Product item : inventory.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
}