package co.edu.misiontic.sebas.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.misiontic.sebas.commerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
