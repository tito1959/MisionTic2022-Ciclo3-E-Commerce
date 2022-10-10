package co.edu.misiontic.sebas.commerce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSlimDto {

    private Long id;
    private boolean admin;
    private String firstName;
    private String lastName;
    private String urlImg;
    private String phone;
    private String email;
    private double balance;
}
