package com.bookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class SecurityUtility {

    private static final String SALT = "salt"; //Salt should be protected carefully

    @Bean
    public static BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
    }

    @Bean
    public static String randomPassword(){
        String SALTCHARS = "asdfasdfasdfasdfasdfasdfasdf";
        StringBuilder salt = new StringBuilder();
        Random rd = new Random();

        while(salt.length() < 18){
            int index = (int)(rd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }

        String saltStr = salt.toString();
        return saltStr;
    }

}
