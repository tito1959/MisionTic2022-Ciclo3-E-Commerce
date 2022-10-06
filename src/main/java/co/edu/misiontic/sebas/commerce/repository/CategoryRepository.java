package co.edu.misiontic.sebas.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.misiontic.sebas.commerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
