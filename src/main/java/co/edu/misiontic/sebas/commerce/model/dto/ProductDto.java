package co.edu.misiontic.sebas.commerce.model.dto;

import co.edu.misiontic.sebas.commerce.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
    private String urlImg;
    private String stock;
    private double price;

    private Category category;
}
