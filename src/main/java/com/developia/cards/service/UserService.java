package com.developia.cards.service;

import com.developia.cards.dao.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUsers();
    UserEntity getUserByID(Long id);
}
