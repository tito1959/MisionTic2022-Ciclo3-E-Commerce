package co.edu.misiontic.sebas.commerce.model.dto;

import java.util.List;

import co.edu.misiontic.sebas.commerce.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    private Long id;
    private String name;

    private List<Product> products;

}
