package br.com.ftt.stockmanager.exceptions;

import br.com.ftt.stockmanager.controller.dto.formException.FormExceptionDTO;
import br.com.ftt.stockmanager.controller.dto.formException.FormExceptionResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ValidationExceptionHandler {
    @Autowired
    private MessageSource messageSource;

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public FormExceptionResponseDTO handle(MethodArgumentNotValidException exception) {
        var formExceptionResponseDTO = new FormExceptionResponseDTO();
        var fieldErrors = exception.getBindingResult().getFieldErrors();

        var formExceptionDTO = fieldErrors
                .stream()
                .map(error -> new FormExceptionDTO(error.getField(), messageSource.getMessage(error, LocaleContextHolder.getLocale())))
                .collect(Collectors.toCollection(ArrayList::new));

        formExceptionResponseDTO.setErrors(formExceptionDTO);
        return formExceptionResponseDTO;
    }
}
