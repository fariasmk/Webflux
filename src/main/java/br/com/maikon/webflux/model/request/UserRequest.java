package br.com.maikon.webflux.model.request;

import br.com.maikon.webflux.validator.TrimString;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(
//        Em Java, o termo "record" se refere a um tipo de classe introduzido no Java 16 que simplifica a criação de classes
//        imutáveis e de transferência de dados. Um record é uma classe que é implicitamente final, imutável e automaticamente
//        fornece métodos úteis, como métodos equals(), hashCode() e toString(). O principal propósito dos records é reduzir a
//        verbosidade do código ao criar classes simples que são usadas principalmente para armazenar dados.
//        Com records em Java, você não precisa escrever explicitamente getters e setters. O compilador Java gera automaticamente
//        esses métodos para os campos declarados em um record. Isso é uma parte do design do record para simplificar a criação de
//        classes de dados.

        @TrimString//Anotaçao customizada na pasta validator
        @NotBlank(message = "must not be null or empty")//nulo ou vazio
        @Size(min = 3, max = 50, message = "must be between 3 and 50 characters")//Qtd de caracteres
        String name,

        @TrimString
        @Email(message = "invalid email")//verifique se o email é válido
        @NotBlank(message = "must not be null or empty")
        String email,

        @TrimString
        @NotBlank(message = "must not be null or empty")
        @Size(min = 3, max = 20, message = "must be between 3 and 20 characters")
        String password
) { }
