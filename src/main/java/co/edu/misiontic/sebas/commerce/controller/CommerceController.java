package co.edu.misiontic.sebas.commerce.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.misiontic.sebas.commerce.model.dto.ProductDto;
import co.edu.misiontic.sebas.commerce.model.dto.UserDto;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
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

    // read all products
    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> getProductsWithTags() {
        return null;
    }

    // read product by id
    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDto> getPorudct(@PathVariable String id) {
        return null;
    }

    // create new product
    @PostMapping("/products")
    public ResponseEntity<String> createProduct(@RequestBody ProductDto productDto) {
        return null;
    }

    // edit product
    @PutMapping("/products/{id}")
    public ResponseEntity<String> editProduct(@PathVariable String id) {
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
     * =================?
     */

}
