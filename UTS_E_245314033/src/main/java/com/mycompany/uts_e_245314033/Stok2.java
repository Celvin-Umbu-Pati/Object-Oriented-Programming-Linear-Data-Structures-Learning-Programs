/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_e_245314033;

import java.util.Scanner;

/**
 *
 * @author Celvin Pati
 */
public class Stok2 {
    public class InventoryManagementSystem { 
 
    static String[] items = new String[50]; 
    static int[] stock = new int[50]; 
    static double[] price = new double[50]; 
    static int[] quantitySold = new int[50]; // Track quantity sold for each item 
    static int itemCount = 0; 
    static double totalSales = 0; 
 
    // Add a new item to the inventory 
    public static void addItem(String itemName, int itemStock, double itemPrice) { 
        if (itemCount < items.length) { 
            items[itemCount] = itemName; 
            stock[itemCount] = itemStock; 
            price[itemCount] = itemPrice; 
            quantitySold[itemCount] = 0; // Initialize quantity sold to 0 
            itemCount++; 
            System.out.println("Item added successfully!"); 
        } else { 
            System.out.println("Inventory is full. Cannot add more items."); 
        } 
    } 
 
    // Display all items in the inventory 
    public static void displayItems() { 
        if (itemCount == 0) { 
            System.out.println("Inventory is empty."); 
        } else { 
            System.out.println("\nInventory:"); 
            System.out.println("---------------------------------------------------"); 
            System.out.println("No.\tItem Name\tStock\tPrice (per unit)\tQuantity Sold"); 
            for (int i = 0; i < itemCount; i++) { 
                System.out.printf("%d\t%s\t\t%d\t%.2f\t\t\t%d\n", i + 1, items[i], stock[i], price[i], 
quantitySold[i]); 
            } 
            System.out.println("---------------------------------------------------"); 
        } 
    } 
 
    // Search for an item by name 
    public static void searchItem(String itemName) { 
        boolean found = false; 
        for (int i = 0; i < itemCount; i++) { 
            if (items[i].equalsIgnoreCase(itemName)) { 
                System.out.printf("Item found: %s | Stock: %d | Price: %.2f | Quantity Sold: %d\n", 
                        items[i], stock[i], price[i], quantitySold[i]); 
                found = true; 
                break; 
            } 
        } 
        if (!found) { 
            System.out.println("Item not found in inventory."); 
        } 
    } 
 
    // Update stock of an item 
    public static void updateStock(String itemName, int newStock) { 
        boolean found = false; 
        for (int i = 0; i < itemCount; i++) { 
            if (items[i].equalsIgnoreCase(itemName)) { 
                stock[i] = newStock; 
                System.out.println("Stock updated successfully."); 
                found = true; 
                break; 
            } 
        } 
        if (!found) { 
            System.out.println("Item not found. Cannot update stock."); 
        } 
    } 
 
    // Delete an item from inventory 
    public static void deleteItem(String itemName) { 
        boolean found = false; 
        for (int i = 0; i < itemCount; i++) { 
            if (items[i].equalsIgnoreCase(itemName)) { 
                // Shift items to fill the gap 
                for (int j = i; j < itemCount - 1; j++) { 
                    items[j] = items[j + 1]; 
                    stock[j] = stock[j + 1]; 
                    price[j] = price[j + 1]; 
                    quantitySold[j] = quantitySold[j + 1]; 
                } 
                itemCount--; 
                System.out.println("Item deleted successfully."); 
                found = true; 
                break; 
            } 
        } 
        if (!found) { 
            System.out.println("Item not found. Cannot delete."); 
        } 
    } 
 
    // Record a sale and update stock 
    public static void sellItem(String itemName, int quantity) { 
        boolean found = false; 
        for (int i = 0; i < itemCount; i++) { 
            if (items[i].equalsIgnoreCase(itemName)) { 
                if (stock[i] >= quantity) { 
                    double saleAmount = quantity * price[i]; 
                    totalSales += saleAmount; 
                    stock[i] -= quantity; 
                    quantitySold[i] += quantity; // Track quantity sold 
                    System.out.printf("Sold %d units of %s for %.2f\n", quantity, itemName, saleAmount); 
                } else { 
                    System.out.println("Not enough stock available to complete the sale."); 
                } 
                found = true; 
                break; 
            } 
        } 
        if (!found) { 
            System.out.println("Item not found. Cannot complete the sale."); 
        } 
    } 
 
    // Display total sales for the month and sales for each item 
    public static void displaySales() { 
        System.out.println("\nSales Summary:"); 
        System.out.println("---------------------------------------------------"); 
        System.out.println("Item Name\tQuantity Sold\tTotal Sales"); 
        for (int i = 0; i < itemCount; i++) { 
            double itemSales = quantitySold[i] * price[i]; 
            System.out.printf("%s\t\t%d\t\t%.2f\n", items[i], quantitySold[i], itemSales); 
        } 
        System.out.println("---------------------------------------------------"); 
        System.out.printf("Total sales for the month: %.2f\n", totalSales); 
    } 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int choice; 
 
        do { 
            System.out.println("\nAlgoPro Suppermarket\n Inventory Management"); 
            System.out.println("1. Add Item"); 
            System.out.println("2. Display Items"); 
            System.out.println("3. Search Item"); 
            System.out.println("4. Update Stock"); 
            System.out.println("5. Delete Item"); 
            System.out.println("6. Sell Item"); 
            System.out.println("7. Display Monthly Sales"); 
            System.out.println("8. Exit"); 
            System.out.print("Enter your choice: "); 
            choice = scanner.nextInt(); 
            scanner.nextLine(); // Consume newline 
 
            switch (choice) { 
                case 1: 
                    System.out.print("Enter item name: "); 
                    String itemName = scanner.nextLine(); 
                    System.out.print("Enter stock quantity: "); 
                    int itemStock = scanner.nextInt(); 
                    System.out.print("Enter item price: "); 
                    double itemPrice = scanner.nextDouble(); 
                    addItem(itemName, itemStock, itemPrice); 
                    break; 
                case 2: 
                    displayItems(); 
                    break; 
                case 3: 
                    System.out.print("Enter item name to search: "); 
                    String searchName = scanner.nextLine(); 
                    searchItem(searchName); 
                    break; 
                case 4: 
                    System.out.print("Enter item name to update stock: "); 
                    String updateName = scanner.nextLine(); 
                    System.out.print("Enter new stock quantity: "); 
                    int newStock = scanner.nextInt(); 
                    updateStock(updateName, newStock); 
                    break; 
                case 5: 
                    System.out.print("Enter item name to delete: "); 
                    String deleteName = scanner.nextLine(); 
                    deleteItem(deleteName); 
                    break; 
                case 6: 
                    System.out.print("Enter item name to sell: "); 
                    String sellName = scanner.nextLine(); 
                    System.out.print("Enter quantity to sell: "); 
                    int sellQuantity = scanner.nextInt(); 
                    sellItem(sellName, sellQuantity); 
                    break; 
                case 7: 
                    displaySales(); 
                    break; 
                case 8: 
                    System.out.println("Exiting program. Goodbye!"); 
                    break; 
                default: 
                    System.out.println("Invalid choice. Please try again."); 
            } 
        } while (choice != 8); 
 
        scanner.close(); 
} 
} 
}
