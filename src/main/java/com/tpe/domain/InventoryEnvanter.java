package com.tpe.domain;

import java.util.HashMap;
import java.util.Map;

public class InventoryEnvanter {

        private Map<Integer, ProductUrun> inventory;

        public InventoryEnvanter() {
            this.inventory = new HashMap<>();
        }

        public void addProduct(ProductUrun product) {
            inventory.put(product.getId(), product);
        }

        public void updateStock(int productId, int newStock) {
            if (inventory.containsKey(productId)) {
                inventory.get(productId).setStok(newStock);
            }
        }

        public void removeProduct(int productId) {
            inventory.remove(productId);
        }

        public ProductUrun getProduct(int productId) {
            return inventory.get(productId);
        }

}