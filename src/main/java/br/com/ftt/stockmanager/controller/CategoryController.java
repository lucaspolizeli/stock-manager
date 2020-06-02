package br.com.ftt.stockmanager.controller;

import br.com.ftt.stockmanager.controller.dto.category.CategoryRequestDTO;
import br.com.ftt.stockmanager.controller.dto.category.CategoryResponseDTO;
import br.com.ftt.stockmanager.model.Category;
import br.com.ftt.stockmanager.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
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
    public ResponseEntity<CategoryResponseDTO> store(@RequestBody @Valid CategoryRequestDTO categoryToInsert, UriComponentsBuilder uriComponentsBuilder) {
        var category = new Category();

        category.setName(categoryToInsert.getName());
        category.setDescription(categoryToInsert.getDescription());

        categoryRepository.save(category);

        var uri = uriComponentsBuilder
                .path("/category/{id}")
                .buildAndExpand(category.getId())
                .toUri();
        return ResponseEntity.created(uri).body(CategoryResponseDTO.parse(category));
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
