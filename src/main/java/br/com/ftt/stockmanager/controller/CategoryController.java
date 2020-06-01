package br.com.ftt.stockmanager.controller;

import br.com.ftt.stockmanager.controller.dto.category.CategoryRequestDTO;
import br.com.ftt.stockmanager.controller.dto.category.CategoryResponseDTO;
import br.com.ftt.stockmanager.model.Category;
import br.com.ftt.stockmanager.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/")
    public List<CategoryResponseDTO> index(){
        var category = categoryRepository.findAll();

        return category
                .stream()
                .map(CategoryResponseDTO::parse)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CategoryResponseDTO show(@PathVariable("id") Long id) {
        var category = categoryRepository.getOne(id);
        return CategoryResponseDTO.parse(category);
    }

    @PostMapping("/")
    public void store(@RequestBody CategoryRequestDTO categoryToInsert) {
        var category = new Category();

        category.setName(categoryToInsert.getName());
        category.setDescription(categoryToInsert.getDescription());

        categoryRepository.save(category);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody CategoryRequestDTO categoryToUpdate) throws Exception {
        var hasCategory = categoryRepository.findById(id);

        if(hasCategory.isPresent()) {
            var category = hasCategory.get();

            category.setName(categoryToUpdate.getName());
            category.setDescription(categoryToUpdate.getDescription());

            categoryRepository.save(category);
        } else {
            throw new Exception("Categoria não encontrada");
        }
    }
}
