package com.accenture.accenture.domain.usuario.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginRequest {

    @NotNull
    private String login;
    @NotNull
    private String senha;
}
