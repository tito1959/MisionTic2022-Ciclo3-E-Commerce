package co.edu.misiontic.sebas.commerce.service;

import java.util.List;

import co.edu.misiontic.sebas.commerce.model.dto.ProductDto;

public interface ProductService {

    // get all products with categories
    List<ProductDto> getAllProducts();

    // get one product with categories
    ProductDto getProduct(Long id);

    // save one product
    void saveProduct(ProductDto product);

    // edit one product
    void editProduct(ProductDto product);

    // delete one product
    void deleteProduct(Long id);

}
