package com.bashir.spring.dao;

import com.bashir.spring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ProductDao extends JpaRepository<Product, Long> {
}
