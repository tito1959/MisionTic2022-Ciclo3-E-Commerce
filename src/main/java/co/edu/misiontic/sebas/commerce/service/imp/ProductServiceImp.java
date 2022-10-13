package co.edu.misiontic.sebas.commerce.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.misiontic.sebas.commerce.model.dto.ProductSlimDto;
import co.edu.misiontic.sebas.commerce.model.mapper.ProductMapper;
import co.edu.misiontic.sebas.commerce.repository.ProductRepository;
import co.edu.misiontic.sebas.commerce.service.ProductService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private final ProductRepository productRepository;

    @Override
    public List<ProductSlimDto> getAllProducts() {
        return productMapper.productsToProductsSlimDto(productRepository.findAll());
    }

}
