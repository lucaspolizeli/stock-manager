package br.com.ftt.stockmanager.dto.category;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CategoryRequestDTO {
    @NotNull
    @NotEmpty
    @Length(max = 25)
    private String name;

    @NotNull
    @NotEmpty
    @Length(max = 255)
    private String description;
}
