package co.edu.misiontic.sebas.commerce.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.misiontic.sebas.commerce.model.User;
import co.edu.misiontic.sebas.commerce.model.dto.UserSlimDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    List<UserSlimDto> usersToUsersSlimDto(List<User> users);
}
