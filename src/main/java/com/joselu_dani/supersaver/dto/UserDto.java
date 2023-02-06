package com.joselu_dani.supersaver.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;
    @NotEmpty(message = "Necesitamos un nombre para tu usuario")
    private String username;
    @NotEmpty(message = "El campo email debe ser rellenado")
    @Email
    private String email;
    @NotEmpty(message = "Debes elegir una contraseña")
    private String password;
}
