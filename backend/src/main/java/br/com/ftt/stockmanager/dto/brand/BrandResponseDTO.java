package br.com.ftt.stockmanager.dto.brand;

import br.com.ftt.stockmanager.model.Brand;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class BrandResponseDTO {
    private Long id;
    private String name;
    private String description;

    public static BrandResponseDTO parse(Brand brandToParse) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(brandToParse, BrandResponseDTO.class);
    }
}
