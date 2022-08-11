package rikkei.academy.service;


import rikkei.academy.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Class nghiệp vụ
public class ProductServiceIMPL implements IProductService {
    public static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Apple", 80));
        productList.add(new Product(2, "SAMSUNG", 20));
        productList.add(new Product(3, "VIVO", 50));
        productList.add(new Product(4, "XIAOMI", 10));


    }

    @Override
    public List<Product> remove(int id) {
        productList.remove(id - 1);
        return productList;
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public List<Product> save(Product product) {
        productList.add(product);
        return productList;
    }

    @Override
    public List<Product> sortByPrice() {
        Collections.sort(productList);
        return productList;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                products.add(product);
            }
        }
        return products;
    }

    @Override
    public List<Product> edit(int id, String name, int price) {
        productList.get(id - 1).setName(name);
        productList.get(id - 1).setPrice(price);
        return productList;
    }
}
