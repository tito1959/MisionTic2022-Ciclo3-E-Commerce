package co.edu.misiontic.sebas.commerce.service;

import java.util.List;

import co.edu.misiontic.sebas.commerce.model.dto.UserDto;
import co.edu.misiontic.sebas.commerce.model.dto.UserSlimDto;

public interface SecurityService {

    // get all users
    List<UserSlimDto> getUsers();

    // get user for verified login
    UserDto getUserById(Long userId);

    // register user
    void registerUser(UserDto user);

    // Update user
    void updateUser(UserDto user);

    // delete user
    void deleteUser(Long userId);

}
