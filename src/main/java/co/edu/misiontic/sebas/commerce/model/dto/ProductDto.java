package co.edu.misiontic.sebas.commerce.model.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Long id;
    private String name;
    private String urlImg;
    private String stock;
    private double price;

    private List<CategorySlimDto> categories = new ArrayList<>();
}
