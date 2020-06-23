package br.com.ftt.stockmanager.dto.product;

import br.com.ftt.stockmanager.model.Product;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class ProductResponseDTO {
    private Long id;
    private String name;
    private String description;
    private Float price;
    private String brandName;
    private String categoryName;
    private String providerName;

    public static ProductResponseDTO parse(Product productToParse) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(productToParse, ProductResponseDTO.class);
    }
}
