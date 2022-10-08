package co.edu.misiontic.sebas.commerce.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.misiontic.sebas.commerce.model.Product;
import co.edu.misiontic.sebas.commerce.model.dto.ProductDto;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    List<ProductDto> productToProductDto(List<Product> products);
}
