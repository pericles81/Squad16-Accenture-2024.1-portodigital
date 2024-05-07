package com.accenture.accenture.domain.clientes.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequest {

    @NonNull
    private String nome;
    @NonNull
    private String senha;
    @NonNull
    private String email;

}
