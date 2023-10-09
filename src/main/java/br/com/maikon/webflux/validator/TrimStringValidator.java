package br.com.maikon.webflux.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TrimStringValidator implements ConstraintValidator<TrimString, String> {//Define que essa anotação será utilizada
    // para validação de strings.

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {//Valida se a string não tem espaços em branco no inicio e no fim.
        return value == null || value.trim().length() == value.length();
    }
}