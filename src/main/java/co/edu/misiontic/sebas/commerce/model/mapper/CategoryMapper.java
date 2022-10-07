package co.edu.misiontic.sebas.commerce.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.edu.misiontic.sebas.commerce.model.Category;
import co.edu.misiontic.sebas.commerce.model.dto.CategoryDto;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mapping(target = "products", ignore = true)
    List<CategoryDto> categoryToCategoryDto(List<Category> category);
}
