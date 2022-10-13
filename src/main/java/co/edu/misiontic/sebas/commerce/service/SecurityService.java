package co.edu.misiontic.sebas.commerce.service;

import co.edu.misiontic.sebas.commerce.model.dto.UserDto;
import co.edu.misiontic.sebas.commerce.model.dto.UserSlimDto;

public interface SecurityService {

    UserDto getUser(UserSlimDto user);
}
