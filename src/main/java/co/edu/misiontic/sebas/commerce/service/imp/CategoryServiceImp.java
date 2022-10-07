package co.edu.misiontic.sebas.commerce.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import co.edu.misiontic.sebas.commerce.model.dto.CategoryDto;
import co.edu.misiontic.sebas.commerce.model.mapper.CategoryMapper;
import co.edu.misiontic.sebas.commerce.repository.CategoryRepository;
import co.edu.misiontic.sebas.commerce.service.CategoryService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryServiceImp implements CategoryService {

    /*
     * =================
     * Repository Injection
     * ================
     */
    @Autowired
    private final CategoryRepository categoryRepository;

    @Autowired
    CategoryMapper categoryMapper;

    /*
     * ===============
     * SERVICES
     * =============
     */

    @Override
    public List<CategoryDto> getCategories() {
        var categoryOp = categoryRepository.findAll(Sort.by("name"));
        return categoryMapper.categoryToCategoryDto(categoryOp);
    }

    @Override
    public void saveCategory(CategoryDto category) {

    }

    @Override
    public void updateCategory(CategoryDto category) {

    }

    @Override
    public void deleteCategory(CategoryDto category) {

    }

}
