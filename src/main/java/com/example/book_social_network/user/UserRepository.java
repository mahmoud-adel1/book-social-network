package com.example.book_social_network.user;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findByEmail(String email);

}
