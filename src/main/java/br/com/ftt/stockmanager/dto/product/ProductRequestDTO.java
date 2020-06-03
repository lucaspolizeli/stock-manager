package br.com.ftt.stockmanager.dto.product;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ProductRequestDTO {
    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String description;

    @NotNull
    private Float price;

    @NotNull
    private Long brandId;

    @NotNull
    private Long categoryId;

    @NotNull
    private Long providerId;
}
