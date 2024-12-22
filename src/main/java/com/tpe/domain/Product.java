package com.tpe.domain;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;

public class Product {

    private String id;
    public static int counter = loadCounter();
    private static final String COUNTER_FILE = "counter.txt";
    private String productName;
    private String productorName;
    private int quantity;
    private String part;
    private String shelf;

    public Product() {
    }

    public Product(String id, String productName, String productorName, int quantity, String part, String shelf) {
        this.id = id;
        this.productName = productName;
        this.productorName = productorName;
        this.quantity = quantity;
        this.part = part;
        this.shelf = shelf;
    }

    public static int loadCounter() {
        try {
            if (Files.exists(Paths.get("counter.txt"), new LinkOption[0])) {
                BufferedReader reader = new BufferedReader(new FileReader("counter.txt"));
                String line = reader.readLine();
                reader.close();
                return Integer.parseInt(line);
            }
        } catch (IOException var2) {
            IOException e = var2;
            e.printStackTrace();
        }

        return 1000;
    }

    public static void saveCounter(int counter) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("counter.txt"));

            try {
                writer.write(String.valueOf(counter));
            } catch (Throwable var5) {
                try {
                    writer.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            writer.close();
        } catch (IOException var6) {
            IOException e = var6;
            e.printStackTrace();
        }

    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductorName() {
        return this.productorName;
    }

    public void setProductorName(String productorName) {
        this.productorName = productorName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPart() {
        return this.part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getShelf() {
        return this.shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }
}
