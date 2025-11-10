package com.sparklead.sharaspot.services;

import com.sparklead.sharaspot.payload.SignInRequest;
import com.sparklead.sharaspot.payload.SignupRequest;
import com.sparklead.sharaspot.models.User;

import java.util.Optional;

public interface UserService {

    String saveUser(User user);

    String registerUser(SignupRequest signupRequest);

    Boolean verifyUser(User user, SignInRequest signInRequest);

    Optional<User> findById(String id);
}
