package co.edu.misiontic.sebas.commerce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSlimDto {

    private String email;
    private String password;
}
