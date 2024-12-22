package com.tpe.domain;

import java.util.Map;

public interface AppInterface {

        void addProduct(Map<java.lang.String, Product> var1);

        void listProduct(Map<java.lang.String, Product> var1);

        void enterProduct(Map<java.lang.String, Product> var1);

        void putProductOnShelf(Map<java.lang.String, Product> var1);

        void productOutput(Map<java.lang.String, Product> var1);

        void removeProduct(Map<java.lang.String, Product> var1);

        void clearProducts(Map<java.lang.String, Product> var1);
}

