package dev.adarsh.productservice.repositories;

import dev.adarsh.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product save(Product product);
    Product findProductById(Long id);
}
