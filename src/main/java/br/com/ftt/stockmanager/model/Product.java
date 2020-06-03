package br.com.ftt.stockmanager.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Float price;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Provider provider;
}
