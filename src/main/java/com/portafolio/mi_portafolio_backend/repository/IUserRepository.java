package com.portafolio.mi_portafolio_backend.repository;

import com.portafolio.mi_portafolio_backend.model.User;

import java.util.Optional;

public interface IUserRepository {
    Optional<User> findByUsername(String username);

}
