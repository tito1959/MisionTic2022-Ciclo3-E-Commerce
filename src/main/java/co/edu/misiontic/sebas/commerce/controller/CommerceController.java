package co.edu.misiontic.sebas.commerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.misiontic.sebas.commerce.model.Product;

@RestController
@RequestMapping("/api")
public class CommerceController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return null;
    }
}
