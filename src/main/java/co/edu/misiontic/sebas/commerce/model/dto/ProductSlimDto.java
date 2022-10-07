package co.edu.misiontic.sebas.commerce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductSlimDto {

    private Long id;
    private String name;
    private String urlImg;
    private String stock;
    private double price;
}
