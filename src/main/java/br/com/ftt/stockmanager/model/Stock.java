package br.com.ftt.stockmanager.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer amount;
    @OneToOne
    private Product product;
}
