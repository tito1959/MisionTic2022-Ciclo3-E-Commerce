package co.edu.misiontic.sebas.commerce.service;

import java.util.List;

import co.edu.misiontic.sebas.commerce.model.dto.UserDto;

public interface SecurityService {

    // get all users
    List<UserDto> getUsers();

    // get user for verified login
    UserDto getUserById(Long userId);

    // register user
    void registerUser(UserDto user);

    // Update user
    void updateUser(UserDto user);

    // delete user
    void deleteUser(Long userId);

}
