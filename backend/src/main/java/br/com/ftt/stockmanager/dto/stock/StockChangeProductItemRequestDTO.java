package br.com.ftt.stockmanager.dto.stock;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Data
public class StockChangeProductItemRequestDTO {
    @NotNull
    @PositiveOrZero
    private Integer amount;
}
