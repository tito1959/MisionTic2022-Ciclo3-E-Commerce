package co.edu.misiontic.sebas.commerce.service;

import java.util.List;

import co.edu.misiontic.sebas.commerce.model.dto.CategoryDto;

public interface CategoryService {

    // read
    List<CategoryDto> getCategories();

    // create
    void saveCategory(CategoryDto category);

    // edit
    void updateCategory(CategoryDto category);

    // delete
    void deleteCategory(CategoryDto category);

    // return categories by id User
    // ==== featured in evaluation ====
}
