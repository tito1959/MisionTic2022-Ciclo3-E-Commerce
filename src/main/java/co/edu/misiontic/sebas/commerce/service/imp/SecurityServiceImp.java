package co.edu.misiontic.sebas.commerce.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.misiontic.sebas.commerce.model.dto.UserDto;
import co.edu.misiontic.sebas.commerce.model.dto.UserSlimDto;
import co.edu.misiontic.sebas.commerce.model.mapper.UserMapper;
import co.edu.misiontic.sebas.commerce.repository.UserRepository;
import co.edu.misiontic.sebas.commerce.service.SecurityService;

@Service
public class SecurityServiceImp implements SecurityService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserSlimDto> getUsers() {
        return userMapper.usersToUsersSlimDto(userRepository.findAll());
    }

    @Override
    public UserDto getUserById(Long userId) {
        return null;
    }

    @Override
    public void registerUser(UserDto user) {

    }

    @Override
    public void updateUser(UserDto user) {

    }

    @Override
    public void deleteUser(Long userId) {

    }

}
