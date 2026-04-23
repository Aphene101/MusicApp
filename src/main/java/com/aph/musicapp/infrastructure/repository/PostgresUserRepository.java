package com.aph.musicapp.infrastructure.repository;

import com.aph.musicapp.domain.model.User;
import com.aph.musicapp.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public class PostgresUserRepository implements UserRepository {
    @Override
    public Mono<User> findById(UUID id) {
        return null;
    }

    @Override
    public Mono<User> save(User user) {
        return null;
    }

    @Override
    public Flux<User> findAll() {
        return null;
    }
}
