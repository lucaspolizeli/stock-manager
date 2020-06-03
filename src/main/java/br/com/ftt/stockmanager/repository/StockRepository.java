package br.com.ftt.stockmanager.repository;

import br.com.ftt.stockmanager.dto.stock.StockProductResponseDTO;
import br.com.ftt.stockmanager.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
    void deleteByProductId(Long id);

    Optional<Stock> findByProductId(Long id);
}
