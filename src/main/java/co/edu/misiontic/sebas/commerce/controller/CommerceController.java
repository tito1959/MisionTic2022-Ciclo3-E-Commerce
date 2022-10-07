package co.edu.misiontic.sebas.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.misiontic.sebas.commerce.model.Product;
import co.edu.misiontic.sebas.commerce.model.dto.CategoryDto;
import co.edu.misiontic.sebas.commerce.model.dto.ProductDto;
import co.edu.misiontic.sebas.commerce.model.dto.UserDto;
import co.edu.misiontic.sebas.commerce.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CommerceController {

    /*
     * =================
     * Products Operations
     * ==================
     * GET: Read
     * POST: create
     * PUT: update
     * DELETE: delete
     */

    /*
     * ===============
     * DEPENDENCIES
     * ===============
     */

    @Autowired
    private CategoryService categoryService;

    /*
     * ==============
     * ENDPOINTS
     * =============
     */

    // read all products
    @GetMapping("/products")
    public List<Product> getProducts() {
        return null;
    }

    // create new product
    @PostMapping("/products")
    public ResponseEntity<String> createProduct(@RequestBody ProductDto productDto) {
        return null;
    }

    // edit product
    @PutMapping("/products/{id}")
    public ResponseEntity<String> editProduct(@PathVariable String id, @RequestBody ProductDto product) {
        return null;
    }

    // delete product
    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable String id) {
        return null;
    }

    /*
     * ===============
     * User Operations
     * ==============
     */

    // read all users
    @GetMapping("/user")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return null;
    }

    // read user by id
    @GetMapping("/user/{id}")
    public ResponseEntity<String> getMethodName(@PathVariable String id) {
        return null;
    }

    // create a new user
    @PostMapping("/user")
    public ResponseEntity<String> registerUser(@RequestBody UserDto userDto) {
        return null;
    }

    /*
     * ==================
     * Category Operations
     * ==================
     */

    // read all categories
    @GetMapping("/categories")
    public ResponseEntity<List<CategoryDto>> getMethodName() {
        var categories = categoryService.getCategories();
        return ResponseEntity.ok(categories);
    }

    // create category
    @PostMapping("/categories")
    public ResponseEntity<String> createCategory(@RequestBody CategoryDto category) {
        return null;
    }

    // edit category
    @PutMapping("/categories/{id}")
    public ResponseEntity<String> editCategory(@RequestBody CategoryDto category) {
        return null;
    };

    // delete category
    @DeleteMapping("/categories/{id}")
    public ResponseEntity<String> deleteCategory(@RequestBody CategoryDto category) {
        return null;
    }
}
