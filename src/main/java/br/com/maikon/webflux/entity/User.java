package br.com.maikon.webflux.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class User {

    @Id
    private String id;
    private String name;

    @Indexed(unique = true)//Com essa anotaçao o valor de email será único. Pra funcionar, precisa do auto-index-creation no application.yml
    private String email;
    private String password;
}
