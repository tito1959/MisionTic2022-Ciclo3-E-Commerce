package co.edu.misiontic.sebas.commerce.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.misiontic.sebas.commerce.model.Product;
import co.edu.misiontic.sebas.commerce.model.dto.ProductSlimDto;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    List<ProductSlimDto> productToProductDto(List<Product> products);
}
