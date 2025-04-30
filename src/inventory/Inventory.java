package inventory;

import products.Product;
import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T product) {
        items.add(product);
    }

    public void removeItemById(String id) {
        ArrayList<T> itemsToKeep = new ArrayList<>();
        for (T item : items) {
            if (!item.getId().equals(id)) {
                itemsToKeep.add(item);
            }
        }
        items = itemsToKeep;
    }

    public T findItemById(String id) {
        for (T item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public void applyDiscount(String productName, int discount) {
        for (T item : items) {
            if (item.getTitle().equals(productName)) {
                double newPrice = item.getPrice() * (1 - discount / 100.0);
                item.setPrice(newPrice);
            }
        }
    }

    public void displayAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public ArrayList<T> getItems() {
        return items;
    }
}