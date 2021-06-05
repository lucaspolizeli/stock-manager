package br.com.ftt.stockmanager.dto.stock;

import br.com.ftt.stockmanager.dto.provider.ProviderResponseDTO;
import br.com.ftt.stockmanager.model.Product;
import br.com.ftt.stockmanager.model.Provider;
import br.com.ftt.stockmanager.model.Stock;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class StockProductResponseDTO {
    private Long id;
    private Product product;
    private Integer amount;

    public static StockProductResponseDTO parse(Stock stockToParse) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(stockToParse, StockProductResponseDTO.class);
    }
}
