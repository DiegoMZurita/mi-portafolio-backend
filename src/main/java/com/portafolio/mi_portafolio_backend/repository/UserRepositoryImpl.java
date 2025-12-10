package com.portafolio.mi_portafolio_backend.repository;

import com.portafolio.mi_portafolio_backend.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements IUserRepository {

    private final JdbcTemplate jdbcTemplate;


    private User mapRowtoUser(ResultSet rs, int numRow) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setEnabled(rs.getBoolean("enabled"));
        return user;
    }

    @Override
    public Optional<User> findByUsername(String username) {

        String sql = "SELECT * FROM users WHERE username = ?";

        try{
            return Optional.ofNullable(jdbcTemplate.queryForObject(sql, this::mapRowtoUser, username));
        } catch(EmptyResultDataAccessException e){
            return Optional.empty();
        }

    }
}
