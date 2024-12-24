package com.tpe.domain;

import java.util.Map;

public interface UrunInterface {

        void addProduct(Map<String, Urun> products);
        void listProduct(Map<String, Urun> products);
        void enterProduct(Map<String, Urun> products);
        void putProductOnShelf(Map<String, Urun> products);
        void productOutput(Map<String, Urun> products);
        void removeProduct(Map<String, Urun> products);
        void clearProducts(Map<String, Urun> products);

}
