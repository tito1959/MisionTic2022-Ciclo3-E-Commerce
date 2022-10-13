package co.edu.misiontic.sebas.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.misiontic.sebas.commerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByPasswordAndEmail(String password, String email);
}
