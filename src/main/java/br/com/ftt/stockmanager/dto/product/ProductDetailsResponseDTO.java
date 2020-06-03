package br.com.ftt.stockmanager.dto.product;

import br.com.ftt.stockmanager.model.Brand;
import br.com.ftt.stockmanager.model.Category;
import br.com.ftt.stockmanager.model.Product;
import br.com.ftt.stockmanager.model.Provider;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class ProductDetailsResponseDTO {
    private Long id;
    private String name;
    private String description;
    private Float price;
    private Brand brand;
    private Category category;
    private Provider provider;

    public static ProductDetailsResponseDTO parse(Product productToParse) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(productToParse, ProductDetailsResponseDTO.class);
    }
}
