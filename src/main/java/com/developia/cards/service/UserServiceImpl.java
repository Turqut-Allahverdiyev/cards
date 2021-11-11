package com.developia.cards.service;

import com.developia.cards.dao.entity.UserEntity;
import com.developia.cards.dao.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUserByID(Long id) {

        Optional<UserEntity> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(new UserEntity());
    }
}
