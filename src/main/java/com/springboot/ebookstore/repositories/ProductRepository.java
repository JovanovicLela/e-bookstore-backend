package com.springboot.ebookstore.repositories;

import com.springboot.ebookstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
