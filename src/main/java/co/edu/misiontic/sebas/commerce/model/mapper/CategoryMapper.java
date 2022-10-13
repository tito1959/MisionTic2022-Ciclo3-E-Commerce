package co.edu.misiontic.sebas.commerce.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.misiontic.sebas.commerce.model.Category;
import co.edu.misiontic.sebas.commerce.model.dto.CategorySlimDto;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    List<CategorySlimDto> categoriesToCategoriesSlimDto(List<Category> categories);
}
