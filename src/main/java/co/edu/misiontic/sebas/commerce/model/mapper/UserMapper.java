package co.edu.misiontic.sebas.commerce.model.mapper;

import org.mapstruct.Mapper;

import co.edu.misiontic.sebas.commerce.model.User;
import co.edu.misiontic.sebas.commerce.model.dto.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto userToUserDto(User user);
}
