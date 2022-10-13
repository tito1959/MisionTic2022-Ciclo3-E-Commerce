package co.edu.misiontic.sebas.commerce.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.misiontic.sebas.commerce.model.dto.CategorySlimDto;
import co.edu.misiontic.sebas.commerce.model.mapper.CategoryMapper;
import co.edu.misiontic.sebas.commerce.repository.CategoryRepository;
import co.edu.misiontic.sebas.commerce.service.CategoryService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private final CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategorySlimDto> getAllCategories() {
        return categoryMapper.categoriesToCategoriesSlimDto(categoryRepository.findAll());
    }

}
