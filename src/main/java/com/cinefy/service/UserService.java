package com.cinefy.service;

import com.cinefy.dto.UserDto;
import com.cinefy.entity.User;
import com.cinefy.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(UserDto dto) {

        User user = User.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .phoneNumber(dto.getPhoneNumber())
                .password("defaultPassword")
                .build();

        return userRepository.save(user);
    }
}