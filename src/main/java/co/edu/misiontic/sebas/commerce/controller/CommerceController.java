package co.edu.misiontic.sebas.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.misiontic.sebas.commerce.model.dto.CategorySlimDto;
import co.edu.misiontic.sebas.commerce.model.dto.ProductSlimDto;
import co.edu.misiontic.sebas.commerce.model.dto.UserDto;
import co.edu.misiontic.sebas.commerce.model.dto.UserSlimDto;
import co.edu.misiontic.sebas.commerce.service.CategoryService;
import co.edu.misiontic.sebas.commerce.service.ProductService;
import co.edu.misiontic.sebas.commerce.service.SecurityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class CommerceController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @Autowired
    private SecurityService securityService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductSlimDto>> getProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/categories")
    public ResponseEntity<List<CategorySlimDto>> getCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @PostMapping("user/{user}")
    public ResponseEntity<UserDto> postMethodName(@RequestBody UserSlimDto user) {
        return ResponseEntity.ok(securityService.getUser(user));
    }

}
