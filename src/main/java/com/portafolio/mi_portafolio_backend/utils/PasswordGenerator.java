package com.portafolio.mi_portafolio_backend.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if (args.length == 0) {
            throw new IllegalArgumentException("Debes indicar la contraseña a encriptar.");
        }
        String password = args[0];
        String encodePassword = passwordEncoder.encode(password);
        System.out.println(encodePassword);
    }
}
