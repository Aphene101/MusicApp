package com.aph.musicapp.domain.repository;

import com.aph.musicapp.domain.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface UserRepository {
    Mono<User> findById(UUID id);
    Mono<User> save(User user);
    Flux<User> findAll();
}
