package com.bookstore.Service;

import com.bookstore.domain.security.User;
import com.bookstore.domain.security.UserRole;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface UserService {

    User createUser(User user, Set<UserRole> userRoles);
}
