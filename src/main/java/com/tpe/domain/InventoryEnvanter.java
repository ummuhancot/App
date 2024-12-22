package com.tpe.domain;

import java.util.HashMap;
import java.util.Map;

public class InventoryEnvanter {

        private Map<Integer, Product> inventory;

        public InventoryEnvanter() {
            this.inventory = new HashMap<>();
        }


        public void removeProduct(int productId) {
            inventory.remove(productId);
        }

        public Product getProduct(int productId) {
            return inventory.get(productId);
        }

}