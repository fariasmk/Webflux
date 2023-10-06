package br.com.maikon.webflux.controller;

import br.com.maikon.webflux.model.request.UserRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

public interface UserController {

    @PostMapping
    ResponseEntity<Mono<Void>> save(@Valid @RequestBody UserRequest request);
//    No contexto do projeto Reactor, que é a base do WebFlux no ecossistema Spring, "Mono" é uma abreviação de
//    "monomorfismo" e representa um tipo que representa um valor único ou a ausência de um valor. É uma construção
//    usada para modelar computações que podem ou não ter um resultado.

    @GetMapping(value = "/{id}")
    ResponseEntity<Mono<UserResponse>> findById(@PathVariable String id);

    @GetMapping
    ResponseEntity<Flux<UserResponse>> findAll();
//    Assim como o Mono, o Flux é outra classe fundamental no projeto Reactor, que é a base do WebFlux no Spring.
//    Enquanto o Mono é usado para representar zero ou um valor, o Flux é usado para representar zero, um ou vários valores.

    @PatchMapping(value = "/{id}")
    ResponseEntity<Mono<UserResponse>> update(@PathVariable String id, @RequestBody UserRequest request);

    @DeleteMapping(value = "/{id}")
    ResponseEntity<Mono<Void>> delete(@PathVariable String id);


}
