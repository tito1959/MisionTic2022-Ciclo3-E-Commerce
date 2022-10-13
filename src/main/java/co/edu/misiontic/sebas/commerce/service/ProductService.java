package co.edu.misiontic.sebas.commerce.service;

import java.util.List;

import co.edu.misiontic.sebas.commerce.model.dto.ProductSlimDto;

public interface ProductService {

    public List<ProductSlimDto> getAllProducts();

}
