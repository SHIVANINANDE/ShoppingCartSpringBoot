package com.springbootproject.ShoppingCart.service.user;

import com.springbootproject.ShoppingCart.dto.UserDto;
import com.springbootproject.ShoppingCart.model.User;
import com.springbootproject.ShoppingCart.request.CreateUserRequest;
import com.springbootproject.ShoppingCart.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}