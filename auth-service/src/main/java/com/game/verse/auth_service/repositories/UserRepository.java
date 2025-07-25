package com.game.verse.auth_service.repositories;

import com.game.verse.auth_service.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    public Optional<User> findByEmail(String email);
}
