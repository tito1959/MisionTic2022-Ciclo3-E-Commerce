package co.edu.misiontic.sebas.commerce.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.misiontic.sebas.commerce.model.dto.UserDto;
import co.edu.misiontic.sebas.commerce.model.dto.UserSlimDto;
import co.edu.misiontic.sebas.commerce.model.mapper.UserMapper;
import co.edu.misiontic.sebas.commerce.repository.UserRepository;
import co.edu.misiontic.sebas.commerce.service.SecurityService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SecurityServiceImp implements SecurityService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto getUser(UserSlimDto user) {
        return userMapper.userToUserDto(userRepository.findOne(user));
    }

}
