package co.edu.misiontic.sebas.commerce.service.imp;

import java.util.List;

import co.edu.misiontic.sebas.commerce.model.dto.CategoryDto;
import co.edu.misiontic.sebas.commerce.service.CategoryService;

public class CategoryServiceImp implements CategoryService {

<<<<<<< HEAD
=======
    /*
     * =================
     * Repository Injection.
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

>>>>>>> dev
    @Override
    public List<CategoryDto> getCategories() {
        return null;
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
