package co.edu.misiontic.sebas.commerce.model.dto;

import java.util.ArrayList;
import java.util.List;

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

    public UserDto(Long id, boolean admin, String firstName, String lastName, String urlImg, String phone, String email,
            String password, double balance) {
        this.id = id;
        this.admin = admin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.urlImg = urlImg;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    private List<ProductDto> products = new ArrayList<>();
}
