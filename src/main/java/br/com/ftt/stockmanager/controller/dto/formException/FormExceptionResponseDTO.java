package br.com.ftt.stockmanager.controller.dto.formException;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class FormExceptionResponseDTO {
    private List<FormExceptionDTO> errors;
}