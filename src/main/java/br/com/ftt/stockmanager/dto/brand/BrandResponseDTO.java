package br.com.ftt.stockmanager.dto.brand;

import br.com.ftt.stockmanager.model.Brand;
import lombok.Data;

@Data
public class BrandResponseDTO {
    private Long id;
    private String name;
    private String description;

    public static BrandResponseDTO parse(Brand brandToParse) {
        var brand = new BrandResponseDTO();

        brand.setId(brandToParse.getId());
        brand.setName(brandToParse.getName());
        brand.setDescription(brandToParse.getDescription());

        return brand;
    }
}
