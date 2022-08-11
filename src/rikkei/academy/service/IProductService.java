package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> remove(int id);

    List<Product> findAll();

    List<Product> save(Product product);

    List<Product> sortByPrice();

    List<Product> search (String name);

    List<Product> edit (int id, String name, int price);
}
