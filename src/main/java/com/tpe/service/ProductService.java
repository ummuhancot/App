package com.tpe.service;

import com.tpe.domain.Product;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductService implements Appendable {
    static Scanner scan;
    Map<String, Product> products = new LinkedHashMap();
    Scanner sc;




    public void addProduct(Map<String, Product> products) {
        Product pr = new Product((String)null, (String)null, (String)null, 0, (String)null, (String)null);
        System.out.print("Enter a product name: ");
        String productName = this.sc.nextLine().toUpperCase().trim();
        System.out.print("Enter a productor name: ");
        String productorName = this.sc.nextLine().toUpperCase().trim();
        System.out.print("Enter a part: ");
        String part = this.sc.nextLine().toUpperCase().trim();
        Iterator var6 = products.values().iterator();

        while(var6.hasNext()) {
            Product w = (Product)var6.next();
            if (w.getProductName().equals(productName) && w.getProductorName().equals(productorName) && w.getPart().equals(part)) {
                System.out.println("This product already exists. You can update the quantity instead.");
                return;
            }
        }

        int productQuantity;
        do {
            System.out.print("Enter a quantity: ");

            while(!this.sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a numeric value for quantity.");
                this.sc.next();
            }

            productQuantity = this.sc.nextInt();
            this.sc.nextLine();
            if (productQuantity <= 0) {
                System.out.println("Quantity should be a positive number.");
            }
        } while(productQuantity <= 0);

        pr.setProductName(productName);
        pr.setProductorName(productorName);
        pr.setQuantity(productQuantity);
        pr.setPart(part);
        this.productId(pr);
        products.put(pr.getId(), pr);
        Product.saveCounter(Product.counter);

    }

    public void productId(Product pr) {
        try {
            String var4 = pr.getProductName().toUpperCase().substring(0, 2);
            pr.setId(var4 + LocalDate.now().getYear() + Product.counter);
            ++Product.counter;
        } catch (StringIndexOutOfBoundsException var3) {
            int var10001 = LocalDate.now().getYear();
            pr.setId("NULL" + var10001 + Product.counter);
            ++Product.counter;
        }

    }

    public void listProduct(Map<String, Product> products) {
        System.out.printf("%-20s %-20s %-20s %-15s %-10s %-10s%n", "PRODUCT ID", "PRODUCT NAME", "PRODUCTOR NAME", "QUANTITY", "PART", "SHELF");
        System.out.printf("%-20s %-20s %-20s %-15s %-10s %-10s%n", "----------", "------------", "--------------", "--------", "-------", "------");
        Iterator var2 = products.values().iterator();

        while(var2.hasNext()) {
            Product product = (Product)var2.next();
            System.out.printf("%-20s %-20s %-20s %-15s %-10s %-10s%n", product.getId(), product.getProductName(), product.getProductorName(), product.getQuantity(), product.getPart(), product.getShelf());
        }

    }

    public void enterProduct(Map<String, Product> products) {
        System.out.print("Enter the product ID to update quantity: ");
        String productId = this.sc.nextLine().trim();
        Product product = (Product)products.get(productId);
        if (product == null) {
            System.out.println("The ID you have entered is not on the list. Please check again.");
        } else {
            while(true) {
                System.out.print("Enter the quantity to add: ");

                while(!this.sc.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a numeric value for quantity.");
                    this.sc.next();
                }

                int quantity = this.sc.nextInt();
                this.sc.nextLine();
                if (quantity <= 0) {
                    System.out.println("Quantity should be a positive number.");
                }

                if (quantity > 0) {
                    product.setQuantity(product.getQuantity() + quantity);
                    System.out.println("Product quantity updated successfully. NEW STOCK: " + product.getQuantity());
                    break;
                }
            }
        }


    }

    public void putProductOnSepet(Map<String, Product> products) {
        System.out.print("Enter the product ID to place on the shelf: ");
        String productId = this.sc.nextLine().trim();
        Product product = (Product)products.get(productId);
        if (product == null) {
            System.out.println("The ID you have entered is not on the list. Please check again.");
        } else {
            while(true) {
                System.out.print("Enter a positive shelf number: ");

                while(!this.sc.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a valid number value for the Shelf Number.");
                    this.sc.next();
                }

                int shelfNo = this.sc.nextInt();
                this.sc.nextLine();
                boolean isShelfAvailable = true;
                Iterator var6 = products.values().iterator();

                while(var6.hasNext()) {
                    Product p = (Product)var6.next();
                    if (p.getShelf() != null && p.getShelf().equals("SHELF" + shelfNo)) {
                        System.out.println("This shelf is already occupied. Try a different one.");
                        isShelfAvailable = false;
                        break;
                    }
                }

                if (shelfNo >= 0 && isShelfAvailable) {
                    product.setShelf("SHELF" + shelfNo);
                    System.out.println("Product placed on shelf " + product.getShelf() + " successfully.");
                    break;
                }
            }
        }


    }

    public void productOutput(Map<String, Product> products) {
        System.out.print("Enter the product ID for output: ");
        String productId = this.sc.nextLine().trim();
        Product product = (Product)products.get(productId);
        if (product == null) {
            System.out.println("The ID you have entered is not on the list. Please check again.");
        } else {
            while(true) {
                System.out.print("Enter the quantity to remove: ");

                while(!this.sc.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a numeric value for quantity.");
                    this.sc.next();
                }

                int quantity = this.sc.nextInt();
                this.sc.nextLine();
                if (quantity > product.getQuantity()) {
                    System.out.println("Insufficient quantity in stock. MAXIMUM AVAILABLE: " + product.getQuantity());
                } else if (quantity <= 0) {
                    System.out.println("Quantity should be a positive number.");
                }

                if (quantity > 0 && quantity <= product.getQuantity()) {
                    product.setQuantity(product.getQuantity() - quantity);
                    System.out.println("Product output successful. REMAINING STOCK: " + product.getQuantity());
                    break;
                }
            }
        }


    }

    public void removeProduct(Map<String, Product> products) {
        System.out.print("Enter the product ID to remove: ");
        String productId = this.sc.nextLine().trim();
        Product product = (Product)products.get(productId);
        if (product != null) {
            products.remove(productId);
            System.out.println("Product with ID " + productId + " has been removed successfully.");
        } else {
            System.out.println("The ID you entered is not in the list. Please check again.");
        }


    }

    public void clearProducts(Map<String, Product> products) {
        System.out.print("Are you sure you want to clear all products? (yes/no): ");
        String confirmation = this.sc.nextLine().trim().toLowerCase();
        if (confirmation.equals("yes")) {
            System.out.println("Warning: This action will remove all products from the list.");
            System.out.print("Are you really sure? Type 'yes' to confirm: ");
            String secondConfirmation = this.sc.nextLine().trim().toLowerCase();
            if (secondConfirmation.equals("yes")) {
                products.clear();
                System.out.println("All products have been cleared successfully.");
            } else {
                System.out.println("Action canceled. Products remain in the list.");
            }
        } else {
            System.out.println("Action canceled. Products remain in the list.");
        }


    }


    @Override
    public Appendable append(CharSequence csq) throws IOException {
        return null;
    }

    @Override
    public Appendable append(CharSequence csq, int start, int end) throws IOException {
        return null;
    }

    @Override
    public Appendable append(char c) throws IOException {
        return null;
    }
}
