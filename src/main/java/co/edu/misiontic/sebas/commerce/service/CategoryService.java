package co.edu.misiontic.sebas.commerce.service;

import java.util.List;

import co.edu.misiontic.sebas.commerce.model.dto.CategorySlimDto;

public interface CategoryService {

    List<CategorySlimDto> getAllCategories();

}
