package br.com.ftt.stockmanager.controller.dto.formException;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FormExceptionDTO {
    private String field;
    private String error;
}
