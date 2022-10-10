package co.edu.misiontic.sebas.commerce.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.misiontic.sebas.commerce.model.dto.ProductDto;
import co.edu.misiontic.sebas.commerce.model.dto.ProductSlimDto;
import co.edu.misiontic.sebas.commerce.model.mapper.ProductMapper;
import co.edu.misiontic.sebas.commerce.repository.ProductRepository;
import co.edu.misiontic.sebas.commerce.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductSlimDto> getAllProducts() {
        return productMapper.productToProductDto(productRepository.findAll());
    }

    @Override
    public ProductDto getProduct(Long id) {
        return null;
    }

    @Override
    public void saveProduct(ProductDto product) {

    }

    @Override
    public void editProduct(ProductDto product) {

    }

    @Override
    public void deleteProduct(Long id) {

    }

}
