package service;

import entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface Order {
    List<Product> productList = new ArrayList<>();

    void addProduct(Product product);
    void deleteProduct(int id);
    List<Product> totalProducts();
    Product getProduct(int id);
}
