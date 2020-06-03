package br.com.ftt.stockmanager.dto.category;


import br.com.ftt.stockmanager.model.Category;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class CategoryResponseDTO {

    private Long id;
    private String name;
    private String description;

    public static CategoryResponseDTO parse(Category categoryToParse) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(categoryToParse, CategoryResponseDTO.class);
    }
}
