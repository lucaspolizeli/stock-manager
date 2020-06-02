package br.com.ftt.stockmanager.dto.formException;

import lombok.Data;

import java.util.List;

@Data
public class FormExceptionResponseDTO {
    private List<FormExceptionDTO> errors;
}