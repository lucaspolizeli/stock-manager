package br.com.ftt.stockmanager.repository;

import br.com.ftt.stockmanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}