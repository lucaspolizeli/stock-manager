package br.com.ftt.stockmanager.controller.dto.category;

import br.com.ftt.stockmanager.model.Category;
import lombok.Data;

@Data
public class CategoryResponseDTO {
    private Long id;
    private String name;
    private String description;

    public static CategoryResponseDTO parse(Category categoryToParse) {
        var category = new CategoryResponseDTO();

        category.setId(categoryToParse.getId());
        category.setName(categoryToParse.getName());
        category.setDescription(categoryToParse.getDescription());

        return category;
    }
}
