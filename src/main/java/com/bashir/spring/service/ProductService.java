package com.bashir.spring.service;

import com.bashir.spring.dao.ProductDao;
import com.bashir.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public void save() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1231", 2));
        products.add(new Product("1232", 23));
        products.add(new Product("1233", 22));
        productDao.saveAll(products);
    }
}
