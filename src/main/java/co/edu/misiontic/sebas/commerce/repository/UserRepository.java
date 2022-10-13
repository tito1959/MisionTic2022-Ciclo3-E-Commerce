package co.edu.misiontic.sebas.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.misiontic.sebas.commerce.model.User;
import co.edu.misiontic.sebas.commerce.model.dto.UserSlimDto;

public interface UserRepository extends JpaRepository<User, Long> {

    User findOne(UserSlimDto user);

}
