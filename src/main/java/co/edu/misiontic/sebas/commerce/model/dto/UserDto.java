package co.edu.misiontic.sebas.commerce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String urlImg;
    private String phone;
    private String email;
    private String password;
    private double balance;
    private boolean admin;
}
